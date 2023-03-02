# CloudInstanceApi

All URIs are relative to *https://localhost:8111*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAllCloudImages**](CloudInstanceApi.md#getAllCloudImages) | **GET** /app/rest/cloud/images | Get all cloud images.
[**getAllCloudInstances**](CloudInstanceApi.md#getAllCloudInstances) | **GET** /app/rest/cloud/instances | Get all cloud instances.
[**getAllCloudProfiles**](CloudInstanceApi.md#getAllCloudProfiles) | **GET** /app/rest/cloud/profiles | Get all cloud profiles.
[**getCloudImage**](CloudInstanceApi.md#getCloudImage) | **GET** /app/rest/cloud/images/{imageLocator} | Get cloud image matching the locator.
[**getCloudInstance**](CloudInstanceApi.md#getCloudInstance) | **GET** /app/rest/cloud/instances/{instanceLocator} | Get cloud instance matching the locator.
[**getCloudProfile**](CloudInstanceApi.md#getCloudProfile) | **GET** /app/rest/cloud/profiles/{profileLocator} | Get cloud profile matching the locator.
[**startInstance**](CloudInstanceApi.md#startInstance) | **POST** /app/rest/cloud/instances | Start a new cloud instance.
[**stopInstance**](CloudInstanceApi.md#stopInstance) | **DELETE** /app/rest/cloud/instances/{instanceLocator} | Stop cloud instance matching the locator.


<a name="getAllCloudImages"></a>
# **getAllCloudImages**
> CloudImages getAllCloudImages(locator, fields)

Get all cloud images.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CloudInstanceApi;


CloudInstanceApi apiInstance = new CloudInstanceApi();
String locator = "locator_example"; // String | 
String fields = "fields_example"; // String | 
try {
    CloudImages result = apiInstance.getAllCloudImages(locator, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudInstanceApi#getAllCloudImages");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **locator** | **String**|  | [optional]
 **fields** | **String**|  | [optional]

### Return type

[**CloudImages**](CloudImages.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getAllCloudInstances"></a>
# **getAllCloudInstances**
> CloudInstances getAllCloudInstances(locator, fields)

Get all cloud instances.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CloudInstanceApi;


CloudInstanceApi apiInstance = new CloudInstanceApi();
String locator = "locator_example"; // String | 
String fields = "fields_example"; // String | 
try {
    CloudInstances result = apiInstance.getAllCloudInstances(locator, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudInstanceApi#getAllCloudInstances");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **locator** | **String**|  | [optional]
 **fields** | **String**|  | [optional]

### Return type

[**CloudInstances**](CloudInstances.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getAllCloudProfiles"></a>
# **getAllCloudProfiles**
> CloudProfiles getAllCloudProfiles(locator, fields)

Get all cloud profiles.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CloudInstanceApi;


CloudInstanceApi apiInstance = new CloudInstanceApi();
String locator = "locator_example"; // String | 
String fields = "fields_example"; // String | 
try {
    CloudProfiles result = apiInstance.getAllCloudProfiles(locator, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudInstanceApi#getAllCloudProfiles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **locator** | **String**|  | [optional]
 **fields** | **String**|  | [optional]

### Return type

[**CloudProfiles**](CloudProfiles.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getCloudImage"></a>
# **getCloudImage**
> CloudImage getCloudImage(imageLocator, fields)

Get cloud image matching the locator.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CloudInstanceApi;


CloudInstanceApi apiInstance = new CloudInstanceApi();
String imageLocator = "imageLocator_example"; // String | 
String fields = "fields_example"; // String | 
try {
    CloudImage result = apiInstance.getCloudImage(imageLocator, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudInstanceApi#getCloudImage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **imageLocator** | **String**|  |
 **fields** | **String**|  | [optional]

### Return type

[**CloudImage**](CloudImage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getCloudInstance"></a>
# **getCloudInstance**
> CloudInstance getCloudInstance(instanceLocator, fields)

Get cloud instance matching the locator.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CloudInstanceApi;


CloudInstanceApi apiInstance = new CloudInstanceApi();
String instanceLocator = "instanceLocator_example"; // String | 
String fields = "fields_example"; // String | 
try {
    CloudInstance result = apiInstance.getCloudInstance(instanceLocator, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudInstanceApi#getCloudInstance");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **instanceLocator** | **String**|  |
 **fields** | **String**|  | [optional]

### Return type

[**CloudInstance**](CloudInstance.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getCloudProfile"></a>
# **getCloudProfile**
> CloudProfile getCloudProfile(profileLocator, fields)

Get cloud profile matching the locator.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CloudInstanceApi;


CloudInstanceApi apiInstance = new CloudInstanceApi();
String profileLocator = "profileLocator_example"; // String | 
String fields = "fields_example"; // String | 
try {
    CloudProfile result = apiInstance.getCloudProfile(profileLocator, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudInstanceApi#getCloudProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **profileLocator** | **String**|  |
 **fields** | **String**|  | [optional]

### Return type

[**CloudProfile**](CloudProfile.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="startInstance"></a>
# **startInstance**
> startInstance(body, fields)

Start a new cloud instance.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CloudInstanceApi;


CloudInstanceApi apiInstance = new CloudInstanceApi();
CloudInstance body = new CloudInstance(); // CloudInstance | 
String fields = "fields_example"; // String | 
try {
    apiInstance.startInstance(body, fields);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudInstanceApi#startInstance");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CloudInstance**](CloudInstance.md)|  | [optional]
 **fields** | **String**|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="stopInstance"></a>
# **stopInstance**
> stopInstance(instanceLocator)

Stop cloud instance matching the locator.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CloudInstanceApi;


CloudInstanceApi apiInstance = new CloudInstanceApi();
String instanceLocator = "instanceLocator_example"; // String | 
try {
    apiInstance.stopInstance(instanceLocator);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudInstanceApi#stopInstance");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **instanceLocator** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

