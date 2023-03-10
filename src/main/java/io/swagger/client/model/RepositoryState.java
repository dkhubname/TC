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
import io.swagger.client.model.BranchVersion;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Represents the list of the repository Branch entities with their recent revisions.
 */
@ApiModel(description = "Represents the list of the repository Branch entities with their recent revisions.")

public class RepositoryState {
  @SerializedName("timestamp")
  private String timestamp = null;

  @SerializedName("count")
  private Integer count = null;

  @SerializedName("branch")
  private List<BranchVersion> branch = null;

  public RepositoryState timestamp(String timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Get timestamp
   * @return timestamp
  **/
  @ApiModelProperty(value = "")
  public String getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(String timestamp) {
    this.timestamp = timestamp;
  }

  public RepositoryState count(Integer count) {
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

  public RepositoryState branch(List<BranchVersion> branch) {
    this.branch = branch;
    return this;
  }

  public RepositoryState addBranchItem(BranchVersion branchItem) {
    if (this.branch == null) {
      this.branch = new ArrayList<BranchVersion>();
    }
    this.branch.add(branchItem);
    return this;
  }

   /**
   * Get branch
   * @return branch
  **/
  @ApiModelProperty(value = "")
  public List<BranchVersion> getBranch() {
    return branch;
  }

  public void setBranch(List<BranchVersion> branch) {
    this.branch = branch;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RepositoryState repositoryState = (RepositoryState) o;
    return Objects.equals(this.timestamp, repositoryState.timestamp) &&
        Objects.equals(this.count, repositoryState.count) &&
        Objects.equals(this.branch, repositoryState.branch);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timestamp, count, branch);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RepositoryState {\n");
    
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    branch: ").append(toIndentedString(branch)).append("\n");
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

