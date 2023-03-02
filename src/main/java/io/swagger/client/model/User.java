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
import io.swagger.client.model.Groups;
import io.swagger.client.model.Properties;
import io.swagger.client.model.Roles;
import io.swagger.client.model.UserAvatars;
import java.io.IOException;

/**
 * Represents a user.
 */
@ApiModel(description = "Represents a user.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-02-26T16:22:21.476Z")
public class User {
  @SerializedName("username")
  private String username = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("lastLogin")
  private String lastLogin = null;

  @SerializedName("password")
  private String password = null;

  @SerializedName("hasPassword")
  private Boolean hasPassword = null;

  @SerializedName("realm")
  private String realm = null;

  @SerializedName("href")
  private String href = null;

  @SerializedName("properties")
  private Properties properties = null;

  @SerializedName("roles")
  private Roles roles = null;

  @SerializedName("groups")
  private Groups groups = null;

  @SerializedName("locator")
  private String locator = null;

  @SerializedName("avatars")
  private UserAvatars avatars = null;

  @SerializedName("enabled2FA")
  private Boolean enabled2FA = null;

  public User username(String username) {
    this.username = username;
    return this;
  }

   /**
   * Get username
   * @return username
  **/
  @ApiModelProperty(value = "")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public User name(String name) {
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

  public User id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public User email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @ApiModelProperty(value = "")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public User lastLogin(String lastLogin) {
    this.lastLogin = lastLogin;
    return this;
  }

   /**
   * Get lastLogin
   * @return lastLogin
  **/
  @ApiModelProperty(value = "")
  public String getLastLogin() {
    return lastLogin;
  }

  public void setLastLogin(String lastLogin) {
    this.lastLogin = lastLogin;
  }

  public User password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Get password
   * @return password
  **/
  @ApiModelProperty(value = "")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public User hasPassword(Boolean hasPassword) {
    this.hasPassword = hasPassword;
    return this;
  }

   /**
   * Get hasPassword
   * @return hasPassword
  **/
  @ApiModelProperty(value = "")
  public Boolean isHasPassword() {
    return hasPassword;
  }

  public void setHasPassword(Boolean hasPassword) {
    this.hasPassword = hasPassword;
  }

  public User realm(String realm) {
    this.realm = realm;
    return this;
  }

   /**
   * Get realm
   * @return realm
  **/
  @ApiModelProperty(value = "")
  public String getRealm() {
    return realm;
  }

  public void setRealm(String realm) {
    this.realm = realm;
  }

  public User href(String href) {
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

  public User properties(Properties properties) {
    this.properties = properties;
    return this;
  }

   /**
   * Get properties
   * @return properties
  **/
  @ApiModelProperty(value = "")
  public Properties getProperties() {
    return properties;
  }

  public void setProperties(Properties properties) {
    this.properties = properties;
  }

  public User roles(Roles roles) {
    this.roles = roles;
    return this;
  }

   /**
   * Get roles
   * @return roles
  **/
  @ApiModelProperty(value = "")
  public Roles getRoles() {
    return roles;
  }

  public void setRoles(Roles roles) {
    this.roles = roles;
  }

  public User groups(Groups groups) {
    this.groups = groups;
    return this;
  }

   /**
   * Get groups
   * @return groups
  **/
  @ApiModelProperty(value = "")
  public Groups getGroups() {
    return groups;
  }

  public void setGroups(Groups groups) {
    this.groups = groups;
  }

  public User locator(String locator) {
    this.locator = locator;
    return this;
  }

   /**
   * Get locator
   * @return locator
  **/
  @ApiModelProperty(value = "")
  public String getLocator() {
    return locator;
  }

  public void setLocator(String locator) {
    this.locator = locator;
  }

  public User avatars(UserAvatars avatars) {
    this.avatars = avatars;
    return this;
  }

   /**
   * Get avatars
   * @return avatars
  **/
  @ApiModelProperty(value = "")
  public UserAvatars getAvatars() {
    return avatars;
  }

  public void setAvatars(UserAvatars avatars) {
    this.avatars = avatars;
  }

  public User enabled2FA(Boolean enabled2FA) {
    this.enabled2FA = enabled2FA;
    return this;
  }

   /**
   * Get enabled2FA
   * @return enabled2FA
  **/
  @ApiModelProperty(value = "")
  public Boolean isEnabled2FA() {
    return enabled2FA;
  }

  public void setEnabled2FA(Boolean enabled2FA) {
    this.enabled2FA = enabled2FA;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    User user = (User) o;
    return Objects.equals(this.username, user.username) &&
        Objects.equals(this.name, user.name) &&
        Objects.equals(this.id, user.id) &&
        Objects.equals(this.email, user.email) &&
        Objects.equals(this.lastLogin, user.lastLogin) &&
        Objects.equals(this.password, user.password) &&
        Objects.equals(this.hasPassword, user.hasPassword) &&
        Objects.equals(this.realm, user.realm) &&
        Objects.equals(this.href, user.href) &&
        Objects.equals(this.properties, user.properties) &&
        Objects.equals(this.roles, user.roles) &&
        Objects.equals(this.groups, user.groups) &&
        Objects.equals(this.locator, user.locator) &&
        Objects.equals(this.avatars, user.avatars) &&
        Objects.equals(this.enabled2FA, user.enabled2FA);
  }

  @Override
  public int hashCode() {
    return Objects.hash(username, name, id, email, lastLogin, password, hasPassword, realm, href, properties, roles, groups, locator, avatars, enabled2FA);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    lastLogin: ").append(toIndentedString(lastLogin)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    hasPassword: ").append(toIndentedString(hasPassword)).append("\n");
    sb.append("    realm: ").append(toIndentedString(realm)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    locator: ").append(toIndentedString(locator)).append("\n");
    sb.append("    avatars: ").append(toIndentedString(avatars)).append("\n");
    sb.append("    enabled2FA: ").append(toIndentedString(enabled2FA)).append("\n");
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
