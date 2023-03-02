
# TestOccurrence

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** |  |  [optional]
**name** | **String** |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**ignored** | **Boolean** |  |  [optional]
**duration** | **Integer** |  |  [optional]
**runOrder** | **String** |  |  [optional]
**newFailure** | **Boolean** |  |  [optional]
**muted** | **Boolean** |  |  [optional]
**currentlyMuted** | **Boolean** |  |  [optional]
**currentlyInvestigated** | **Boolean** |  |  [optional]
**href** | **String** |  |  [optional]
**ignoreDetails** | **String** |  |  [optional]
**details** | **String** |  |  [optional]
**test** | [**Test**](Test.md) |  |  [optional]
**mute** | [**Mute**](Mute.md) |  |  [optional]
**build** | [**Build**](Build.md) |  |  [optional]
**firstFailed** | [**TestOccurrence**](TestOccurrence.md) |  |  [optional]
**nextFixed** | [**TestOccurrence**](TestOccurrence.md) |  |  [optional]
**invocations** | [**TestOccurrences**](TestOccurrences.md) |  |  [optional]
**metadata** | [**TestRunMetadata**](TestRunMetadata.md) |  |  [optional]
**logAnchor** | **String** |  |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
UNKNOWN | &quot;UNKNOWN&quot;
NORMAL | &quot;NORMAL&quot;
WARNING | &quot;WARNING&quot;
FAILURE | &quot;FAILURE&quot;
ERROR | &quot;ERROR&quot;



