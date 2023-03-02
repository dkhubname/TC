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
import io.swagger.client.model.ProblemScope;
import io.swagger.client.model.ProblemTarget;
import io.swagger.client.model.Resolution;
import java.io.IOException;

/**
 * Represents a muted test.
 */
@ApiModel(description = "Represents a muted test.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-02-26T16:22:21.476Z")
public class Mute {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("href")
  private String href = null;

  @SerializedName("assignment")
  private Comment assignment = null;

  @SerializedName("scope")
  private ProblemScope scope = null;

  @SerializedName("target")
  private ProblemTarget target = null;

  @SerializedName("resolution")
  private Resolution resolution = null;

  public Mute id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Mute href(String href) {
    this.href = href;
    return this;
  }

   /**
   * Get href
   * @return href
  **/
  @ApiModelProperty(value = "")
  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public Mute assignment(Comment assignment) {
    this.assignment = assignment;
    return this;
  }

   /**
   * Get assignment
   * @return assignment
  **/
  @ApiModelProperty(value = "")
  public Comment getAssignment() {
    return assignment;
  }

  public void setAssignment(Comment assignment) {
    this.assignment = assignment;
  }

  public Mute scope(ProblemScope scope) {
    this.scope = scope;
    return this;
  }

   /**
   * Get scope
   * @return scope
  **/
  @ApiModelProperty(value = "")
  public ProblemScope getScope() {
    return scope;
  }

  public void setScope(ProblemScope scope) {
    this.scope = scope;
  }

  public Mute target(ProblemTarget target) {
    this.target = target;
    return this;
  }

   /**
   * Get target
   * @return target
  **/
  @ApiModelProperty(value = "")
  public ProblemTarget getTarget() {
    return target;
  }

  public void setTarget(ProblemTarget target) {
    this.target = target;
  }

  public Mute resolution(Resolution resolution) {
    this.resolution = resolution;
    return this;
  }

   /**
   * Get resolution
   * @return resolution
  **/
  @ApiModelProperty(value = "")
  public Resolution getResolution() {
    return resolution;
  }

  public void setResolution(Resolution resolution) {
    this.resolution = resolution;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Mute mute = (Mute) o;
    return Objects.equals(this.id, mute.id) &&
        Objects.equals(this.href, mute.href) &&
        Objects.equals(this.assignment, mute.assignment) &&
        Objects.equals(this.scope, mute.scope) &&
        Objects.equals(this.target, mute.target) &&
        Objects.equals(this.resolution, mute.resolution);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, assignment, scope, target, resolution);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Mute {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    assignment: ").append(toIndentedString(assignment)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("    resolution: ").append(toIndentedString(resolution)).append("\n");
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
