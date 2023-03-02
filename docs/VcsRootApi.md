# VcsRootApi

All URIs are relative to *https://localhost:8111*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addVcsRoot**](VcsRootApi.md#addVcsRoot) | **POST** /app/rest/vcs-roots | Add a new VCS root.
[**deleteAllVcsRootProperties**](VcsRootApi.md#deleteAllVcsRootProperties) | **DELETE** /app/rest/vcs-roots/{vcsRootLocator}/properties | Delete all properties of the matching VCS root.
[**deleteVcsRoot**](VcsRootApi.md#deleteVcsRoot) | **DELETE** /app/rest/vcs-roots/{vcsRootLocator} | Remove VCS root matching the locator.
[**deleteVcsRootProperty**](VcsRootApi.md#deleteVcsRootProperty) | **DELETE** /app/rest/vcs-roots/{vcsRootLocator}/properties/{name} | Delete a property of the matching VCS root.
[**getAllVcsRootProperties**](VcsRootApi.md#getAllVcsRootProperties) | **GET** /app/rest/vcs-roots/{vcsRootLocator}/properties | Get all properties of the matching VCS root.
[**getAllVcsRoots**](VcsRootApi.md#getAllVcsRoots) | **GET** /app/rest/vcs-roots | Get all VCS roots.
[**getRootEndpoints**](VcsRootApi.md#getRootEndpoints) | **GET** /app/rest/vcs-roots/{vcsRootLocator} | Get root endpoints.
[**getVcsRootField**](VcsRootApi.md#getVcsRootField) | **GET** /app/rest/vcs-roots/{vcsRootLocator}/{field} | Get a field of the matching VCS root.
[**getVcsRootInstances**](VcsRootApi.md#getVcsRootInstances) | **GET** /app/rest/vcs-roots/{vcsRootLocator}/instances | Get all VCS root instances of the matching VCS root.
[**getVcsRootProperty**](VcsRootApi.md#getVcsRootProperty) | **GET** /app/rest/vcs-roots/{vcsRootLocator}/properties/{name} | Get a property on the matching VCS root.
[**getVcsRootSettingsFile**](VcsRootApi.md#getVcsRootSettingsFile) | **GET** /app/rest/vcs-roots/{vcsRootLocator}/settingsFile | Get the settings file of the matching VCS root.
[**setVcsRootField**](VcsRootApi.md#setVcsRootField) | **PUT** /app/rest/vcs-roots/{vcsRootLocator}/{field} | Update a field of the matching VCS root.
[**setVcsRootProperties**](VcsRootApi.md#setVcsRootProperties) | **PUT** /app/rest/vcs-roots/{vcsRootLocator}/properties | Update all properties of the matching VCS root.
[**setVcsRootProperty**](VcsRootApi.md#setVcsRootProperty) | **PUT** /app/rest/vcs-roots/{vcsRootLocator}/properties/{name} | Update a property of the matching VCS root.


<a name="addVcsRoot"></a>
# **addVcsRoot**
> VcsRoot addVcsRoot(body, fields)

Add a new VCS root.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.VcsRootApi;


VcsRootApi apiInstance = new VcsRootApi();
VcsRoot body = new VcsRoot(); // VcsRoot | 
String fields = "fields_example"; // String | 
try {
    VcsRoot result = apiInstance.addVcsRoot(body, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VcsRootApi#addVcsRoot");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**VcsRoot**](VcsRoot.md)|  | [optional]
 **fields** | **String**|  | [optional]

### Return type

[**VcsRoot**](VcsRoot.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="deleteAllVcsRootProperties"></a>
# **deleteAllVcsRootProperties**
> deleteAllVcsRootProperties(vcsRootLocator)

Delete all properties of the matching VCS root.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.VcsRootApi;


VcsRootApi apiInstance = new VcsRootApi();
String vcsRootLocator = "vcsRootLocator_example"; // String | 
try {
    apiInstance.deleteAllVcsRootProperties(vcsRootLocator);
} catch (ApiException e) {
    System.err.println("Exception when calling VcsRootApi#deleteAllVcsRootProperties");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vcsRootLocator** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteVcsRoot"></a>
# **deleteVcsRoot**
> deleteVcsRoot(vcsRootLocator)

Remove VCS root matching the locator.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.VcsRootApi;


VcsRootApi apiInstance = new VcsRootApi();
String vcsRootLocator = "vcsRootLocator_example"; // String | 
try {
    apiInstance.deleteVcsRoot(vcsRootLocator);
} catch (ApiException e) {
    System.err.println("Exception when calling VcsRootApi#deleteVcsRoot");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vcsRootLocator** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteVcsRootProperty"></a>
# **deleteVcsRootProperty**
> deleteVcsRootProperty(vcsRootLocator, name)

Delete a property of the matching VCS root.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.VcsRootApi;


VcsRootApi apiInstance = new VcsRootApi();
String vcsRootLocator = "vcsRootLocator_example"; // String | 
String name = "name_example"; // String | 
try {
    apiInstance.deleteVcsRootProperty(vcsRootLocator, name);
} catch (ApiException e) {
    System.err.println("Exception when calling VcsRootApi#deleteVcsRootProperty");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vcsRootLocator** | **String**|  |
 **name** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getAllVcsRootProperties"></a>
# **getAllVcsRootProperties**
> Properties getAllVcsRootProperties(vcsRootLocator, fields)

Get all properties of the matching VCS root.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.VcsRootApi;


VcsRootApi apiInstance = new VcsRootApi();
String vcsRootLocator = "vcsRootLocator_example"; // String | 
String fields = "fields_example"; // String | 
try {
    Properties result = apiInstance.getAllVcsRootProperties(vcsRootLocator, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VcsRootApi#getAllVcsRootProperties");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vcsRootLocator** | **String**|  |
 **fields** | **String**|  | [optional]

### Return type

[**Properties**](Properties.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getAllVcsRoots"></a>
# **getAllVcsRoots**
> VcsRoots getAllVcsRoots(locator, fields)

Get all VCS roots.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.VcsRootApi;


VcsRootApi apiInstance = new VcsRootApi();
String locator = "locator_example"; // String | 
String fields = "fields_example"; // String | 
try {
    VcsRoots result = apiInstance.getAllVcsRoots(locator, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VcsRootApi#getAllVcsRoots");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **locator** | **String**|  | [optional]
 **fields** | **String**|  | [optional]

### Return type

[**VcsRoots**](VcsRoots.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getRootEndpoints"></a>
# **getRootEndpoints**
> VcsRoot getRootEndpoints(vcsRootLocator, fields)

Get root endpoints.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.VcsRootApi;


VcsRootApi apiInstance = new VcsRootApi();
String vcsRootLocator = "vcsRootLocator_example"; // String | 
String fields = "fields_example"; // String | 
try {
    VcsRoot result = apiInstance.getRootEndpoints(vcsRootLocator, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VcsRootApi#getRootEndpoints");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vcsRootLocator** | **String**|  |
 **fields** | **String**|  | [optional]

### Return type

[**VcsRoot**](VcsRoot.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getVcsRootField"></a>
# **getVcsRootField**
> String getVcsRootField(vcsRootLocator, field)

Get a field of the matching VCS root.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.VcsRootApi;


VcsRootApi apiInstance = new VcsRootApi();
String vcsRootLocator = "vcsRootLocator_example"; // String | 
String field = "field_example"; // String | 
try {
    String result = apiInstance.getVcsRootField(vcsRootLocator, field);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VcsRootApi#getVcsRootField");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vcsRootLocator** | **String**|  |
 **field** | **String**|  |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

<a name="getVcsRootInstances"></a>
# **getVcsRootInstances**
> VcsRootInstances getVcsRootInstances(vcsRootLocator, fields)

Get all VCS root instances of the matching VCS root.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.VcsRootApi;


VcsRootApi apiInstance = new VcsRootApi();
String vcsRootLocator = "vcsRootLocator_example"; // String | 
String fields = "fields_example"; // String | 
try {
    VcsRootInstances result = apiInstance.getVcsRootInstances(vcsRootLocator, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VcsRootApi#getVcsRootInstances");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vcsRootLocator** | **String**|  |
 **fields** | **String**|  | [optional]

### Return type

[**VcsRootInstances**](VcsRootInstances.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getVcsRootProperty"></a>
# **getVcsRootProperty**
> String getVcsRootProperty(vcsRootLocator, name)

Get a property on the matching VCS root.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.VcsRootApi;


VcsRootApi apiInstance = new VcsRootApi();
String vcsRootLocator = "vcsRootLocator_example"; // String | 
String name = "name_example"; // String | 
try {
    String result = apiInstance.getVcsRootProperty(vcsRootLocator, name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VcsRootApi#getVcsRootProperty");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vcsRootLocator** | **String**|  |
 **name** | **String**|  |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

<a name="getVcsRootSettingsFile"></a>
# **getVcsRootSettingsFile**
> String getVcsRootSettingsFile(vcsRootLocator)

Get the settings file of the matching VCS root.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.VcsRootApi;


VcsRootApi apiInstance = new VcsRootApi();
String vcsRootLocator = "vcsRootLocator_example"; // String | 
try {
    String result = apiInstance.getVcsRootSettingsFile(vcsRootLocator);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VcsRootApi#getVcsRootSettingsFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vcsRootLocator** | **String**|  |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

<a name="setVcsRootField"></a>
# **setVcsRootField**
> String setVcsRootField(vcsRootLocator, field, body)

Update a field of the matching VCS root.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.VcsRootApi;


VcsRootApi apiInstance = new VcsRootApi();
String vcsRootLocator = "vcsRootLocator_example"; // String | 
String field = "field_example"; // String | 
String body = "body_example"; // String | 
try {
    String result = apiInstance.setVcsRootField(vcsRootLocator, field, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VcsRootApi#setVcsRootField");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vcsRootLocator** | **String**|  |
 **field** | **String**|  |
 **body** | **String**|  | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: text/plain
 - **Accept**: text/plain

<a name="setVcsRootProperties"></a>
# **setVcsRootProperties**
> Properties setVcsRootProperties(vcsRootLocator, body, fields)

Update all properties of the matching VCS root.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.VcsRootApi;


VcsRootApi apiInstance = new VcsRootApi();
String vcsRootLocator = "vcsRootLocator_example"; // String | 
Properties body = new Properties(); // Properties | 
String fields = "fields_example"; // String | 
try {
    Properties result = apiInstance.setVcsRootProperties(vcsRootLocator, body, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VcsRootApi#setVcsRootProperties");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vcsRootLocator** | **String**|  |
 **body** | [**Properties**](Properties.md)|  | [optional]
 **fields** | **String**|  | [optional]

### Return type

[**Properties**](Properties.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="setVcsRootProperty"></a>
# **setVcsRootProperty**
> String setVcsRootProperty(vcsRootLocator, name, body)

Update a property of the matching VCS root.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.VcsRootApi;


VcsRootApi apiInstance = new VcsRootApi();
String vcsRootLocator = "vcsRootLocator_example"; // String | 
String name = "name_example"; // String | 
String body = "body_example"; // String | 
try {
    String result = apiInstance.setVcsRootProperty(vcsRootLocator, name, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VcsRootApi#setVcsRootProperty");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vcsRootLocator** | **String**|  |
 **name** | **String**|  |
 **body** | **String**|  | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: text/plain
 - **Accept**: text/plain

