# MuteApi

All URIs are relative to *https://localhost:8111*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAllMutedTests**](MuteApi.md#getAllMutedTests) | **GET** /app/rest/mutes | Get all muted tests.
[**getMutedTest**](MuteApi.md#getMutedTest) | **GET** /app/rest/mutes/{muteLocator} | Get a muted test.
[**muteMultipleTests**](MuteApi.md#muteMultipleTests) | **POST** /app/rest/mutes/multiple | Mute multiple tests.
[**muteTest**](MuteApi.md#muteTest) | **POST** /app/rest/mutes | Mute a test.
[**unmuteTest**](MuteApi.md#unmuteTest) | **DELETE** /app/rest/mutes/{muteLocator} | Unmute the matching test.


<a name="getAllMutedTests"></a>
# **getAllMutedTests**
> Mutes getAllMutedTests(locator, fields)

Get all muted tests.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MuteApi;


MuteApi apiInstance = new MuteApi();
String locator = "locator_example"; // String | 
String fields = "fields_example"; // String | 
try {
    Mutes result = apiInstance.getAllMutedTests(locator, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MuteApi#getAllMutedTests");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **locator** | **String**|  | [optional]
 **fields** | **String**|  | [optional]

### Return type

[**Mutes**](Mutes.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getMutedTest"></a>
# **getMutedTest**
> Mute getMutedTest(muteLocator, fields)

Get a muted test.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MuteApi;


MuteApi apiInstance = new MuteApi();
String muteLocator = "muteLocator_example"; // String | 
String fields = "fields_example"; // String | 
try {
    Mute result = apiInstance.getMutedTest(muteLocator, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MuteApi#getMutedTest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **muteLocator** | **String**|  |
 **fields** | **String**|  | [optional]

### Return type

[**Mute**](Mute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="muteMultipleTests"></a>
# **muteMultipleTests**
> Mutes muteMultipleTests(body, fields)

Mute multiple tests.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MuteApi;


MuteApi apiInstance = new MuteApi();
Mutes body = new Mutes(); // Mutes | 
String fields = "fields_example"; // String | 
try {
    Mutes result = apiInstance.muteMultipleTests(body, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MuteApi#muteMultipleTests");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Mutes**](Mutes.md)|  | [optional]
 **fields** | **String**|  | [optional]

### Return type

[**Mutes**](Mutes.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="muteTest"></a>
# **muteTest**
> Mute muteTest(body, fields)

Mute a test.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MuteApi;


MuteApi apiInstance = new MuteApi();
Mute body = new Mute(); // Mute | 
String fields = "fields_example"; // String | 
try {
    Mute result = apiInstance.muteTest(body, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MuteApi#muteTest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Mute**](Mute.md)|  | [optional]
 **fields** | **String**|  | [optional]

### Return type

[**Mute**](Mute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="unmuteTest"></a>
# **unmuteTest**
> unmuteTest(muteLocator, body)

Unmute the matching test.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MuteApi;


MuteApi apiInstance = new MuteApi();
String muteLocator = "muteLocator_example"; // String | 
String body = "body_example"; // String | 
try {
    apiInstance.unmuteTest(muteLocator, body);
} catch (ApiException e) {
    System.err.println("Exception when calling MuteApi#unmuteTest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **muteLocator** | **String**|  |
 **body** | **String**|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

