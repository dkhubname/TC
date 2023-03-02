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
import io.swagger.client.model.HealthCategory;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Represents a paginated list of HealthCategory entities.
 */
@ApiModel(description = "Represents a paginated list of HealthCategory entities.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-02-26T16:22:21.476Z")
public class HealthCategories {
  @SerializedName("count")
  private Integer count = null;

  @SerializedName("healthCategory")
  private List<HealthCategory> healthCategory = null;

  @SerializedName("href")
  private String href = null;

  @SerializedName("nextHref")
  private String nextHref = null;

  @SerializedName("prevHref")
  private String prevHref = null;

  public HealthCategories count(Integer count) {
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

  public HealthCategories healthCategory(List<HealthCategory> healthCategory) {
    this.healthCategory = healthCategory;
    return this;
  }

  public HealthCategories addHealthCategoryItem(HealthCategory healthCategoryItem) {
    if (this.healthCategory == null) {
      this.healthCategory = new ArrayList<HealthCategory>();
    }
    this.healthCategory.add(healthCategoryItem);
    return this;
  }

   /**
   * Get healthCategory
   * @return healthCategory
  **/
  @ApiModelProperty(value = "")
  public List<HealthCategory> getHealthCategory() {
    return healthCategory;
  }

  public void setHealthCategory(List<HealthCategory> healthCategory) {
    this.healthCategory = healthCategory;
  }

  public HealthCategories href(String href) {
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

  public HealthCategories nextHref(String nextHref) {
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

  public HealthCategories prevHref(String prevHref) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HealthCategories healthCategories = (HealthCategories) o;
    return Objects.equals(this.count, healthCategories.count) &&
        Objects.equals(this.healthCategory, healthCategories.healthCategory) &&
        Objects.equals(this.href, healthCategories.href) &&
        Objects.equals(this.nextHref, healthCategories.nextHref) &&
        Objects.equals(this.prevHref, healthCategories.prevHref);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, healthCategory, href, nextHref, prevHref);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HealthCategories {\n");
    
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    healthCategory: ").append(toIndentedString(healthCategory)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    nextHref: ").append(toIndentedString(nextHref)).append("\n");
    sb.append("    prevHref: ").append(toIndentedString(prevHref)).append("\n");
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
