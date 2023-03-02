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
import io.swagger.client.model.BuildType;
import io.swagger.client.model.BuildTypes;
import io.swagger.client.model.CloudProfiles;
import io.swagger.client.model.Links;
import io.swagger.client.model.Project;
import io.swagger.client.model.ProjectFeatures;
import io.swagger.client.model.Projects;
import io.swagger.client.model.Properties;
import io.swagger.client.model.StateField;
import io.swagger.client.model.VcsRoots;
import java.io.IOException;

/**
 * Represents a project.
 */
@ApiModel(description = "Represents a project.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-02-26T16:22:21.476Z")
public class Project {
  @SerializedName("id")
  private String id = null;

  @SerializedName("internalId")
  private String internalId = null;

  @SerializedName("uuid")
  private String uuid = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("parentProjectId")
  private String parentProjectId = null;

  @SerializedName("parentProjectInternalId")
  private String parentProjectInternalId = null;

  @SerializedName("parentProjectName")
  private String parentProjectName = null;

  @SerializedName("archived")
  private Boolean archived = null;

  @SerializedName("virtual")
  private Boolean virtual = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("href")
  private String href = null;

  @SerializedName("webUrl")
  private String webUrl = null;

  @SerializedName("links")
  private Links links = null;

  @SerializedName("parentProject")
  private Project parentProject = null;

  @SerializedName("readOnlyUI")
  private StateField readOnlyUI = null;

  @SerializedName("defaultTemplate")
  private BuildType defaultTemplate = null;

  @SerializedName("buildTypes")
  private BuildTypes buildTypes = null;

  @SerializedName("templates")
  private BuildTypes templates = null;

  @SerializedName("parameters")
  private Properties parameters = null;

  @SerializedName("vcsRoots")
  private VcsRoots vcsRoots = null;

  @SerializedName("projectFeatures")
  private ProjectFeatures projectFeatures = null;

  @SerializedName("projects")
  private Projects projects = null;

  @SerializedName("cloudProfiles")
  private CloudProfiles cloudProfiles = null;

  @SerializedName("ancestorProjects")
  private Projects ancestorProjects = null;

  @SerializedName("locator")
  private String locator = null;

