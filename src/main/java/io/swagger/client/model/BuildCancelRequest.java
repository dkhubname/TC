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
import java.io.IOException;

/**
 * Represents a cancel request for the specific build.
 */
@ApiModel(description = "Represents a cancel request for the specific build.")

public class BuildCancelRequest {
  @SerializedName("comment")
  private String comment = null;

  @SerializedName("readdIntoQueue")
  private Boolean readdIntoQueue = null;

  public BuildCancelRequest comment(String comment) {
    this.comment = comment;
    return this;
  }

   /**
   * Get comment
   * @return comment
  **/
  @ApiModelProperty(value = "")
  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public BuildCancelRequest readdIntoQueue(Boolean readdIntoQueue) {
    this.readdIntoQueue = readdIntoQueue;
    return this;
  }

   /**
   * Get readdIntoQueue
   * @return readdIntoQueue
  **/
  @ApiModelProperty(value = "")
  public Boolean isReaddIntoQueue() {
    return readdIntoQueue;
  }

  public void setReaddIntoQueue(Boolean readdIntoQueue) {
    this.readdIntoQueue = readdIntoQueue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BuildCancelRequest buildCancelRequest = (BuildCancelRequest) o;
    return Objects.equals(this.comment, buildCancelRequest.comment) &&
        Objects.equals(this.readdIntoQueue, buildCancelRequest.readdIntoQueue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comment, readdIntoQueue);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuildCancelRequest {\n");
    
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    readdIntoQueue: ").append(toIndentedString(readdIntoQueue)).append("\n");
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

