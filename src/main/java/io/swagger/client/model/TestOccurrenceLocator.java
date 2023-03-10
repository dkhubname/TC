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
 * Represents a locator string for filtering TestOccurrence entities.
 */
@ApiModel(description = "Represents a locator string for filtering TestOccurrence entities.")

public class TestOccurrenceLocator {
  @SerializedName("affectedProject")
  private String affectedProject = null;

  @SerializedName("branch")
  private String branch = null;

  @SerializedName("build")
  private String build = null;

  @SerializedName("buildType")
  private String buildType = null;

  @SerializedName("count")
  private Integer count = null;

  @SerializedName("currentlyFailing")
  private Boolean currentlyFailing = null;

  @SerializedName("currentlyInvestigated")
  private Boolean currentlyInvestigated = null;

  @SerializedName("currentlyMuted")
  private String currentlyMuted = null;

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("ignored")
  private Boolean ignored = null;

  @SerializedName("includePersonal")
  private Boolean includePersonal = null;

  @SerializedName("item")
  private String item = null;

  @SerializedName("lookupLimit")
  private Integer lookupLimit = null;

  @SerializedName("muted")
  private Boolean muted = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("newFailure")
  private String newFailure = null;

  @SerializedName("start")
  private Integer start = null;

  /**
   * Gets or Sets status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    UNKNOWN("unknown"),
    
    NORMAL("normal"),
    
    WARNING("warning"),
    
    FAILURE("failure"),
    
    ERROR("error");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StatusEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("status")
  private StatusEnum status = null;

  @SerializedName("test")
  private String test = null;

  public TestOccurrenceLocator affectedProject(String affectedProject) {
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

  public TestOccurrenceLocator branch(String branch) {
    this.branch = branch;
    return this;
  }

   /**
   * Get branch
   * @return branch
  **/
  @ApiModelProperty(value = "")
  public String getBranch() {
    return branch;
  }

  public void setBranch(String branch) {
    this.branch = branch;
  }

