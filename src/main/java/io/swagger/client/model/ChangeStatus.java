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
import io.swagger.client.model.Builds;
import java.io.IOException;

/**
 * Aggregated statuses of the first builds with this change. Fairly expensive to compute.
 */
@ApiModel(description = "Aggregated statuses of the first builds with this change. Fairly expensive to compute.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-02-26T16:22:21.476Z")
public class ChangeStatus {
  @SerializedName("runningSuccessfullyBuilds")
  private Integer runningSuccessfullyBuilds = null;

  @SerializedName("pendingBuildTypes")
  private Integer pendingBuildTypes = null;

  @SerializedName("successfulBuilds")
  private Integer successfulBuilds = null;

  @SerializedName("totalProblems")
  private Integer totalProblems = null;

  @SerializedName("newFailedTests")
  private Integer newFailedTests = null;

  @SerializedName("otherFailedTests")
  private Integer otherFailedTests = null;

  @SerializedName("queuedBuildsCount")
  private Integer queuedBuildsCount = null;

  @SerializedName("criticalBuilds")
  private Builds criticalBuilds = null;

  @SerializedName("notCriticalBuilds")
  private Builds notCriticalBuilds = null;

  @SerializedName("newTestsFailedBuilds")
  private Builds newTestsFailedBuilds = null;

  @SerializedName("compilationErrorBuilds")
  private Builds compilationErrorBuilds = null;

  @SerializedName("runningBuilds")
  private Integer runningBuilds = null;

  @SerializedName("failedBuilds")
  private Integer failedBuilds = null;

  @SerializedName("cancelledBuilds")
  private Integer cancelledBuilds = null;

  @SerializedName("finishedBuilds")
  private Integer finishedBuilds = null;

  public ChangeStatus runningSuccessfullyBuilds(Integer runningSuccessfullyBuilds) {
    this.runningSuccessfullyBuilds = runningSuccessfullyBuilds;
    return this;
  }

   /**
   * Get runningSuccessfullyBuilds
   * @return runningSuccessfullyBuilds
  **/
  @ApiModelProperty(value = "")
  public Integer getRunningSuccessfullyBuilds() {
    return runningSuccessfullyBuilds;
  }

  public void setRunningSuccessfullyBuilds(Integer runningSuccessfullyBuilds) {
    this.runningSuccessfullyBuilds = runningSuccessfullyBuilds;
  }

  public ChangeStatus pendingBuildTypes(Integer pendingBuildTypes) {
    this.pendingBuildTypes = pendingBuildTypes;
    return this;
  }

   /**
   * Get pendingBuildTypes
   * @return pendingBuildTypes
  **/
  @ApiModelProperty(value = "")
  public Integer getPendingBuildTypes() {
    return pendingBuildTypes;
  }

  public void setPendingBuildTypes(Integer pendingBuildTypes) {
    this.pendingBuildTypes = pendingBuildTypes;
  }

  public ChangeStatus successfulBuilds(Integer successfulBuilds) {
    this.successfulBuilds = successfulBuilds;
    return this;
  }

   /**
   * Get successfulBuilds
   * @return successfulBuilds
  **/
  @ApiModelProperty(value = "")
  public Integer getSuccessfulBuilds() {
    return successfulBuilds;
  }

  public void setSuccessfulBuilds(Integer successfulBuilds) {
    this.successfulBuilds = successfulBuilds;
  }

  public ChangeStatus totalProblems(Integer totalProblems) {
    this.totalProblems = totalProblems;
    return this;
  }

   /**
   * Get totalProblems
   * @return totalProblems
  **/
  @ApiModelProperty(value = "")
  public Integer getTotalProblems() {
    return totalProblems;
  }

  public void setTotalProblems(Integer totalProblems) {
    this.totalProblems = totalProblems;
  }

  public ChangeStatus newFailedTests(Integer newFailedTests) {
    this.newFailedTests = newFailedTests;
    return this;
  }

   /**
   * Get newFailedTests
   * @return newFailedTests
  **/
  @ApiModelProperty(value = "")
  public Integer getNewFailedTests() {
    return newFailedTests;
  }

  public void setNewFailedTests(Integer newFailedTests) {
    this.newFailedTests = newFailedTests;
  }

