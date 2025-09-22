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
 * 组织信息
 */

@Schema(name = "OpenOrganizationDTO", description = "组织信息")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-09-22T21:41:13.496995+08:00[Asia/Shanghai]", comments = "Generator version: 7.15.0")
public class OpenOrganizationDTO {

  private @Nullable String orgId;

  private @Nullable String orgName;

  public OpenOrganizationDTO orgId(@Nullable String orgId) {
    this.orgId = orgId;
    return this;
  }

  /**
   * 组织ID
   * @return orgId
   */

  @Schema(name = "orgId", description = "组织ID", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("orgId")
  public @Nullable String getOrgId() {
    return orgId;
  }

  public void setOrgId(@Nullable String orgId) {
    this.orgId = orgId;
  }

  public OpenOrganizationDTO orgName(@Nullable String orgName) {
    this.orgName = orgName;
    return this;
  }

  /**
   * 组织名称
   * @return orgName
   */

  @Schema(name = "orgName", description = "组织名称", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("orgName")
  public @Nullable String getOrgName() {
    return orgName;
  }

  public void setOrgName(@Nullable String orgName) {
    this.orgName = orgName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenOrganizationDTO openOrganizationDTO = (OpenOrganizationDTO) o;
    return Objects.equals(this.orgId, openOrganizationDTO.orgId) &&
        Objects.equals(this.orgName, openOrganizationDTO.orgName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orgId, orgName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenOrganizationDTO {\n");
    sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
    sb.append("    orgName: ").append(toIndentedString(orgName)).append("\n");
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
