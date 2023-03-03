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
import io.swagger.client.model.Step;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Represents a list of Step entities.
 */
@ApiModel(description = "Represents a list of Step entities.")

public class Steps {
  @SerializedName("count")
  private Integer count = null;

  @SerializedName("step")
  private List<Step> step = null;

  public Steps count(Integer count) {
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

  public Steps step(List<Step> step) {
    this.step = step;
    return this;
  }

  public Steps addStepItem(Step stepItem) {
    if (this.step == null) {
      this.step = new ArrayList<Step>();
    }
    this.step.add(stepItem);
    return this;
  }

   /**
   * Get step
   * @return step
  **/
  @ApiModelProperty(value = "")
  public List<Step> getStep() {
    return step;
  }

  public void setStep(List<Step> step) {
    this.step = step;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Steps steps = (Steps) o;
    return Objects.equals(this.count, steps.count) &&
        Objects.equals(this.step, steps.step);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, step);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Steps {\n");
    
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    step: ").append(toIndentedString(step)).append("\n");
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

