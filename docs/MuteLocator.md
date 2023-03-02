
# MuteLocator

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**affectedProject** | **String** | Project (direct or indirect parent) locator. |  [optional]
**creationDate** | [**OffsetDateTime**](OffsetDateTime.md) | yyyyMMddTHHmmss+ZZZZ |  [optional]
**id** | **Integer** |  |  [optional]
**item** | **String** | Supply multiple locators and return a union of the results. |  [optional]
**problem** | **String** | Problem locator. |  [optional]
**project** | **String** | Project (direct parent) locator. |  [optional]
**reporter** | **String** | User who muted this test. |  [optional]
**resolution** | [**ResolutionEnum**](#ResolutionEnum) |  |  [optional]
**test** | **String** | Test locator. |  [optional]
**type** | [**TypeEnum**](#TypeEnum) |  |  [optional]
**unmuteDate** | [**OffsetDateTime**](OffsetDateTime.md) | yyyyMMddTHHmmss+ZZZZ |  [optional]


<a name="ResolutionEnum"></a>
## Enum: ResolutionEnum
Name | Value
---- | -----
MANUALLY | &quot;manually&quot;
WHENFIXED | &quot;whenFixed&quot;
ATTIME | &quot;atTime&quot;


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
TEST | &quot;test&quot;
PROBLEM | &quot;problem&quot;
ANYPROBLEM | &quot;anyProblem&quot;
UNKNOWN | &quot;unknown&quot;



