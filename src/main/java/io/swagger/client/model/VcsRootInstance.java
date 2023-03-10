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
import io.swagger.client.model.Items;
import io.swagger.client.model.Properties;
import io.swagger.client.model.RepositoryState;
import io.swagger.client.model.VcsRoot;
import io.swagger.client.model.VcsStatus;
import java.io.IOException;

/**
 * Represents a relation between a VCS root and unique settings set for this root.
 */
@ApiModel(description = "Represents a relation between a VCS root and unique settings set for this root.")

public class VcsRootInstance {
  @SerializedName("id")
  private String id = null;

  @SerializedName("vcs-root-id")
  private String vcsRootId = null;

  @SerializedName("vcsRootInternalId")
  private String vcsRootInternalId = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("vcsName")
  private String vcsName = null;

  @SerializedName("modificationCheckInterval")
  private Integer modificationCheckInterval = null;

  @SerializedName("commitHookMode")
  private Boolean commitHookMode = null;

  @SerializedName("lastVersion")
  private String lastVersion = null;

  @SerializedName("lastVersionInternal")
  private String lastVersionInternal = null;

  @SerializedName("href")
  private String href = null;

  @SerializedName("vcs-root")
  private VcsRoot vcsRoot = null;

  @SerializedName("status")
  private VcsStatus status = null;

  @SerializedName("repositoryState")
  private RepositoryState repositoryState = null;

  @SerializedName("properties")
  private Properties properties = null;

  @SerializedName("repositoryIdStrings")
  private Items repositoryIdStrings = null;

  @SerializedName("projectLocator")
  private String projectLocator = null;

