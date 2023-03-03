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
 * Represents the last known repository check status.
 */
@ApiModel(description = "Represents the last known repository check status.")

public class VcsCheckStatus {
  @SerializedName("status")
  private String status = null;

  @SerializedName("requestorType")
  private String requestorType = null;

  @SerializedName("timestamp")
  private String timestamp = null;

  public VcsCheckStatus status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public VcsCheckStatus requestorType(String requestorType) {
    this.requestorType = requestorType;
    return this;
  }

   /**
   * Get requestorType
   * @return requestorType
  **/
  @ApiModelProperty(value = "")
  public String getRequestorType() {
    return requestorType;
  }

  public void setRequestorType(String requestorType) {
    this.requestorType = requestorType;
  }

  public VcsCheckStatus timestamp(String timestamp) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VcsCheckStatus vcsCheckStatus = (VcsCheckStatus) o;
    return Objects.equals(this.status, vcsCheckStatus.status) &&
        Objects.equals(this.requestorType, vcsCheckStatus.requestorType) &&
        Objects.equals(this.timestamp, vcsCheckStatus.timestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, requestorType, timestamp);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VcsCheckStatus {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    requestorType: ").append(toIndentedString(requestorType)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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