  public ChangeStatus otherFailedTests(Integer otherFailedTests) {
    this.otherFailedTests = otherFailedTests;
    return this;
  }

   /**
   * Get otherFailedTests
   * @return otherFailedTests
  **/
  @ApiModelProperty(value = "")
  public Integer getOtherFailedTests() {
    return otherFailedTests;
  }

  public void setOtherFailedTests(Integer otherFailedTests) {
    this.otherFailedTests = otherFailedTests;
  }

  public ChangeStatus queuedBuildsCount(Integer queuedBuildsCount) {
    this.queuedBuildsCount = queuedBuildsCount;
    return this;
  }

   /**
   * Get queuedBuildsCount
   * @return queuedBuildsCount
  **/
  @ApiModelProperty(value = "")
  public Integer getQueuedBuildsCount() {
    return queuedBuildsCount;
  }

  public void setQueuedBuildsCount(Integer queuedBuildsCount) {
    this.queuedBuildsCount = queuedBuildsCount;
  }

  public ChangeStatus criticalBuilds(Builds criticalBuilds) {
    this.criticalBuilds = criticalBuilds;
    return this;
  }

   /**
   * Get criticalBuilds
   * @return criticalBuilds
  **/
  @ApiModelProperty(value = "")
  public Builds getCriticalBuilds() {
    return criticalBuilds;
  }

  public void setCriticalBuilds(Builds criticalBuilds) {
    this.criticalBuilds = criticalBuilds;
  }

  public ChangeStatus notCriticalBuilds(Builds notCriticalBuilds) {
    this.notCriticalBuilds = notCriticalBuilds;
    return this;
  }

   /**
   * Get notCriticalBuilds
   * @return notCriticalBuilds
  **/
  @ApiModelProperty(value = "")
  public Builds getNotCriticalBuilds() {
    return notCriticalBuilds;
  }

  public void setNotCriticalBuilds(Builds notCriticalBuilds) {
    this.notCriticalBuilds = notCriticalBuilds;
  }

  public ChangeStatus newTestsFailedBuilds(Builds newTestsFailedBuilds) {
    this.newTestsFailedBuilds = newTestsFailedBuilds;
    return this;
  }

   /**
   * Get newTestsFailedBuilds
   * @return newTestsFailedBuilds
  **/
  @ApiModelProperty(value = "")
  public Builds getNewTestsFailedBuilds() {
    return newTestsFailedBuilds;
  }

  public void setNewTestsFailedBuilds(Builds newTestsFailedBuilds) {
    this.newTestsFailedBuilds = newTestsFailedBuilds;
  }

  public ChangeStatus compilationErrorBuilds(Builds compilationErrorBuilds) {
    this.compilationErrorBuilds = compilationErrorBuilds;
    return this;
  }

   /**
   * Get compilationErrorBuilds
   * @return compilationErrorBuilds
  **/
  @ApiModelProperty(value = "")
  public Builds getCompilationErrorBuilds() {
    return compilationErrorBuilds;
  }

  public void setCompilationErrorBuilds(Builds compilationErrorBuilds) {
    this.compilationErrorBuilds = compilationErrorBuilds;
  }

  public ChangeStatus runningBuilds(Integer runningBuilds) {
    this.runningBuilds = runningBuilds;
    return this;
  }

   /**
   * Get runningBuilds
   * @return runningBuilds
  **/
  @ApiModelProperty(value = "")
  public Integer getRunningBuilds() {
    return runningBuilds;
  }

  public void setRunningBuilds(Integer runningBuilds) {
    this.runningBuilds = runningBuilds;
  }

  public ChangeStatus failedBuilds(Integer failedBuilds) {
    this.failedBuilds = failedBuilds;
    return this;
  }

   /**
   * Get failedBuilds
   * @return failedBuilds
  **/
  @ApiModelProperty(value = "")
  public Integer getFailedBuilds() {
    return failedBuilds;
  }

  public void setFailedBuilds(Integer failedBuilds) {
    this.failedBuilds = failedBuilds;
  }

  public ChangeStatus cancelledBuilds(Integer cancelledBuilds) {
    this.cancelledBuilds = cancelledBuilds;
    return this;
  }

