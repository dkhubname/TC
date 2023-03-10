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
import io.swagger.client.model.AgentRequirements;
import io.swagger.client.model.Agents;
import io.swagger.client.model.ArtifactDependencies;
import io.swagger.client.model.Branches;
import io.swagger.client.model.BuildType;
import io.swagger.client.model.BuildTypes;
import io.swagger.client.model.Builds;
import io.swagger.client.model.Comment;
import io.swagger.client.model.Features;
import io.swagger.client.model.Investigations;
import io.swagger.client.model.Links;
import io.swagger.client.model.Project;
import io.swagger.client.model.Properties;
import io.swagger.client.model.SnapshotDependencies;
import io.swagger.client.model.Steps;
import io.swagger.client.model.Triggers;
import io.swagger.client.model.VcsRootEntries;
import io.swagger.client.model.VcsRootInstances;
import java.io.IOException;

/**
 * Represents a build configuration.
 */
@ApiModel(description = "Represents a build configuration.")

public class BuildType {
  @SerializedName("id")
  private String id = null;

  @SerializedName("internalId")
  private String internalId = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("templateFlag")
  private Boolean templateFlag = null;

  /**
   * Gets or Sets type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    REGULAR("regular"),
    
    COMPOSITE("composite"),
    
    DEPLOYMENT("deployment");

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

  @SerializedName("paused")
  private Boolean paused = null;

  @SerializedName("uuid")
  private String uuid = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("projectName")
  private String projectName = null;

  @SerializedName("projectId")
  private String projectId = null;

  @SerializedName("projectInternalId")
  private String projectInternalId = null;

  @SerializedName("href")
  private String href = null;

  @SerializedName("webUrl")
  private String webUrl = null;

  @SerializedName("inherited")
  private Boolean inherited = null;

  @SerializedName("links")
  private Links links = null;

  @SerializedName("project")
  private Project project = null;

  @SerializedName("templates")
  private BuildTypes templates = null;

  @SerializedName("template")
  private BuildType template = null;

  @SerializedName("vcs-root-entries")
  private VcsRootEntries vcsRootEntries = null;

  @SerializedName("settings")
  private Properties settings = null;

  @SerializedName("parameters")
  private Properties parameters = null;

  @SerializedName("steps")
  private Steps steps = null;

  @SerializedName("features")
  private Features features = null;

  @SerializedName("triggers")
  private Triggers triggers = null;

  @SerializedName("snapshot-dependencies")
  private SnapshotDependencies snapshotDependencies = null;

  @SerializedName("artifact-dependencies")
  private ArtifactDependencies artifactDependencies = null;

  @SerializedName("agent-requirements")
  private AgentRequirements agentRequirements = null;

  @SerializedName("branches")
  private Branches branches = null;

  @SerializedName("builds")
  private Builds builds = null;

  @SerializedName("investigations")
  private Investigations investigations = null;

  @SerializedName("compatibleAgents")
  private Agents compatibleAgents = null;

  @SerializedName("vcsRootInstances")
  private VcsRootInstances vcsRootInstances = null;

  @SerializedName("externalStatusAllowed")
  private Boolean externalStatusAllowed = null;

  @SerializedName("pauseComment")
  private Comment pauseComment = null;

  @SerializedName("locator")
  private String locator = null;

  public BuildType id(String id) {
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

  public BuildType internalId(String internalId) {
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

  public BuildType name(String name) {
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

  public BuildType templateFlag(Boolean templateFlag) {
    this.templateFlag = templateFlag;
    return this;
  }

   /**
   * Get templateFlag
   * @return templateFlag
  **/
  @ApiModelProperty(value = "")
  public Boolean isTemplateFlag() {
    return templateFlag;
  }

  public void setTemplateFlag(Boolean templateFlag) {
    this.templateFlag = templateFlag;
  }

