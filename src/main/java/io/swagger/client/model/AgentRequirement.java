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
 * Represents a requirement to agent parameters.
 */
@ApiModel(description = "Represents a requirement to agent parameters.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-02-26T16:22:21.476Z")
public class AgentRequirement {
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("disabled")
  private Boolean disabled = null;

  @SerializedName("inherited")
  private Boolean inherited = null;

  @SerializedName("href")
  private String href = null;

  @SerializedName("properties")
  private Properties properties = null;

  public AgentRequirement id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public AgentRequirement name(String name) {
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

  public AgentRequirement type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public AgentRequirement disabled(Boolean disabled) {
    this.disabled = disabled;
    return this;
  }

   /**
   * Get disabled
   * @return disabled
  **/
  @ApiModelProperty(value = "")
  public Boolean isDisabled() {
    return disabled;
  }

  public void setDisabled(Boolean disabled) {
    this.disabled = disabled;
  }

  public AgentRequirement inherited(Boolean inherited) {
    this.inherited = inherited;
    return this;
  }

   /**
   * Get inherited
   * @return inherited
  **/
  @ApiModelProperty(value = "")
  public Boolean isInherited() {
    return inherited;
  }

  public void setInherited(Boolean inherited) {
    this.inherited = inherited;
  }

  public AgentRequirement href(String href) {
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

  public AgentRequirement properties(Properties properties) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgentRequirement agentRequirement = (AgentRequirement) o;
    return Objects.equals(this.id, agentRequirement.id) &&
        Objects.equals(this.name, agentRequirement.name) &&
        Objects.equals(this.type, agentRequirement.type) &&
        Objects.equals(this.disabled, agentRequirement.disabled) &&
        Objects.equals(this.inherited, agentRequirement.inherited) &&
        Objects.equals(this.href, agentRequirement.href) &&
        Objects.equals(this.properties, agentRequirement.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, type, disabled, inherited, href, properties);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgentRequirement {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
    sb.append("    inherited: ").append(toIndentedString(inherited)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
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

