
# VcsLabel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**text** | **String** |  |  [optional]
**failureReason** | **String** |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**buildId** | **Long** |  |  [optional]
**vcsRootInstance** | [**VcsRootInstance**](VcsRootInstance.md) |  |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
NONE | &quot;none&quot;
SET | &quot;set&quot;
IS_BEING_SET | &quot;is being set&quot;
FAILED | &quot;failed&quot;
DISABLED_FOR_THE_VCS_ROOT | &quot;disabled for the vcs root&quot;
NOT_SUPPORTED_YET_FOR_THE_VCS | &quot;not supported yet for the vcs&quot;



