
# InvestigationLocator

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**affectedProject** | **String** | Project (direct or indirect parent) locator. |  [optional]
**assignee** | **String** |  |  [optional]
**assignmentProject** | **String** | Project (direct parent) locator. |  [optional]
**buildType** | **String** | Build type locator. |  [optional]
**count** | **Integer** | For paginated calls, how many entities to return per page. |  [optional]
**item** | **String** | Supply multiple locators and return a union of the results. |  [optional]
**lookupLimit** | **Integer** | Limit processing to the latest &#x60;&lt;lookupLimit&gt;&#x60; entities. |  [optional]
**problem** | **String** | Problem locator. |  [optional]
**reporter** | **String** |  |  [optional]
**resolution** | [**ResolutionEnum**](#ResolutionEnum) |  |  [optional]
**sinceDate** | [**OffsetDateTime**](OffsetDateTime.md) | yyyyMMddTHHmmss+ZZZZ |  [optional]
**start** | **Integer** | For paginated calls, from which entity to start rendering the page. |  [optional]
**state** | [**StateEnum**](#StateEnum) |  |  [optional]
**test** | **String** | Test locator. |  [optional]
**type** | [**TypeEnum**](#TypeEnum) |  |  [optional]


<a name="ResolutionEnum"></a>
## Enum: ResolutionEnum
Name | Value
---- | -----
MANUALLY | &quot;manually&quot;
WHENFIXED | &quot;whenFixed&quot;
ATTIME | &quot;atTime&quot;


<a name="StateEnum"></a>
## Enum: StateEnum
Name | Value
---- | -----
TAKEN | &quot;taken&quot;
FIXED | &quot;fixed&quot;
GIVEN_UP | &quot;given_up&quot;
NONE | &quot;none&quot;


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
TEST | &quot;test&quot;
PROBLEM | &quot;problem&quot;
ANYPROBLEM | &quot;anyProblem&quot;
UNKNOWN | &quot;unknown&quot;



