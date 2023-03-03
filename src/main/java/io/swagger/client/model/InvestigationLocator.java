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
import org.threeten.bp.OffsetDateTime;

/**
 * Represents a locator string for filtering Investigation entities.
 */
@ApiModel(description = "Represents a locator string for filtering Investigation entities.")

public class InvestigationLocator {
  @SerializedName("affectedProject")
  private String affectedProject = null;

  @SerializedName("assignee")
  private String assignee = null;

  @SerializedName("assignmentProject")
  private String assignmentProject = null;

  @SerializedName("buildType")
  private String buildType = null;

  @SerializedName("count")
  private Integer count = null;

  @SerializedName("item")
  private String item = null;

  @SerializedName("lookupLimit")
  private Integer lookupLimit = null;

  @SerializedName("problem")
  private String problem = null;

  @SerializedName("reporter")
  private String reporter = null;

  /**
   * Gets or Sets resolution
   */
  @JsonAdapter(ResolutionEnum.Adapter.class)
  public enum ResolutionEnum {
    MANUALLY("manually"),
    
    WHENFIXED("whenFixed"),
    
    ATTIME("atTime");

    private String value;

    ResolutionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ResolutionEnum fromValue(String text) {
      for (ResolutionEnum b : ResolutionEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ResolutionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ResolutionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ResolutionEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ResolutionEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("resolution")
  private ResolutionEnum resolution = null;

  @SerializedName("sinceDate")
  private OffsetDateTime sinceDate = null;

  @SerializedName("start")
  private Integer start = null;

  /**
   * Gets or Sets state
   */
  @JsonAdapter(StateEnum.Adapter.class)
  public enum StateEnum {
    TAKEN("taken"),
    
    FIXED("fixed"),
    
    GIVEN_UP("given_up"),
    
    NONE("none");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StateEnum fromValue(String text) {
      for (StateEnum b : StateEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StateEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StateEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("state")
  private StateEnum state = null;

  @SerializedName("test")
  private String test = null;

  /**
   * Gets or Sets type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    TEST("test"),
    
    PROBLEM("problem"),
    
    ANYPROBLEM("anyProblem"),
    
    UNKNOWN("unknown");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("type")
  private TypeEnum type = null;

  public InvestigationLocator affectedProject(String affectedProject) {
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

  public InvestigationLocator assignee(String assignee) {
    this.assignee = assignee;
    return this;
  }

   /**
   * Get assignee
   * @return assignee
  **/
  @ApiModelProperty(value = "")
  public String getAssignee() {
    return assignee;
  }

  public void setAssignee(String assignee) {
    this.assignee = assignee;
  }

  public InvestigationLocator assignmentProject(String assignmentProject) {
    this.assignmentProject = assignmentProject;
    return this;
  }

   /**
   * Project (direct parent) locator.
   * @return assignmentProject
  **/
  @ApiModelProperty(value = "Project (direct parent) locator.")
  public String getAssignmentProject() {
    return assignmentProject;
  }

  public void setAssignmentProject(String assignmentProject) {
    this.assignmentProject = assignmentProject;
  }

  public InvestigationLocator buildType(String buildType) {
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

  public InvestigationLocator count(Integer count) {
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

  public InvestigationLocator item(String item) {
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

  public InvestigationLocator lookupLimit(Integer lookupLimit) {
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

  public InvestigationLocator problem(String problem) {
    this.problem = problem;
    return this;
  }

   /**
   * Problem locator.
   * @return problem
  **/
  @ApiModelProperty(value = "Problem locator.")
  public String getProblem() {
    return problem;
  }

  public void setProblem(String problem) {
    this.problem = problem;
  }

  public InvestigationLocator reporter(String reporter) {
    this.reporter = reporter;
    return this;
  }

   /**
   * Get reporter
   * @return reporter
  **/
  @ApiModelProperty(value = "")
  public String getReporter() {
    return reporter;
  }

  public void setReporter(String reporter) {
    this.reporter = reporter;
  }

  public InvestigationLocator resolution(ResolutionEnum resolution) {
    this.resolution = resolution;
    return this;
  }

   /**
   * Get resolution
   * @return resolution
  **/
  @ApiModelProperty(value = "")
  public ResolutionEnum getResolution() {
    return resolution;
  }

  public void setResolution(ResolutionEnum resolution) {
    this.resolution = resolution;
  }

  public InvestigationLocator sinceDate(OffsetDateTime sinceDate) {
    this.sinceDate = sinceDate;
    return this;
  }

   /**
   * yyyyMMddTHHmmss+ZZZZ
   * @return sinceDate
  **/
  @ApiModelProperty(value = "yyyyMMddTHHmmss+ZZZZ")
  public OffsetDateTime getSinceDate() {
    return sinceDate;
  }

  public void setSinceDate(OffsetDateTime sinceDate) {
    this.sinceDate = sinceDate;
  }

  public InvestigationLocator start(Integer start) {
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

  public InvestigationLocator state(StateEnum state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @ApiModelProperty(value = "")
  public StateEnum getState() {
    return state;
  }

  public void setState(StateEnum state) {
    this.state = state;
  }

  public InvestigationLocator test(String test) {
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

  public InvestigationLocator type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
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
    InvestigationLocator investigationLocator = (InvestigationLocator) o;
    return Objects.equals(this.affectedProject, investigationLocator.affectedProject) &&
        Objects.equals(this.assignee, investigationLocator.assignee) &&
        Objects.equals(this.assignmentProject, investigationLocator.assignmentProject) &&
        Objects.equals(this.buildType, investigationLocator.buildType) &&
        Objects.equals(this.count, investigationLocator.count) &&
        Objects.equals(this.item, investigationLocator.item) &&
        Objects.equals(this.lookupLimit, investigationLocator.lookupLimit) &&
        Objects.equals(this.problem, investigationLocator.problem) &&
        Objects.equals(this.reporter, investigationLocator.reporter) &&
        Objects.equals(this.resolution, investigationLocator.resolution) &&
        Objects.equals(this.sinceDate, investigationLocator.sinceDate) &&
        Objects.equals(this.start, investigationLocator.start) &&
        Objects.equals(this.state, investigationLocator.state) &&
        Objects.equals(this.test, investigationLocator.test) &&
        Objects.equals(this.type, investigationLocator.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(affectedProject, assignee, assignmentProject, buildType, count, item, lookupLimit, problem, reporter, resolution, sinceDate, start, state, test, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvestigationLocator {\n");
    
    sb.append("    affectedProject: ").append(toIndentedString(affectedProject)).append("\n");
    sb.append("    assignee: ").append(toIndentedString(assignee)).append("\n");
    sb.append("    assignmentProject: ").append(toIndentedString(assignmentProject)).append("\n");
    sb.append("    buildType: ").append(toIndentedString(buildType)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    item: ").append(toIndentedString(item)).append("\n");
    sb.append("    lookupLimit: ").append(toIndentedString(lookupLimit)).append("\n");
    sb.append("    problem: ").append(toIndentedString(problem)).append("\n");
    sb.append("    reporter: ").append(toIndentedString(reporter)).append("\n");
    sb.append("    resolution: ").append(toIndentedString(resolution)).append("\n");
    sb.append("    sinceDate: ").append(toIndentedString(sinceDate)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    test: ").append(toIndentedString(test)).append("\n");
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

