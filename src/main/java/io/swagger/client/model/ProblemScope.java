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
import io.swagger.client.model.BuildType;
import io.swagger.client.model.BuildTypes;
import io.swagger.client.model.Project;
import java.io.IOException;

/**
 * Represents an investigation scope.
 */
@ApiModel(description = "Represents an investigation scope.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-02-26T16:22:21.476Z")
public class ProblemScope {
  @SerializedName("project")
  private Project project = null;

  @SerializedName("buildTypes")
  private BuildTypes buildTypes = null;

  @SerializedName("buildType")
  private BuildType buildType = null;

  public ProblemScope project(Project project) {
    this.project = project;
    return this;
  }

   /**
   * Get project
   * @return project
  **/
  @ApiModelProperty(value = "")
  public Project getProject() {
    return project;
  }

  public void setProject(Project project) {
    this.project = project;
  }

  public ProblemScope buildTypes(BuildTypes buildTypes) {
    this.buildTypes = buildTypes;
    return this;
  }

   /**
   * Get buildTypes
   * @return buildTypes
  **/
  @ApiModelProperty(value = "")
  public BuildTypes getBuildTypes() {
    return buildTypes;
  }

  public void setBuildTypes(BuildTypes buildTypes) {
    this.buildTypes = buildTypes;
  }

  public ProblemScope buildType(BuildType buildType) {
    this.buildType = buildType;
    return this;
  }

   /**
   * Get buildType
   * @return buildType
  **/
  @ApiModelProperty(value = "")
  public BuildType getBuildType() {
    return buildType;
  }

  public void setBuildType(BuildType buildType) {
    this.buildType = buildType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProblemScope problemScope = (ProblemScope) o;
    return Objects.equals(this.project, problemScope.project) &&
        Objects.equals(this.buildTypes, problemScope.buildTypes) &&
        Objects.equals(this.buildType, problemScope.buildType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(project, buildTypes, buildType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProblemScope {\n");
    
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    buildTypes: ").append(toIndentedString(buildTypes)).append("\n");
    sb.append("    buildType: ").append(toIndentedString(buildType)).append("\n");
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

