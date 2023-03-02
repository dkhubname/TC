
# TestOccurrenceLocator

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**affectedProject** | **String** | Project (direct or indirect parent) locator. |  [optional]
**branch** | **String** |  |  [optional]
**build** | **String** | Build locator. |  [optional]
**buildType** | **String** | Build type locator. |  [optional]
**count** | **Integer** | For paginated calls, how many entities to return per page. |  [optional]
**currentlyFailing** | **Boolean** | Is currently failing. |  [optional]
**currentlyInvestigated** | **Boolean** | Is currently investigated. |  [optional]
**currentlyMuted** | **String** |  |  [optional]
**id** | **Integer** | Entity ID. |  [optional]
**ignored** | **Boolean** | Is ignored. |  [optional]
**includePersonal** | **Boolean** |  |  [optional]
**item** | **String** | Supply multiple locators and return a union of the results. |  [optional]
**lookupLimit** | **Integer** | Limit processing to the latest &#x60;&lt;lookupLimit&gt;&#x60; entities. |  [optional]
**muted** | **Boolean** | Is muted. |  [optional]
**name** | **String** |  |  [optional]
**newFailure** | **String** |  |  [optional]
**start** | **Integer** | For paginated calls, from which entity to start rendering the page. |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**test** | **String** | Test locator. |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
UNKNOWN | &quot;unknown&quot;
NORMAL | &quot;normal&quot;
WARNING | &quot;warning&quot;
FAILURE | &quot;failure&quot;
ERROR | &quot;error&quot;



