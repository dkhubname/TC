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
 * Represents a test results counter (how many times this test was successful/failed/muted/ignored).
 */
@ApiModel(description = "Represents a test results counter (how many times this test was successful/failed/muted/ignored).")

public class TestCounters {
  @SerializedName("ignored")
  private Integer ignored = null;

  @SerializedName("failed")
  private Integer failed = null;

  @SerializedName("muted")
  private Integer muted = null;

  @SerializedName("success")
  private Integer success = null;

  @SerializedName("all")
  private Integer all = null;

  @SerializedName("newFailed")
  private Integer newFailed = null;

  @SerializedName("duration")
  private Long duration = null;

  public TestCounters ignored(Integer ignored) {
    this.ignored = ignored;
    return this;
  }

   /**
   * Get ignored
   * @return ignored
  **/
  @ApiModelProperty(value = "")
  public Integer getIgnored() {
    return ignored;
  }

  public void setIgnored(Integer ignored) {
    this.ignored = ignored;
  }

  public TestCounters failed(Integer failed) {
    this.failed = failed;
    return this;
  }

   /**
   * Get failed
   * @return failed
  **/
  @ApiModelProperty(value = "")
  public Integer getFailed() {
    return failed;
  }

  public void setFailed(Integer failed) {
    this.failed = failed;
  }

  public TestCounters muted(Integer muted) {
    this.muted = muted;
    return this;
  }

   /**
   * Get muted
   * @return muted
  **/
  @ApiModelProperty(value = "")
  public Integer getMuted() {
    return muted;
  }

  public void setMuted(Integer muted) {
    this.muted = muted;
  }

  public TestCounters success(Integer success) {
    this.success = success;
    return this;
  }

   /**
   * Get success
   * @return success
  **/
  @ApiModelProperty(value = "")
  public Integer getSuccess() {
    return success;
  }

  public void setSuccess(Integer success) {
    this.success = success;
  }

  public TestCounters all(Integer all) {
    this.all = all;
    return this;
  }

   /**
   * Get all
   * @return all
  **/
  @ApiModelProperty(value = "")
  public Integer getAll() {
    return all;
  }

  public void setAll(Integer all) {
    this.all = all;
  }

  public TestCounters newFailed(Integer newFailed) {
    this.newFailed = newFailed;
    return this;
  }

   /**
   * Get newFailed
   * @return newFailed
  **/
  @ApiModelProperty(value = "")
  public Integer getNewFailed() {
    return newFailed;
  }

  public void setNewFailed(Integer newFailed) {
    this.newFailed = newFailed;
  }

  public TestCounters duration(Long duration) {
    this.duration = duration;
    return this;
  }

   /**
   * Get duration
   * @return duration
  **/
  @ApiModelProperty(value = "")
  public Long getDuration() {
    return duration;
  }

  public void setDuration(Long duration) {
    this.duration = duration;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TestCounters testCounters = (TestCounters) o;
    return Objects.equals(this.ignored, testCounters.ignored) &&
        Objects.equals(this.failed, testCounters.failed) &&
        Objects.equals(this.muted, testCounters.muted) &&
        Objects.equals(this.success, testCounters.success) &&
        Objects.equals(this.all, testCounters.all) &&
        Objects.equals(this.newFailed, testCounters.newFailed) &&
        Objects.equals(this.duration, testCounters.duration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ignored, failed, muted, success, all, newFailed, duration);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TestCounters {\n");
    
    sb.append("    ignored: ").append(toIndentedString(ignored)).append("\n");
    sb.append("    failed: ").append(toIndentedString(failed)).append("\n");
    sb.append("    muted: ").append(toIndentedString(muted)).append("\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    all: ").append(toIndentedString(all)).append("\n");
    sb.append("    newFailed: ").append(toIndentedString(newFailed)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
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

