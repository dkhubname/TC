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
import io.swagger.client.model.Feature;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Represents a list of Feature entities.
 */
@ApiModel(description = "Represents a list of Feature entities.")

public class Features {
  @SerializedName("count")
  private Integer count = null;

  @SerializedName("feature")
  private List<Feature> feature = null;

  public Features count(Integer count) {
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

  public Features feature(List<Feature> feature) {
    this.feature = feature;
    return this;
  }

  public Features addFeatureItem(Feature featureItem) {
    if (this.feature == null) {
      this.feature = new ArrayList<Feature>();
    }
    this.feature.add(featureItem);
    return this;
  }

   /**
   * Get feature
   * @return feature
  **/
  @ApiModelProperty(value = "")
  public List<Feature> getFeature() {
    return feature;
  }

  public void setFeature(List<Feature> feature) {
    this.feature = feature;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Features features = (Features) o;
    return Objects.equals(this.count, features.count) &&
        Objects.equals(this.feature, features.feature);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, feature);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Features {\n");
    
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    feature: ").append(toIndentedString(feature)).append("\n");
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

