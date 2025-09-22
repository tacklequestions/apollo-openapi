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
 * 集群信息
 */

@Schema(name = "ClusterDTO", description = "集群信息")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-09-22T21:41:13.496995+08:00[Asia/Shanghai]", comments = "Generator version: 7.15.0")
public class ClusterDTO {

  private @Nullable String dataChangeCreatedBy;

  private @Nullable String dataChangeLastModifiedBy;

  private @Nullable String dataChangeCreatedByDisplayName;

  private @Nullable String dataChangeLastModifiedByDisplayName;

  private @Nullable String dataChangeCreatedTime;

  private @Nullable String dataChangeLastModifiedTime;

  private @Nullable Long id;

  private String name;

  private String appId;

  private @Nullable Long parentClusterId;

  private @Nullable String comment;

  public ClusterDTO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ClusterDTO(String name, String appId) {
    this.name = name;
    this.appId = appId;
  }

  public ClusterDTO dataChangeCreatedBy(@Nullable String dataChangeCreatedBy) {
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

  public ClusterDTO dataChangeLastModifiedBy(@Nullable String dataChangeLastModifiedBy) {
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

  public ClusterDTO dataChangeCreatedByDisplayName(@Nullable String dataChangeCreatedByDisplayName) {
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

  public ClusterDTO dataChangeLastModifiedByDisplayName(@Nullable String dataChangeLastModifiedByDisplayName) {
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

  public ClusterDTO dataChangeCreatedTime(@Nullable String dataChangeCreatedTime) {
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

  public ClusterDTO dataChangeLastModifiedTime(@Nullable String dataChangeLastModifiedTime) {
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

  public ClusterDTO id(@Nullable Long id) {
    this.id = id;
    return this;
  }

  /**
   * 集群ID
   * @return id
   */

  @Schema(name = "id", description = "集群ID", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public @Nullable Long getId() {
    return id;
  }

  public void setId(@Nullable Long id) {
    this.id = id;
  }

  public ClusterDTO name(String name) {
    this.name = name;
    return this;
  }

  /**
   * 集群名称
   * @return name
   */
  @NotNull @Pattern(regexp = "[0-9a-zA-Z_-]+[0-9a-zA-Z_.-]*")
  @Schema(name = "name", description = "集群名称", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ClusterDTO appId(String appId) {
    this.appId = appId;
    return this;
  }

  /**
   * 应用ID
   * @return appId
   */
  @NotNull
  @Schema(name = "appId", description = "应用ID", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("appId")
  public String getAppId() {
    return appId;
  }

  public void setAppId(String appId) {
    this.appId = appId;
  }

  public ClusterDTO parentClusterId(@Nullable Long parentClusterId) {
    this.parentClusterId = parentClusterId;
    return this;
  }

  /**
   * 父集群ID
   * @return parentClusterId
   */

  @Schema(name = "parentClusterId", description = "父集群ID", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("parentClusterId")
  public @Nullable Long getParentClusterId() {
    return parentClusterId;
  }

  public void setParentClusterId(@Nullable Long parentClusterId) {
    this.parentClusterId = parentClusterId;
  }

  public ClusterDTO comment(@Nullable String comment) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClusterDTO clusterDTO = (ClusterDTO) o;
    return Objects.equals(this.dataChangeCreatedBy, clusterDTO.dataChangeCreatedBy) &&
        Objects.equals(this.dataChangeLastModifiedBy, clusterDTO.dataChangeLastModifiedBy) &&
        Objects.equals(this.dataChangeCreatedByDisplayName, clusterDTO.dataChangeCreatedByDisplayName) &&
        Objects.equals(this.dataChangeLastModifiedByDisplayName, clusterDTO.dataChangeLastModifiedByDisplayName) &&
        Objects.equals(this.dataChangeCreatedTime, clusterDTO.dataChangeCreatedTime) &&
        Objects.equals(this.dataChangeLastModifiedTime, clusterDTO.dataChangeLastModifiedTime) &&
        Objects.equals(this.id, clusterDTO.id) &&
        Objects.equals(this.name, clusterDTO.name) &&
        Objects.equals(this.appId, clusterDTO.appId) &&
        Objects.equals(this.parentClusterId, clusterDTO.parentClusterId) &&
        Objects.equals(this.comment, clusterDTO.comment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataChangeCreatedBy, dataChangeLastModifiedBy, dataChangeCreatedByDisplayName, dataChangeLastModifiedByDisplayName, dataChangeCreatedTime, dataChangeLastModifiedTime, id, name, appId, parentClusterId, comment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClusterDTO {\n");
    sb.append("    dataChangeCreatedBy: ").append(toIndentedString(dataChangeCreatedBy)).append("\n");
    sb.append("    dataChangeLastModifiedBy: ").append(toIndentedString(dataChangeLastModifiedBy)).append("\n");
    sb.append("    dataChangeCreatedByDisplayName: ").append(toIndentedString(dataChangeCreatedByDisplayName)).append("\n");
    sb.append("    dataChangeLastModifiedByDisplayName: ").append(toIndentedString(dataChangeLastModifiedByDisplayName)).append("\n");
    sb.append("    dataChangeCreatedTime: ").append(toIndentedString(dataChangeCreatedTime)).append("\n");
    sb.append("    dataChangeLastModifiedTime: ").append(toIndentedString(dataChangeLastModifiedTime)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    parentClusterId: ").append(toIndentedString(parentClusterId)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
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
