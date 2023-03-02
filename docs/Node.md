
# Node

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** |  |  [optional]
**url** | **String** |  |  [optional]
**state** | [**StateEnum**](#StateEnum) |  |  [optional]
**role** | **String** |  |  [optional]
**current** | **Boolean** |  |  [optional]
**enabledResponsibilities** | [**EnabledResponsibilities**](EnabledResponsibilities.md) |  |  [optional]
**disabledResponsibilities** | [**DisabledResponsibilities**](DisabledResponsibilities.md) |  |  [optional]
**effectiveResponsibilities** | [**EffectiveResponsibilities**](EffectiveResponsibilities.md) |  |  [optional]


<a name="StateEnum"></a>
## Enum: StateEnum
Name | Value
---- | -----
ONLINE | &quot;online&quot;
OFFLINE | &quot;offline&quot;
STOPPING | &quot;stopping&quot;
STARTING | &quot;starting&quot;



