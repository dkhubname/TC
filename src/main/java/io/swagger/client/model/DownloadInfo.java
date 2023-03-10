/*
 * TeamCity REST API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 2018.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.ArtifactDownloadInfo;
import io.swagger.client.model.Build;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * List of metadata on artifacts downloaded from [or provided by] a build.
 */
@ApiModel(description = "List of metadata on artifacts downloaded from [or provided by] a build.")

public class DownloadInfo {
  @SerializedName("build")
  private Build build = null;

  @SerializedName("artifactInfo")
  private List<ArtifactDownloadInfo> artifactInfo = null;

  @SerializedName("count")
  private Integer count = null;

  public DownloadInfo build(Build build) {
    this.build = build;
    return this;
  }

   /**
   * Get build
   * @return build
  **/
  @ApiModelProperty(value = "")
  public Build getBuild() {
    return build;
  }

  public void setBuild(Build build) {
    this.build = build;
  }

  public DownloadInfo artifactInfo(List<ArtifactDownloadInfo> artifactInfo) {
    this.artifactInfo = artifactInfo;
    return this;
  }

  public DownloadInfo addArtifactInfoItem(ArtifactDownloadInfo artifactInfoItem) {
    if (this.artifactInfo == null) {
      this.artifactInfo = new ArrayList<ArtifactDownloadInfo>();
    }
    this.artifactInfo.add(artifactInfoItem);
    return this;
  }

   /**
   * Get artifactInfo
   * @return artifactInfo
  **/
  @ApiModelProperty(value = "")
  public List<ArtifactDownloadInfo> getArtifactInfo() {
    return artifactInfo;
  }

  public void setArtifactInfo(List<ArtifactDownloadInfo> artifactInfo) {
    this.artifactInfo = artifactInfo;
  }

  public DownloadInfo count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * Get count
   * @return count
  **/
  @ApiModelProperty(value = "")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DownloadInfo downloadInfo = (DownloadInfo) o;
    return Objects.equals(this.build, downloadInfo.build) &&
        Objects.equals(this.artifactInfo, downloadInfo.artifactInfo) &&
        Objects.equals(this.count, downloadInfo.count);
  }

  @Override
  public int hashCode() {
    return Objects.hash(build, artifactInfo, count);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DownloadInfo {\n");
    
    sb.append("    build: ").append(toIndentedString(build)).append("\n");
    sb.append("    artifactInfo: ").append(toIndentedString(artifactInfo)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

