package com.apollo.openapi.server.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * OpenEnvClusterDTO
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-09-14T15:38:43.825630+08:00[Asia/Shanghai]", comments = "Generator version: 7.15.0")
public class OpenEnvClusterDTO {

  private @Nullable String env;

  @Valid
  private List<String> clusters = new ArrayList<>();

  public OpenEnvClusterDTO env(@Nullable String env) {
    this.env = env;
    return this;
  }

  /**
   * 
   * @return env
   */
  
  @Schema(name = "env", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("env")
  public @Nullable String getEnv() {
    return env;
  }

  public void setEnv(@Nullable String env) {
    this.env = env;
  }

  public OpenEnvClusterDTO clusters(List<String> clusters) {
    this.clusters = clusters;
    return this;
  }

  public OpenEnvClusterDTO addClustersItem(String clustersItem) {
    if (this.clusters == null) {
      this.clusters = new ArrayList<>();
    }
    this.clusters.add(clustersItem);
    return this;
  }

  /**
   * 
   * @return clusters
   */
  
  @Schema(name = "clusters", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("clusters")
  public List<String> getClusters() {
    return clusters;
  }

  public void setClusters(List<String> clusters) {
    this.clusters = clusters;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenEnvClusterDTO openEnvClusterDTO = (OpenEnvClusterDTO) o;
    return Objects.equals(this.env, openEnvClusterDTO.env) &&
        Objects.equals(this.clusters, openEnvClusterDTO.clusters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(env, clusters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenEnvClusterDTO {\n");
    sb.append("    env: ").append(toIndentedString(env)).append("\n");
    sb.append("    clusters: ").append(toIndentedString(clusters)).append("\n");
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

