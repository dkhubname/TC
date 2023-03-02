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
 * Represents a locator string for filtering ProblemOccurrence entities.
 */
@ApiModel(description = "Represents a locator string for filtering ProblemOccurrence entities.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-02-26T16:22:21.476Z")
public class ProblemOccurrenceLocator {
  @SerializedName("affectedProject")
  private String affectedProject = null;

  @SerializedName("build")
  private String build = null;

  @SerializedName("count")
  private Integer count = null;

  @SerializedName("currentlyFailing")
  private Boolean currentlyFailing = null;

  @SerializedName("currentlyInvestigated")
  private Boolean currentlyInvestigated = null;

  @SerializedName("currentlyMuted")
  private Boolean currentlyMuted = null;

  @SerializedName("identity")
  private String identity = null;

  @SerializedName("item")
  private String item = null;

  @SerializedName("lookupLimit")
  private Integer lookupLimit = null;

  @SerializedName("muted")
  private Boolean muted = null;

  @SerializedName("problem")
  private String problem = null;

  @SerializedName("start")
  private Integer start = null;

  @SerializedName("type")
  private String type = null;

  public ProblemOccurrenceLocator affectedProject(String affectedProject) {
    this.affectedProject = affectedProject;
    return this;
  }

   /**
   * Project (direct or indirect parent) locator.
   * @return affectedProject
  **/
  @ApiModelProperty(value = "Project (direct or indirect parent) locator.")
  public String getAffectedProject() {
    return affectedProject;
  }

  public void setAffectedProject(String affectedProject) {
    this.affectedProject = affectedProject;
  }

  public ProblemOccurrenceLocator build(String build) {
    this.build = build;
    return this;
  }

   /**
   * Build locator.
   * @return build
  **/
  @ApiModelProperty(value = "Build locator.")
  public String getBuild() {
    return build;
  }

  public void setBuild(String build) {
    this.build = build;
  }

  public ProblemOccurrenceLocator count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * For paginated calls, how many entities to return per page.
   * @return count
  **/
  @ApiModelProperty(value = "For paginated calls, how many entities to return per page.")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public ProblemOccurrenceLocator currentlyFailing(Boolean currentlyFailing) {
    this.currentlyFailing = currentlyFailing;
    return this;
  }

   /**
   * Is currently failing.
   * @return currentlyFailing
  **/
  @ApiModelProperty(value = "Is currently failing.")
  public Boolean isCurrentlyFailing() {
    return currentlyFailing;
  }

  public void setCurrentlyFailing(Boolean currentlyFailing) {
    this.currentlyFailing = currentlyFailing;
  }

  public ProblemOccurrenceLocator currentlyInvestigated(Boolean currentlyInvestigated) {
    this.currentlyInvestigated = currentlyInvestigated;
    return this;
  }

   /**
   * Is currently investigated.
   * @return currentlyInvestigated
  **/
  @ApiModelProperty(value = "Is currently investigated.")
  public Boolean isCurrentlyInvestigated() {
    return currentlyInvestigated;
  }

  public void setCurrentlyInvestigated(Boolean currentlyInvestigated) {
    this.currentlyInvestigated = currentlyInvestigated;
  }

  public ProblemOccurrenceLocator currentlyMuted(Boolean currentlyMuted) {
    this.currentlyMuted = currentlyMuted;
    return this;
  }

   /**
   * Is currently muted.
   * @return currentlyMuted
  **/
  @ApiModelProperty(value = "Is currently muted.")
  public Boolean isCurrentlyMuted() {
    return currentlyMuted;
  }

  public void setCurrentlyMuted(Boolean currentlyMuted) {
    this.currentlyMuted = currentlyMuted;
  }

  public ProblemOccurrenceLocator identity(String identity) {
    this.identity = identity;
    return this;
  }

   /**
   * Get identity
   * @return identity
  **/
  @ApiModelProperty(value = "")
  public String getIdentity() {
    return identity;
  }

  public void setIdentity(String identity) {
    this.identity = identity;
  }

  public ProblemOccurrenceLocator item(String item) {
    this.item = item;
    return this;
  }

