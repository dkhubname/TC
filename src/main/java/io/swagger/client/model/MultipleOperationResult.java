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
import io.swagger.client.model.OperationResult;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Represents a list of OperationResult entities.
 */
@ApiModel(description = "Represents a list of OperationResult entities.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-02-26T16:22:21.476Z")
public class MultipleOperationResult {
  @SerializedName("count")
  private Integer count = null;

  @SerializedName("errorCount")
  private Integer errorCount = null;

  @SerializedName("operationResult")
  private List<OperationResult> operationResult = null;

  public MultipleOperationResult count(Integer count) {
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

  public MultipleOperationResult errorCount(Integer errorCount) {
    this.errorCount = errorCount;
    return this;
  }

   /**
   * Get errorCount
   * @return errorCount
  **/
  @ApiModelProperty(value = "")
  public Integer getErrorCount() {
    return errorCount;
  }

  public void setErrorCount(Integer errorCount) {
    this.errorCount = errorCount;
  }

  public MultipleOperationResult operationResult(List<OperationResult> operationResult) {
    this.operationResult = operationResult;
    return this;
  }

  public MultipleOperationResult addOperationResultItem(OperationResult operationResultItem) {
    if (this.operationResult == null) {
      this.operationResult = new ArrayList<OperationResult>();
    }
    this.operationResult.add(operationResultItem);
    return this;
  }

   /**
   * Get operationResult
   * @return operationResult
  **/
  @ApiModelProperty(value = "")
  public List<OperationResult> getOperationResult() {
    return operationResult;
  }

  public void setOperationResult(List<OperationResult> operationResult) {
    this.operationResult = operationResult;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MultipleOperationResult multipleOperationResult = (MultipleOperationResult) o;
    return Objects.equals(this.count, multipleOperationResult.count) &&
        Objects.equals(this.errorCount, multipleOperationResult.errorCount) &&
        Objects.equals(this.operationResult, multipleOperationResult.operationResult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, errorCount, operationResult);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MultipleOperationResult {\n");
    
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    errorCount: ").append(toIndentedString(errorCount)).append("\n");
    sb.append("    operationResult: ").append(toIndentedString(operationResult)).append("\n");
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

