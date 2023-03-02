# ProblemApi

All URIs are relative to *https://localhost:8111*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAllBuildProblems**](ProblemApi.md#getAllBuildProblems) | **GET** /app/rest/problems | Get all build problems.
[**getBuildProblem**](ProblemApi.md#getBuildProblem) | **GET** /app/rest/problems/{problemLocator} | Get a matching build problem.


<a name="getAllBuildProblems"></a>
# **getAllBuildProblems**
> Problems getAllBuildProblems(locator, fields)

Get all build problems.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProblemApi;


ProblemApi apiInstance = new ProblemApi();
String locator = "locator_example"; // String | 
String fields = "fields_example"; // String | 
try {
    Problems result = apiInstance.getAllBuildProblems(locator, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProblemApi#getAllBuildProblems");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **locator** | **String**|  | [optional]
 **fields** | **String**|  | [optional]

### Return type

[**Problems**](Problems.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getBuildProblem"></a>
# **getBuildProblem**
> Problem getBuildProblem(problemLocator, fields)

Get a matching build problem.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProblemApi;


ProblemApi apiInstance = new ProblemApi();
String problemLocator = "problemLocator_example"; // String | 
String fields = "fields_example"; // String | 
try {
    Problem result = apiInstance.getBuildProblem(problemLocator, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProblemApi#getBuildProblem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **problemLocator** | **String**|  |
 **fields** | **String**|  | [optional]

### Return type

[**Problem**](Problem.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

