package com.apollo.openapi.server.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ItemDTO
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-09-23T16:12:19.656458+08:00[Asia/Shanghai]", comments = "Generator version: 7.15.0")
public class ItemDTO {

  private @Nullable String dataChangeCreatedBy;

  private @Nullable String dataChangeLastModifiedBy;

  private @Nullable String dataChangeCreatedByDisplayName;

  private @Nullable String dataChangeLastModifiedByDisplayName;

  private @Nullable String dataChangeCreatedTime;

  private @Nullable String dataChangeLastModifiedTime;

  private @Nullable Long id;

  private @Nullable Long namespaceId;

  private @Nullable String key;

  private @Nullable Integer type;

  private @Nullable String value;

  private @Nullable String comment;

  private @Nullable Integer lineNum;

  public ItemDTO dataChangeCreatedBy(@Nullable String dataChangeCreatedBy) {
    this.dataChangeCreatedBy = dataChangeCreatedBy;
    return this;
  }

  /**
   * 配置项创建者用户名
   * @return dataChangeCreatedBy
   */

  @Schema(name = "dataChangeCreatedBy", description = "配置项创建者用户名", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dataChangeCreatedBy")
  public @Nullable String getDataChangeCreatedBy() {
    return dataChangeCreatedBy;
  }

  public void setDataChangeCreatedBy(@Nullable String dataChangeCreatedBy) {
    this.dataChangeCreatedBy = dataChangeCreatedBy;
  }

  public ItemDTO dataChangeLastModifiedBy(@Nullable String dataChangeLastModifiedBy) {
    this.dataChangeLastModifiedBy = dataChangeLastModifiedBy;
    return this;
  }

  /**
   * 配置项最后修改者用户名
   * @return dataChangeLastModifiedBy
   */

  @Schema(name = "dataChangeLastModifiedBy", description = "配置项最后修改者用户名", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dataChangeLastModifiedBy")
  public @Nullable String getDataChangeLastModifiedBy() {
    return dataChangeLastModifiedBy;
  }

  public void setDataChangeLastModifiedBy(@Nullable String dataChangeLastModifiedBy) {
    this.dataChangeLastModifiedBy = dataChangeLastModifiedBy;
  }

  public ItemDTO dataChangeCreatedByDisplayName(@Nullable String dataChangeCreatedByDisplayName) {
    this.dataChangeCreatedByDisplayName = dataChangeCreatedByDisplayName;
    return this;
  }

  /**
   * 创建者显示名
   * @return dataChangeCreatedByDisplayName
   */

  @Schema(name = "dataChangeCreatedByDisplayName", description = "创建者显示名", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dataChangeCreatedByDisplayName")
  public @Nullable String getDataChangeCreatedByDisplayName() {
    return dataChangeCreatedByDisplayName;
  }

  public void setDataChangeCreatedByDisplayName(@Nullable String dataChangeCreatedByDisplayName) {
    this.dataChangeCreatedByDisplayName = dataChangeCreatedByDisplayName;
  }

  public ItemDTO dataChangeLastModifiedByDisplayName(@Nullable String dataChangeLastModifiedByDisplayName) {
    this.dataChangeLastModifiedByDisplayName = dataChangeLastModifiedByDisplayName;
    return this;
  }

  /**
   * 最后修改者显示名
   * @return dataChangeLastModifiedByDisplayName
   */

  @Schema(name = "dataChangeLastModifiedByDisplayName", description = "最后修改者显示名", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dataChangeLastModifiedByDisplayName")
  public @Nullable String getDataChangeLastModifiedByDisplayName() {
    return dataChangeLastModifiedByDisplayName;
  }

  public void setDataChangeLastModifiedByDisplayName(@Nullable String dataChangeLastModifiedByDisplayName) {
    this.dataChangeLastModifiedByDisplayName = dataChangeLastModifiedByDisplayName;
  }

  public ItemDTO dataChangeCreatedTime(@Nullable String dataChangeCreatedTime) {
    this.dataChangeCreatedTime = dataChangeCreatedTime;
    return this;
  }

  /**
   * 配置项创建时间（ISO 8601）
   * @return dataChangeCreatedTime
   */

  @Schema(name = "dataChangeCreatedTime", description = "配置项创建时间（ISO 8601）", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dataChangeCreatedTime")
  public @Nullable String getDataChangeCreatedTime() {
    return dataChangeCreatedTime;
  }

  public void setDataChangeCreatedTime(@Nullable String dataChangeCreatedTime) {
    this.dataChangeCreatedTime = dataChangeCreatedTime;
  }

  public ItemDTO dataChangeLastModifiedTime(@Nullable String dataChangeLastModifiedTime) {
    this.dataChangeLastModifiedTime = dataChangeLastModifiedTime;
    return this;
  }

  /**
   * 配置项最后修改时间（ISO 8601）
   * @return dataChangeLastModifiedTime
   */

  @Schema(name = "dataChangeLastModifiedTime", description = "配置项最后修改时间（ISO 8601）", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dataChangeLastModifiedTime")
  public @Nullable String getDataChangeLastModifiedTime() {
    return dataChangeLastModifiedTime;
  }

  public void setDataChangeLastModifiedTime(@Nullable String dataChangeLastModifiedTime) {
    this.dataChangeLastModifiedTime = dataChangeLastModifiedTime;
  }

  public ItemDTO id(@Nullable Long id) {
    this.id = id;
    return this;
  }

  /**
   * 配置项ID
   * @return id
   */

  @Schema(name = "id", description = "配置项ID", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public @Nullable Long getId() {
    return id;
  }

  public void setId(@Nullable Long id) {
    this.id = id;
  }

  public ItemDTO namespaceId(@Nullable Long namespaceId) {
    this.namespaceId = namespaceId;
    return this;
  }

  /**
   * 所属命名空间ID
   * @return namespaceId
   */

  @Schema(name = "namespaceId", description = "所属命名空间ID", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("namespaceId")
  public @Nullable Long getNamespaceId() {
    return namespaceId;
  }

  public void setNamespaceId(@Nullable Long namespaceId) {
    this.namespaceId = namespaceId;
  }

  public ItemDTO key(@Nullable String key) {
    this.key = key;
    return this;
  }

  /**
   * 配置项键名
   * @return key
   */

  @Schema(name = "key", description = "配置项键名", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("key")
  public @Nullable String getKey() {
    return key;
  }

  public void setKey(@Nullable String key) {
    this.key = key;
  }

  public ItemDTO type(@Nullable Integer type) {
    this.type = type;
    return this;
  }

  /**
   * 配置项类型，0表示普通，1表示文件
   * @return type
   */

  @Schema(name = "type", description = "配置项类型，0表示普通，1表示文件", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
  public @Nullable Integer getType() {
    return type;
  }

  public void setType(@Nullable Integer type) {
    this.type = type;
  }

  public ItemDTO value(@Nullable String value) {
    this.value = value;
    return this;
  }

  /**
   * 配置项值
   * @return value
   */

  @Schema(name = "value", description = "配置项值", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("value")
  public @Nullable String getValue() {
    return value;
  }

  public void setValue(@Nullable String value) {
    this.value = value;
  }

  public ItemDTO comment(@Nullable String comment) {
    this.comment = comment;
    return this;
  }

  /**
   * 配置项备注
   * @return comment
   */

  @Schema(name = "comment", description = "配置项备注", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("comment")
  public @Nullable String getComment() {
    return comment;
  }

  public void setComment(@Nullable String comment) {
    this.comment = comment;
  }

  public ItemDTO lineNum(@Nullable Integer lineNum) {
    this.lineNum = lineNum;
    return this;
  }

  /**
   * 在配置文件中的行号（从1开始）
   * @return lineNum
   */

  @Schema(name = "lineNum", description = "在配置文件中的行号（从1开始）", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lineNum")
  public @Nullable Integer getLineNum() {
    return lineNum;
  }

  public void setLineNum(@Nullable Integer lineNum) {
    this.lineNum = lineNum;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemDTO itemDTO = (ItemDTO) o;
    return Objects.equals(this.dataChangeCreatedBy, itemDTO.dataChangeCreatedBy) &&
        Objects.equals(this.dataChangeLastModifiedBy, itemDTO.dataChangeLastModifiedBy) &&
        Objects.equals(this.dataChangeCreatedByDisplayName, itemDTO.dataChangeCreatedByDisplayName) &&
        Objects.equals(this.dataChangeLastModifiedByDisplayName, itemDTO.dataChangeLastModifiedByDisplayName) &&
        Objects.equals(this.dataChangeCreatedTime, itemDTO.dataChangeCreatedTime) &&
        Objects.equals(this.dataChangeLastModifiedTime, itemDTO.dataChangeLastModifiedTime) &&
        Objects.equals(this.id, itemDTO.id) &&
        Objects.equals(this.namespaceId, itemDTO.namespaceId) &&
        Objects.equals(this.key, itemDTO.key) &&
        Objects.equals(this.type, itemDTO.type) &&
        Objects.equals(this.value, itemDTO.value) &&
        Objects.equals(this.comment, itemDTO.comment) &&
        Objects.equals(this.lineNum, itemDTO.lineNum);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataChangeCreatedBy, dataChangeLastModifiedBy, dataChangeCreatedByDisplayName, dataChangeLastModifiedByDisplayName, dataChangeCreatedTime, dataChangeLastModifiedTime, id, namespaceId, key, type, value, comment, lineNum);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemDTO {\n");
    sb.append("    dataChangeCreatedBy: ").append(toIndentedString(dataChangeCreatedBy)).append("\n");
    sb.append("    dataChangeLastModifiedBy: ").append(toIndentedString(dataChangeLastModifiedBy)).append("\n");
    sb.append("    dataChangeCreatedByDisplayName: ").append(toIndentedString(dataChangeCreatedByDisplayName)).append("\n");
    sb.append("    dataChangeLastModifiedByDisplayName: ").append(toIndentedString(dataChangeLastModifiedByDisplayName)).append("\n");
    sb.append("    dataChangeCreatedTime: ").append(toIndentedString(dataChangeCreatedTime)).append("\n");
    sb.append("    dataChangeLastModifiedTime: ").append(toIndentedString(dataChangeLastModifiedTime)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    namespaceId: ").append(toIndentedString(namespaceId)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    lineNum: ").append(toIndentedString(lineNum)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