  public VcsRootInstance id(String id) {
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

  public VcsRootInstance vcsRootId(String vcsRootId) {
    this.vcsRootId = vcsRootId;
    return this;
  }

   /**
   * Get vcsRootId
   * @return vcsRootId
  **/
  @ApiModelProperty(value = "")
  public String getVcsRootId() {
    return vcsRootId;
  }

  public void setVcsRootId(String vcsRootId) {
    this.vcsRootId = vcsRootId;
  }

  public VcsRootInstance vcsRootInternalId(String vcsRootInternalId) {
    this.vcsRootInternalId = vcsRootInternalId;
    return this;
  }

   /**
   * Get vcsRootInternalId
   * @return vcsRootInternalId
  **/
  @ApiModelProperty(value = "")
  public String getVcsRootInternalId() {
    return vcsRootInternalId;
  }

  public void setVcsRootInternalId(String vcsRootInternalId) {
    this.vcsRootInternalId = vcsRootInternalId;
  }

  public VcsRootInstance name(String name) {
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

  public VcsRootInstance vcsName(String vcsName) {
    this.vcsName = vcsName;
    return this;
  }

   /**
   * Get vcsName
   * @return vcsName
  **/
  @ApiModelProperty(value = "")
  public String getVcsName() {
    return vcsName;
  }

  public void setVcsName(String vcsName) {
    this.vcsName = vcsName;
  }

  public VcsRootInstance modificationCheckInterval(Integer modificationCheckInterval) {
    this.modificationCheckInterval = modificationCheckInterval;
    return this;
  }

   /**
   * Get modificationCheckInterval
   * @return modificationCheckInterval
  **/
  @ApiModelProperty(value = "")
  public Integer getModificationCheckInterval() {
    return modificationCheckInterval;
  }

  public void setModificationCheckInterval(Integer modificationCheckInterval) {
    this.modificationCheckInterval = modificationCheckInterval;
  }

  public VcsRootInstance commitHookMode(Boolean commitHookMode) {
    this.commitHookMode = commitHookMode;
    return this;
  }

   /**
   * Get commitHookMode
   * @return commitHookMode
  **/
  @ApiModelProperty(value = "")
  public Boolean isCommitHookMode() {
    return commitHookMode;
  }

  public void setCommitHookMode(Boolean commitHookMode) {
    this.commitHookMode = commitHookMode;
  }

  public VcsRootInstance lastVersion(String lastVersion) {
    this.lastVersion = lastVersion;
    return this;
  }

   /**
   * Get lastVersion
   * @return lastVersion
  **/
  @ApiModelProperty(value = "")
  public String getLastVersion() {
    return lastVersion;
  }

  public void setLastVersion(String lastVersion) {
    this.lastVersion = lastVersion;
  }

  public VcsRootInstance lastVersionInternal(String lastVersionInternal) {
    this.lastVersionInternal = lastVersionInternal;
    return this;
  }

   /**
   * Get lastVersionInternal
   * @return lastVersionInternal
  **/
  @ApiModelProperty(value = "")
  public String getLastVersionInternal() {
    return lastVersionInternal;
  }

  public void setLastVersionInternal(String lastVersionInternal) {
    this.lastVersionInternal = lastVersionInternal;
  }

  public VcsRootInstance href(String href) {
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

  public VcsRootInstance vcsRoot(VcsRoot vcsRoot) {
    this.vcsRoot = vcsRoot;
    return this;
  }

   /**
   * Get vcsRoot
   * @return vcsRoot
  **/
  @ApiModelProperty(value = "")
  public VcsRoot getVcsRoot() {
    return vcsRoot;
  }

  public void setVcsRoot(VcsRoot vcsRoot) {
    this.vcsRoot = vcsRoot;
  }

  public VcsRootInstance status(VcsStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public VcsStatus getStatus() {
    return status;
  }

  public void setStatus(VcsStatus status) {
    this.status = status;
  }

  public VcsRootInstance repositoryState(RepositoryState repositoryState) {
    this.repositoryState = repositoryState;
    return this;
  }

   /**
   * Get repositoryState
   * @return repositoryState
  **/
  @ApiModelProperty(value = "")
  public RepositoryState getRepositoryState() {
    return repositoryState;
  }

  public void setRepositoryState(RepositoryState repositoryState) {
    this.repositoryState = repositoryState;
  }

  public VcsRootInstance properties(Properties properties) {
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

  public VcsRootInstance repositoryIdStrings(Items repositoryIdStrings) {
    this.repositoryIdStrings = repositoryIdStrings;
    return this;
  }

   /**
   * Get repositoryIdStrings
   * @return repositoryIdStrings
  **/
  @ApiModelProperty(value = "")
  public Items getRepositoryIdStrings() {
    return repositoryIdStrings;
  }

  public void setRepositoryIdStrings(Items repositoryIdStrings) {
    this.repositoryIdStrings = repositoryIdStrings;
  }

  public VcsRootInstance projectLocator(String projectLocator) {
    this.projectLocator = projectLocator;
    return this;
  }

   /**
   * Get projectLocator
   * @return projectLocator
  **/
  @ApiModelProperty(value = "")
  public String getProjectLocator() {
    return projectLocator;
  }

  public void setProjectLocator(String projectLocator) {
    this.projectLocator = projectLocator;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VcsRootInstance vcsRootInstance = (VcsRootInstance) o;
    return Objects.equals(this.id, vcsRootInstance.id) &&
        Objects.equals(this.vcsRootId, vcsRootInstance.vcsRootId) &&
        Objects.equals(this.vcsRootInternalId, vcsRootInstance.vcsRootInternalId) &&
        Objects.equals(this.name, vcsRootInstance.name) &&
        Objects.equals(this.vcsName, vcsRootInstance.vcsName) &&
        Objects.equals(this.modificationCheckInterval, vcsRootInstance.modificationCheckInterval) &&
        Objects.equals(this.commitHookMode, vcsRootInstance.commitHookMode) &&
        Objects.equals(this.lastVersion, vcsRootInstance.lastVersion) &&
        Objects.equals(this.lastVersionInternal, vcsRootInstance.lastVersionInternal) &&
        Objects.equals(this.href, vcsRootInstance.href) &&
        Objects.equals(this.vcsRoot, vcsRootInstance.vcsRoot) &&
        Objects.equals(this.status, vcsRootInstance.status) &&
        Objects.equals(this.repositoryState, vcsRootInstance.repositoryState) &&
        Objects.equals(this.properties, vcsRootInstance.properties) &&
        Objects.equals(this.repositoryIdStrings, vcsRootInstance.repositoryIdStrings) &&
        Objects.equals(this.projectLocator, vcsRootInstance.projectLocator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, vcsRootId, vcsRootInternalId, name, vcsName, modificationCheckInterval, commitHookMode, lastVersion, lastVersionInternal, href, vcsRoot, status, repositoryState, properties, repositoryIdStrings, projectLocator);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VcsRootInstance {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    vcsRootId: ").append(toIndentedString(vcsRootId)).append("\n");
    sb.append("    vcsRootInternalId: ").append(toIndentedString(vcsRootInternalId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    vcsName: ").append(toIndentedString(vcsName)).append("\n");
    sb.append("    modificationCheckInterval: ").append(toIndentedString(modificationCheckInterval)).append("\n");
    sb.append("    commitHookMode: ").append(toIndentedString(commitHookMode)).append("\n");
    sb.append("    lastVersion: ").append(toIndentedString(lastVersion)).append("\n");
    sb.append("    lastVersionInternal: ").append(toIndentedString(lastVersionInternal)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    vcsRoot: ").append(toIndentedString(vcsRoot)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    repositoryState: ").append(toIndentedString(repositoryState)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    repositoryIdStrings: ").append(toIndentedString(repositoryIdStrings)).append("\n");
    sb.append("    projectLocator: ").append(toIndentedString(projectLocator)).append("\n");
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

