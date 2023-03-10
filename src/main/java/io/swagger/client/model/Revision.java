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
import io.swagger.client.model.VcsRootInstance;
import java.io.IOException;

/**
 * Represents a revision related to a VCS change.
 */
@ApiModel(description = "Represents a revision related to a VCS change.")

public class Revision {
  @SerializedName("version")
  private String version = null;

  @SerializedName("internalVersion")
  private String internalVersion = null;

  @SerializedName("vcsBranchName")
  private String vcsBranchName = null;

  @SerializedName("vcs-root-instance")
  private VcsRootInstance vcsRootInstance = null;

  @SerializedName("checkout-rules")
  private String checkoutRules = null;

  public Revision version(String version) {
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @ApiModelProperty(value = "")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public Revision internalVersion(String internalVersion) {
    this.internalVersion = internalVersion;
    return this;
  }

   /**
   * Get internalVersion
   * @return internalVersion
  **/
  @ApiModelProperty(value = "")
  public String getInternalVersion() {
    return internalVersion;
  }

  public void setInternalVersion(String internalVersion) {
    this.internalVersion = internalVersion;
  }

  public Revision vcsBranchName(String vcsBranchName) {
    this.vcsBranchName = vcsBranchName;
    return this;
  }

   /**
   * Get vcsBranchName
   * @return vcsBranchName
  **/
  @ApiModelProperty(value = "")
  public String getVcsBranchName() {
    return vcsBranchName;
  }

  public void setVcsBranchName(String vcsBranchName) {
    this.vcsBranchName = vcsBranchName;
  }

  public Revision vcsRootInstance(VcsRootInstance vcsRootInstance) {
    this.vcsRootInstance = vcsRootInstance;
    return this;
  }

   /**
   * Get vcsRootInstance
   * @return vcsRootInstance
  **/
  @ApiModelProperty(value = "")
  public VcsRootInstance getVcsRootInstance() {
    return vcsRootInstance;
  }

  public void setVcsRootInstance(VcsRootInstance vcsRootInstance) {
    this.vcsRootInstance = vcsRootInstance;
  }

  public Revision checkoutRules(String checkoutRules) {
    this.checkoutRules = checkoutRules;
    return this;
  }

   /**
   * Get checkoutRules
   * @return checkoutRules
  **/
  @ApiModelProperty(value = "")
  public String getCheckoutRules() {
    return checkoutRules;
  }

  public void setCheckoutRules(String checkoutRules) {
    this.checkoutRules = checkoutRules;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Revision revision = (Revision) o;
    return Objects.equals(this.version, revision.version) &&
        Objects.equals(this.internalVersion, revision.internalVersion) &&
        Objects.equals(this.vcsBranchName, revision.vcsBranchName) &&
        Objects.equals(this.vcsRootInstance, revision.vcsRootInstance) &&
        Objects.equals(this.checkoutRules, revision.checkoutRules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, internalVersion, vcsBranchName, vcsRootInstance, checkoutRules);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Revision {\n");
    
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    internalVersion: ").append(toIndentedString(internalVersion)).append("\n");
    sb.append("    vcsBranchName: ").append(toIndentedString(vcsBranchName)).append("\n");
    sb.append("    vcsRootInstance: ").append(toIndentedString(vcsRootInstance)).append("\n");
    sb.append("    checkoutRules: ").append(toIndentedString(checkoutRules)).append("\n");
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

