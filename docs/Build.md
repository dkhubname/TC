
# Build

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** |  |  [optional]
**taskId** | **Long** |  |  [optional]
**buildTypeId** | **String** |  |  [optional]
**buildTypeInternalId** | **String** |  |  [optional]
**number** | **String** |  |  [optional]
**status** | **String** |  |  [optional]
**state** | [**StateEnum**](#StateEnum) |  |  [optional]
**running** | **Boolean** |  |  [optional]
**composite** | **Boolean** |  |  [optional]
**failedToStart** | **Boolean** |  |  [optional]
**personal** | **Boolean** |  |  [optional]
**percentageComplete** | **Integer** |  |  [optional]
**branchName** | **String** |  |  [optional]
**defaultBranch** | **Boolean** |  |  [optional]
**unspecifiedBranch** | **Boolean** |  |  [optional]
**history** | **Boolean** |  |  [optional]
**pinned** | **Boolean** |  |  [optional]
**href** | **String** |  |  [optional]
**webUrl** | **String** |  |  [optional]
**queuePosition** | **Integer** |  |  [optional]
**limitedChangesCount** | **Integer** |  |  [optional]
**artifactsDirectory** | **String** |  |  [optional]
**links** | [**Links**](Links.md) |  |  [optional]
**statusText** | **String** |  |  [optional]
**buildType** | [**BuildType**](BuildType.md) |  |  [optional]
**comment** | [**Comment**](Comment.md) |  |  [optional]
**tags** | [**Tags**](Tags.md) |  |  [optional]
**pinInfo** | [**Comment**](Comment.md) |  |  [optional]
**user** | [**User**](User.md) |  |  [optional]
**startEstimate** | **String** |  |  [optional]
**waitReason** | **String** |  |  [optional]
**finishEstimate** | **String** |  |  [optional]
**delayedByBuild** | [**Build**](Build.md) |  |  [optional]
**plannedAgent** | [**Agent**](Agent.md) |  |  [optional]
**approvalInfo** | [**ApprovalInfo**](ApprovalInfo.md) |  |  [optional]
**runningInfo** | [**ProgressInfo**](ProgressInfo.md) |  |  [optional]
**canceledInfo** | [**Comment**](Comment.md) |  |  [optional]
**queuedDate** | **String** |  |  [optional]
**startDate** | **String** |  |  [optional]
**finishDate** | **String** |  |  [optional]
**triggered** | [**TriggeredBy**](TriggeredBy.md) |  |  [optional]
**lastChanges** | [**Changes**](Changes.md) |  |  [optional]
**changes** | [**Changes**](Changes.md) |  |  [optional]
**revisions** | [**Revisions**](Revisions.md) |  |  [optional]
**versionedSettingsRevision** | [**Revision**](Revision.md) |  |  [optional]
**artifactDependencyChanges** | [**BuildChanges**](BuildChanges.md) |  |  [optional]
**agent** | [**Agent**](Agent.md) |  |  [optional]
**compatibleAgents** | [**Agents**](Agents.md) |  |  [optional]
**testOccurrences** | [**TestOccurrences**](TestOccurrences.md) |  |  [optional]
**problemOccurrences** | [**ProblemOccurrences**](ProblemOccurrences.md) |  |  [optional]
**artifacts** | [**Files**](Files.md) |  |  [optional]
**relatedIssues** | [**IssuesUsages**](IssuesUsages.md) |  |  [optional]
**properties** | [**Properties**](Properties.md) |  |  [optional]
**resultingProperties** | [**Properties**](Properties.md) |  |  [optional]
**attributes** | [**Entries**](Entries.md) |  |  [optional]
**statistics** | [**Properties**](Properties.md) |  |  [optional]
**metadata** | [**Datas**](Datas.md) |  |  [optional]
**snapshotDependencies** | [**Builds**](Builds.md) |  |  [optional]
**artifactDependencies** | [**Builds**](Builds.md) |  |  [optional]
**customArtifactDependencies** | [**ArtifactDependencies**](ArtifactDependencies.md) |  |  [optional]
**settingsHash** | **String** |  |  [optional]
**currentSettingsHash** | **String** |  |  [optional]
**modificationId** | **String** |  |  [optional]
**chainModificationId** | **String** |  |  [optional]
**replacementIds** | [**Items**](Items.md) |  |  [optional]
**related** | [**Related**](Related.md) |  |  [optional]
**triggeringOptions** | [**BuildTriggeringOptions**](BuildTriggeringOptions.md) |  |  [optional]
**usedByOtherBuilds** | **Boolean** |  |  [optional]
**statusChangeComment** | [**Comment**](Comment.md) |  |  [optional]
**vcsLabels** | [**List&lt;VcsLabel&gt;**](VcsLabel.md) |  |  [optional]
**detachedFromAgent** | **Boolean** |  |  [optional]
**finishOnAgentDate** | **String** |  |  [optional]
**customized** | **Boolean** |  |  [optional]
**customization** | [**Customizations**](Customizations.md) |  |  [optional]
**changesCollectingInProgress** | **Boolean** |  |  [optional]
**queuedWaitReasons** | [**Properties**](Properties.md) |  |  [optional]
**downloadedArtifacts** | [**DownloadedArtifacts**](DownloadedArtifacts.md) |  |  [optional]
**firstBuildWithSameChanges** | [**Build**](Build.md) |  |  [optional]
**locator** | **String** |  |  [optional]


<a name="StateEnum"></a>
## Enum: StateEnum
Name | Value
---- | -----
QUEUED | &quot;queued&quot;
FINISHED | &quot;finished&quot;
RUNNING | &quot;running&quot;
DELETED | &quot;deleted&quot;
UNKNOWN | &quot;unknown&quot;