   /**
   * Get cancelledBuilds
   * @return cancelledBuilds
  **/
  @ApiModelProperty(value = "")
  public Integer getCancelledBuilds() {
    return cancelledBuilds;
  }

  public void setCancelledBuilds(Integer cancelledBuilds) {
    this.cancelledBuilds = cancelledBuilds;
  }

  public ChangeStatus finishedBuilds(Integer finishedBuilds) {
    this.finishedBuilds = finishedBuilds;
    return this;
  }

   /**
   * Get finishedBuilds
   * @return finishedBuilds
  **/
  @ApiModelProperty(value = "")
  public Integer getFinishedBuilds() {
    return finishedBuilds;
  }

  public void setFinishedBuilds(Integer finishedBuilds) {
    this.finishedBuilds = finishedBuilds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChangeStatus changeStatus = (ChangeStatus) o;
    return Objects.equals(this.runningSuccessfullyBuilds, changeStatus.runningSuccessfullyBuilds) &&
        Objects.equals(this.pendingBuildTypes, changeStatus.pendingBuildTypes) &&
        Objects.equals(this.successfulBuilds, changeStatus.successfulBuilds) &&
        Objects.equals(this.totalProblems, changeStatus.totalProblems) &&
        Objects.equals(this.newFailedTests, changeStatus.newFailedTests) &&
        Objects.equals(this.otherFailedTests, changeStatus.otherFailedTests) &&
        Objects.equals(this.queuedBuildsCount, changeStatus.queuedBuildsCount) &&
        Objects.equals(this.criticalBuilds, changeStatus.criticalBuilds) &&
        Objects.equals(this.notCriticalBuilds, changeStatus.notCriticalBuilds) &&
        Objects.equals(this.newTestsFailedBuilds, changeStatus.newTestsFailedBuilds) &&
        Objects.equals(this.compilationErrorBuilds, changeStatus.compilationErrorBuilds) &&
        Objects.equals(this.runningBuilds, changeStatus.runningBuilds) &&
        Objects.equals(this.failedBuilds, changeStatus.failedBuilds) &&
        Objects.equals(this.cancelledBuilds, changeStatus.cancelledBuilds) &&
        Objects.equals(this.finishedBuilds, changeStatus.finishedBuilds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(runningSuccessfullyBuilds, pendingBuildTypes, successfulBuilds, totalProblems, newFailedTests, otherFailedTests, queuedBuildsCount, criticalBuilds, notCriticalBuilds, newTestsFailedBuilds, compilationErrorBuilds, runningBuilds, failedBuilds, cancelledBuilds, finishedBuilds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChangeStatus {\n");
    
    sb.append("    runningSuccessfullyBuilds: ").append(toIndentedString(runningSuccessfullyBuilds)).append("\n");
    sb.append("    pendingBuildTypes: ").append(toIndentedString(pendingBuildTypes)).append("\n");
    sb.append("    successfulBuilds: ").append(toIndentedString(successfulBuilds)).append("\n");
    sb.append("    totalProblems: ").append(toIndentedString(totalProblems)).append("\n");
    sb.append("    newFailedTests: ").append(toIndentedString(newFailedTests)).append("\n");
    sb.append("    otherFailedTests: ").append(toIndentedString(otherFailedTests)).append("\n");
    sb.append("    queuedBuildsCount: ").append(toIndentedString(queuedBuildsCount)).append("\n");
    sb.append("    criticalBuilds: ").append(toIndentedString(criticalBuilds)).append("\n");
    sb.append("    notCriticalBuilds: ").append(toIndentedString(notCriticalBuilds)).append("\n");
    sb.append("    newTestsFailedBuilds: ").append(toIndentedString(newTestsFailedBuilds)).append("\n");
    sb.append("    compilationErrorBuilds: ").append(toIndentedString(compilationErrorBuilds)).append("\n");
    sb.append("    runningBuilds: ").append(toIndentedString(runningBuilds)).append("\n");
    sb.append("    failedBuilds: ").append(toIndentedString(failedBuilds)).append("\n");
    sb.append("    cancelledBuilds: ").append(toIndentedString(cancelledBuilds)).append("\n");
    sb.append("    finishedBuilds: ").append(toIndentedString(finishedBuilds)).append("\n");
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

