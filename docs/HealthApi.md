# HealthApi

All URIs are relative to *https://localhost:8111*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCategories**](HealthApi.md#getCategories) | **GET** /app/rest/health/category | 
[**getHealthItems**](HealthApi.md#getHealthItems) | **GET** /app/rest/health | 
[**getSingleCategory**](HealthApi.md#getSingleCategory) | **GET** /app/rest/health/category/{locator} | 
[**getSingleHealthItem**](HealthApi.md#getSingleHealthItem) | **GET** /app/rest/health/{locator} | 


<a name="getCategories"></a>
# **getCategories**
> HealthCategories getCategories(locator, fields)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.HealthApi;


HealthApi apiInstance = new HealthApi();
String locator = "locator_example"; // String | 
String fields = "fields_example"; // String | 
try {
    HealthCategories result = apiInstance.getCategories(locator, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HealthApi#getCategories");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **locator** | **String**|  | [optional]
 **fields** | **String**|  | [optional]

### Return type

[**HealthCategories**](HealthCategories.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getHealthItems"></a>
# **getHealthItems**
> HealthStatusItems getHealthItems(locator, fields)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.HealthApi;


HealthApi apiInstance = new HealthApi();
String locator = "locator_example"; // String | 
String fields = "fields_example"; // String | 
try {
    HealthStatusItems result = apiInstance.getHealthItems(locator, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HealthApi#getHealthItems");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **locator** | **String**|  | [optional]
 **fields** | **String**|  | [optional]

### Return type

[**HealthStatusItems**](HealthStatusItems.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getSingleCategory"></a>
# **getSingleCategory**
> HealthCategory getSingleCategory(locator, fields)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.HealthApi;


HealthApi apiInstance = new HealthApi();
String locator = "locator_example"; // String | 
String fields = "fields_example"; // String | 
try {
    HealthCategory result = apiInstance.getSingleCategory(locator, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HealthApi#getSingleCategory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **locator** | **String**|  |
 **fields** | **String**|  | [optional]

### Return type

[**HealthCategory**](HealthCategory.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getSingleHealthItem"></a>
# **getSingleHealthItem**
> HealthItem getSingleHealthItem(locator, fields)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.HealthApi;


HealthApi apiInstance = new HealthApi();
String locator = "locator_example"; // String | 
String fields = "fields_example"; // String | 
try {
    HealthItem result = apiInstance.getSingleHealthItem(locator, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HealthApi#getSingleHealthItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **locator** | **String**|  |
 **fields** | **String**|  | [optional]

### Return type

[**HealthItem**](HealthItem.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

