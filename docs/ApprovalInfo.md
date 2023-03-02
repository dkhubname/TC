
# ApprovalInfo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**timeoutTimestamp** | **String** |  |  [optional]
**configurationValid** | **Boolean** |  |  [optional]
**canBeApprovedByCurrentUser** | **Boolean** |  |  [optional]
**userApprovals** | [**UserApprovals**](UserApprovals.md) |  |  [optional]
**groupApprovals** | [**GroupApprovals**](GroupApprovals.md) |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
WAITINGFORAPPROVAL | &quot;waitingForApproval&quot;
APPROVED | &quot;approved&quot;
TIMEDOUT | &quot;timedOut&quot;
CANCELED | &quot;canceled&quot;



