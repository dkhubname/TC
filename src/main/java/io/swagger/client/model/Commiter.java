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
import io.swagger.client.model.Users;
import java.io.IOException;

/**
 * Represents a commiter to a VCS.
 */
@ApiModel(description = "Represents a commiter to a VCS.")

public class Commiter {
  @SerializedName("vcsUsername")
  private String vcsUsername = null;

  @SerializedName("users")
  private Users users = null;

  public Commiter vcsUsername(String vcsUsername) {
    this.vcsUsername = vcsUsername;
    return this;
  }

   /**
   * Get vcsUsername
   * @return vcsUsername
  **/
  @ApiModelProperty(value = "")
  public String getVcsUsername() {
    return vcsUsername;
  }

  public void setVcsUsername(String vcsUsername) {
    this.vcsUsername = vcsUsername;
  }

  public Commiter users(Users users) {
    this.users = users;
    return this;
  }

   /**
   * Get users
   * @return users
  **/
  @ApiModelProperty(value = "")
  public Users getUsers() {
    return users;
  }

  public void setUsers(Users users) {
    this.users = users;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Commiter commiter = (Commiter) o;
    return Objects.equals(this.vcsUsername, commiter.vcsUsername) &&
        Objects.equals(this.users, commiter.users);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vcsUsername, users);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Commiter {\n");
    
    sb.append("    vcsUsername: ").append(toIndentedString(vcsUsername)).append("\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
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

