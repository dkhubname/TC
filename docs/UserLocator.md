
# UserLocator

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**affectedGroup** | **String** | User group (direct or indirect parent) locator. |  [optional]
**current** | **String** | Return user that has issued this request. |  [optional]
**email** | **String** |  |  [optional]
**group** | **String** | User group (direct parent) locator. |  [optional]
**id** | **String** |  |  [optional]
**item** | **String** | Supply multiple locators and return a union of the results. |  [optional]
**lastLogin** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**name** | **String** |  |  [optional]
**property** | [**PropertyEnum**](#PropertyEnum) |  |  [optional]
**role** | **String** | Role locator. |  [optional]
**username** | **String** |  |  [optional]


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



