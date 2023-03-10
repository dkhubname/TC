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
 * Represents a locator string for filtering Agent entities.
 */
@ApiModel(description = "Represents a locator string for filtering Agent entities.")

public class AgentLocator {
  @SerializedName("authorized")
  private Boolean authorized = null;

  @SerializedName("build")
  private String build = null;

  @SerializedName("compatible")
  private String compatible = null;

  @SerializedName("connected")
  private Boolean connected = null;

  @SerializedName("count")
  private Integer count = null;

  @SerializedName("enabled")
  private Boolean enabled = null;

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("ip")
  private String ip = null;

  @SerializedName("item")
  private String item = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("parameter")
  private String parameter = null;

  @SerializedName("pool")
  private String pool = null;

  @SerializedName("start")
  private Integer start = null;

  public AgentLocator authorized(Boolean authorized) {
    this.authorized = authorized;
    return this;
  }

   /**
   * Is the agent authorized.
   * @return authorized
  **/
  @ApiModelProperty(value = "Is the agent authorized.")
  public Boolean isAuthorized() {
    return authorized;
  }

  public void setAuthorized(Boolean authorized) {
    this.authorized = authorized;
  }

  public AgentLocator build(String build) {
    this.build = build;
    return this;
  }

   /**
   * Build locator.
   * @return build
  **/
  @ApiModelProperty(value = "Build locator.")
  public String getBuild() {
    return build;
  }

  public void setBuild(String build) {
    this.build = build;
  }

  public AgentLocator compatible(String compatible) {
    this.compatible = compatible;
    return this;
  }

   /**
   * Compatible build types locator.
   * @return compatible
  **/
  @ApiModelProperty(value = "Compatible build types locator.")
  public String getCompatible() {
    return compatible;
  }

  public void setCompatible(String compatible) {
    this.compatible = compatible;
  }

  public AgentLocator connected(Boolean connected) {
    this.connected = connected;
    return this;
  }

   /**
   * Is the agent connected.
   * @return connected
  **/
  @ApiModelProperty(value = "Is the agent connected.")
  public Boolean isConnected() {
    return connected;
  }

  public void setConnected(Boolean connected) {
    this.connected = connected;
  }

  public AgentLocator count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * For paginated calls, how many entities to return per page.
   * @return count
  **/
  @ApiModelProperty(value = "For paginated calls, how many entities to return per page.")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public AgentLocator enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Is the agent enabled.
   * @return enabled
  **/
  @ApiModelProperty(value = "Is the agent enabled.")
  public Boolean isEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public AgentLocator id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Entity ID.
   * @return id
  **/
  @ApiModelProperty(value = "Entity ID.")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public AgentLocator ip(String ip) {
    this.ip = ip;
    return this;
  }

   /**
   * Get ip
   * @return ip
  **/
  @ApiModelProperty(value = "")
  public String getIp() {
    return ip;
  }

  public void setIp(String ip) {
    this.ip = ip;
  }

  public AgentLocator item(String item) {
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

  public AgentLocator name(String name) {
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

  public AgentLocator parameter(String parameter) {
    this.parameter = parameter;
    return this;
  }

   /**
   * Get parameter
   * @return parameter
  **/
  @ApiModelProperty(value = "")
  public String getParameter() {
    return parameter;
  }

  public void setParameter(String parameter) {
    this.parameter = parameter;
  }

  public AgentLocator pool(String pool) {
    this.pool = pool;
    return this;
  }

   /**
   * Agent pool locator.
   * @return pool
  **/
  @ApiModelProperty(value = "Agent pool locator.")
  public String getPool() {
    return pool;
  }

  public void setPool(String pool) {
    this.pool = pool;
  }

  public AgentLocator start(Integer start) {
    this.start = start;
    return this;
  }

   /**
   * For paginated calls, from which entity to start rendering the page.
   * @return start
  **/
  @ApiModelProperty(value = "For paginated calls, from which entity to start rendering the page.")
  public Integer getStart() {
    return start;
  }

  public void setStart(Integer start) {
    this.start = start;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgentLocator agentLocator = (AgentLocator) o;
    return Objects.equals(this.authorized, agentLocator.authorized) &&
        Objects.equals(this.build, agentLocator.build) &&
        Objects.equals(this.compatible, agentLocator.compatible) &&
        Objects.equals(this.connected, agentLocator.connected) &&
        Objects.equals(this.count, agentLocator.count) &&
        Objects.equals(this.enabled, agentLocator.enabled) &&
        Objects.equals(this.id, agentLocator.id) &&
        Objects.equals(this.ip, agentLocator.ip) &&
        Objects.equals(this.item, agentLocator.item) &&
        Objects.equals(this.name, agentLocator.name) &&
        Objects.equals(this.parameter, agentLocator.parameter) &&
        Objects.equals(this.pool, agentLocator.pool) &&
        Objects.equals(this.start, agentLocator.start);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authorized, build, compatible, connected, count, enabled, id, ip, item, name, parameter, pool, start);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgentLocator {\n");
    
    sb.append("    authorized: ").append(toIndentedString(authorized)).append("\n");
    sb.append("    build: ").append(toIndentedString(build)).append("\n");
    sb.append("    compatible: ").append(toIndentedString(compatible)).append("\n");
    sb.append("    connected: ").append(toIndentedString(connected)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
    sb.append("    item: ").append(toIndentedString(item)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    parameter: ").append(toIndentedString(parameter)).append("\n");
    sb.append("    pool: ").append(toIndentedString(pool)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
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

