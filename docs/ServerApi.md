# ServerApi

All URIs are relative to *https://localhost:8111*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addLicenseKeys**](ServerApi.md#addLicenseKeys) | **POST** /app/rest/server/licensingData/licenseKeys | Add license keys.
[**deleteLicenseKey**](ServerApi.md#deleteLicenseKey) | **DELETE** /app/rest/server/licensingData/licenseKeys/{licenseKey} | Delete a license key.
[**downloadFileOfServer**](ServerApi.md#downloadFileOfServer) | **GET** /app/rest/server/files/{areaId}/files{path} | Download specific file.
[**getAllMetrics**](ServerApi.md#getAllMetrics) | **GET** /app/rest/server/metrics | Get metrics.
[**getAllPlugins**](ServerApi.md#getAllPlugins) | **GET** /app/rest/server/plugins | Get all plugins.
[**getBackupStatus**](ServerApi.md#getBackupStatus) | **GET** /app/rest/server/backup | Get the latest backup status.
[**getFileMetadataOfServer**](ServerApi.md#getFileMetadataOfServer) | **GET** /app/rest/server/files/{areaId}/metadata{path} | Get metadata of specific file.
[**getFilesListForSubpathOfServer**](ServerApi.md#getFilesListForSubpathOfServer) | **GET** /app/rest/server/files/{areaId}/{path} | List files under this path.
[**getFilesListOfServer**](ServerApi.md#getFilesListOfServer) | **GET** /app/rest/server/files/{areaId} | List all files.
[**getLicenseKey**](ServerApi.md#getLicenseKey) | **GET** /app/rest/server/licensingData/licenseKeys/{licenseKey} | Get a license key.
[**getLicenseKeys**](ServerApi.md#getLicenseKeys) | **GET** /app/rest/server/licensingData/licenseKeys | Get all license keys.
[**getLicensingData**](ServerApi.md#getLicensingData) | **GET** /app/rest/server/licensingData | Get the licensing data.
[**getServerField**](ServerApi.md#getServerField) | **GET** /app/rest/server/{field} | Get a field of the server info.
[**getServerInfo**](ServerApi.md#getServerInfo) | **GET** /app/rest/server | Get the server info.
[**getZippedFileOfServer**](ServerApi.md#getZippedFileOfServer) | **GET** /app/rest/server/files/{areaId}/archived{path} | Get specific file zipped.
[**startBackup**](ServerApi.md#startBackup) | **POST** /app/rest/server/backup | Start a new backup.


<a name="addLicenseKeys"></a>
# **addLicenseKeys**
> LicenseKeys addLicenseKeys(body, fields)

Add license keys.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ServerApi;


ServerApi apiInstance = new ServerApi();
String body = "body_example"; // String | 
String fields = "fields_example"; // String | 
try {
    LicenseKeys result = apiInstance.addLicenseKeys(body, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServerApi#addLicenseKeys");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | **String**|  | [optional]
 **fields** | **String**|  | [optional]

### Return type

[**LicenseKeys**](LicenseKeys.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: text/plain
 - **Accept**: application/xml, application/json

<a name="deleteLicenseKey"></a>
# **deleteLicenseKey**
> deleteLicenseKey(licenseKey)

Delete a license key.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ServerApi;


ServerApi apiInstance = new ServerApi();
String licenseKey = "licenseKey_example"; // String | 
try {
    apiInstance.deleteLicenseKey(licenseKey);
} catch (ApiException e) {
    System.err.println("Exception when calling ServerApi#deleteLicenseKey");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **licenseKey** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="downloadFileOfServer"></a>
# **downloadFileOfServer**
> downloadFileOfServer(path, areaId)

Download specific file.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ServerApi;


ServerApi apiInstance = new ServerApi();
String path = "path_example"; // String | 
String areaId = "areaId_example"; // String | 
try {
    apiInstance.downloadFileOfServer(path, areaId);
} catch (ApiException e) {
    System.err.println("Exception when calling ServerApi#downloadFileOfServer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**|  |
 **areaId** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getAllMetrics"></a>
# **getAllMetrics**
> Metrics getAllMetrics(fields)

Get metrics.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ServerApi;


ServerApi apiInstance = new ServerApi();
String fields = "fields_example"; // String | 
try {
    Metrics result = apiInstance.getAllMetrics(fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServerApi#getAllMetrics");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fields** | **String**|  | [optional]

### Return type

[**Metrics**](Metrics.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getAllPlugins"></a>
# **getAllPlugins**
> Plugins getAllPlugins(fields)

Get all plugins.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ServerApi;


ServerApi apiInstance = new ServerApi();
String fields = "fields_example"; // String | 
try {
    Plugins result = apiInstance.getAllPlugins(fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServerApi#getAllPlugins");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fields** | **String**|  | [optional]

### Return type

[**Plugins**](Plugins.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getBackupStatus"></a>
# **getBackupStatus**
> String getBackupStatus()

Get the latest backup status.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ServerApi;


ServerApi apiInstance = new ServerApi();
try {
    String result = apiInstance.getBackupStatus();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServerApi#getBackupStatus");
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

<a name="getFileMetadataOfServer"></a>
# **getFileMetadataOfServer**
> File getFileMetadataOfServer(path, areaId, fields)

Get metadata of specific file.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ServerApi;


ServerApi apiInstance = new ServerApi();
String path = "path_example"; // String | 
String areaId = "areaId_example"; // String | 
String fields = "fields_example"; // String | 
try {
    File result = apiInstance.getFileMetadataOfServer(path, areaId, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServerApi#getFileMetadataOfServer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**|  |
 **areaId** | **String**|  |
 **fields** | **String**|  | [optional]

### Return type

[**File**](File.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getFilesListForSubpathOfServer"></a>
# **getFilesListForSubpathOfServer**
> Files getFilesListForSubpathOfServer(path, areaId, basePath, locator, fields)

List files under this path.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ServerApi;


ServerApi apiInstance = new ServerApi();
String path = "path_example"; // String | 
String areaId = "areaId_example"; // String | 
String basePath = "basePath_example"; // String | 
String locator = "locator_example"; // String | 
String fields = "fields_example"; // String | 
try {
    Files result = apiInstance.getFilesListForSubpathOfServer(path, areaId, basePath, locator, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServerApi#getFilesListForSubpathOfServer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**|  |
 **areaId** | **String**|  |
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

<a name="getFilesListOfServer"></a>
# **getFilesListOfServer**
> Files getFilesListOfServer(areaId, basePath, locator, fields)

List all files.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ServerApi;


ServerApi apiInstance = new ServerApi();
String areaId = "areaId_example"; // String | 
String basePath = "basePath_example"; // String | 
String locator = "locator_example"; // String | 
String fields = "fields_example"; // String | 
try {
    Files result = apiInstance.getFilesListOfServer(areaId, basePath, locator, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServerApi#getFilesListOfServer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **areaId** | **String**|  |
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

<a name="getLicenseKey"></a>
# **getLicenseKey**
> LicenseKey getLicenseKey(licenseKey, fields)

Get a license key.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ServerApi;


ServerApi apiInstance = new ServerApi();
String licenseKey = "licenseKey_example"; // String | 
String fields = "fields_example"; // String | 
try {
    LicenseKey result = apiInstance.getLicenseKey(licenseKey, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServerApi#getLicenseKey");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **licenseKey** | **String**|  |
 **fields** | **String**|  | [optional]

### Return type

[**LicenseKey**](LicenseKey.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getLicenseKeys"></a>
# **getLicenseKeys**
> LicenseKeys getLicenseKeys(fields)

Get all license keys.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ServerApi;


ServerApi apiInstance = new ServerApi();
String fields = "fields_example"; // String | 
try {
    LicenseKeys result = apiInstance.getLicenseKeys(fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServerApi#getLicenseKeys");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fields** | **String**|  | [optional]

### Return type

[**LicenseKeys**](LicenseKeys.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getLicensingData"></a>
# **getLicensingData**
> LicensingData getLicensingData(fields)

Get the licensing data.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ServerApi;


ServerApi apiInstance = new ServerApi();
String fields = "fields_example"; // String | 
try {
    LicensingData result = apiInstance.getLicensingData(fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServerApi#getLicensingData");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fields** | **String**|  | [optional]

### Return type

[**LicensingData**](LicensingData.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getServerField"></a>
# **getServerField**
> String getServerField(field)

Get a field of the server info.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ServerApi;


ServerApi apiInstance = new ServerApi();
String field = "field_example"; // String | 
try {
    String result = apiInstance.getServerField(field);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServerApi#getServerField");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **field** | **String**|  |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

<a name="getServerInfo"></a>
# **getServerInfo**
> Server getServerInfo(fields)

Get the server info.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ServerApi;


ServerApi apiInstance = new ServerApi();
String fields = "fields_example"; // String | 
try {
    Server result = apiInstance.getServerInfo(fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServerApi#getServerInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fields** | **String**|  | [optional]

### Return type

[**Server**](Server.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getZippedFileOfServer"></a>
# **getZippedFileOfServer**
> getZippedFileOfServer(path, areaId, basePath, locator, name)

Get specific file zipped.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ServerApi;


ServerApi apiInstance = new ServerApi();
String path = "path_example"; // String | 
String areaId = "areaId_example"; // String | 
String basePath = "basePath_example"; // String | 
String locator = "locator_example"; // String | 
String name = "name_example"; // String | 
try {
    apiInstance.getZippedFileOfServer(path, areaId, basePath, locator, name);
} catch (ApiException e) {
    System.err.println("Exception when calling ServerApi#getZippedFileOfServer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**|  |
 **areaId** | **String**|  |
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

<a name="startBackup"></a>
# **startBackup**
> String startBackup(fileName, addTimestamp, includeConfigs, includeDatabase, includeBuildLogs, includePersonalChanges, includeRunningBuilds, includeSupplimentaryData)

Start a new backup.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ServerApi;


ServerApi apiInstance = new ServerApi();
String fileName = "fileName_example"; // String | 
Boolean addTimestamp = true; // Boolean | 
Boolean includeConfigs = true; // Boolean | 
Boolean includeDatabase = true; // Boolean | 
Boolean includeBuildLogs = true; // Boolean | 
Boolean includePersonalChanges = true; // Boolean | 
Boolean includeRunningBuilds = true; // Boolean | 
Boolean includeSupplimentaryData = true; // Boolean | 
try {
    String result = apiInstance.startBackup(fileName, addTimestamp, includeConfigs, includeDatabase, includeBuildLogs, includePersonalChanges, includeRunningBuilds, includeSupplimentaryData);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServerApi#startBackup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fileName** | **String**|  | [optional]
 **addTimestamp** | **Boolean**|  | [optional]
 **includeConfigs** | **Boolean**|  | [optional]
 **includeDatabase** | **Boolean**|  | [optional]
 **includeBuildLogs** | **Boolean**|  | [optional]
 **includePersonalChanges** | **Boolean**|  | [optional]
 **includeRunningBuilds** | **Boolean**|  | [optional]
 **includeSupplimentaryData** | **Boolean**|  | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

