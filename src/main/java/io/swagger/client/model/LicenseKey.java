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
 * Represents a license key details.
 */
@ApiModel(description = "Represents a license key details.")

public class LicenseKey {
  @SerializedName("valid")
  private Boolean valid = null;

  @SerializedName("active")
  private Boolean active = null;

  @SerializedName("expired")
  private Boolean expired = null;

  @SerializedName("obsolete")
  private Boolean obsolete = null;

  @SerializedName("expirationDate")
  private String expirationDate = null;

  @SerializedName("maintenanceEndDate")
  private String maintenanceEndDate = null;

  /**
   * Gets or Sets type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    EVALUATION("evaluation"),
    
    EAP("eap"),
    
    OPEN_SOURCE("open_source"),
    
    COMMERCIAL("commercial"),
    
    ENTERPRISE("enterprise"),
    
    PROFESSIONAL("professional");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("type")
  private TypeEnum type = null;

  @SerializedName("servers")
  private Integer servers = null;

  @SerializedName("agents")
  private Integer agents = null;

  @SerializedName("unlimitedAgents")
  private Boolean unlimitedAgents = null;

  @SerializedName("buildTypes")
  private Integer buildTypes = null;

  @SerializedName("unlimitedBuildTypes")
  private Boolean unlimitedBuildTypes = null;

  @SerializedName("errorDetails")
  private String errorDetails = null;

  @SerializedName("key")
  private String key = null;

  @SerializedName("rawType")
  private String rawType = null;

  public LicenseKey valid(Boolean valid) {
    this.valid = valid;
    return this;
  }

   /**
   * Get valid
   * @return valid
  **/
  @ApiModelProperty(value = "")
  public Boolean isValid() {
    return valid;
  }

  public void setValid(Boolean valid) {
    this.valid = valid;
  }

  public LicenseKey active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
  **/
  @ApiModelProperty(value = "")
  public Boolean isActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public LicenseKey expired(Boolean expired) {
    this.expired = expired;
    return this;
  }

   /**
   * Get expired
   * @return expired
  **/
  @ApiModelProperty(value = "")
  public Boolean isExpired() {
    return expired;
  }

  public void setExpired(Boolean expired) {
    this.expired = expired;
  }

  public LicenseKey obsolete(Boolean obsolete) {
    this.obsolete = obsolete;
    return this;
  }

   /**
   * Get obsolete
   * @return obsolete
  **/
  @ApiModelProperty(value = "")
  public Boolean isObsolete() {
    return obsolete;
  }

  public void setObsolete(Boolean obsolete) {
    this.obsolete = obsolete;
  }

  public LicenseKey expirationDate(String expirationDate) {
    this.expirationDate = expirationDate;
    return this;
  }

   /**
   * Get expirationDate
   * @return expirationDate
  **/
  @ApiModelProperty(value = "")
  public String getExpirationDate() {
    return expirationDate;
  }

  public void setExpirationDate(String expirationDate) {
    this.expirationDate = expirationDate;
  }

  public LicenseKey maintenanceEndDate(String maintenanceEndDate) {
    this.maintenanceEndDate = maintenanceEndDate;
    return this;
  }

   /**
   * Get maintenanceEndDate
   * @return maintenanceEndDate
  **/
  @ApiModelProperty(value = "")
  public String getMaintenanceEndDate() {
    return maintenanceEndDate;
  }

  public void setMaintenanceEndDate(String maintenanceEndDate) {
    this.maintenanceEndDate = maintenanceEndDate;
  }

  public LicenseKey type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public LicenseKey servers(Integer servers) {
    this.servers = servers;
    return this;
  }

   /**
   * Get servers
   * @return servers
  **/
  @ApiModelProperty(value = "")
  public Integer getServers() {
    return servers;
  }

  public void setServers(Integer servers) {
    this.servers = servers;
  }

  public LicenseKey agents(Integer agents) {
    this.agents = agents;
    return this;
  }

   /**
   * Get agents
   * @return agents
  **/
  @ApiModelProperty(value = "")
  public Integer getAgents() {
    return agents;
  }

  public void setAgents(Integer agents) {
    this.agents = agents;
  }

  public LicenseKey unlimitedAgents(Boolean unlimitedAgents) {
    this.unlimitedAgents = unlimitedAgents;
    return this;
  }

