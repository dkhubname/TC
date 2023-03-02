
# BranchLocator

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**branched** | **String** | Is feature branch. |  [optional]
**build** | **String** | Build locator. |  [optional]
**buildType** | **String** | Build type locator. |  [optional]
**_default** | **String** | Is default branch. |  [optional]
**item** | **String** | Supply multiple locators and return a union of the results. |  [optional]
**name** | **String** |  |  [optional]
**policy** | [**PolicyEnum**](#PolicyEnum) |  |  [optional]


<a name="PolicyEnum"></a>
## Enum: PolicyEnum
Name | Value
---- | -----
VCS_BRANCHES | &quot;VCS_BRANCHES&quot;
ACTIVE_VCS_BRANCHES | &quot;ACTIVE_VCS_BRANCHES&quot;
HISTORY_BRANCHES | &quot;HISTORY_BRANCHES&quot;
ACTIVE_HISTORY_BRANCHES | &quot;ACTIVE_HISTORY_BRANCHES&quot;
ACTIVE_HISTORY_AND_ACTIVE_VCS_BRANCHES | &quot;ACTIVE_HISTORY_AND_ACTIVE_VCS_BRANCHES&quot;
ALL_BRANCHES | &quot;ALL_BRANCHES&quot;



