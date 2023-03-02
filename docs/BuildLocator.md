
# BuildLocator

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**affectedProject** | **String** | Project (direct or indirect parent) locator. |  [optional]
**agent** | **String** | Agent locator. |  [optional]
**agentTypeId** | **Integer** | typeId of agent used to execute build. |  [optional]
**any** | **Boolean** | State can be any. |  [optional]
**artifactDependency** | **String** |  |  [optional]
**branch** | **String** | Branch locator. |  [optional]
**buildType** | **String** | Build type locator. |  [optional]
**canceled** | **Boolean** | Is canceled. |  [optional]
**compatibleAgent** | **String** | Agent locator. |  [optional]
**composite** | **Boolean** | Is composite. |  [optional]
**count** | **Integer** | For paginated calls, how many entities to return per page. |  [optional]
**defaultFilter** | **Boolean** | If true, applies default filter which returns only \&quot;normal\&quot; builds (finished builds which are not canceled, not failed-to-start, not personal, and on default branch (in branched build configurations)). |  [optional]
**failedToStart** | **Boolean** | Is failed to start. |  [optional]
**finishDate** | **String** | Requires either date or build dimension. |  [optional]
**finished** | **Boolean** | Is finished. |  [optional]
**hanging** | **Boolean** | Is hanging. |  [optional]
**history** | **Boolean** | Is history build. |  [optional]
**id** | **Integer** | Entity ID. |  [optional]
**item** | **String** | Supply multiple locators and return a union of the results. |  [optional]
**lookupLimit** | **Integer** | Limit processing to the latest &#x60;&lt;lookupLimit&gt;&#x60; entities. |  [optional]
**number** | **String** |  |  [optional]
**personal** | **Boolean** | Is a personal build. |  [optional]
**pinned** | **Boolean** | Is pinned. |  [optional]
**project** | **String** | Project (direct parent) locator. |  [optional]
**property** | [**PropertyEnum**](#PropertyEnum) |  |  [optional]
**queued** | **Boolean** | Is queued. |  [optional]
**queuedDate** | **String** | Requires either date or build dimension. |  [optional]
**revision** | **String** | Build revision. |  [optional]
**running** | **Boolean** | Is running. |  [optional]
**snapshotDependency** | **String** |  |  [optional]
**start** | **Integer** | For paginated calls, from which entity to start rendering the page. |  [optional]
**startDate** | **String** | Requires either date or build dimension. |  [optional]
**state** | [**StateEnum**](#StateEnum) |  |  [optional]
**status** | **String** |  |  [optional]
**tag** | **String** | Tag locator. |  [optional]
**taskId** | **Integer** | ID of a build or build promotion. |  [optional]
**user** | **String** | For personal builds checks the owner of the build, triggerring user in other cases. |  [optional]


<a name="PropertyEnum"></a>
## Enum: PropertyEnum
Name | Value
---- | -----
EXISTS | &quot;exists&quot;
NOT_EXISTS | &quot;not-exists&quot;
EQUALS | &quot;equals&quot;
DOES_NOT_EQUAL | &quot;does-not-equal&quot;
STARTS_WITH | &quot;starts-with&quot;
CONTAINS | &quot;contains&quot;
DOES_NOT_CONTAIN | &quot;does-not-contain&quot;
ENDS_WITH | &quot;ends-with&quot;
ANY | &quot;any&quot;
MATCHES | &quot;matches&quot;
DOES_NOT_MATCH | &quot;does-not-match&quot;
MORE_THAN | &quot;more-than&quot;
NO_MORE_THAN | &quot;no-more-than&quot;
LESS_THAN | &quot;less-than&quot;
NO_LESS_THAN | &quot;no-less-than&quot;
VER_MORE_THAN | &quot;ver-more-than&quot;
VER_NO_MORE_THAN | &quot;ver-no-more-than&quot;
VER_LESS_THAN | &quot;ver-less-than&quot;
VER_NO_LESS_THAN | &quot;ver-no-less-than&quot;


<a name="StateEnum"></a>
## Enum: StateEnum
Name | Value
---- | -----
QUEUED | &quot;queued&quot;
RUNNING | &quot;running&quot;
FINISHED | &quot;finished&quot;
ANY | &quot;any&quot;



