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
import io.swagger.client.model.PermissionRestrictions;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;

/**
 * Represents an authentication token.
 */
@ApiModel(description = "Represents an authentication token.")

public class Token {
  @SerializedName("name")
  private String name = null;

  @SerializedName("creationTime")
  private OffsetDateTime creationTime = null;

  @SerializedName("value")
  private String value = null;

  @SerializedName("expirationTime")
  private OffsetDateTime expirationTime = null;

  @SerializedName("permissionRestrictions")
  private PermissionRestrictions permissionRestrictions = null;

  public Token name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Token creationTime(OffsetDateTime creationTime) {
    this.creationTime = creationTime;
    return this;
  }

   /**
   * Get creationTime
   * @return creationTime
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getCreationTime() {
    return creationTime;
  }

  public void setCreationTime(OffsetDateTime creationTime) {
    this.creationTime = creationTime;
  }

  public Token value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @ApiModelProperty(value = "")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public Token expirationTime(OffsetDateTime expirationTime) {
    this.expirationTime = expirationTime;
    return this;
  }

   /**
   * Get expirationTime
   * @return expirationTime
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getExpirationTime() {
    return expirationTime;
  }

  public void setExpirationTime(OffsetDateTime expirationTime) {
    this.expirationTime = expirationTime;
  }

  public Token permissionRestrictions(PermissionRestrictions permissionRestrictions) {
    this.permissionRestrictions = permissionRestrictions;
    return this;
  }

   /**
   * Get permissionRestrictions
   * @return permissionRestrictions
  **/
  @ApiModelProperty(value = "")
  public PermissionRestrictions getPermissionRestrictions() {
    return permissionRestrictions;
  }

  public void setPermissionRestrictions(PermissionRestrictions permissionRestrictions) {
    this.permissionRestrictions = permissionRestrictions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Token token = (Token) o;
    return Objects.equals(this.name, token.name) &&
        Objects.equals(this.creationTime, token.creationTime) &&
        Objects.equals(this.value, token.value) &&
        Objects.equals(this.expirationTime, token.expirationTime) &&
        Objects.equals(this.permissionRestrictions, token.permissionRestrictions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, creationTime, value, expirationTime, permissionRestrictions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Token {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    expirationTime: ").append(toIndentedString(expirationTime)).append("\n");
    sb.append("    permissionRestrictions: ").append(toIndentedString(permissionRestrictions)).append("\n");
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