   /**
   * Get unlimitedAgents
   * @return unlimitedAgents
  **/
  @ApiModelProperty(value = "")
  public Boolean isUnlimitedAgents() {
    return unlimitedAgents;
  }

  public void setUnlimitedAgents(Boolean unlimitedAgents) {
    this.unlimitedAgents = unlimitedAgents;
  }

  public LicenseKey buildTypes(Integer buildTypes) {
    this.buildTypes = buildTypes;
    return this;
  }

   /**
   * Get buildTypes
   * @return buildTypes
  **/
  @ApiModelProperty(value = "")
  public Integer getBuildTypes() {
    return buildTypes;
  }

  public void setBuildTypes(Integer buildTypes) {
    this.buildTypes = buildTypes;
  }

  public LicenseKey unlimitedBuildTypes(Boolean unlimitedBuildTypes) {
    this.unlimitedBuildTypes = unlimitedBuildTypes;
    return this;
  }

   /**
   * Get unlimitedBuildTypes
   * @return unlimitedBuildTypes
  **/
  @ApiModelProperty(value = "")
  public Boolean isUnlimitedBuildTypes() {
    return unlimitedBuildTypes;
  }

  public void setUnlimitedBuildTypes(Boolean unlimitedBuildTypes) {
    this.unlimitedBuildTypes = unlimitedBuildTypes;
  }

  public LicenseKey errorDetails(String errorDetails) {
    this.errorDetails = errorDetails;
    return this;
  }

   /**
   * Get errorDetails
   * @return errorDetails
  **/
  @ApiModelProperty(value = "")
  public String getErrorDetails() {
    return errorDetails;
  }

  public void setErrorDetails(String errorDetails) {
    this.errorDetails = errorDetails;
  }

  public LicenseKey key(String key) {
    this.key = key;
    return this;
  }

   /**
   * Get key
   * @return key
  **/
  @ApiModelProperty(value = "")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public LicenseKey rawType(String rawType) {
    this.rawType = rawType;
    return this;
  }

   /**
   * Get rawType
   * @return rawType
  **/
  @ApiModelProperty(value = "")
  public String getRawType() {
    return rawType;
  }

  public void setRawType(String rawType) {
    this.rawType = rawType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LicenseKey licenseKey = (LicenseKey) o;
    return Objects.equals(this.valid, licenseKey.valid) &&
        Objects.equals(this.active, licenseKey.active) &&
        Objects.equals(this.expired, licenseKey.expired) &&
        Objects.equals(this.obsolete, licenseKey.obsolete) &&
        Objects.equals(this.expirationDate, licenseKey.expirationDate) &&
        Objects.equals(this.maintenanceEndDate, licenseKey.maintenanceEndDate) &&
        Objects.equals(this.type, licenseKey.type) &&
        Objects.equals(this.servers, licenseKey.servers) &&
        Objects.equals(this.agents, licenseKey.agents) &&
        Objects.equals(this.unlimitedAgents, licenseKey.unlimitedAgents) &&
        Objects.equals(this.buildTypes, licenseKey.buildTypes) &&
        Objects.equals(this.unlimitedBuildTypes, licenseKey.unlimitedBuildTypes) &&
        Objects.equals(this.errorDetails, licenseKey.errorDetails) &&
        Objects.equals(this.key, licenseKey.key) &&
        Objects.equals(this.rawType, licenseKey.rawType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valid, active, expired, obsolete, expirationDate, maintenanceEndDate, type, servers, agents, unlimitedAgents, buildTypes, unlimitedBuildTypes, errorDetails, key, rawType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LicenseKey {\n");
    
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    expired: ").append(toIndentedString(expired)).append("\n");
    sb.append("    obsolete: ").append(toIndentedString(obsolete)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    maintenanceEndDate: ").append(toIndentedString(maintenanceEndDate)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    servers: ").append(toIndentedString(servers)).append("\n");
    sb.append("    agents: ").append(toIndentedString(agents)).append("\n");
    sb.append("    unlimitedAgents: ").append(toIndentedString(unlimitedAgents)).append("\n");
    sb.append("    buildTypes: ").append(toIndentedString(buildTypes)).append("\n");
    sb.append("    unlimitedBuildTypes: ").append(toIndentedString(unlimitedBuildTypes)).append("\n");
    sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    rawType: ").append(toIndentedString(rawType)).append("\n");
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

