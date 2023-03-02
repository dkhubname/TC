# ProblemOccurrenceApi

All URIs are relative to *https://localhost:8111*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAllBuildProblemOccurrences**](ProblemOccurrenceApi.md#getAllBuildProblemOccurrences) | **GET** /app/rest/problemOccurrences | Get all build problem occurrences.
[**getBuildProblemOccurrence**](ProblemOccurrenceApi.md#getBuildProblemOccurrence) | **GET** /app/rest/problemOccurrences/{problemLocator} | Get a matching build problem occurrence.


<a name="getAllBuildProblemOccurrences"></a>
# **getAllBuildProblemOccurrences**
> ProblemOccurrences getAllBuildProblemOccurrences(locator, fields)

Get all build problem occurrences.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProblemOccurrenceApi;


ProblemOccurrenceApi apiInstance = new ProblemOccurrenceApi();
String locator = "locator_example"; // String | 
String fields = "fields_example"; // String | 
try {
    ProblemOccurrences result = apiInstance.getAllBuildProblemOccurrences(locator, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProblemOccurrenceApi#getAllBuildProblemOccurrences");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **locator** | **String**|  | [optional]
 **fields** | **String**|  | [optional]

### Return type

[**ProblemOccurrences**](ProblemOccurrences.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getBuildProblemOccurrence"></a>
# **getBuildProblemOccurrence**
> ProblemOccurrence getBuildProblemOccurrence(problemLocator, fields)

Get a matching build problem occurrence.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProblemOccurrenceApi;


ProblemOccurrenceApi apiInstance = new ProblemOccurrenceApi();
String problemLocator = "problemLocator_example"; // String | 
String fields = "fields_example"; // String | 
try {
    ProblemOccurrence result = apiInstance.getBuildProblemOccurrence(problemLocator, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProblemOccurrenceApi#getBuildProblemOccurrence");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **problemLocator** | **String**|  |
 **fields** | **String**|  | [optional]

### Return type

[**ProblemOccurrence**](ProblemOccurrence.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

