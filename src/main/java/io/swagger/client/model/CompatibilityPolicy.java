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
import io.swagger.client.model.BuildTypes;
import java.io.IOException;

/**
 * Represents a build configuration run policy and included build configurations.
 */
@ApiModel(description = "Represents a build configuration run policy and included build configurations.")

public class CompatibilityPolicy {
  @SerializedName("policy")
  private String policy = null;

  @SerializedName("buildTypes")
  private BuildTypes buildTypes = null;

  public CompatibilityPolicy policy(String policy) {
    this.policy = policy;
    return this;
  }

   /**
   * Get policy
   * @return policy
  **/
  @ApiModelProperty(value = "")
  public String getPolicy() {
    return policy;
  }

  public void setPolicy(String policy) {
    this.policy = policy;
  }

  public CompatibilityPolicy buildTypes(BuildTypes buildTypes) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompatibilityPolicy compatibilityPolicy = (CompatibilityPolicy) o;
    return Objects.equals(this.policy, compatibilityPolicy.policy) &&
        Objects.equals(this.buildTypes, compatibilityPolicy.buildTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(policy, buildTypes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompatibilityPolicy {\n");
    
    sb.append("    policy: ").append(toIndentedString(policy)).append("\n");
    sb.append("    buildTypes: ").append(toIndentedString(buildTypes)).append("\n");
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

