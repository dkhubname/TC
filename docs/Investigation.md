
# Investigation

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** |  |  [optional]
**state** | [**StateEnum**](#StateEnum) |  |  [optional]
**href** | **String** |  |  [optional]
**assignee** | [**User**](User.md) |  |  [optional]
**assignment** | [**Comment**](Comment.md) |  |  [optional]
**scope** | [**ProblemScope**](ProblemScope.md) |  |  [optional]
**target** | [**ProblemTarget**](ProblemTarget.md) |  |  [optional]
**resolution** | [**Resolution**](Resolution.md) |  |  [optional]
**responsible** | [**User**](User.md) |  |  [optional]


<a name="StateEnum"></a>
## Enum: StateEnum
Name | Value
---- | -----
TAKEN | &quot;TAKEN&quot;
FIXED | &quot;FIXED&quot;
GIVEN_UP | &quot;GIVEN_UP&quot;
NONE | &quot;NONE&quot;