  public BuildType type(TypeEnum type) {
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

  public BuildType paused(Boolean paused) {
    this.paused = paused;
    return this;
  }

   /**
   * Get paused
   * @return paused
  **/
  @ApiModelProperty(value = "")
  public Boolean isPaused() {
    return paused;
  }

  public void setPaused(Boolean paused) {
    this.paused = paused;
  }

  public BuildType uuid(String uuid) {
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

  public BuildType description(String description) {
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

  public BuildType projectName(String projectName) {
    this.projectName = projectName;
    return this;
  }

   /**
   * Get projectName
   * @return projectName
  **/
  @ApiModelProperty(value = "")
  public String getProjectName() {
    return projectName;
  }

  public void setProjectName(String projectName) {
    this.projectName = projectName;
  }

  public BuildType projectId(String projectId) {
    this.projectId = projectId;
    return this;
  }

   /**
   * Get projectId
   * @return projectId
  **/
  @ApiModelProperty(value = "")
  public String getProjectId() {
    return projectId;
  }

  public void setProjectId(String projectId) {
    this.projectId = projectId;
  }

  public BuildType projectInternalId(String projectInternalId) {
    this.projectInternalId = projectInternalId;
    return this;
  }

   /**
   * Get projectInternalId
   * @return projectInternalId
  **/
  @ApiModelProperty(value = "")
  public String getProjectInternalId() {
    return projectInternalId;
  }

  public void setProjectInternalId(String projectInternalId) {
    this.projectInternalId = projectInternalId;
  }

  public BuildType href(String href) {
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

  public BuildType webUrl(String webUrl) {
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

  public BuildType inherited(Boolean inherited) {
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

  public BuildType links(Links links) {
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

  public BuildType project(Project project) {
    this.project = project;
    return this;
  }

   /**
   * Get project
   * @return project
  **/
  @ApiModelProperty(value = "")
  public Project getProject() {
    return project;
  }

  public void setProject(Project project) {
    this.project = project;
  }

  public BuildType templates(BuildTypes templates) {
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

  public BuildType template(BuildType template) {
    this.template = template;
    return this;
  }

   /**
   * Get template
   * @return template
  **/
  @ApiModelProperty(value = "")
  public BuildType getTemplate() {
    return template;
  }

  public void setTemplate(BuildType template) {
    this.template = template;
  }

  public BuildType vcsRootEntries(VcsRootEntries vcsRootEntries) {
    this.vcsRootEntries = vcsRootEntries;
    return this;
  }

   /**
   * Get vcsRootEntries
   * @return vcsRootEntries
  **/
  @ApiModelProperty(value = "")
  public VcsRootEntries getVcsRootEntries() {
    return vcsRootEntries;
  }

  public void setVcsRootEntries(VcsRootEntries vcsRootEntries) {
    this.vcsRootEntries = vcsRootEntries;
  }

  public BuildType settings(Properties settings) {
    this.settings = settings;
    return this;
  }

   /**
   * Get settings
   * @return settings
  **/
  @ApiModelProperty(value = "")
  public Properties getSettings() {
    return settings;
  }

  public void setSettings(Properties settings) {
    this.settings = settings;
  }

  public BuildType parameters(Properties parameters) {
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

  public BuildType steps(Steps steps) {
    this.steps = steps;
    return this;
  }

   /**
   * Get steps
   * @return steps
  **/
  @ApiModelProperty(value = "")
  public Steps getSteps() {
    return steps;
  }

  public void setSteps(Steps steps) {
    this.steps = steps;
  }

  public BuildType features(Features features) {
    this.features = features;
    return this;
  }

   /**
   * Get features
   * @return features
  **/
  @ApiModelProperty(value = "")
  public Features getFeatures() {
    return features;
  }

  public void setFeatures(Features features) {
    this.features = features;
  }

  public BuildType triggers(Triggers triggers) {
    this.triggers = triggers;
    return this;
  }

   /**
   * Get triggers
   * @return triggers
  **/
  @ApiModelProperty(value = "")
  public Triggers getTriggers() {
    return triggers;
  }

  public void setTriggers(Triggers triggers) {
    this.triggers = triggers;
  }

  public BuildType snapshotDependencies(SnapshotDependencies snapshotDependencies) {
    this.snapshotDependencies = snapshotDependencies;
    return this;
  }

   /**
   * Get snapshotDependencies
   * @return snapshotDependencies
  **/
  @ApiModelProperty(value = "")
  public SnapshotDependencies getSnapshotDependencies() {
    return snapshotDependencies;
  }

  public void setSnapshotDependencies(SnapshotDependencies snapshotDependencies) {
    this.snapshotDependencies = snapshotDependencies;
  }

  public BuildType artifactDependencies(ArtifactDependencies artifactDependencies) {
    this.artifactDependencies = artifactDependencies;
    return this;
  }

   /**
   * Get artifactDependencies
   * @return artifactDependencies
  **/
  @ApiModelProperty(value = "")
  public ArtifactDependencies getArtifactDependencies() {
    return artifactDependencies;
  }

  public void setArtifactDependencies(ArtifactDependencies artifactDependencies) {
    this.artifactDependencies = artifactDependencies;
  }

  public BuildType agentRequirements(AgentRequirements agentRequirements) {
    this.agentRequirements = agentRequirements;
    return this;
  }

   /**
   * Get agentRequirements
   * @return agentRequirements
  **/
  @ApiModelProperty(value = "")
  public AgentRequirements getAgentRequirements() {
    return agentRequirements;
  }

  public void setAgentRequirements(AgentRequirements agentRequirements) {
    this.agentRequirements = agentRequirements;
  }

  public BuildType branches(Branches branches) {
    this.branches = branches;
    return this;
  }

   /**
   * Get branches
   * @return branches
  **/
  @ApiModelProperty(value = "")
  public Branches getBranches() {
    return branches;
  }

  public void setBranches(Branches branches) {
    this.branches = branches;
  }

  public BuildType builds(Builds builds) {
    this.builds = builds;
    return this;
  }

   /**
   * Get builds
   * @return builds
  **/
  @ApiModelProperty(value = "")
  public Builds getBuilds() {
    return builds;
  }

  public void setBuilds(Builds builds) {
    this.builds = builds;
  }

  public BuildType investigations(Investigations investigations) {
    this.investigations = investigations;
    return this;
  }

   /**
   * Get investigations
   * @return investigations
  **/
  @ApiModelProperty(value = "")
  public Investigations getInvestigations() {
    return investigations;
  }

  public void setInvestigations(Investigations investigations) {
    this.investigations = investigations;
  }

  public BuildType compatibleAgents(Agents compatibleAgents) {
    this.compatibleAgents = compatibleAgents;
    return this;
  }

   /**
   * Get compatibleAgents
   * @return compatibleAgents
  **/
  @ApiModelProperty(value = "")
  public Agents getCompatibleAgents() {
    return compatibleAgents;
  }

  public void setCompatibleAgents(Agents compatibleAgents) {
    this.compatibleAgents = compatibleAgents;
  }

  public BuildType vcsRootInstances(VcsRootInstances vcsRootInstances) {
    this.vcsRootInstances = vcsRootInstances;
    return this;
  }

   /**
   * Get vcsRootInstances
   * @return vcsRootInstances
  **/
  @ApiModelProperty(value = "")
  public VcsRootInstances getVcsRootInstances() {
    return vcsRootInstances;
  }

  public void setVcsRootInstances(VcsRootInstances vcsRootInstances) {
    this.vcsRootInstances = vcsRootInstances;
  }

  public BuildType externalStatusAllowed(Boolean externalStatusAllowed) {
    this.externalStatusAllowed = externalStatusAllowed;
    return this;
  }

   /**
   * Get externalStatusAllowed
   * @return externalStatusAllowed
  **/
  @ApiModelProperty(value = "")
  public Boolean isExternalStatusAllowed() {
    return externalStatusAllowed;
  }

  public void setExternalStatusAllowed(Boolean externalStatusAllowed) {
    this.externalStatusAllowed = externalStatusAllowed;
  }

  public BuildType pauseComment(Comment pauseComment) {
    this.pauseComment = pauseComment;
    return this;
  }

   /**
   * Get pauseComment
   * @return pauseComment
  **/
  @ApiModelProperty(value = "")
  public Comment getPauseComment() {
    return pauseComment;
  }

  public void setPauseComment(Comment pauseComment) {
    this.pauseComment = pauseComment;
  }

  public BuildType locator(String locator) {
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
    BuildType buildType = (BuildType) o;
    return Objects.equals(this.id, buildType.id) &&
        Objects.equals(this.internalId, buildType.internalId) &&
        Objects.equals(this.name, buildType.name) &&
        Objects.equals(this.templateFlag, buildType.templateFlag) &&
        Objects.equals(this.type, buildType.type) &&
        Objects.equals(this.paused, buildType.paused) &&
        Objects.equals(this.uuid, buildType.uuid) &&
        Objects.equals(this.description, buildType.description) &&
        Objects.equals(this.projectName, buildType.projectName) &&
        Objects.equals(this.projectId, buildType.projectId) &&
        Objects.equals(this.projectInternalId, buildType.projectInternalId) &&
        Objects.equals(this.href, buildType.href) &&
        Objects.equals(this.webUrl, buildType.webUrl) &&
        Objects.equals(this.inherited, buildType.inherited) &&
        Objects.equals(this.links, buildType.links) &&
        Objects.equals(this.project, buildType.project) &&
        Objects.equals(this.templates, buildType.templates) &&
        Objects.equals(this.template, buildType.template) &&
        Objects.equals(this.vcsRootEntries, buildType.vcsRootEntries) &&
        Objects.equals(this.settings, buildType.settings) &&
        Objects.equals(this.parameters, buildType.parameters) &&
        Objects.equals(this.steps, buildType.steps) &&
        Objects.equals(this.features, buildType.features) &&
        Objects.equals(this.triggers, buildType.triggers) &&
        Objects.equals(this.snapshotDependencies, buildType.snapshotDependencies) &&
        Objects.equals(this.artifactDependencies, buildType.artifactDependencies) &&
        Objects.equals(this.agentRequirements, buildType.agentRequirements) &&
        Objects.equals(this.branches, buildType.branches) &&
        Objects.equals(this.builds, buildType.builds) &&
        Objects.equals(this.investigations, buildType.investigations) &&
        Objects.equals(this.compatibleAgents, buildType.compatibleAgents) &&
        Objects.equals(this.vcsRootInstances, buildType.vcsRootInstances) &&
        Objects.equals(this.externalStatusAllowed, buildType.externalStatusAllowed) &&
        Objects.equals(this.pauseComment, buildType.pauseComment) &&
        Objects.equals(this.locator, buildType.locator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, internalId, name, templateFlag, type, paused, uuid, description, projectName, projectId, projectInternalId, href, webUrl, inherited, links, project, templates, template, vcsRootEntries, settings, parameters, steps, features, triggers, snapshotDependencies, artifactDependencies, agentRequirements, branches, builds, investigations, compatibleAgents, vcsRootInstances, externalStatusAllowed, pauseComment, locator);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuildType {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    internalId: ").append(toIndentedString(internalId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    templateFlag: ").append(toIndentedString(templateFlag)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    paused: ").append(toIndentedString(paused)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    projectInternalId: ").append(toIndentedString(projectInternalId)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    webUrl: ").append(toIndentedString(webUrl)).append("\n");
    sb.append("    inherited: ").append(toIndentedString(inherited)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    templates: ").append(toIndentedString(templates)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("    vcsRootEntries: ").append(toIndentedString(vcsRootEntries)).append("\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    steps: ").append(toIndentedString(steps)).append("\n");
    sb.append("    features: ").append(toIndentedString(features)).append("\n");
    sb.append("    triggers: ").append(toIndentedString(triggers)).append("\n");
    sb.append("    snapshotDependencies: ").append(toIndentedString(snapshotDependencies)).append("\n");
    sb.append("    artifactDependencies: ").append(toIndentedString(artifactDependencies)).append("\n");
    sb.append("    agentRequirements: ").append(toIndentedString(agentRequirements)).append("\n");
    sb.append("    branches: ").append(toIndentedString(branches)).append("\n");
    sb.append("    builds: ").append(toIndentedString(builds)).append("\n");
    sb.append("    investigations: ").append(toIndentedString(investigations)).append("\n");
    sb.append("    compatibleAgents: ").append(toIndentedString(compatibleAgents)).append("\n");
    sb.append("    vcsRootInstances: ").append(toIndentedString(vcsRootInstances)).append("\n");
    sb.append("    externalStatusAllowed: ").append(toIndentedString(externalStatusAllowed)).append("\n");
    sb.append("    pauseComment: ").append(toIndentedString(pauseComment)).append("\n");
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

