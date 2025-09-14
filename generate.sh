#!/bin/bash
set -e

SPEC_FILE="apollo-openapi.yaml"
JAVA_CLIENT_DIR="java-client"
SPRING_BOOT2_DIR="spring-boot2"
PYTHON_DIR="python"
RUST_DIR="rust"
TS_DIR="typescript"

# 函数：修复代码格式问题（移除行尾空格和修复换行符）
fix_formatting() {
    local target_dir="$1"
    local file_pattern="$2"
    
    if [[ ! -d "$target_dir" ]]; then
        echo "⚠️  目录不存在: $target_dir"
        return
    fi
    
    echo "🔧 修复 $target_dir 中的格式问题..."
    
    # 查找并修复文件
    find "$target_dir" -type f \( $file_pattern \) -print0 | while IFS= read -r -d '' file; do
        # 创建临时文件
        local temp_file=$(mktemp)
        local changed=false
        
        # 移除行尾空格和制表符
        sed 's/[[:space:]]*$//' "$file" > "$temp_file"
        
        # 检查是否有变化
        if ! diff -q "$file" "$temp_file" >/dev/null 2>&1; then
            changed=true
            mv "$temp_file" "$file"
        else
            rm "$temp_file"
        fi
        
        # 修复文件末尾换行符
        if [[ -s "$file" ]]; then
            # 确保文件以单个换行符结尾
            local last_char=$(tail -c 1 "$file")
            if [[ "$last_char" != "" ]]; then
                echo "" >> "$file"
                changed=true
            fi
        fi
        
        if [[ "$changed" == "true" ]]; then
            echo "  ✅ 修复: $file"
        fi
    done
}

echo "🧹 Cleaning old generated SDKs..."
rm -rf "$JAVA_CLIENT_DIR"
rm -rf "$SPRING_BOOT2_DIR"
rm -rf "$PYTHON_DIR"
rm -rf "$RUST_DIR"
rm -rf "$TS_DIR"

echo "🚀 Generating Python SDK..."
openapi-generator generate \
  -i "$SPEC_FILE" \
  -g python \
  -o "$PYTHON_DIR" \
  --package-name apollo_openapi \
  --additional-properties=projectName=apollo-openapi,packageVersion=0.0.1

# 修复 Python 代码格式
fix_formatting "$PYTHON_DIR" "-name '*.py' -o -name '*.md'"

echo "🚀 Generating TypeScript SDK..."
openapi-generator generate \
  -i "$SPEC_FILE" \
  -g typescript-fetch \
  -o "$TS_DIR" \
  --additional-properties=npmName=apollo-openapi,npmVersion=0.0.1,typescriptThreePlus=true

# 修复 TypeScript 代码格式
fix_formatting "$TS_DIR" "-name '*.ts' -o -name '*.js' -o -name '*.md'"

echo "🚀 Generating Java Client SDK..."
openapi-generator generate \
  -i "$SPEC_FILE" \
  -g java \
  -o "$JAVA_CLIENT_DIR" \
  --additional-properties=groupId=com.apollo,artifactId=apollo-openapi-client,artifactVersion=0.0.1,packageName=com.apollo.openapi.client

# 修复 Java 代码格式
fix_formatting "$JAVA_CLIENT_DIR" "-name '*.java' -o -name '*.md' -o -name '*.gradle' -o -name '*.yaml'"

echo "🚀 Generating Spring Boot 2 Server..."
openapi-generator generate \
  -i "$SPEC_FILE" \
  -g spring \
  -o "$SPRING_BOOT2_DIR" \
  --additional-properties=groupId=com.apollo,artifactId=apollo-openapi-server,artifactVersion=0.0.1,packageName=com.apollo.openapi.server,basePackage=com.apollo.openapi.server,configPackage=com.apollo.openapi.server.config,modelPackage=com.apollo.openapi.server.model,apiPackage=com.apollo.openapi.server.api,library=spring-boot,java8=true,interfaceOnly=false,delegatePattern=true,useTags=true

# 修复 Spring Boot 代码格式
fix_formatting "$SPRING_BOOT2_DIR" "-name '*.java' -o -name '*.md' -o -name '*.xml' -o -name '*.yml' -o -name '*.yaml'"

echo "📦 Adding Maven Wrapper to Spring Boot 2 project..."
cd "$SPRING_BOOT2_DIR"
mvn -N io.takari:maven:wrapper -Dmaven=3.8.6
cd ..

echo "💡 Spring Boot 2 project ready! To start the server, run:"
echo "   cd $SPRING_BOOT2_DIR && ./mvnw spring-boot:run"

# Optional: Ask if user wants to start the server immediately
if [ "$1" = "--start-spring-boot" ]; then
    echo "🚀 Starting Spring Boot server..."
    cd "$SPRING_BOOT2_DIR"
    ./mvnw spring-boot:run &
    echo "✅ Spring Boot server started in background. Access it at http://localhost:8080"
    cd ..
fi

echo "🚀 Generating Rust SDK..."
openapi-generator generate \
  -i "$SPEC_FILE" \
  -g rust \
  -o "$RUST_DIR" \
  --global-property models,supportingFiles \
  --additional-properties=packageName=apollo-openapi,packageVersion=0.0.1

# 修复 Rust 代码格式
fix_formatting "$RUST_DIR" "-name '*.rs' -o -name '*.toml' -o -name '*.md'"

echo "✅ SDK generation complete."