  public Project id(String id) {
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

  public Project internalId(String internalId) {
    this.internalId = internalId;
    return this;
  }

   /**
   * Get internalId
   * @return internalId
  **/
  @ApiModelProperty(value = "")
  public String getInternalId() {
    return internalId;
  }

  public void setInternalId(String internalId) {
    this.internalId = internalId;
  }

  public Project uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

   /**
   * Get uuid
   * @return uuid
  **/
  @ApiModelProperty(value = "")
  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  public Project name(String name) {
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

  public Project parentProjectId(String parentProjectId) {
    this.parentProjectId = parentProjectId;
    return this;
  }

   /**
   * Get parentProjectId
   * @return parentProjectId
  **/
  @ApiModelProperty(value = "")
  public String getParentProjectId() {
    return parentProjectId;
  }

  public void setParentProjectId(String parentProjectId) {
    this.parentProjectId = parentProjectId;
  }

  public Project parentProjectInternalId(String parentProjectInternalId) {
    this.parentProjectInternalId = parentProjectInternalId;
    return this;
  }

   /**
   * Get parentProjectInternalId
   * @return parentProjectInternalId
  **/
  @ApiModelProperty(value = "")
  public String getParentProjectInternalId() {
    return parentProjectInternalId;
  }

  public void setParentProjectInternalId(String parentProjectInternalId) {
    this.parentProjectInternalId = parentProjectInternalId;
  }

  public Project parentProjectName(String parentProjectName) {
    this.parentProjectName = parentProjectName;
    return this;
  }

   /**
   * Get parentProjectName
   * @return parentProjectName
  **/
  @ApiModelProperty(value = "")
  public String getParentProjectName() {
    return parentProjectName;
  }

  public void setParentProjectName(String parentProjectName) {
    this.parentProjectName = parentProjectName;
  }

  public Project archived(Boolean archived) {
    this.archived = archived;
    return this;
  }

   /**
   * Get archived
   * @return archived
  **/
  @ApiModelProperty(value = "")
  public Boolean isArchived() {
    return archived;
  }

  public void setArchived(Boolean archived) {
    this.archived = archived;
  }

  public Project virtual(Boolean virtual) {
    this.virtual = virtual;
    return this;
  }

   /**
   * Get virtual
   * @return virtual
  **/
  @ApiModelProperty(value = "")
  public Boolean isVirtual() {
    return virtual;
  }

  public void setVirtual(Boolean virtual) {
    this.virtual = virtual;
  }

  public Project description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Project href(String href) {
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

  public Project webUrl(String webUrl) {
    this.webUrl = webUrl;
    return this;
  }

   /**
   * Get webUrl
   * @return webUrl
  **/
  @ApiModelProperty(value = "")
  public String getWebUrl() {
    return webUrl;
  }

  public void setWebUrl(String webUrl) {
    this.webUrl = webUrl;
  }

  public Project links(Links links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(value = "")
  public Links getLinks() {
    return links;
  }

  public void setLinks(Links links) {
    this.links = links;
  }

  public Project parentProject(Project parentProject) {
    this.parentProject = parentProject;
    return this;
  }

   /**
   * Get parentProject
   * @return parentProject
  **/
  @ApiModelProperty(value = "")
  public Project getParentProject() {
    return parentProject;
  }

  public void setParentProject(Project parentProject) {
    this.parentProject = parentProject;
  }

  public Project readOnlyUI(StateField readOnlyUI) {
    this.readOnlyUI = readOnlyUI;
    return this;
  }

   /**
   * Get readOnlyUI
   * @return readOnlyUI
  **/
  @ApiModelProperty(value = "")
  public StateField getReadOnlyUI() {
    return readOnlyUI;
  }

  public void setReadOnlyUI(StateField readOnlyUI) {
    this.readOnlyUI = readOnlyUI;
  }

  public Project defaultTemplate(BuildType defaultTemplate) {
    this.defaultTemplate = defaultTemplate;
    return this;
  }

   /**
   * Get defaultTemplate
   * @return defaultTemplate
  **/
  @ApiModelProperty(value = "")
  public BuildType getDefaultTemplate() {
    return defaultTemplate;
  }

  public void setDefaultTemplate(BuildType defaultTemplate) {
    this.defaultTemplate = defaultTemplate;
  }

  public Project buildTypes(BuildTypes buildTypes) {
    this.buildTypes = buildTypes;
    return this;
  }

   /**
   * Get buildTypes
   * @return buildTypes
  **/
  @ApiModelProperty(value = "")
  public BuildTypes getBuildTypes() {
    return buildTypes;
  }

  public void setBuildTypes(BuildTypes buildTypes) {
    this.buildTypes = buildTypes;
  }

  public Project templates(BuildTypes templates) {
    this.templates = templates;
    return this;
  }

   /**
   * Get templates
   * @return templates
  **/
  @ApiModelProperty(value = "")
  public BuildTypes getTemplates() {
    return templates;
  }

  public void setTemplates(BuildTypes templates) {
    this.templates = templates;
  }

  public Project parameters(Properties parameters) {
    this.parameters = parameters;
    return this;
  }

   /**
   * Get parameters
   * @return parameters
  **/
  @ApiModelProperty(value = "")
  public Properties getParameters() {
    return parameters;
  }

  public void setParameters(Properties parameters) {
    this.parameters = parameters;
  }

  public Project vcsRoots(VcsRoots vcsRoots) {
    this.vcsRoots = vcsRoots;
    return this;
  }

   /**
   * Get vcsRoots
   * @return vcsRoots
  **/
  @ApiModelProperty(value = "")
  public VcsRoots getVcsRoots() {
    return vcsRoots;
  }

  public void setVcsRoots(VcsRoots vcsRoots) {
    this.vcsRoots = vcsRoots;
  }

  public Project projectFeatures(ProjectFeatures projectFeatures) {
    this.projectFeatures = projectFeatures;
    return this;
  }

   /**
   * Get projectFeatures
   * @return projectFeatures
  **/
  @ApiModelProperty(value = "")
  public ProjectFeatures getProjectFeatures() {
    return projectFeatures;
  }

  public void setProjectFeatures(ProjectFeatures projectFeatures) {
    this.projectFeatures = projectFeatures;
  }

  public Project projects(Projects projects) {
    this.projects = projects;
    return this;
  }

   /**
   * Get projects
   * @return projects
  **/
  @ApiModelProperty(value = "")
  public Projects getProjects() {
    return projects;
  }

  public void setProjects(Projects projects) {
    this.projects = projects;
  }

  public Project cloudProfiles(CloudProfiles cloudProfiles) {
    this.cloudProfiles = cloudProfiles;
    return this;
  }

   /**
   * Get cloudProfiles
   * @return cloudProfiles
  **/
  @ApiModelProperty(value = "")
  public CloudProfiles getCloudProfiles() {
    return cloudProfiles;
  }

  public void setCloudProfiles(CloudProfiles cloudProfiles) {
    this.cloudProfiles = cloudProfiles;
  }

  public Project ancestorProjects(Projects ancestorProjects) {
    this.ancestorProjects = ancestorProjects;
    return this;
  }

   /**
   * Get ancestorProjects
   * @return ancestorProjects
  **/
  @ApiModelProperty(value = "")
  public Projects getAncestorProjects() {
    return ancestorProjects;
  }

  public void setAncestorProjects(Projects ancestorProjects) {
    this.ancestorProjects = ancestorProjects;
  }

  public Project locator(String locator) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Project project = (Project) o;
    return Objects.equals(this.id, project.id) &&
        Objects.equals(this.internalId, project.internalId) &&
        Objects.equals(this.uuid, project.uuid) &&
        Objects.equals(this.name, project.name) &&
        Objects.equals(this.parentProjectId, project.parentProjectId) &&
        Objects.equals(this.parentProjectInternalId, project.parentProjectInternalId) &&
        Objects.equals(this.parentProjectName, project.parentProjectName) &&
        Objects.equals(this.archived, project.archived) &&
        Objects.equals(this.virtual, project.virtual) &&
        Objects.equals(this.description, project.description) &&
        Objects.equals(this.href, project.href) &&
        Objects.equals(this.webUrl, project.webUrl) &&
        Objects.equals(this.links, project.links) &&
        Objects.equals(this.parentProject, project.parentProject) &&
        Objects.equals(this.readOnlyUI, project.readOnlyUI) &&
        Objects.equals(this.defaultTemplate, project.defaultTemplate) &&
        Objects.equals(this.buildTypes, project.buildTypes) &&
        Objects.equals(this.templates, project.templates) &&
        Objects.equals(this.parameters, project.parameters) &&
        Objects.equals(this.vcsRoots, project.vcsRoots) &&
        Objects.equals(this.projectFeatures, project.projectFeatures) &&
        Objects.equals(this.projects, project.projects) &&
        Objects.equals(this.cloudProfiles, project.cloudProfiles) &&
        Objects.equals(this.ancestorProjects, project.ancestorProjects) &&
        Objects.equals(this.locator, project.locator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, internalId, uuid, name, parentProjectId, parentProjectInternalId, parentProjectName, archived, virtual, description, href, webUrl, links, parentProject, readOnlyUI, defaultTemplate, buildTypes, templates, parameters, vcsRoots, projectFeatures, projects, cloudProfiles, ancestorProjects, locator);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Project {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    internalId: ").append(toIndentedString(internalId)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    parentProjectId: ").append(toIndentedString(parentProjectId)).append("\n");
    sb.append("    parentProjectInternalId: ").append(toIndentedString(parentProjectInternalId)).append("\n");
    sb.append("    parentProjectName: ").append(toIndentedString(parentProjectName)).append("\n");
    sb.append("    archived: ").append(toIndentedString(archived)).append("\n");
    sb.append("    virtual: ").append(toIndentedString(virtual)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    webUrl: ").append(toIndentedString(webUrl)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    parentProject: ").append(toIndentedString(parentProject)).append("\n");
    sb.append("    readOnlyUI: ").append(toIndentedString(readOnlyUI)).append("\n");
    sb.append("    defaultTemplate: ").append(toIndentedString(defaultTemplate)).append("\n");
    sb.append("    buildTypes: ").append(toIndentedString(buildTypes)).append("\n");
    sb.append("    templates: ").append(toIndentedString(templates)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    vcsRoots: ").append(toIndentedString(vcsRoots)).append("\n");
    sb.append("    projectFeatures: ").append(toIndentedString(projectFeatures)).append("\n");
    sb.append("    projects: ").append(toIndentedString(projects)).append("\n");
    sb.append("    cloudProfiles: ").append(toIndentedString(cloudProfiles)).append("\n");
    sb.append("    ancestorProjects: ").append(toIndentedString(ancestorProjects)).append("\n");
    sb.append("    locator: ").append(toIndentedString(locator)).append("\n");
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

