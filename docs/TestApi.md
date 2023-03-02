# TestApi

All URIs are relative to *https://localhost:8111*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getTest**](TestApi.md#getTest) | **GET** /app/rest/tests/{testLocator} | Get a matching test.
[**getTests**](TestApi.md#getTests) | **GET** /app/rest/tests | Get all tests.


<a name="getTest"></a>
# **getTest**
> Test getTest(testLocator, fields)

Get a matching test.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TestApi;


TestApi apiInstance = new TestApi();
String testLocator = "testLocator_example"; // String | 
String fields = "fields_example"; // String | 
try {
    Test result = apiInstance.getTest(testLocator, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TestApi#getTest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **testLocator** | **String**|  |
 **fields** | **String**|  | [optional]

### Return type

[**Test**](Test.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getTests"></a>
# **getTests**
> Tests getTests(locator, fields)

Get all tests.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TestApi;


TestApi apiInstance = new TestApi();
String locator = "locator_example"; // String | 
String fields = "fields_example"; // String | 
try {
    Tests result = apiInstance.getTests(locator, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TestApi#getTests");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **locator** | **String**|  | [optional]
 **fields** | **String**|  | [optional]

### Return type

[**Tests**](Tests.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

