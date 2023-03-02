# AuditApi

All URIs are relative to *https://localhost:8111*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAllAuditEvents**](AuditApi.md#getAllAuditEvents) | **GET** /app/rest/audit | Get all audit events.
[**getAuditEvent**](AuditApi.md#getAuditEvent) | **GET** /app/rest/audit/{auditEventLocator} | Get audit event matching the locator.


<a name="getAllAuditEvents"></a>
# **getAllAuditEvents**
> AuditEvents getAllAuditEvents(locator, fields)

Get all audit events.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AuditApi;


AuditApi apiInstance = new AuditApi();
String locator = "locator_example"; // String | 
String fields = "fields_example"; // String | 
try {
    AuditEvents result = apiInstance.getAllAuditEvents(locator, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuditApi#getAllAuditEvents");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **locator** | **String**|  | [optional]
 **fields** | **String**|  | [optional]

### Return type

[**AuditEvents**](AuditEvents.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getAuditEvent"></a>
# **getAuditEvent**
> AuditEvent getAuditEvent(auditEventLocator, fields)

Get audit event matching the locator.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AuditApi;


AuditApi apiInstance = new AuditApi();
String auditEventLocator = "auditEventLocator_example"; // String | 
String fields = "fields_example"; // String | 
try {
    AuditEvent result = apiInstance.getAuditEvent(auditEventLocator, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuditApi#getAuditEvent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **auditEventLocator** | **String**|  |
 **fields** | **String**|  | [optional]

### Return type

[**AuditEvent**](AuditEvent.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