  public TestOccurrenceLocator build(String build) {
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

  public TestOccurrenceLocator buildType(String buildType) {
    this.buildType = buildType;
    return this;
  }

   /**
   * Build type locator.
   * @return buildType
  **/
  @ApiModelProperty(value = "Build type locator.")
  public String getBuildType() {
    return buildType;
  }

  public void setBuildType(String buildType) {
    this.buildType = buildType;
  }

  public TestOccurrenceLocator count(Integer count) {
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

  public TestOccurrenceLocator currentlyFailing(Boolean currentlyFailing) {
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

  public TestOccurrenceLocator currentlyInvestigated(Boolean currentlyInvestigated) {
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

  public TestOccurrenceLocator currentlyMuted(String currentlyMuted) {
    this.currentlyMuted = currentlyMuted;
    return this;
  }

   /**
   * Get currentlyMuted
   * @return currentlyMuted
  **/
  @ApiModelProperty(value = "")
  public String getCurrentlyMuted() {
    return currentlyMuted;
  }

  public void setCurrentlyMuted(String currentlyMuted) {
    this.currentlyMuted = currentlyMuted;
  }

  public TestOccurrenceLocator id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Entity ID.
   * @return id
  **/
  @ApiModelProperty(value = "Entity ID.")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public TestOccurrenceLocator ignored(Boolean ignored) {
    this.ignored = ignored;
    return this;
  }

   /**
   * Is ignored.
   * @return ignored
  **/
  @ApiModelProperty(value = "Is ignored.")
  public Boolean isIgnored() {
    return ignored;
  }

  public void setIgnored(Boolean ignored) {
    this.ignored = ignored;
  }

  public TestOccurrenceLocator includePersonal(Boolean includePersonal) {
    this.includePersonal = includePersonal;
    return this;
  }

   /**
   * Get includePersonal
   * @return includePersonal
  **/
  @ApiModelProperty(value = "")
  public Boolean isIncludePersonal() {
    return includePersonal;
  }

  public void setIncludePersonal(Boolean includePersonal) {
    this.includePersonal = includePersonal;
  }

  public TestOccurrenceLocator item(String item) {
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

  public TestOccurrenceLocator lookupLimit(Integer lookupLimit) {
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

  public TestOccurrenceLocator muted(Boolean muted) {
    this.muted = muted;
    return this;
  }

   /**
   * Is muted.
   * @return muted
  **/
  @ApiModelProperty(value = "Is muted.")
  public Boolean isMuted() {
    return muted;
  }

  public void setMuted(Boolean muted) {
    this.muted = muted;
  }

  public TestOccurrenceLocator name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public TestOccurrenceLocator newFailure(String newFailure) {
    this.newFailure = newFailure;
    return this;
  }

   /**
   * Get newFailure
   * @return newFailure
  **/
  @ApiModelProperty(value = "")
  public String getNewFailure() {
    return newFailure;
  }

  public void setNewFailure(String newFailure) {
    this.newFailure = newFailure;
  }

  public TestOccurrenceLocator start(Integer start) {
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

  public TestOccurrenceLocator status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public TestOccurrenceLocator test(String test) {
    this.test = test;
    return this;
  }

   /**
   * Test locator.
   * @return test
  **/
  @ApiModelProperty(value = "Test locator.")
  public String getTest() {
    return test;
  }

  public void setTest(String test) {
    this.test = test;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TestOccurrenceLocator testOccurrenceLocator = (TestOccurrenceLocator) o;
    return Objects.equals(this.affectedProject, testOccurrenceLocator.affectedProject) &&
        Objects.equals(this.branch, testOccurrenceLocator.branch) &&
        Objects.equals(this.build, testOccurrenceLocator.build) &&
        Objects.equals(this.buildType, testOccurrenceLocator.buildType) &&
        Objects.equals(this.count, testOccurrenceLocator.count) &&
        Objects.equals(this.currentlyFailing, testOccurrenceLocator.currentlyFailing) &&
        Objects.equals(this.currentlyInvestigated, testOccurrenceLocator.currentlyInvestigated) &&
        Objects.equals(this.currentlyMuted, testOccurrenceLocator.currentlyMuted) &&
        Objects.equals(this.id, testOccurrenceLocator.id) &&
        Objects.equals(this.ignored, testOccurrenceLocator.ignored) &&
        Objects.equals(this.includePersonal, testOccurrenceLocator.includePersonal) &&
        Objects.equals(this.item, testOccurrenceLocator.item) &&
        Objects.equals(this.lookupLimit, testOccurrenceLocator.lookupLimit) &&
        Objects.equals(this.muted, testOccurrenceLocator.muted) &&
        Objects.equals(this.name, testOccurrenceLocator.name) &&
        Objects.equals(this.newFailure, testOccurrenceLocator.newFailure) &&
        Objects.equals(this.start, testOccurrenceLocator.start) &&
        Objects.equals(this.status, testOccurrenceLocator.status) &&
        Objects.equals(this.test, testOccurrenceLocator.test);
  }

  @Override
  public int hashCode() {
    return Objects.hash(affectedProject, branch, build, buildType, count, currentlyFailing, currentlyInvestigated, currentlyMuted, id, ignored, includePersonal, item, lookupLimit, muted, name, newFailure, start, status, test);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TestOccurrenceLocator {\n");
    
    sb.append("    affectedProject: ").append(toIndentedString(affectedProject)).append("\n");
    sb.append("    branch: ").append(toIndentedString(branch)).append("\n");
    sb.append("    build: ").append(toIndentedString(build)).append("\n");
    sb.append("    buildType: ").append(toIndentedString(buildType)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    currentlyFailing: ").append(toIndentedString(currentlyFailing)).append("\n");
    sb.append("    currentlyInvestigated: ").append(toIndentedString(currentlyInvestigated)).append("\n");
    sb.append("    currentlyMuted: ").append(toIndentedString(currentlyMuted)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    ignored: ").append(toIndentedString(ignored)).append("\n");
    sb.append("    includePersonal: ").append(toIndentedString(includePersonal)).append("\n");
    sb.append("    item: ").append(toIndentedString(item)).append("\n");
    sb.append("    lookupLimit: ").append(toIndentedString(lookupLimit)).append("\n");
    sb.append("    muted: ").append(toIndentedString(muted)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    newFailure: ").append(toIndentedString(newFailure)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    test: ").append(toIndentedString(test)).append("\n");
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

