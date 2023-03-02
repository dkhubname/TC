
# Agent

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** |  |  [optional]
**name** | **String** |  |  [optional]
**typeId** | **Integer** |  |  [optional]
**connected** | **Boolean** |  |  [optional]
**enabled** | **Boolean** |  |  [optional]
**authorized** | **Boolean** |  |  [optional]
**uptodate** | **Boolean** |  |  [optional]
**outdated** | **Boolean** |  |  [optional]
**pluginsOutdated** | **Boolean** |  |  [optional]
**javaOutdated** | **Boolean** |  |  [optional]
**ip** | **String** |  |  [optional]
**protocol** | [**ProtocolEnum**](#ProtocolEnum) |  |  [optional]
**version** | **String** |  |  [optional]
**currentAgentVersion** | **String** |  |  [optional]
**lastActivityTime** | **String** |  |  [optional]
**idleSinceTime** | **String** |  |  [optional]
**disconnectionComment** | **String** |  |  [optional]
**registrationTimestamp** | **String** |  |  [optional]
**host** | **String** |  |  [optional]
**cpuRank** | **Integer** |  |  [optional]
**port** | **Integer** |  |  [optional]
**href** | **String** |  |  [optional]
**webUrl** | **String** |  |  [optional]
**build** | [**Build**](Build.md) |  |  [optional]
**links** | [**Links**](Links.md) |  |  [optional]
**enabledInfo** | [**EnabledInfo**](EnabledInfo.md) |  |  [optional]
**authorizedInfo** | [**AuthorizedInfo**](AuthorizedInfo.md) |  |  [optional]
**properties** | [**Properties**](Properties.md) |  |  [optional]
**cloudInstance** | [**CloudInstance**](CloudInstance.md) |  |  [optional]
**cloudImage** | [**CloudImage**](CloudImage.md) |  |  [optional]
**environment** | [**Environment**](Environment.md) |  |  [optional]
**pool** | [**AgentPool**](AgentPool.md) |  |  [optional]
**compatibilityPolicy** | [**CompatibilityPolicy**](CompatibilityPolicy.md) |  |  [optional]
**compatibleBuildTypes** | [**BuildTypes**](BuildTypes.md) |  |  [optional]
**incompatibleBuildTypes** | [**Compatibilities**](Compatibilities.md) |  |  [optional]
**builds** | [**Builds**](Builds.md) |  |  [optional]
**locator** | **String** |  |  [optional]


<a name="ProtocolEnum"></a>
## Enum: ProtocolEnum
Name | Value
---- | -----
UNIDIRECTIONAL | &quot;unidirectional&quot;
BIDIRECTIONAL | &quot;bidirectional&quot;



