# VcsRootInstanceApi

All URIs are relative to *https://localhost:8111*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteVcsRootInstanceField**](VcsRootInstanceApi.md#deleteVcsRootInstanceField) | **DELETE** /app/rest/vcs-root-instances/{vcsRootInstanceLocator}/{field} | Remove a field of the matching VCS root instance.
[**deleteVcsRootInstanceRepositoryState**](VcsRootInstanceApi.md#deleteVcsRootInstanceRepositoryState) | **DELETE** /app/rest/vcs-root-instances/{vcsRootInstanceLocator}/repositoryState | Delete the last repository state of the matching VCS root instance.
[**downloadFile**](VcsRootInstanceApi.md#downloadFile) | **GET** /app/rest/vcs-root-instances/{vcsRootInstanceLocator}/files/latest/files{path} | Download specific file.
[**getAllVcsRootInstances**](VcsRootInstanceApi.md#getAllVcsRootInstances) | **GET** /app/rest/vcs-root-instances | Get all VCS root instances.
[**getFileMetadata**](VcsRootInstanceApi.md#getFileMetadata) | **GET** /app/rest/vcs-root-instances/{vcsRootInstanceLocator}/files/latest/metadata{path} | Get metadata of specific file.
[**getFilesList**](VcsRootInstanceApi.md#getFilesList) | **GET** /app/rest/vcs-root-instances/{vcsRootInstanceLocator}/files/latest | List all files.
[**getFilesListForSubpath**](VcsRootInstanceApi.md#getFilesListForSubpath) | **GET** /app/rest/vcs-root-instances/{vcsRootInstanceLocator}/files/latest/{path} | List files under this path.
[**getVcsRootInstance**](VcsRootInstanceApi.md#getVcsRootInstance) | **GET** /app/rest/vcs-root-instances/{vcsRootInstanceLocator} | Get VCS root instance matching the locator.
[**getVcsRootInstanceCreationDate**](VcsRootInstanceApi.md#getVcsRootInstanceCreationDate) | **GET** /app/rest/vcs-root-instances/{vcsRootInstanceLocator}/repositoryState/creationDate | Get the creation date of the matching VCS root instance.
[**getVcsRootInstanceField**](VcsRootInstanceApi.md#getVcsRootInstanceField) | **GET** /app/rest/vcs-root-instances/{vcsRootInstanceLocator}/{field} | Get a field of the matching VCS root instance.
[**getVcsRootInstanceProperties**](VcsRootInstanceApi.md#getVcsRootInstanceProperties) | **GET** /app/rest/vcs-root-instances/{vcsRootInstanceLocator}/properties | Get all properties of the matching VCS root instance.
[**getVcsRootInstanceRepositoryState**](VcsRootInstanceApi.md#getVcsRootInstanceRepositoryState) | **GET** /app/rest/vcs-root-instances/{vcsRootInstanceLocator}/repositoryState | Get the repository state of the matching VCS root instance.
[**getZippedFile**](VcsRootInstanceApi.md#getZippedFile) | **GET** /app/rest/vcs-root-instances/{vcsRootInstanceLocator}/files/latest/archived{path} | Get specific file zipped.
[**requestPendingChangesCheck**](VcsRootInstanceApi.md#requestPendingChangesCheck) | **POST** /app/rest/vcs-root-instances/checkingForChangesQueue | Check for the pending changes for all VCS root instances.
[**setVcsRootInstanceField**](VcsRootInstanceApi.md#setVcsRootInstanceField) | **PUT** /app/rest/vcs-root-instances/{vcsRootInstanceLocator}/{field} | Get a field of the matching VCS root instance.
[**setVcsRootInstanceRepositoryState**](VcsRootInstanceApi.md#setVcsRootInstanceRepositoryState) | **PUT** /app/rest/vcs-root-instances/{vcsRootInstanceLocator}/repositoryState | Update the repository state of the matching VCS root instance.
[**triggerCommitHookNotification**](VcsRootInstanceApi.md#triggerCommitHookNotification) | **POST** /app/rest/vcs-root-instances/commitHookNotification | Send the commit hook notification.


<a name="deleteVcsRootInstanceField"></a>
# **deleteVcsRootInstanceField**
> deleteVcsRootInstanceField(vcsRootInstanceLocator, field)

Remove a field of the matching VCS root instance.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.VcsRootInstanceApi;


VcsRootInstanceApi apiInstance = new VcsRootInstanceApi();
String vcsRootInstanceLocator = "vcsRootInstanceLocator_example"; // String | 
String field = "field_example"; // String | 
try {
    apiInstance.deleteVcsRootInstanceField(vcsRootInstanceLocator, field);
} catch (ApiException e) {
    System.err.println("Exception when calling VcsRootInstanceApi#deleteVcsRootInstanceField");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vcsRootInstanceLocator** | **String**|  |
 **field** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteVcsRootInstanceRepositoryState"></a>
# **deleteVcsRootInstanceRepositoryState**
> deleteVcsRootInstanceRepositoryState(vcsRootInstanceLocator)

Delete the last repository state of the matching VCS root instance.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.VcsRootInstanceApi;


VcsRootInstanceApi apiInstance = new VcsRootInstanceApi();
String vcsRootInstanceLocator = "vcsRootInstanceLocator_example"; // String | 
try {
    apiInstance.deleteVcsRootInstanceRepositoryState(vcsRootInstanceLocator);
} catch (ApiException e) {
    System.err.println("Exception when calling VcsRootInstanceApi#deleteVcsRootInstanceRepositoryState");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vcsRootInstanceLocator** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="downloadFile"></a>
# **downloadFile**
> downloadFile(path, vcsRootInstanceLocator)

Download specific file.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.VcsRootInstanceApi;


VcsRootInstanceApi apiInstance = new VcsRootInstanceApi();
String path = "path_example"; // String | 
String vcsRootInstanceLocator = "vcsRootInstanceLocator_example"; // String | 
try {
    apiInstance.downloadFile(path, vcsRootInstanceLocator);
} catch (ApiException e) {
    System.err.println("Exception when calling VcsRootInstanceApi#downloadFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**|  |
 **vcsRootInstanceLocator** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getAllVcsRootInstances"></a>
# **getAllVcsRootInstances**
> VcsRootInstances getAllVcsRootInstances(locator, fields)

Get all VCS root instances.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.VcsRootInstanceApi;


VcsRootInstanceApi apiInstance = new VcsRootInstanceApi();
String locator = "locator_example"; // String | 
String fields = "fields_example"; // String | 
try {
    VcsRootInstances result = apiInstance.getAllVcsRootInstances(locator, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VcsRootInstanceApi#getAllVcsRootInstances");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **locator** | **String**|  | [optional]
 **fields** | **String**|  | [optional]

### Return type

[**VcsRootInstances**](VcsRootInstances.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getFileMetadata"></a>
# **getFileMetadata**
> File getFileMetadata(path, vcsRootInstanceLocator, fields)

Get metadata of specific file.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.VcsRootInstanceApi;


VcsRootInstanceApi apiInstance = new VcsRootInstanceApi();
String path = "path_example"; // String | 
String vcsRootInstanceLocator = "vcsRootInstanceLocator_example"; // String | 
String fields = "fields_example"; // String | 
try {
    File result = apiInstance.getFileMetadata(path, vcsRootInstanceLocator, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VcsRootInstanceApi#getFileMetadata");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**|  |
 **vcsRootInstanceLocator** | **String**|  |
 **fields** | **String**|  | [optional]

### Return type

[**File**](File.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getFilesList"></a>
# **getFilesList**
> Files getFilesList(vcsRootInstanceLocator, basePath, locator, fields)

List all files.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.VcsRootInstanceApi;


VcsRootInstanceApi apiInstance = new VcsRootInstanceApi();
String vcsRootInstanceLocator = "vcsRootInstanceLocator_example"; // String | 
String basePath = "basePath_example"; // String | 
String locator = "locator_example"; // String | 
String fields = "fields_example"; // String | 
try {
    Files result = apiInstance.getFilesList(vcsRootInstanceLocator, basePath, locator, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VcsRootInstanceApi#getFilesList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vcsRootInstanceLocator** | **String**|  |
 **basePath** | **String**|  | [optional]
 **locator** | **String**|  | [optional]
 **fields** | **String**|  | [optional]

### Return type

[**Files**](Files.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getFilesListForSubpath"></a>
# **getFilesListForSubpath**
> Files getFilesListForSubpath(path, vcsRootInstanceLocator, basePath, locator, fields)

List files under this path.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.VcsRootInstanceApi;


VcsRootInstanceApi apiInstance = new VcsRootInstanceApi();
String path = "path_example"; // String | 
String vcsRootInstanceLocator = "vcsRootInstanceLocator_example"; // String | 
String basePath = "basePath_example"; // String | 
String locator = "locator_example"; // String | 
String fields = "fields_example"; // String | 
try {
    Files result = apiInstance.getFilesListForSubpath(path, vcsRootInstanceLocator, basePath, locator, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VcsRootInstanceApi#getFilesListForSubpath");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**|  |
 **vcsRootInstanceLocator** | **String**|  |
 **basePath** | **String**|  | [optional]
 **locator** | **String**|  | [optional]
 **fields** | **String**|  | [optional]

### Return type

[**Files**](Files.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getVcsRootInstance"></a>
# **getVcsRootInstance**
> VcsRootInstance getVcsRootInstance(vcsRootInstanceLocator, fields)

Get VCS root instance matching the locator.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.VcsRootInstanceApi;


VcsRootInstanceApi apiInstance = new VcsRootInstanceApi();
String vcsRootInstanceLocator = "vcsRootInstanceLocator_example"; // String | 
String fields = "fields_example"; // String | 
try {
    VcsRootInstance result = apiInstance.getVcsRootInstance(vcsRootInstanceLocator, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VcsRootInstanceApi#getVcsRootInstance");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vcsRootInstanceLocator** | **String**|  |
 **fields** | **String**|  | [optional]

### Return type

[**VcsRootInstance**](VcsRootInstance.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getVcsRootInstanceCreationDate"></a>
# **getVcsRootInstanceCreationDate**
> String getVcsRootInstanceCreationDate(vcsRootInstanceLocator)

Get the creation date of the matching VCS root instance.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.VcsRootInstanceApi;


VcsRootInstanceApi apiInstance = new VcsRootInstanceApi();
String vcsRootInstanceLocator = "vcsRootInstanceLocator_example"; // String | 
try {
    String result = apiInstance.getVcsRootInstanceCreationDate(vcsRootInstanceLocator);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VcsRootInstanceApi#getVcsRootInstanceCreationDate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vcsRootInstanceLocator** | **String**|  |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: text/plain
 - **Accept**: text/plain

<a name="getVcsRootInstanceField"></a>
# **getVcsRootInstanceField**
> String getVcsRootInstanceField(vcsRootInstanceLocator, field)

Get a field of the matching VCS root instance.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.VcsRootInstanceApi;


VcsRootInstanceApi apiInstance = new VcsRootInstanceApi();
String vcsRootInstanceLocator = "vcsRootInstanceLocator_example"; // String | 
String field = "field_example"; // String | 
try {
    String result = apiInstance.getVcsRootInstanceField(vcsRootInstanceLocator, field);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VcsRootInstanceApi#getVcsRootInstanceField");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vcsRootInstanceLocator** | **String**|  |
 **field** | **String**|  |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

<a name="getVcsRootInstanceProperties"></a>
# **getVcsRootInstanceProperties**
> Properties getVcsRootInstanceProperties(vcsRootInstanceLocator, fields)

Get all properties of the matching VCS root instance.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.VcsRootInstanceApi;


VcsRootInstanceApi apiInstance = new VcsRootInstanceApi();
String vcsRootInstanceLocator = "vcsRootInstanceLocator_example"; // String | 
String fields = "fields_example"; // String | 
try {
    Properties result = apiInstance.getVcsRootInstanceProperties(vcsRootInstanceLocator, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VcsRootInstanceApi#getVcsRootInstanceProperties");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vcsRootInstanceLocator** | **String**|  |
 **fields** | **String**|  | [optional]

### Return type

[**Properties**](Properties.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getVcsRootInstanceRepositoryState"></a>
# **getVcsRootInstanceRepositoryState**
> Entries getVcsRootInstanceRepositoryState(vcsRootInstanceLocator, fields)

Get the repository state of the matching VCS root instance.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.VcsRootInstanceApi;


VcsRootInstanceApi apiInstance = new VcsRootInstanceApi();
String vcsRootInstanceLocator = "vcsRootInstanceLocator_example"; // String | 
String fields = "fields_example"; // String | 
try {
    Entries result = apiInstance.getVcsRootInstanceRepositoryState(vcsRootInstanceLocator, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VcsRootInstanceApi#getVcsRootInstanceRepositoryState");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vcsRootInstanceLocator** | **String**|  |
 **fields** | **String**|  | [optional]

### Return type

[**Entries**](Entries.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getZippedFile"></a>
# **getZippedFile**
> getZippedFile(path, vcsRootInstanceLocator, basePath, locator, name)

Get specific file zipped.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.VcsRootInstanceApi;


VcsRootInstanceApi apiInstance = new VcsRootInstanceApi();
String path = "path_example"; // String | 
String vcsRootInstanceLocator = "vcsRootInstanceLocator_example"; // String | 
String basePath = "basePath_example"; // String | 
String locator = "locator_example"; // String | 
String name = "name_example"; // String | 
try {
    apiInstance.getZippedFile(path, vcsRootInstanceLocator, basePath, locator, name);
} catch (ApiException e) {
    System.err.println("Exception when calling VcsRootInstanceApi#getZippedFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**|  |
 **vcsRootInstanceLocator** | **String**|  |
 **basePath** | **String**|  | [optional]
 **locator** | **String**|  | [optional]
 **name** | **String**|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="requestPendingChangesCheck"></a>
# **requestPendingChangesCheck**
> VcsRootInstances requestPendingChangesCheck(locator, requestor, fields)

Check for the pending changes for all VCS root instances.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.VcsRootInstanceApi;


VcsRootInstanceApi apiInstance = new VcsRootInstanceApi();
String locator = "locator_example"; // String | 
String requestor = "requestor_example"; // String | 
String fields = "fields_example"; // String | 
try {
    VcsRootInstances result = apiInstance.requestPendingChangesCheck(locator, requestor, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VcsRootInstanceApi#requestPendingChangesCheck");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **locator** | **String**|  | [optional]
 **requestor** | **String**|  | [optional]
 **fields** | **String**|  | [optional]

### Return type

[**VcsRootInstances**](VcsRootInstances.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="setVcsRootInstanceField"></a>
# **setVcsRootInstanceField**
> String setVcsRootInstanceField(vcsRootInstanceLocator, field, body)

Get a field of the matching VCS root instance.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.VcsRootInstanceApi;


VcsRootInstanceApi apiInstance = new VcsRootInstanceApi();
String vcsRootInstanceLocator = "vcsRootInstanceLocator_example"; // String | 
String field = "field_example"; // String | 
String body = "body_example"; // String | 
try {
    String result = apiInstance.setVcsRootInstanceField(vcsRootInstanceLocator, field, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VcsRootInstanceApi#setVcsRootInstanceField");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vcsRootInstanceLocator** | **String**|  |
 **field** | **String**|  |
 **body** | **String**|  | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: text/plain
 - **Accept**: text/plain

<a name="setVcsRootInstanceRepositoryState"></a>
# **setVcsRootInstanceRepositoryState**
> Entries setVcsRootInstanceRepositoryState(vcsRootInstanceLocator, body, fields)

Update the repository state of the matching VCS root instance.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.VcsRootInstanceApi;


VcsRootInstanceApi apiInstance = new VcsRootInstanceApi();
String vcsRootInstanceLocator = "vcsRootInstanceLocator_example"; // String | 
Entries body = new Entries(); // Entries | 
String fields = "fields_example"; // String | 
try {
    Entries result = apiInstance.setVcsRootInstanceRepositoryState(vcsRootInstanceLocator, body, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VcsRootInstanceApi#setVcsRootInstanceRepositoryState");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vcsRootInstanceLocator** | **String**|  |
 **body** | [**Entries**](Entries.md)|  | [optional]
 **fields** | **String**|  | [optional]

### Return type

[**Entries**](Entries.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="triggerCommitHookNotification"></a>
# **triggerCommitHookNotification**
> triggerCommitHookNotification(locator, okOnNothingFound)

Send the commit hook notification.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.VcsRootInstanceApi;


VcsRootInstanceApi apiInstance = new VcsRootInstanceApi();
String locator = "locator_example"; // String | 
Boolean okOnNothingFound = true; // Boolean | 
try {
    apiInstance.triggerCommitHookNotification(locator, okOnNothingFound);
} catch (ApiException e) {
    System.err.println("Exception when calling VcsRootInstanceApi#triggerCommitHookNotification");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **locator** | **String**|  | [optional]
 **okOnNothingFound** | **Boolean**|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

