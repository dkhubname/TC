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
import io.swagger.client.model.DisabledResponsibilities;
import io.swagger.client.model.EffectiveResponsibilities;
import io.swagger.client.model.EnabledResponsibilities;
import java.io.IOException;

/**
 * Represents a TeamCity node.
 */
@ApiModel(description = "Represents a TeamCity node.")

public class Node {
  @SerializedName("id")
  private String id = null;

  @SerializedName("url")
  private String url = null;

  /**
   * Gets or Sets state
   */
  @JsonAdapter(StateEnum.Adapter.class)
  public enum StateEnum {
    ONLINE("online"),
    
    OFFLINE("offline"),
    
    STOPPING("stopping"),
    
    STARTING("starting");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StateEnum fromValue(String text) {
      for (StateEnum b : StateEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StateEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StateEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("state")
  private StateEnum state = null;

  @SerializedName("role")
  private String role = null;

  @SerializedName("current")
  private Boolean current = null;

  @SerializedName("enabledResponsibilities")
  private EnabledResponsibilities enabledResponsibilities = null;

  @SerializedName("disabledResponsibilities")
  private DisabledResponsibilities disabledResponsibilities = null;

  @SerializedName("effectiveResponsibilities")
  private EffectiveResponsibilities effectiveResponsibilities = null;

  public Node id(String id) {
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

  public Node url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @ApiModelProperty(value = "")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public Node state(StateEnum state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @ApiModelProperty(value = "")
  public StateEnum getState() {
    return state;
  }

  public void setState(StateEnum state) {
    this.state = state;
  }

  public Node role(String role) {
    this.role = role;
    return this;
  }

   /**
   * Get role
   * @return role
  **/
  @ApiModelProperty(value = "")
  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public Node current(Boolean current) {
    this.current = current;
    return this;
  }

   /**
   * Get current
   * @return current
  **/
  @ApiModelProperty(value = "")
  public Boolean isCurrent() {
    return current;
  }

  public void setCurrent(Boolean current) {
    this.current = current;
  }

  public Node enabledResponsibilities(EnabledResponsibilities enabledResponsibilities) {
    this.enabledResponsibilities = enabledResponsibilities;
    return this;
  }

   /**
   * Get enabledResponsibilities
   * @return enabledResponsibilities
  **/
  @ApiModelProperty(value = "")
  public EnabledResponsibilities getEnabledResponsibilities() {
    return enabledResponsibilities;
  }

  public void setEnabledResponsibilities(EnabledResponsibilities enabledResponsibilities) {
    this.enabledResponsibilities = enabledResponsibilities;
  }

  public Node disabledResponsibilities(DisabledResponsibilities disabledResponsibilities) {
    this.disabledResponsibilities = disabledResponsibilities;
    return this;
  }

   /**
   * Get disabledResponsibilities
   * @return disabledResponsibilities
  **/
  @ApiModelProperty(value = "")
  public DisabledResponsibilities getDisabledResponsibilities() {
    return disabledResponsibilities;
  }

  public void setDisabledResponsibilities(DisabledResponsibilities disabledResponsibilities) {
    this.disabledResponsibilities = disabledResponsibilities;
  }

  public Node effectiveResponsibilities(EffectiveResponsibilities effectiveResponsibilities) {
    this.effectiveResponsibilities = effectiveResponsibilities;
    return this;
  }

   /**
   * Get effectiveResponsibilities
   * @return effectiveResponsibilities
  **/
  @ApiModelProperty(value = "")
  public EffectiveResponsibilities getEffectiveResponsibilities() {
    return effectiveResponsibilities;
  }

  public void setEffectiveResponsibilities(EffectiveResponsibilities effectiveResponsibilities) {
    this.effectiveResponsibilities = effectiveResponsibilities;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Node node = (Node) o;
    return Objects.equals(this.id, node.id) &&
        Objects.equals(this.url, node.url) &&
        Objects.equals(this.state, node.state) &&
        Objects.equals(this.role, node.role) &&
        Objects.equals(this.current, node.current) &&
        Objects.equals(this.enabledResponsibilities, node.enabledResponsibilities) &&
        Objects.equals(this.disabledResponsibilities, node.disabledResponsibilities) &&
        Objects.equals(this.effectiveResponsibilities, node.effectiveResponsibilities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, url, state, role, current, enabledResponsibilities, disabledResponsibilities, effectiveResponsibilities);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Node {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    current: ").append(toIndentedString(current)).append("\n");
    sb.append("    enabledResponsibilities: ").append(toIndentedString(enabledResponsibilities)).append("\n");
    sb.append("    disabledResponsibilities: ").append(toIndentedString(disabledResponsibilities)).append("\n");
    sb.append("    effectiveResponsibilities: ").append(toIndentedString(effectiveResponsibilities)).append("\n");
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

