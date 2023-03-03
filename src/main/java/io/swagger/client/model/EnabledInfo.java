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
import io.swagger.client.model.Comment;
import java.io.IOException;

/**
 * Represents the current enablement status of the agent.
 */
@ApiModel(description = "Represents the current enablement status of the agent.")

public class EnabledInfo {
  @SerializedName("status")
  private Boolean status = null;

  @SerializedName("comment")
  private Comment comment = null;

  @SerializedName("statusSwitchTime")
  private String statusSwitchTime = null;

  public EnabledInfo status(Boolean status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public Boolean isStatus() {
    return status;
  }

  public void setStatus(Boolean status) {
    this.status = status;
  }

  public EnabledInfo comment(Comment comment) {
    this.comment = comment;
    return this;
  }

   /**
   * Get comment
   * @return comment
  **/
  @ApiModelProperty(value = "")
  public Comment getComment() {
    return comment;
  }

  public void setComment(Comment comment) {
    this.comment = comment;
  }

  public EnabledInfo statusSwitchTime(String statusSwitchTime) {
    this.statusSwitchTime = statusSwitchTime;
    return this;
  }

   /**
   * Get statusSwitchTime
   * @return statusSwitchTime
  **/
  @ApiModelProperty(value = "")
  public String getStatusSwitchTime() {
    return statusSwitchTime;
  }

  public void setStatusSwitchTime(String statusSwitchTime) {
    this.statusSwitchTime = statusSwitchTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnabledInfo enabledInfo = (EnabledInfo) o;
    return Objects.equals(this.status, enabledInfo.status) &&
        Objects.equals(this.comment, enabledInfo.comment) &&
        Objects.equals(this.statusSwitchTime, enabledInfo.statusSwitchTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, comment, statusSwitchTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnabledInfo {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    statusSwitchTime: ").append(toIndentedString(statusSwitchTime)).append("\n");
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

