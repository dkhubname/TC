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

/**
 * Represents links to the next or previous build.
 */
@ApiModel(description = "Represents links to the next or previous build.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-02-26T16:22:21.476Z")
public class BuildChange {
  @SerializedName("nextBuild")
  private Build nextBuild = null;

  @SerializedName("prevBuild")
  private Build prevBuild = null;

  public BuildChange nextBuild(Build nextBuild) {
    this.nextBuild = nextBuild;
    return this;
  }

   /**
   * Get nextBuild
   * @return nextBuild
  **/
  @ApiModelProperty(value = "")
  public Build getNextBuild() {
    return nextBuild;
  }

  public void setNextBuild(Build nextBuild) {
    this.nextBuild = nextBuild;
  }

  public BuildChange prevBuild(Build prevBuild) {
    this.prevBuild = prevBuild;
    return this;
  }

   /**
   * Get prevBuild
   * @return prevBuild
  **/
  @ApiModelProperty(value = "")
  public Build getPrevBuild() {
    return prevBuild;
  }

  public void setPrevBuild(Build prevBuild) {
    this.prevBuild = prevBuild;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BuildChange buildChange = (BuildChange) o;
    return Objects.equals(this.nextBuild, buildChange.nextBuild) &&
        Objects.equals(this.prevBuild, buildChange.prevBuild);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextBuild, prevBuild);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuildChange {\n");
    
    sb.append("    nextBuild: ").append(toIndentedString(nextBuild)).append("\n");
    sb.append("    prevBuild: ").append(toIndentedString(prevBuild)).append("\n");
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

