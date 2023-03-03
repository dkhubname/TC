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
import io.swagger.client.model.LicenseKeys;
import java.io.IOException;

/**
 * Represents license state details (available build configurations, agents, etc.).
 */
@ApiModel(description = "Represents license state details (available build configurations, agents, etc.).")

public class LicensingData {
  @SerializedName("licenseUseExceeded")
  private Boolean licenseUseExceeded = null;

  @SerializedName("maxAgents")
  private Integer maxAgents = null;

  @SerializedName("unlimitedAgents")
  private Boolean unlimitedAgents = null;

  @SerializedName("maxBuildTypes")
  private Integer maxBuildTypes = null;

  @SerializedName("unlimitedBuildTypes")
  private Boolean unlimitedBuildTypes = null;

  @SerializedName("buildTypesLeft")
  private Integer buildTypesLeft = null;

  /**
   * Gets or Sets serverLicenseType
   */
  @JsonAdapter(ServerLicenseTypeEnum.Adapter.class)
  public enum ServerLicenseTypeEnum {
    EVALUATION("evaluation"),
    
    EAP("eap"),
    
    OPEN_SOURCE("open_source"),
    
    COMMERCIAL("commercial"),
    
    ENTERPRISE("enterprise"),
    
    PROFESSIONAL("professional");

    private String value;

    ServerLicenseTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ServerLicenseTypeEnum fromValue(String text) {
      for (ServerLicenseTypeEnum b : ServerLicenseTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ServerLicenseTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ServerLicenseTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ServerLicenseTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ServerLicenseTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("serverLicenseType")
  private ServerLicenseTypeEnum serverLicenseType = null;

  @SerializedName("serverEffectiveReleaseDate")
  private String serverEffectiveReleaseDate = null;

  @SerializedName("agentsLeft")
  private Integer agentsLeft = null;

  @SerializedName("licenseKeys")
  private LicenseKeys licenseKeys = null;

  public LicensingData licenseUseExceeded(Boolean licenseUseExceeded) {
    this.licenseUseExceeded = licenseUseExceeded;
    return this;
  }

   /**
   * Get licenseUseExceeded
   * @return licenseUseExceeded
  **/
  @ApiModelProperty(value = "")
  public Boolean isLicenseUseExceeded() {
    return licenseUseExceeded;
  }

  public void setLicenseUseExceeded(Boolean licenseUseExceeded) {
    this.licenseUseExceeded = licenseUseExceeded;
  }

  public LicensingData maxAgents(Integer maxAgents) {
    this.maxAgents = maxAgents;
    return this;
  }

   /**
   * Get maxAgents
   * @return maxAgents
  **/
  @ApiModelProperty(value = "")
  public Integer getMaxAgents() {
    return maxAgents;
  }

  public void setMaxAgents(Integer maxAgents) {
    this.maxAgents = maxAgents;
  }

  public LicensingData unlimitedAgents(Boolean unlimitedAgents) {
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

  public LicensingData maxBuildTypes(Integer maxBuildTypes) {
    this.maxBuildTypes = maxBuildTypes;
    return this;
  }

   /**
   * Get maxBuildTypes
   * @return maxBuildTypes
  **/
  @ApiModelProperty(value = "")
  public Integer getMaxBuildTypes() {
    return maxBuildTypes;
  }

  public void setMaxBuildTypes(Integer maxBuildTypes) {
    this.maxBuildTypes = maxBuildTypes;
  }

  public LicensingData unlimitedBuildTypes(Boolean unlimitedBuildTypes) {
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

  public LicensingData buildTypesLeft(Integer buildTypesLeft) {
    this.buildTypesLeft = buildTypesLeft;
    return this;
  }

   /**
   * Get buildTypesLeft
   * @return buildTypesLeft
  **/
  @ApiModelProperty(value = "")
  public Integer getBuildTypesLeft() {
    return buildTypesLeft;
  }

  public void setBuildTypesLeft(Integer buildTypesLeft) {
    this.buildTypesLeft = buildTypesLeft;
  }

  public LicensingData serverLicenseType(ServerLicenseTypeEnum serverLicenseType) {
    this.serverLicenseType = serverLicenseType;
    return this;
  }

   /**
   * Get serverLicenseType
   * @return serverLicenseType
  **/
  @ApiModelProperty(value = "")
  public ServerLicenseTypeEnum getServerLicenseType() {
    return serverLicenseType;
  }

  public void setServerLicenseType(ServerLicenseTypeEnum serverLicenseType) {
    this.serverLicenseType = serverLicenseType;
  }

  public LicensingData serverEffectiveReleaseDate(String serverEffectiveReleaseDate) {
    this.serverEffectiveReleaseDate = serverEffectiveReleaseDate;
    return this;
  }

   /**
   * Get serverEffectiveReleaseDate
   * @return serverEffectiveReleaseDate
  **/
  @ApiModelProperty(value = "")
  public String getServerEffectiveReleaseDate() {
    return serverEffectiveReleaseDate;
  }

  public void setServerEffectiveReleaseDate(String serverEffectiveReleaseDate) {
    this.serverEffectiveReleaseDate = serverEffectiveReleaseDate;
  }

  public LicensingData agentsLeft(Integer agentsLeft) {
    this.agentsLeft = agentsLeft;
    return this;
  }

   /**
   * Get agentsLeft
   * @return agentsLeft
  **/
  @ApiModelProperty(value = "")
  public Integer getAgentsLeft() {
    return agentsLeft;
  }

  public void setAgentsLeft(Integer agentsLeft) {
    this.agentsLeft = agentsLeft;
  }

  public LicensingData licenseKeys(LicenseKeys licenseKeys) {
    this.licenseKeys = licenseKeys;
    return this;
  }

   /**
   * Get licenseKeys
   * @return licenseKeys
  **/
  @ApiModelProperty(value = "")
  public LicenseKeys getLicenseKeys() {
    return licenseKeys;
  }

  public void setLicenseKeys(LicenseKeys licenseKeys) {
    this.licenseKeys = licenseKeys;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LicensingData licensingData = (LicensingData) o;
    return Objects.equals(this.licenseUseExceeded, licensingData.licenseUseExceeded) &&
        Objects.equals(this.maxAgents, licensingData.maxAgents) &&
        Objects.equals(this.unlimitedAgents, licensingData.unlimitedAgents) &&
        Objects.equals(this.maxBuildTypes, licensingData.maxBuildTypes) &&
        Objects.equals(this.unlimitedBuildTypes, licensingData.unlimitedBuildTypes) &&
        Objects.equals(this.buildTypesLeft, licensingData.buildTypesLeft) &&
        Objects.equals(this.serverLicenseType, licensingData.serverLicenseType) &&
        Objects.equals(this.serverEffectiveReleaseDate, licensingData.serverEffectiveReleaseDate) &&
        Objects.equals(this.agentsLeft, licensingData.agentsLeft) &&
        Objects.equals(this.licenseKeys, licensingData.licenseKeys);
  }

  @Override
  public int hashCode() {
    return Objects.hash(licenseUseExceeded, maxAgents, unlimitedAgents, maxBuildTypes, unlimitedBuildTypes, buildTypesLeft, serverLicenseType, serverEffectiveReleaseDate, agentsLeft, licenseKeys);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LicensingData {\n");
    
    sb.append("    licenseUseExceeded: ").append(toIndentedString(licenseUseExceeded)).append("\n");
    sb.append("    maxAgents: ").append(toIndentedString(maxAgents)).append("\n");
    sb.append("    unlimitedAgents: ").append(toIndentedString(unlimitedAgents)).append("\n");
    sb.append("    maxBuildTypes: ").append(toIndentedString(maxBuildTypes)).append("\n");
    sb.append("    unlimitedBuildTypes: ").append(toIndentedString(unlimitedBuildTypes)).append("\n");
    sb.append("    buildTypesLeft: ").append(toIndentedString(buildTypesLeft)).append("\n");
    sb.append("    serverLicenseType: ").append(toIndentedString(serverLicenseType)).append("\n");
    sb.append("    serverEffectiveReleaseDate: ").append(toIndentedString(serverEffectiveReleaseDate)).append("\n");
    sb.append("    agentsLeft: ").append(toIndentedString(agentsLeft)).append("\n");
    sb.append("    licenseKeys: ").append(toIndentedString(licenseKeys)).append("\n");
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

