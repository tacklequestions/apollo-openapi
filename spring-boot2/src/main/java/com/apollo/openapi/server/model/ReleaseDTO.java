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
 * 发布信息
 */

@Schema(name = "ReleaseDTO", description = "发布信息")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-09-22T21:41:13.496995+08:00[Asia/Shanghai]", comments = "Generator version: 7.15.0")
public class ReleaseDTO {

  private @Nullable String dataChangeCreatedBy;

  private @Nullable String dataChangeLastModifiedBy;

  private @Nullable String dataChangeCreatedByDisplayName;

  private @Nullable String dataChangeLastModifiedByDisplayName;

  private @Nullable String dataChangeCreatedTime;

  private @Nullable String dataChangeLastModifiedTime;

  private @Nullable Long id;

  private @Nullable String releaseKey;

  private @Nullable String name;

  private @Nullable String appId;

  private @Nullable String clusterName;

  private @Nullable String namespaceName;

  private @Nullable String configurations;

  private @Nullable String comment;

  private @Nullable Boolean isAbandoned;

  public ReleaseDTO dataChangeCreatedBy(@Nullable String dataChangeCreatedBy) {
    this.dataChangeCreatedBy = dataChangeCreatedBy;
    return this;
  }

  /**
   * 创建人
   * @return dataChangeCreatedBy
   */

