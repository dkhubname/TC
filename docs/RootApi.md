# RootApi

All URIs are relative to *https://localhost:8111*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getApiVersion**](RootApi.md#getApiVersion) | **GET** /app/rest/apiVersion | Get the API version.
[**getPluginInfo**](RootApi.md#getPluginInfo) | **GET** /app/rest/info | Get the plugin info.
[**getRootEndpointsOfRoot**](RootApi.md#getRootEndpointsOfRoot) | **GET** /app/rest | Get root endpoints.
[**getVersion**](RootApi.md#getVersion) | **GET** /app/rest/version | Get the TeamCity server version.


<a name="getApiVersion"></a>
# **getApiVersion**
> String getApiVersion()

Get the API version.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RootApi;


RootApi apiInstance = new RootApi();
try {
    String result = apiInstance.getApiVersion();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RootApi#getApiVersion");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

<a name="getPluginInfo"></a>
# **getPluginInfo**
> Plugin getPluginInfo(fields)

Get the plugin info.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RootApi;


RootApi apiInstance = new RootApi();
String fields = "fields_example"; // String | 
try {
    Plugin result = apiInstance.getPluginInfo(fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RootApi#getPluginInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fields** | **String**|  | [optional]

### Return type

[**Plugin**](Plugin.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml

<a name="getRootEndpointsOfRoot"></a>
# **getRootEndpointsOfRoot**
> String getRootEndpointsOfRoot()

Get root endpoints.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RootApi;


RootApi apiInstance = new RootApi();
try {
    String result = apiInstance.getRootEndpointsOfRoot();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RootApi#getRootEndpointsOfRoot");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

<a name="getVersion"></a>
# **getVersion**
> String getVersion()

Get the TeamCity server version.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RootApi;


RootApi apiInstance = new RootApi();
try {
    String result = apiInstance.getVersion();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RootApi#getVersion");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

