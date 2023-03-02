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
import io.swagger.client.model.AgentPool;
import io.swagger.client.model.AuthorizedInfo;
import io.swagger.client.model.Build;
import io.swagger.client.model.BuildTypes;
import io.swagger.client.model.Builds;
import io.swagger.client.model.CloudImage;
import io.swagger.client.model.CloudInstance;
import io.swagger.client.model.Compatibilities;
import io.swagger.client.model.CompatibilityPolicy;
import io.swagger.client.model.EnabledInfo;
import io.swagger.client.model.Environment;
import io.swagger.client.model.Links;
import io.swagger.client.model.Properties;
import java.io.IOException;

/**
 * Represents a known agent instance.
 */
@ApiModel(description = "Represents a known agent instance.")
public class Agent {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("typeId")
  private Integer typeId = null;

  @SerializedName("connected")
  private Boolean connected = null;

  @SerializedName("enabled")
  private Boolean enabled = null;

  @SerializedName("authorized")
  private Boolean authorized = null;

  @SerializedName("uptodate")
  private Boolean uptodate = null;

  @SerializedName("outdated")
  private Boolean outdated = null;

  @SerializedName("pluginsOutdated")
  private Boolean pluginsOutdated = null;

  @SerializedName("javaOutdated")
  private Boolean javaOutdated = null;

  @SerializedName("ip")
  private String ip = null;

  /**
   * Gets or Sets protocol
   */
  @JsonAdapter(ProtocolEnum.Adapter.class)
  public enum ProtocolEnum {
    UNIDIRECTIONAL("unidirectional"),
    
    BIDIRECTIONAL("bidirectional");

    private String value;

    ProtocolEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ProtocolEnum fromValue(String text) {
      for (ProtocolEnum b : ProtocolEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ProtocolEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ProtocolEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ProtocolEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ProtocolEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("protocol")
  private ProtocolEnum protocol = null;

  @SerializedName("version")
  private String version = null;

  @SerializedName("currentAgentVersion")
  private String currentAgentVersion = null;

  @SerializedName("lastActivityTime")
  private String lastActivityTime = null;

  @SerializedName("idleSinceTime")
  private String idleSinceTime = null;

  @SerializedName("disconnectionComment")
  private String disconnectionComment = null;

  @SerializedName("registrationTimestamp")
  private String registrationTimestamp = null;

  @SerializedName("host")
  private String host = null;

  @SerializedName("cpuRank")
  private Integer cpuRank = null;

  @SerializedName("port")
  private Integer port = null;

  @SerializedName("href")
  private String href = null;

  @SerializedName("webUrl")
  private String webUrl = null;

  @SerializedName("build")
  private Build build = null;

  @SerializedName("links")
  private Links links = null;

  @SerializedName("enabledInfo")
  private EnabledInfo enabledInfo = null;

  @SerializedName("authorizedInfo")
  private AuthorizedInfo authorizedInfo = null;

  @SerializedName("properties")
  private Properties properties = null;

  @SerializedName("cloudInstance")
  private CloudInstance cloudInstance = null;

  @SerializedName("cloudImage")
  private CloudImage cloudImage = null;

  @SerializedName("environment")
  private Environment environment = null;

  @SerializedName("pool")
  private AgentPool pool = null;

  @SerializedName("compatibilityPolicy")
  private CompatibilityPolicy compatibilityPolicy = null;

  @SerializedName("compatibleBuildTypes")
  private BuildTypes compatibleBuildTypes = null;

  @SerializedName("incompatibleBuildTypes")
  private Compatibilities incompatibleBuildTypes = null;

  @SerializedName("builds")
  private Builds builds = null;

  @SerializedName("locator")
  private String locator = null;

  public Agent id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Agent name(String name) {
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

  public Agent typeId(Integer typeId) {
    this.typeId = typeId;
    return this;
  }

   /**
   * Get typeId
   * @return typeId
  **/
  @ApiModelProperty(value = "")
  public Integer getTypeId() {
    return typeId;
  }

  public void setTypeId(Integer typeId) {
    this.typeId = typeId;
  }

  public Agent connected(Boolean connected) {
    this.connected = connected;
    return this;
  }

   /**
   * Get connected
   * @return connected
  **/
  @ApiModelProperty(value = "")
  public Boolean isConnected() {
    return connected;
  }

  public void setConnected(Boolean connected) {
    this.connected = connected;
  }

  public Agent enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Get enabled
   * @return enabled
  **/
  @ApiModelProperty(value = "")
  public Boolean isEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public Agent authorized(Boolean authorized) {
    this.authorized = authorized;
    return this;
  }

   /**
   * Get authorized
   * @return authorized
  **/
  @ApiModelProperty(value = "")
  public Boolean isAuthorized() {
    return authorized;
  }

  public void setAuthorized(Boolean authorized) {
    this.authorized = authorized;
  }

  public Agent uptodate(Boolean uptodate) {
    this.uptodate = uptodate;
    return this;
  }

   /**
   * Get uptodate
   * @return uptodate
  **/
  @ApiModelProperty(value = "")
  public Boolean isUptodate() {
    return uptodate;
  }

  public void setUptodate(Boolean uptodate) {
    this.uptodate = uptodate;
  }

  public Agent outdated(Boolean outdated) {
    this.outdated = outdated;
    return this;
  }

   /**
   * Get outdated
   * @return outdated
  **/
  @ApiModelProperty(value = "")
  public Boolean isOutdated() {
    return outdated;
  }

  public void setOutdated(Boolean outdated) {
    this.outdated = outdated;
  }

  public Agent pluginsOutdated(Boolean pluginsOutdated) {
    this.pluginsOutdated = pluginsOutdated;
    return this;
  }

   /**
   * Get pluginsOutdated
   * @return pluginsOutdated
  **/
  @ApiModelProperty(value = "")
  public Boolean isPluginsOutdated() {
    return pluginsOutdated;
  }

  public void setPluginsOutdated(Boolean pluginsOutdated) {
    this.pluginsOutdated = pluginsOutdated;
  }

  public Agent javaOutdated(Boolean javaOutdated) {
    this.javaOutdated = javaOutdated;
    return this;
  }

   /**
   * Get javaOutdated
   * @return javaOutdated
  **/
  @ApiModelProperty(value = "")
  public Boolean isJavaOutdated() {
    return javaOutdated;
  }

  public void setJavaOutdated(Boolean javaOutdated) {
    this.javaOutdated = javaOutdated;
  }

  public Agent ip(String ip) {
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

  public Agent protocol(ProtocolEnum protocol) {
    this.protocol = protocol;
    return this;
  }

   /**
   * Get protocol
   * @return protocol
  **/
  @ApiModelProperty(value = "")
  public ProtocolEnum getProtocol() {
    return protocol;
  }

  public void setProtocol(ProtocolEnum protocol) {
    this.protocol = protocol;
  }

  public Agent version(String version) {
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

  public Agent currentAgentVersion(String currentAgentVersion) {
    this.currentAgentVersion = currentAgentVersion;
    return this;
  }

   /**
   * Get currentAgentVersion
   * @return currentAgentVersion
  **/
  @ApiModelProperty(value = "")
  public String getCurrentAgentVersion() {
    return currentAgentVersion;
  }

  public void setCurrentAgentVersion(String currentAgentVersion) {
    this.currentAgentVersion = currentAgentVersion;
  }

  public Agent lastActivityTime(String lastActivityTime) {
    this.lastActivityTime = lastActivityTime;
    return this;
  }

   /**
   * Get lastActivityTime
   * @return lastActivityTime
  **/
  @ApiModelProperty(value = "")
  public String getLastActivityTime() {
    return lastActivityTime;
  }

  public void setLastActivityTime(String lastActivityTime) {
    this.lastActivityTime = lastActivityTime;
  }

  public Agent idleSinceTime(String idleSinceTime) {
    this.idleSinceTime = idleSinceTime;
    return this;
  }

   /**
   * Get idleSinceTime
   * @return idleSinceTime
  **/
  @ApiModelProperty(value = "")
  public String getIdleSinceTime() {
    return idleSinceTime;
  }

  public void setIdleSinceTime(String idleSinceTime) {
    this.idleSinceTime = idleSinceTime;
  }

  public Agent disconnectionComment(String disconnectionComment) {
    this.disconnectionComment = disconnectionComment;
    return this;
  }

   /**
   * Get disconnectionComment
   * @return disconnectionComment
  **/
  @ApiModelProperty(value = "")
  public String getDisconnectionComment() {
    return disconnectionComment;
  }

  public void setDisconnectionComment(String disconnectionComment) {
    this.disconnectionComment = disconnectionComment;
  }

  public Agent registrationTimestamp(String registrationTimestamp) {
    this.registrationTimestamp = registrationTimestamp;
    return this;
  }

   /**
   * Get registrationTimestamp
   * @return registrationTimestamp
  **/
  @ApiModelProperty(value = "")
  public String getRegistrationTimestamp() {
    return registrationTimestamp;
  }

  public void setRegistrationTimestamp(String registrationTimestamp) {
    this.registrationTimestamp = registrationTimestamp;
  }

  public Agent host(String host) {
    this.host = host;
    return this;
  }

   /**
   * Get host
   * @return host
  **/
  @ApiModelProperty(value = "")
  public String getHost() {
    return host;
  }

  public void setHost(String host) {
    this.host = host;
  }

  public Agent cpuRank(Integer cpuRank) {
    this.cpuRank = cpuRank;
    return this;
  }

   /**
   * Get cpuRank
   * @return cpuRank
  **/
  @ApiModelProperty(value = "")
  public Integer getCpuRank() {
    return cpuRank;
  }

  public void setCpuRank(Integer cpuRank) {
    this.cpuRank = cpuRank;
  }

  public Agent port(Integer port) {
    this.port = port;
    return this;
  }

   /**
   * Get port
   * @return port
  **/
  @ApiModelProperty(value = "")
  public Integer getPort() {
    return port;
  }

  public void setPort(Integer port) {
    this.port = port;
  }

  public Agent href(String href) {
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

  public Agent webUrl(String webUrl) {
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

  public Agent build(Build build) {
    this.build = build;
    return this;
  }

   /**
   * Get build
   * @return build
  **/
  @ApiModelProperty(value = "")
  public Build getBuild() {
    return build;
  }

  public void setBuild(Build build) {
    this.build = build;
  }

  public Agent links(Links links) {
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

  public Agent enabledInfo(EnabledInfo enabledInfo) {
    this.enabledInfo = enabledInfo;
    return this;
  }

   /**
   * Get enabledInfo
   * @return enabledInfo
  **/
  @ApiModelProperty(value = "")
  public EnabledInfo getEnabledInfo() {
    return enabledInfo;
  }

  public void setEnabledInfo(EnabledInfo enabledInfo) {
    this.enabledInfo = enabledInfo;
  }

  public Agent authorizedInfo(AuthorizedInfo authorizedInfo) {
    this.authorizedInfo = authorizedInfo;
    return this;
  }

   /**
   * Get authorizedInfo
   * @return authorizedInfo
  **/
  @ApiModelProperty(value = "")
  public AuthorizedInfo getAuthorizedInfo() {
    return authorizedInfo;
  }

  public void setAuthorizedInfo(AuthorizedInfo authorizedInfo) {
    this.authorizedInfo = authorizedInfo;
  }

  public Agent properties(Properties properties) {
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

  public Agent cloudInstance(CloudInstance cloudInstance) {
    this.cloudInstance = cloudInstance;
    return this;
  }

   /**
   * Get cloudInstance
   * @return cloudInstance
  **/
  @ApiModelProperty(value = "")
  public CloudInstance getCloudInstance() {
    return cloudInstance;
  }

  public void setCloudInstance(CloudInstance cloudInstance) {
    this.cloudInstance = cloudInstance;
  }

  public Agent cloudImage(CloudImage cloudImage) {
    this.cloudImage = cloudImage;
    return this;
  }

   /**
   * Get cloudImage
   * @return cloudImage
  **/
  @ApiModelProperty(value = "")
  public CloudImage getCloudImage() {
    return cloudImage;
  }

  public void setCloudImage(CloudImage cloudImage) {
    this.cloudImage = cloudImage;
  }

  public Agent environment(Environment environment) {
    this.environment = environment;
    return this;
  }

   /**
   * Get environment
   * @return environment
  **/
  @ApiModelProperty(value = "")
  public Environment getEnvironment() {
    return environment;
  }

  public void setEnvironment(Environment environment) {
    this.environment = environment;
  }

  public Agent pool(AgentPool pool) {
    this.pool = pool;
    return this;
  }

   /**
   * Get pool
   * @return pool
  **/
  @ApiModelProperty(value = "")
  public AgentPool getPool() {
    return pool;
  }

  public void setPool(AgentPool pool) {
    this.pool = pool;
  }

  public Agent compatibilityPolicy(CompatibilityPolicy compatibilityPolicy) {
    this.compatibilityPolicy = compatibilityPolicy;
    return this;
  }

   /**
   * Get compatibilityPolicy
   * @return compatibilityPolicy
  **/
  @ApiModelProperty(value = "")
  public CompatibilityPolicy getCompatibilityPolicy() {
    return compatibilityPolicy;
  }

  public void setCompatibilityPolicy(CompatibilityPolicy compatibilityPolicy) {
    this.compatibilityPolicy = compatibilityPolicy;
  }

  public Agent compatibleBuildTypes(BuildTypes compatibleBuildTypes) {
    this.compatibleBuildTypes = compatibleBuildTypes;
    return this;
  }

   /**
   * Get compatibleBuildTypes
   * @return compatibleBuildTypes
  **/
  @ApiModelProperty(value = "")
  public BuildTypes getCompatibleBuildTypes() {
    return compatibleBuildTypes;
  }

  public void setCompatibleBuildTypes(BuildTypes compatibleBuildTypes) {
    this.compatibleBuildTypes = compatibleBuildTypes;
  }

  public Agent incompatibleBuildTypes(Compatibilities incompatibleBuildTypes) {
    this.incompatibleBuildTypes = incompatibleBuildTypes;
    return this;
  }

   /**
   * Get incompatibleBuildTypes
   * @return incompatibleBuildTypes
  **/
  @ApiModelProperty(value = "")
  public Compatibilities getIncompatibleBuildTypes() {
    return incompatibleBuildTypes;
  }

  public void setIncompatibleBuildTypes(Compatibilities incompatibleBuildTypes) {
    this.incompatibleBuildTypes = incompatibleBuildTypes;
  }

  public Agent builds(Builds builds) {
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

  public Agent locator(String locator) {
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
    Agent agent = (Agent) o;
    return Objects.equals(this.id, agent.id) &&
        Objects.equals(this.name, agent.name) &&
        Objects.equals(this.typeId, agent.typeId) &&
        Objects.equals(this.connected, agent.connected) &&
        Objects.equals(this.enabled, agent.enabled) &&
        Objects.equals(this.authorized, agent.authorized) &&
        Objects.equals(this.uptodate, agent.uptodate) &&
        Objects.equals(this.outdated, agent.outdated) &&
        Objects.equals(this.pluginsOutdated, agent.pluginsOutdated) &&
        Objects.equals(this.javaOutdated, agent.javaOutdated) &&
        Objects.equals(this.ip, agent.ip) &&
        Objects.equals(this.protocol, agent.protocol) &&
        Objects.equals(this.version, agent.version) &&
        Objects.equals(this.currentAgentVersion, agent.currentAgentVersion) &&
        Objects.equals(this.lastActivityTime, agent.lastActivityTime) &&
        Objects.equals(this.idleSinceTime, agent.idleSinceTime) &&
        Objects.equals(this.disconnectionComment, agent.disconnectionComment) &&
        Objects.equals(this.registrationTimestamp, agent.registrationTimestamp) &&
        Objects.equals(this.host, agent.host) &&
        Objects.equals(this.cpuRank, agent.cpuRank) &&
        Objects.equals(this.port, agent.port) &&
        Objects.equals(this.href, agent.href) &&
        Objects.equals(this.webUrl, agent.webUrl) &&
        Objects.equals(this.build, agent.build) &&
        Objects.equals(this.links, agent.links) &&
        Objects.equals(this.enabledInfo, agent.enabledInfo) &&
        Objects.equals(this.authorizedInfo, agent.authorizedInfo) &&
        Objects.equals(this.properties, agent.properties) &&
        Objects.equals(this.cloudInstance, agent.cloudInstance) &&
        Objects.equals(this.cloudImage, agent.cloudImage) &&
        Objects.equals(this.environment, agent.environment) &&
        Objects.equals(this.pool, agent.pool) &&
        Objects.equals(this.compatibilityPolicy, agent.compatibilityPolicy) &&
        Objects.equals(this.compatibleBuildTypes, agent.compatibleBuildTypes) &&
        Objects.equals(this.incompatibleBuildTypes, agent.incompatibleBuildTypes) &&
        Objects.equals(this.builds, agent.builds) &&
        Objects.equals(this.locator, agent.locator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, typeId, connected, enabled, authorized, uptodate, outdated, pluginsOutdated, javaOutdated, ip, protocol, version, currentAgentVersion, lastActivityTime, idleSinceTime, disconnectionComment, registrationTimestamp, host, cpuRank, port, href, webUrl, build, links, enabledInfo, authorizedInfo, properties, cloudInstance, cloudImage, environment, pool, compatibilityPolicy, compatibleBuildTypes, incompatibleBuildTypes, builds, locator);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Agent {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    typeId: ").append(toIndentedString(typeId)).append("\n");
    sb.append("    connected: ").append(toIndentedString(connected)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    authorized: ").append(toIndentedString(authorized)).append("\n");
    sb.append("    uptodate: ").append(toIndentedString(uptodate)).append("\n");
    sb.append("    outdated: ").append(toIndentedString(outdated)).append("\n");
    sb.append("    pluginsOutdated: ").append(toIndentedString(pluginsOutdated)).append("\n");
    sb.append("    javaOutdated: ").append(toIndentedString(javaOutdated)).append("\n");
    sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    currentAgentVersion: ").append(toIndentedString(currentAgentVersion)).append("\n");
    sb.append("    lastActivityTime: ").append(toIndentedString(lastActivityTime)).append("\n");
    sb.append("    idleSinceTime: ").append(toIndentedString(idleSinceTime)).append("\n");
    sb.append("    disconnectionComment: ").append(toIndentedString(disconnectionComment)).append("\n");
    sb.append("    registrationTimestamp: ").append(toIndentedString(registrationTimestamp)).append("\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    cpuRank: ").append(toIndentedString(cpuRank)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    webUrl: ").append(toIndentedString(webUrl)).append("\n");
    sb.append("    build: ").append(toIndentedString(build)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    enabledInfo: ").append(toIndentedString(enabledInfo)).append("\n");
    sb.append("    authorizedInfo: ").append(toIndentedString(authorizedInfo)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    cloudInstance: ").append(toIndentedString(cloudInstance)).append("\n");
    sb.append("    cloudImage: ").append(toIndentedString(cloudImage)).append("\n");
    sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
    sb.append("    pool: ").append(toIndentedString(pool)).append("\n");
    sb.append("    compatibilityPolicy: ").append(toIndentedString(compatibilityPolicy)).append("\n");
    sb.append("    compatibleBuildTypes: ").append(toIndentedString(compatibleBuildTypes)).append("\n");
    sb.append("    incompatibleBuildTypes: ").append(toIndentedString(incompatibleBuildTypes)).append("\n");
    sb.append("    builds: ").append(toIndentedString(builds)).append("\n");
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