  @Schema(name = "dataChangeCreatedBy", description = "创建人", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dataChangeCreatedBy")
  public @Nullable String getDataChangeCreatedBy() {
    return dataChangeCreatedBy;
  }

  public void setDataChangeCreatedBy(@Nullable String dataChangeCreatedBy) {
    this.dataChangeCreatedBy = dataChangeCreatedBy;
  }

  public ReleaseDTO dataChangeLastModifiedBy(@Nullable String dataChangeLastModifiedBy) {
    this.dataChangeLastModifiedBy = dataChangeLastModifiedBy;
    return this;
  }

  /**
   * 最后修改人
   * @return dataChangeLastModifiedBy
   */

  @Schema(name = "dataChangeLastModifiedBy", description = "最后修改人", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dataChangeLastModifiedBy")
  public @Nullable String getDataChangeLastModifiedBy() {
    return dataChangeLastModifiedBy;
  }

  public void setDataChangeLastModifiedBy(@Nullable String dataChangeLastModifiedBy) {
    this.dataChangeLastModifiedBy = dataChangeLastModifiedBy;
  }

  public ReleaseDTO dataChangeCreatedByDisplayName(@Nullable String dataChangeCreatedByDisplayName) {
    this.dataChangeCreatedByDisplayName = dataChangeCreatedByDisplayName;
    return this;
  }

  /**
   * 创建人显示名称
   * @return dataChangeCreatedByDisplayName
   */

  @Schema(name = "dataChangeCreatedByDisplayName", description = "创建人显示名称", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dataChangeCreatedByDisplayName")
  public @Nullable String getDataChangeCreatedByDisplayName() {
    return dataChangeCreatedByDisplayName;
  }

  public void setDataChangeCreatedByDisplayName(@Nullable String dataChangeCreatedByDisplayName) {
    this.dataChangeCreatedByDisplayName = dataChangeCreatedByDisplayName;
  }

  public ReleaseDTO dataChangeLastModifiedByDisplayName(@Nullable String dataChangeLastModifiedByDisplayName) {
    this.dataChangeLastModifiedByDisplayName = dataChangeLastModifiedByDisplayName;
    return this;
  }

  /**
   * 最后修改人显示名称
   * @return dataChangeLastModifiedByDisplayName
   */

  @Schema(name = "dataChangeLastModifiedByDisplayName", description = "最后修改人显示名称", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dataChangeLastModifiedByDisplayName")
  public @Nullable String getDataChangeLastModifiedByDisplayName() {
    return dataChangeLastModifiedByDisplayName;
  }

  public void setDataChangeLastModifiedByDisplayName(@Nullable String dataChangeLastModifiedByDisplayName) {
    this.dataChangeLastModifiedByDisplayName = dataChangeLastModifiedByDisplayName;
  }

  public ReleaseDTO dataChangeCreatedTime(@Nullable String dataChangeCreatedTime) {
    this.dataChangeCreatedTime = dataChangeCreatedTime;
    return this;
  }

  /**
   * 创建时间
   * @return dataChangeCreatedTime
   */

  @Schema(name = "dataChangeCreatedTime", description = "创建时间", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dataChangeCreatedTime")
  public @Nullable String getDataChangeCreatedTime() {
    return dataChangeCreatedTime;
  }

  public void setDataChangeCreatedTime(@Nullable String dataChangeCreatedTime) {
    this.dataChangeCreatedTime = dataChangeCreatedTime;
  }

  public ReleaseDTO dataChangeLastModifiedTime(@Nullable String dataChangeLastModifiedTime) {
    this.dataChangeLastModifiedTime = dataChangeLastModifiedTime;
    return this;
  }

  /**
   * 最后修改时间
   * @return dataChangeLastModifiedTime
   */

  @Schema(name = "dataChangeLastModifiedTime", description = "最后修改时间", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dataChangeLastModifiedTime")
  public @Nullable String getDataChangeLastModifiedTime() {
    return dataChangeLastModifiedTime;
  }

  public void setDataChangeLastModifiedTime(@Nullable String dataChangeLastModifiedTime) {
    this.dataChangeLastModifiedTime = dataChangeLastModifiedTime;
  }

  public ReleaseDTO id(@Nullable Long id) {
    this.id = id;
    return this;
  }

  /**
   * 发布ID
   * @return id
   */

  @Schema(name = "id", description = "发布ID", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public @Nullable Long getId() {
    return id;
  }

  public void setId(@Nullable Long id) {
    this.id = id;
  }

  public ReleaseDTO releaseKey(@Nullable String releaseKey) {
    this.releaseKey = releaseKey;
    return this;
  }

  /**
   * 发布key
   * @return releaseKey
   */

  @Schema(name = "releaseKey", description = "发布key", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("releaseKey")
  public @Nullable String getReleaseKey() {
    return releaseKey;
  }

  public void setReleaseKey(@Nullable String releaseKey) {
    this.releaseKey = releaseKey;
  }

  public ReleaseDTO name(@Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * 发布名称
   * @return name
   */

  @Schema(name = "name", description = "发布名称", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public @Nullable String getName() {
    return name;
  }

  public void setName(@Nullable String name) {
    this.name = name;
  }

  public ReleaseDTO appId(@Nullable String appId) {
    this.appId = appId;
    return this;
  }

  /**
   * 应用ID
   * @return appId
   */

  @Schema(name = "appId", description = "应用ID", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("appId")
  public @Nullable String getAppId() {
    return appId;
  }

  public void setAppId(@Nullable String appId) {
    this.appId = appId;
  }

  public ReleaseDTO clusterName(@Nullable String clusterName) {
    this.clusterName = clusterName;
    return this;
  }

  /**
   * 集群名称
   * @return clusterName
   */

  @Schema(name = "clusterName", description = "集群名称", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("clusterName")
  public @Nullable String getClusterName() {
    return clusterName;
  }

  public void setClusterName(@Nullable String clusterName) {
    this.clusterName = clusterName;
  }

  public ReleaseDTO namespaceName(@Nullable String namespaceName) {
    this.namespaceName = namespaceName;
    return this;
  }

  /**
   * 命名空间名称
   * @return namespaceName
   */

  @Schema(name = "namespaceName", description = "命名空间名称", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("namespaceName")
  public @Nullable String getNamespaceName() {
    return namespaceName;
  }

  public void setNamespaceName(@Nullable String namespaceName) {
    this.namespaceName = namespaceName;
  }

  public ReleaseDTO configurations(@Nullable String configurations) {
    this.configurations = configurations;
    return this;
  }

  /**
   * 配置
   * @return configurations
   */

  @Schema(name = "configurations", description = "配置", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("configurations")
  public @Nullable String getConfigurations() {
    return configurations;
  }

  public void setConfigurations(@Nullable String configurations) {
    this.configurations = configurations;
  }

  public ReleaseDTO comment(@Nullable String comment) {
    this.comment = comment;
    return this;
  }

  /**
   * 备注
   * @return comment
   */

  @Schema(name = "comment", description = "备注", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("comment")
  public @Nullable String getComment() {
    return comment;
  }

  public void setComment(@Nullable String comment) {
    this.comment = comment;
  }

  public ReleaseDTO isAbandoned(@Nullable Boolean isAbandoned) {
    this.isAbandoned = isAbandoned;
    return this;
  }

  /**
   * 是否被废弃
   * @return isAbandoned
   */

  @Schema(name = "isAbandoned", description = "是否被废弃", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isAbandoned")
  public @Nullable Boolean getIsAbandoned() {
    return isAbandoned;
  }

  public void setIsAbandoned(@Nullable Boolean isAbandoned) {
    this.isAbandoned = isAbandoned;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReleaseDTO releaseDTO = (ReleaseDTO) o;
    return Objects.equals(this.dataChangeCreatedBy, releaseDTO.dataChangeCreatedBy) &&
        Objects.equals(this.dataChangeLastModifiedBy, releaseDTO.dataChangeLastModifiedBy) &&
        Objects.equals(this.dataChangeCreatedByDisplayName, releaseDTO.dataChangeCreatedByDisplayName) &&
        Objects.equals(this.dataChangeLastModifiedByDisplayName, releaseDTO.dataChangeLastModifiedByDisplayName) &&
        Objects.equals(this.dataChangeCreatedTime, releaseDTO.dataChangeCreatedTime) &&
        Objects.equals(this.dataChangeLastModifiedTime, releaseDTO.dataChangeLastModifiedTime) &&
        Objects.equals(this.id, releaseDTO.id) &&
        Objects.equals(this.releaseKey, releaseDTO.releaseKey) &&
        Objects.equals(this.name, releaseDTO.name) &&
        Objects.equals(this.appId, releaseDTO.appId) &&
        Objects.equals(this.clusterName, releaseDTO.clusterName) &&
        Objects.equals(this.namespaceName, releaseDTO.namespaceName) &&
        Objects.equals(this.configurations, releaseDTO.configurations) &&
        Objects.equals(this.comment, releaseDTO.comment) &&
        Objects.equals(this.isAbandoned, releaseDTO.isAbandoned);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataChangeCreatedBy, dataChangeLastModifiedBy, dataChangeCreatedByDisplayName, dataChangeLastModifiedByDisplayName, dataChangeCreatedTime, dataChangeLastModifiedTime, id, releaseKey, name, appId, clusterName, namespaceName, configurations, comment, isAbandoned);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReleaseDTO {\n");
    sb.append("    dataChangeCreatedBy: ").append(toIndentedString(dataChangeCreatedBy)).append("\n");
    sb.append("    dataChangeLastModifiedBy: ").append(toIndentedString(dataChangeLastModifiedBy)).append("\n");
    sb.append("    dataChangeCreatedByDisplayName: ").append(toIndentedString(dataChangeCreatedByDisplayName)).append("\n");
    sb.append("    dataChangeLastModifiedByDisplayName: ").append(toIndentedString(dataChangeLastModifiedByDisplayName)).append("\n");
    sb.append("    dataChangeCreatedTime: ").append(toIndentedString(dataChangeCreatedTime)).append("\n");
    sb.append("    dataChangeLastModifiedTime: ").append(toIndentedString(dataChangeLastModifiedTime)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    releaseKey: ").append(toIndentedString(releaseKey)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
    sb.append("    namespaceName: ").append(toIndentedString(namespaceName)).append("\n");
    sb.append("    configurations: ").append(toIndentedString(configurations)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    isAbandoned: ").append(toIndentedString(isAbandoned)).append("\n");
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