   /**
   * Supply multiple locators and return a union of the results.
   * @return item
  **/
  @ApiModelProperty(value = "Supply multiple locators and return a union of the results.")
  public String getItem() {
    return item;
  }

  public void setItem(String item) {
    this.item = item;
  }

  public ProblemOccurrenceLocator lookupLimit(Integer lookupLimit) {
    this.lookupLimit = lookupLimit;
    return this;
  }

   /**
   * Limit processing to the latest &#x60;&lt;lookupLimit&gt;&#x60; entities.
   * @return lookupLimit
  **/
  @ApiModelProperty(value = "Limit processing to the latest `<lookupLimit>` entities.")
  public Integer getLookupLimit() {
    return lookupLimit;
  }

  public void setLookupLimit(Integer lookupLimit) {
    this.lookupLimit = lookupLimit;
  }

  public ProblemOccurrenceLocator muted(Boolean muted) {
    this.muted = muted;
    return this;
  }

   /**
   * Has ever been muted.
   * @return muted
  **/
  @ApiModelProperty(value = "Has ever been muted.")
  public Boolean isMuted() {
    return muted;
  }

  public void setMuted(Boolean muted) {
    this.muted = muted;
  }

  public ProblemOccurrenceLocator problem(String problem) {
    this.problem = problem;
    return this;
  }

   /**
   * Get problem
   * @return problem
  **/
  @ApiModelProperty(value = "")
  public String getProblem() {
    return problem;
  }

  public void setProblem(String problem) {
    this.problem = problem;
  }

  public ProblemOccurrenceLocator start(Integer start) {
    this.start = start;
    return this;
  }

   /**
   * For paginated calls, from which entity to start rendering the page.
   * @return start
  **/
  @ApiModelProperty(value = "For paginated calls, from which entity to start rendering the page.")
  public Integer getStart() {
    return start;
  }

  public void setStart(Integer start) {
    this.start = start;
  }

  public ProblemOccurrenceLocator type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProblemOccurrenceLocator problemOccurrenceLocator = (ProblemOccurrenceLocator) o;
    return Objects.equals(this.affectedProject, problemOccurrenceLocator.affectedProject) &&
        Objects.equals(this.build, problemOccurrenceLocator.build) &&
        Objects.equals(this.count, problemOccurrenceLocator.count) &&
        Objects.equals(this.currentlyFailing, problemOccurrenceLocator.currentlyFailing) &&
        Objects.equals(this.currentlyInvestigated, problemOccurrenceLocator.currentlyInvestigated) &&
        Objects.equals(this.currentlyMuted, problemOccurrenceLocator.currentlyMuted) &&
        Objects.equals(this.identity, problemOccurrenceLocator.identity) &&
        Objects.equals(this.item, problemOccurrenceLocator.item) &&
        Objects.equals(this.lookupLimit, problemOccurrenceLocator.lookupLimit) &&
        Objects.equals(this.muted, problemOccurrenceLocator.muted) &&
        Objects.equals(this.problem, problemOccurrenceLocator.problem) &&
        Objects.equals(this.start, problemOccurrenceLocator.start) &&
        Objects.equals(this.type, problemOccurrenceLocator.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(affectedProject, build, count, currentlyFailing, currentlyInvestigated, currentlyMuted, identity, item, lookupLimit, muted, problem, start, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProblemOccurrenceLocator {\n");
    
    sb.append("    affectedProject: ").append(toIndentedString(affectedProject)).append("\n");
    sb.append("    build: ").append(toIndentedString(build)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    currentlyFailing: ").append(toIndentedString(currentlyFailing)).append("\n");
    sb.append("    currentlyInvestigated: ").append(toIndentedString(currentlyInvestigated)).append("\n");
    sb.append("    currentlyMuted: ").append(toIndentedString(currentlyMuted)).append("\n");
    sb.append("    identity: ").append(toIndentedString(identity)).append("\n");
    sb.append("    item: ").append(toIndentedString(item)).append("\n");
    sb.append("    lookupLimit: ").append(toIndentedString(lookupLimit)).append("\n");
    sb.append("    muted: ").append(toIndentedString(muted)).append("\n");
    sb.append("    problem: ").append(toIndentedString(problem)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
