# TestOccurrenceApi

All URIs are relative to *https://localhost:8111*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAllTestOccurrences**](TestOccurrenceApi.md#getAllTestOccurrences) | **GET** /app/rest/testOccurrences | Get all test occurrences.
[**getTestOccurrence**](TestOccurrenceApi.md#getTestOccurrence) | **GET** /app/rest/testOccurrences/{testLocator} | Get a matching test occurrence.


<a name="getAllTestOccurrences"></a>
# **getAllTestOccurrences**
> TestOccurrences getAllTestOccurrences(locator, fields)

Get all test occurrences.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TestOccurrenceApi;


TestOccurrenceApi apiInstance = new TestOccurrenceApi();
String locator = "locator_example"; // String | 
String fields = "fields_example"; // String | 
try {
    TestOccurrences result = apiInstance.getAllTestOccurrences(locator, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TestOccurrenceApi#getAllTestOccurrences");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **locator** | **String**|  | [optional]
 **fields** | **String**|  | [optional]

### Return type

[**TestOccurrences**](TestOccurrences.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getTestOccurrence"></a>
# **getTestOccurrence**
> TestOccurrence getTestOccurrence(testLocator, fields)

Get a matching test occurrence.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TestOccurrenceApi;


TestOccurrenceApi apiInstance = new TestOccurrenceApi();
String testLocator = "testLocator_example"; // String | 
String fields = "fields_example"; // String | 
try {
    TestOccurrence result = apiInstance.getTestOccurrence(testLocator, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TestOccurrenceApi#getTestOccurrence");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **testLocator** | **String**|  |
 **fields** | **String**|  | [optional]

### Return type

[**TestOccurrence**](TestOccurrence.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

