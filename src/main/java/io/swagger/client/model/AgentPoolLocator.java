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
import java.io.IOException;

/**
 * Represents a locator string for filtering AgentPool entities.
 */
@ApiModel(description = "Represents a locator string for filtering AgentPool entities.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-02-26T16:22:21.476Z")
public class AgentPoolLocator {
  @SerializedName("agent")
  private String agent = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("item")
  private String item = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("project")
  private String project = null;

  public AgentPoolLocator agent(String agent) {
    this.agent = agent;
    return this;
  }

   /**
   * Pool&#39;s agents locator.
   * @return agent
  **/
  @ApiModelProperty(value = "Pool's agents locator.")
  public String getAgent() {
    return agent;
  }

  public void setAgent(String agent) {
    this.agent = agent;
  }

  public AgentPoolLocator id(String id) {
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

  public AgentPoolLocator item(String item) {
    this.item = item;
    return this;
  }

   /**
   * Supply multiple locators and return a union of the results.
   * @return item
  **/
  @ApiModelProperty(value = "Supply multiple locators and return a union of the results.")
  public String getItem() {
    return item;
  }

  public void setItem(String item) {
    this.item = item;
  }

  public AgentPoolLocator name(String name) {
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

  public AgentPoolLocator project(String project) {
    this.project = project;
    return this;
  }

   /**
   * Pool&#39;s associated projects locator.
   * @return project
  **/
  @ApiModelProperty(value = "Pool's associated projects locator.")
  public String getProject() {
    return project;
  }

  public void setProject(String project) {
    this.project = project;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgentPoolLocator agentPoolLocator = (AgentPoolLocator) o;
    return Objects.equals(this.agent, agentPoolLocator.agent) &&
        Objects.equals(this.id, agentPoolLocator.id) &&
        Objects.equals(this.item, agentPoolLocator.item) &&
        Objects.equals(this.name, agentPoolLocator.name) &&
        Objects.equals(this.project, agentPoolLocator.project);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agent, id, item, name, project);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgentPoolLocator {\n");
    
    sb.append("    agent: ").append(toIndentedString(agent)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    item: ").append(toIndentedString(item)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
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

