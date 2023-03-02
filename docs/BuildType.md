
# BuildType

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** |  |  [optional]
**internalId** | **String** |  |  [optional]
**name** | **String** |  |  [optional]
**templateFlag** | **Boolean** |  |  [optional]
**type** | [**TypeEnum**](#TypeEnum) |  |  [optional]
**paused** | **Boolean** |  |  [optional]
**uuid** | **String** |  |  [optional]
**description** | **String** |  |  [optional]
**projectName** | **String** |  |  [optional]
**projectId** | **String** |  |  [optional]
**projectInternalId** | **String** |  |  [optional]
**href** | **String** |  |  [optional]
**webUrl** | **String** |  |  [optional]
**inherited** | **Boolean** |  |  [optional]
**links** | [**Links**](Links.md) |  |  [optional]
**project** | [**Project**](Project.md) |  |  [optional]
**templates** | [**BuildTypes**](BuildTypes.md) |  |  [optional]
**template** | [**BuildType**](BuildType.md) |  |  [optional]
**vcsRootEntries** | [**VcsRootEntries**](VcsRootEntries.md) |  |  [optional]
**settings** | [**Properties**](Properties.md) |  |  [optional]
**parameters** | [**Properties**](Properties.md) |  |  [optional]
**steps** | [**Steps**](Steps.md) |  |  [optional]
**features** | [**Features**](Features.md) |  |  [optional]
**triggers** | [**Triggers**](Triggers.md) |  |  [optional]
**snapshotDependencies** | [**SnapshotDependencies**](SnapshotDependencies.md) |  |  [optional]
**artifactDependencies** | [**ArtifactDependencies**](ArtifactDependencies.md) |  |  [optional]
**agentRequirements** | [**AgentRequirements**](AgentRequirements.md) |  |  [optional]
**branches** | [**Branches**](Branches.md) |  |  [optional]
**builds** | [**Builds**](Builds.md) |  |  [optional]
**investigations** | [**Investigations**](Investigations.md) |  |  [optional]
**compatibleAgents** | [**Agents**](Agents.md) |  |  [optional]
**vcsRootInstances** | [**VcsRootInstances**](VcsRootInstances.md) |  |  [optional]
**externalStatusAllowed** | **Boolean** |  |  [optional]
**pauseComment** | [**Comment**](Comment.md) |  |  [optional]
**locator** | **String** |  |  [optional]


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
REGULAR | &quot;regular&quot;
COMPOSITE | &quot;composite&quot;
DEPLOYMENT | &quot;deployment&quot;



