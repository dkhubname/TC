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
import io.swagger.client.model.Build;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Represents a paginated list of Build entities.
 */
@ApiModel(description = "Represents a paginated list of Build entities.")

public class Builds {
  @SerializedName("href")
  private String href = null;

  @SerializedName("nextHref")
  private String nextHref = null;

  @SerializedName("prevHref")
  private String prevHref = null;

  @SerializedName("build")
  private List<Build> build = null;

  @SerializedName("count")
  private Integer count = null;

  public Builds href(String href) {
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

  public Builds nextHref(String nextHref) {
    this.nextHref = nextHref;
    return this;
  }

   /**
   * Get nextHref
   * @return nextHref
  **/
  @ApiModelProperty(value = "")
  public String getNextHref() {
    return nextHref;
  }

  public void setNextHref(String nextHref) {
    this.nextHref = nextHref;
  }

  public Builds prevHref(String prevHref) {
    this.prevHref = prevHref;
    return this;
  }

   /**
   * Get prevHref
   * @return prevHref
  **/
  @ApiModelProperty(value = "")
  public String getPrevHref() {
    return prevHref;
  }

  public void setPrevHref(String prevHref) {
    this.prevHref = prevHref;
  }

  public Builds build(List<Build> build) {
    this.build = build;
    return this;
  }

  public Builds addBuildItem(Build buildItem) {
    if (this.build == null) {
      this.build = new ArrayList<Build>();
    }
    this.build.add(buildItem);
    return this;
  }

   /**
   * Get build
   * @return build
  **/
  @ApiModelProperty(value = "")
  public List<Build> getBuild() {
    return build;
  }

  public void setBuild(List<Build> build) {
    this.build = build;
  }

  public Builds count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * Get count
   * @return count
  **/
  @ApiModelProperty(value = "")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Builds builds = (Builds) o;
    return Objects.equals(this.href, builds.href) &&
        Objects.equals(this.nextHref, builds.nextHref) &&
        Objects.equals(this.prevHref, builds.prevHref) &&
        Objects.equals(this.build, builds.build) &&
        Objects.equals(this.count, builds.count);
  }

  @Override
  public int hashCode() {
    return Objects.hash(href, nextHref, prevHref, build, count);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Builds {\n");
    
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    nextHref: ").append(toIndentedString(nextHref)).append("\n");
    sb.append("    prevHref: ").append(toIndentedString(prevHref)).append("\n");
    sb.append("    build: ").append(toIndentedString(build)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
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

