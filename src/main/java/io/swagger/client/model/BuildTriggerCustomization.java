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
import io.swagger.client.model.Properties;
import java.io.IOException;

/**
 * Represents build customization settings of a trigger
 */
@ApiModel(description = "Represents build customization settings of a trigger")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-02-26T16:22:21.476Z")
public class BuildTriggerCustomization {
  @SerializedName("enforceCleanCheckout")
  private Boolean enforceCleanCheckout = null;

  @SerializedName("enforceCleanCheckoutForDependencies")
  private Boolean enforceCleanCheckoutForDependencies = null;

  @SerializedName("parameters")
  private Properties parameters = null;

  public BuildTriggerCustomization enforceCleanCheckout(Boolean enforceCleanCheckout) {
    this.enforceCleanCheckout = enforceCleanCheckout;
    return this;
  }

   /**
   * Get enforceCleanCheckout
   * @return enforceCleanCheckout
  **/
  @ApiModelProperty(value = "")
  public Boolean isEnforceCleanCheckout() {
    return enforceCleanCheckout;
  }

  public void setEnforceCleanCheckout(Boolean enforceCleanCheckout) {
    this.enforceCleanCheckout = enforceCleanCheckout;
  }

  public BuildTriggerCustomization enforceCleanCheckoutForDependencies(Boolean enforceCleanCheckoutForDependencies) {
    this.enforceCleanCheckoutForDependencies = enforceCleanCheckoutForDependencies;
    return this;
  }

   /**
   * Get enforceCleanCheckoutForDependencies
   * @return enforceCleanCheckoutForDependencies
  **/
  @ApiModelProperty(value = "")
  public Boolean isEnforceCleanCheckoutForDependencies() {
    return enforceCleanCheckoutForDependencies;
  }

  public void setEnforceCleanCheckoutForDependencies(Boolean enforceCleanCheckoutForDependencies) {
    this.enforceCleanCheckoutForDependencies = enforceCleanCheckoutForDependencies;
  }

  public BuildTriggerCustomization parameters(Properties parameters) {
    this.parameters = parameters;
    return this;
  }

   /**
   * Get parameters
   * @return parameters
  **/
  @ApiModelProperty(value = "")
  public Properties getParameters() {
    return parameters;
  }

  public void setParameters(Properties parameters) {
    this.parameters = parameters;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BuildTriggerCustomization buildTriggerCustomization = (BuildTriggerCustomization) o;
    return Objects.equals(this.enforceCleanCheckout, buildTriggerCustomization.enforceCleanCheckout) &&
        Objects.equals(this.enforceCleanCheckoutForDependencies, buildTriggerCustomization.enforceCleanCheckoutForDependencies) &&
        Objects.equals(this.parameters, buildTriggerCustomization.parameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enforceCleanCheckout, enforceCleanCheckoutForDependencies, parameters);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuildTriggerCustomization {\n");
    
    sb.append("    enforceCleanCheckout: ").append(toIndentedString(enforceCleanCheckout)).append("\n");
    sb.append("    enforceCleanCheckoutForDependencies: ").append(toIndentedString(enforceCleanCheckoutForDependencies)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
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

