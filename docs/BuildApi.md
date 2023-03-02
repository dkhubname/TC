# BuildApi

All URIs are relative to *https://localhost:8111*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addBuildVcsLabel**](BuildApi.md#addBuildVcsLabel) | **POST** /app/rest/builds/{buildLocator}/vcsLabels | Add a VCS label to the matching build.
[**addLogMessageToBuild**](BuildApi.md#addLogMessageToBuild) | **POST** /app/rest/builds/{buildLocator}/log | Adds a message to the build log. Service messages are accepted.
[**addProblemToBuild**](BuildApi.md#addProblemToBuild) | **POST** /app/rest/builds/{buildLocator}/problemOccurrences | Add a build problem to the matching build.
[**addTagsToBuild**](BuildApi.md#addTagsToBuild) | **POST** /app/rest/builds/{buildLocator}/tags | Add tags to the matching build.
[**addTagsToMultipleBuilds**](BuildApi.md#addTagsToMultipleBuilds) | **POST** /app/rest/builds/multiple/{buildLocator}/tags | Add tags to multiple matching builds.
[**cancelBuild**](BuildApi.md#cancelBuild) | **POST** /app/rest/builds/{buildLocator} | cancelBuild
[**cancelMultiple**](BuildApi.md#cancelMultiple) | **POST** /app/rest/builds/multiple/{buildLocator} | cancelMultipleBuilds
[**deleteBuild**](BuildApi.md#deleteBuild) | **DELETE** /app/rest/builds/{buildLocator} | Delete build matching the locator.
[**deleteBuildComment**](BuildApi.md#deleteBuildComment) | **DELETE** /app/rest/builds/{buildLocator}/comment | Remove the build comment matching the locator.
[**deleteMultipleBuildComments**](BuildApi.md#deleteMultipleBuildComments) | **DELETE** /app/rest/builds/multiple/{buildLocator}/comment | Delete comments of multiple matching builds.
[**deleteMultipleBuilds**](BuildApi.md#deleteMultipleBuilds) | **DELETE** /app/rest/builds/multiple/{buildLocator} | Delete multiple builds matching the locator.
[**downloadFileOfBuild**](BuildApi.md#downloadFileOfBuild) | **GET** /app/rest/builds/{buildLocator}/artifacts/files{path} | Download specific file.
[**getAggregatedBuildStatus**](BuildApi.md#getAggregatedBuildStatus) | **GET** /app/rest/builds/aggregated/{buildLocator}/status | Get the build status of aggregated matching builds.
[**getAggregatedBuildStatusIcon**](BuildApi.md#getAggregatedBuildStatusIcon) | **GET** /app/rest/builds/aggregated/{buildLocator}/statusIcon{suffix} | Get the status icon (in specified format) of aggregated matching builds.
[**getAllBuilds**](BuildApi.md#getAllBuilds) | **GET** /app/rest/builds | Get all builds.
[**getArtifactDependencyChanges**](BuildApi.md#getArtifactDependencyChanges) | **GET** /app/rest/builds/{buildLocator}/artifactDependencyChanges | Get artifact dependency changes of the matching build.
[**getArtifactsDirectory**](BuildApi.md#getArtifactsDirectory) | **GET** /app/rest/builds/{buildLocator}/artifactsDirectory | Get the artifacts&#39; directory of the matching build.
[**getBuild**](BuildApi.md#getBuild) | **GET** /app/rest/builds/{buildLocator} | Get build matching the locator.
[**getBuildActualParameters**](BuildApi.md#getBuildActualParameters) | **GET** /app/rest/builds/{buildLocator}/resulting-properties | Get actual build parameters of the matching build.
[**getBuildField**](BuildApi.md#getBuildField) | **GET** /app/rest/builds/{buildLocator}/{field} | Get a field of the matching build.
[**getBuildFinishDate**](BuildApi.md#getBuildFinishDate) | **GET** /app/rest/builds/{buildLocator}/finishDate | Get the finish date of the matching build.
[**getBuildNumber**](BuildApi.md#getBuildNumber) | **GET** /app/rest/builds/{buildLocator}/number | Get the number of the matching build.
[**getBuildPinInfo**](BuildApi.md#getBuildPinInfo) | **GET** /app/rest/builds/{buildLocator}/pinInfo | Check if the matching build is pinned.
[**getBuildProblems**](BuildApi.md#getBuildProblems) | **GET** /app/rest/builds/{buildLocator}/problemOccurrences | Get build problems of the matching build.
[**getBuildRelatedIssues**](BuildApi.md#getBuildRelatedIssues) | **GET** /app/rest/builds/{buildLocator}/relatedIssues | Get related issues of the matching build.
[**getBuildResolved**](BuildApi.md#getBuildResolved) | **GET** /app/rest/builds/{buildLocator}/resolved/{value} | Get the resolvement status of the matching build.
[**getBuildResultingProperties**](BuildApi.md#getBuildResultingProperties) | **GET** /app/rest/builds/{buildLocator}/resulting-properties/{propertyName} | Update a build parameter of the matching build.
[**getBuildSourceFile**](BuildApi.md#getBuildSourceFile) | **GET** /app/rest/builds/{buildLocator}/sources/files/{fileName} | Get a source file of the matching build.
[**getBuildStatisticValue**](BuildApi.md#getBuildStatisticValue) | **GET** /app/rest/builds/{buildLocator}/statistics/{name} | Get a statistical value of the matching build.
[**getBuildStatisticValues**](BuildApi.md#getBuildStatisticValues) | **GET** /app/rest/builds/{buildLocator}/statistics | Get all statistical values of the matching build.
[**getBuildStatus**](BuildApi.md#getBuildStatus) | **GET** /app/rest/builds/{buildLocator}/status | Get status of the matching build.
[**getBuildStatusIcon**](BuildApi.md#getBuildStatusIcon) | **GET** /app/rest/builds/{buildLocator}/statusIcon{suffix} | Get the status icon (in specified format) of the matching build.
[**getBuildStatusText**](BuildApi.md#getBuildStatusText) | **GET** /app/rest/builds/{buildLocator}/statusText | Get the build status text of the matching build.
[**getBuildTags**](BuildApi.md#getBuildTags) | **GET** /app/rest/builds/{buildLocator}/tags | Get tags of the matching build.
[**getBuildTestOccurrences**](BuildApi.md#getBuildTestOccurrences) | **GET** /app/rest/builds/{buildLocator}/testOccurrences | Get test occurrences of the matching build.
[**getBuildVcsLabels**](BuildApi.md#getBuildVcsLabels) | **GET** /app/rest/builds/{buildLocator}/vcsLabels | Get VCS labels of the matching build.
[**getCanceledInfo**](BuildApi.md#getCanceledInfo) | **GET** /app/rest/builds/{buildLocator}/canceledInfo | Check if the matching build is canceled.
[**getFileMetadataOfBuild**](BuildApi.md#getFileMetadataOfBuild) | **GET** /app/rest/builds/{buildLocator}/artifacts/metadata{path} | Get metadata of specific file.
[**getFilesListForSubpathOfBuild**](BuildApi.md#getFilesListForSubpathOfBuild) | **GET** /app/rest/builds/{buildLocator}/artifacts/{path} | List files under this path.
[**getFilesListOfBuild**](BuildApi.md#getFilesListOfBuild) | **GET** /app/rest/builds/{buildLocator}/artifacts | List all files.
[**getMultipleBuilds**](BuildApi.md#getMultipleBuilds) | **GET** /app/rest/builds/multiple/{buildLocator} | Get multiple builds matching the locator.
[**getZippedFileOfBuild**](BuildApi.md#getZippedFileOfBuild) | **GET** /app/rest/builds/{buildLocator}/artifacts/archived{path} | Get specific file zipped.
[**markBuildAsRunning**](BuildApi.md#markBuildAsRunning) | **PUT** /app/rest/builds/{buildLocator}/runningData | Starts the queued build as an agent-less build and returns the corresponding running build.
[**pinMultipleBuilds**](BuildApi.md#pinMultipleBuilds) | **PUT** /app/rest/builds/multiple/{buildLocator}/pinInfo | Pin multiple matching builds.
[**removeMultipleBuildTags**](BuildApi.md#removeMultipleBuildTags) | **DELETE** /app/rest/builds/multiple/{buildLocator}/tags | Remove tags from multiple matching builds.
[**resetBuildFinishProperties**](BuildApi.md#resetBuildFinishProperties) | **DELETE** /app/rest/builds/{buildLocator}/caches/finishProperties | Remove build parameters from the matching build.
[**setBuildComment**](BuildApi.md#setBuildComment) | **PUT** /app/rest/builds/{buildLocator}/comment | Update the comment on the matching build.
[**setBuildFinishDate**](BuildApi.md#setBuildFinishDate) | **PUT** /app/rest/builds/{buildLocator}/finishDate | Marks the running build as finished by passing agent the current time of the build to finish.
[**setBuildNumber**](BuildApi.md#setBuildNumber) | **PUT** /app/rest/builds/{buildLocator}/number | Update the number of the matching build.
[**setBuildPinInfo**](BuildApi.md#setBuildPinInfo) | **PUT** /app/rest/builds/{buildLocator}/pinInfo | Update the pin info of the matching build.
[**setBuildStatus**](BuildApi.md#setBuildStatus) | **POST** /app/rest/builds/{buildLocator}/status | Change status of the build.
[**setBuildStatusText**](BuildApi.md#setBuildStatusText) | **PUT** /app/rest/builds/{buildLocator}/statusText | Update the build status of the matching build.
[**setBuildTags**](BuildApi.md#setBuildTags) | **PUT** /app/rest/builds/{buildLocator}/tags | Update tags of the matching build.
[**setFinishedTime**](BuildApi.md#setFinishedTime) | **PUT** /app/rest/builds/{buildLocator}/finish | Marks the running build as finished by passing agent the current time of the build to finish.
[**setMultipleBuildComments**](BuildApi.md#setMultipleBuildComments) | **PUT** /app/rest/builds/multiple/{buildLocator}/comment | Update comments in multiple matching builds.


<a name="addBuildVcsLabel"></a>
# **addBuildVcsLabel**
> VcsLabels addBuildVcsLabel(buildLocator, locator, fields, body)

Add a VCS label to the matching build.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildApi;


BuildApi apiInstance = new BuildApi();
String buildLocator = "buildLocator_example"; // String | 
String locator = "locator_example"; // String | 
String fields = "fields_example"; // String | 
String body = "body_example"; // String | 
try {
    VcsLabels result = apiInstance.addBuildVcsLabel(buildLocator, locator, fields, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildApi#addBuildVcsLabel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buildLocator** | **String**|  |
 **locator** | **String**|  | [optional]
 **fields** | **String**|  | [optional]
 **body** | **String**|  | [optional]

### Return type

[**VcsLabels**](VcsLabels.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: text/plain
 - **Accept**: application/xml, application/json

<a name="addLogMessageToBuild"></a>
# **addLogMessageToBuild**
> addLogMessageToBuild(buildLocator, body, fields)

Adds a message to the build log. Service messages are accepted.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildApi;


BuildApi apiInstance = new BuildApi();
String buildLocator = "buildLocator_example"; // String | 
String body = "body_example"; // String | 
String fields = "fields_example"; // String | 
try {
    apiInstance.addLogMessageToBuild(buildLocator, body, fields);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildApi#addLogMessageToBuild");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buildLocator** | **String**|  |
 **body** | **String**|  | [optional]
 **fields** | **String**|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: text/plain
 - **Accept**: Not defined

<a name="addProblemToBuild"></a>
# **addProblemToBuild**
> ProblemOccurrence addProblemToBuild(buildLocator, body, fields)

Add a build problem to the matching build.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildApi;


BuildApi apiInstance = new BuildApi();
String buildLocator = "buildLocator_example"; // String | 
String body = "body_example"; // String | 
String fields = "fields_example"; // String | 
try {
    ProblemOccurrence result = apiInstance.addProblemToBuild(buildLocator, body, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildApi#addProblemToBuild");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buildLocator** | **String**|  |
 **body** | **String**|  | [optional]
 **fields** | **String**|  | [optional]

### Return type

[**ProblemOccurrence**](ProblemOccurrence.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: text/plain
 - **Accept**: application/xml, application/json

<a name="addTagsToBuild"></a>
# **addTagsToBuild**
> Tags addTagsToBuild(buildLocator, body, fields)

Add tags to the matching build.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildApi;


BuildApi apiInstance = new BuildApi();
String buildLocator = "buildLocator_example"; // String | 
Tags body = new Tags(); // Tags | 
String fields = "fields_example"; // String | 
try {
    Tags result = apiInstance.addTagsToBuild(buildLocator, body, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildApi#addTagsToBuild");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buildLocator** | **String**|  |
 **body** | [**Tags**](Tags.md)|  | [optional]
 **fields** | **String**|  | [optional]

### Return type

[**Tags**](Tags.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="addTagsToMultipleBuilds"></a>
# **addTagsToMultipleBuilds**
> MultipleOperationResult addTagsToMultipleBuilds(buildLocator, body, fields)

Add tags to multiple matching builds.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildApi;


BuildApi apiInstance = new BuildApi();
String buildLocator = "buildLocator_example"; // String | 
Tags body = new Tags(); // Tags | 
String fields = "fields_example"; // String | 
try {
    MultipleOperationResult result = apiInstance.addTagsToMultipleBuilds(buildLocator, body, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildApi#addTagsToMultipleBuilds");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buildLocator** | **String**|  |
 **body** | [**Tags**](Tags.md)|  | [optional]
 **fields** | **String**|  | [optional]

### Return type

[**MultipleOperationResult**](MultipleOperationResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="cancelBuild"></a>
# **cancelBuild**
> Build cancelBuild(buildLocator, body, fields)

cancelBuild



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildApi;


BuildApi apiInstance = new BuildApi();
String buildLocator = "buildLocator_example"; // String | 
BuildCancelRequest body = new BuildCancelRequest(); // BuildCancelRequest | 
String fields = "fields_example"; // String | 
try {
    Build result = apiInstance.cancelBuild(buildLocator, body, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildApi#cancelBuild");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buildLocator** | **String**|  |
 **body** | [**BuildCancelRequest**](BuildCancelRequest.md)|  | [optional]
 **fields** | **String**|  | [optional]

### Return type

[**Build**](Build.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="cancelMultiple"></a>
# **cancelMultiple**
> MultipleOperationResult cancelMultiple(buildLocator, body, fields)

cancelMultipleBuilds



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildApi;


BuildApi apiInstance = new BuildApi();
String buildLocator = "buildLocator_example"; // String | 
BuildCancelRequest body = new BuildCancelRequest(); // BuildCancelRequest | 
String fields = "fields_example"; // String | 
try {
    MultipleOperationResult result = apiInstance.cancelMultiple(buildLocator, body, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildApi#cancelMultiple");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buildLocator** | **String**|  |
 **body** | [**BuildCancelRequest**](BuildCancelRequest.md)|  | [optional]
 **fields** | **String**|  | [optional]

### Return type

[**MultipleOperationResult**](MultipleOperationResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="deleteBuild"></a>
# **deleteBuild**
> deleteBuild(buildLocator)

Delete build matching the locator.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildApi;


BuildApi apiInstance = new BuildApi();
String buildLocator = "buildLocator_example"; // String | 
try {
    apiInstance.deleteBuild(buildLocator);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildApi#deleteBuild");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buildLocator** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteBuildComment"></a>
# **deleteBuildComment**
> deleteBuildComment(buildLocator)

Remove the build comment matching the locator.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildApi;


BuildApi apiInstance = new BuildApi();
String buildLocator = "buildLocator_example"; // String | 
try {
    apiInstance.deleteBuildComment(buildLocator);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildApi#deleteBuildComment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buildLocator** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteMultipleBuildComments"></a>
# **deleteMultipleBuildComments**
> MultipleOperationResult deleteMultipleBuildComments(buildLocator, fields)

Delete comments of multiple matching builds.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildApi;


BuildApi apiInstance = new BuildApi();
String buildLocator = "buildLocator_example"; // String | 
String fields = "fields_example"; // String | 
try {
    MultipleOperationResult result = apiInstance.deleteMultipleBuildComments(buildLocator, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildApi#deleteMultipleBuildComments");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buildLocator** | **String**|  |
 **fields** | **String**|  | [optional]

### Return type

[**MultipleOperationResult**](MultipleOperationResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="deleteMultipleBuilds"></a>
# **deleteMultipleBuilds**
> MultipleOperationResult deleteMultipleBuilds(buildLocator, fields)

Delete multiple builds matching the locator.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildApi;


BuildApi apiInstance = new BuildApi();
String buildLocator = "buildLocator_example"; // String | 
String fields = "fields_example"; // String | 
try {
    MultipleOperationResult result = apiInstance.deleteMultipleBuilds(buildLocator, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildApi#deleteMultipleBuilds");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buildLocator** | **String**|  |
 **fields** | **String**|  | [optional]

### Return type

[**MultipleOperationResult**](MultipleOperationResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="downloadFileOfBuild"></a>
# **downloadFileOfBuild**
> downloadFileOfBuild(path, buildLocator, resolveParameters, logBuildUsage)

Download specific file.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildApi;


BuildApi apiInstance = new BuildApi();
String path = "path_example"; // String | 
String buildLocator = "buildLocator_example"; // String | 
Boolean resolveParameters = true; // Boolean | 
Boolean logBuildUsage = true; // Boolean | 
try {
    apiInstance.downloadFileOfBuild(path, buildLocator, resolveParameters, logBuildUsage);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildApi#downloadFileOfBuild");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**|  |
 **buildLocator** | **String**|  |
 **resolveParameters** | **Boolean**|  | [optional]
 **logBuildUsage** | **Boolean**|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getAggregatedBuildStatus"></a>
# **getAggregatedBuildStatus**
> String getAggregatedBuildStatus(buildLocator)

Get the build status of aggregated matching builds.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildApi;


BuildApi apiInstance = new BuildApi();
String buildLocator = "buildLocator_example"; // String | 
try {
    String result = apiInstance.getAggregatedBuildStatus(buildLocator);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildApi#getAggregatedBuildStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buildLocator** | **String**|  |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getAggregatedBuildStatusIcon"></a>
# **getAggregatedBuildStatusIcon**
> getAggregatedBuildStatusIcon(buildLocator, suffix)

Get the status icon (in specified format) of aggregated matching builds.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildApi;


BuildApi apiInstance = new BuildApi();
String buildLocator = "buildLocator_example"; // String | 
String suffix = "suffix_example"; // String | 
try {
    apiInstance.getAggregatedBuildStatusIcon(buildLocator, suffix);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildApi#getAggregatedBuildStatusIcon");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buildLocator** | **String**|  |
 **suffix** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getAllBuilds"></a>
# **getAllBuilds**
> Builds getAllBuilds(locator, fields)

Get all builds.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildApi;


BuildApi apiInstance = new BuildApi();
String locator = "locator_example"; // String | 
String fields = "fields_example"; // String | 
try {
    Builds result = apiInstance.getAllBuilds(locator, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildApi#getAllBuilds");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **locator** | **String**|  | [optional]
 **fields** | **String**|  | [optional]

### Return type

[**Builds**](Builds.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getArtifactDependencyChanges"></a>
# **getArtifactDependencyChanges**
> BuildChanges getArtifactDependencyChanges(buildLocator, fields)

Get artifact dependency changes of the matching build.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildApi;


BuildApi apiInstance = new BuildApi();
String buildLocator = "buildLocator_example"; // String | 
String fields = "fields_example"; // String | 
try {
    BuildChanges result = apiInstance.getArtifactDependencyChanges(buildLocator, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildApi#getArtifactDependencyChanges");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buildLocator** | **String**|  |
 **fields** | **String**|  | [optional]

### Return type

[**BuildChanges**](BuildChanges.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getArtifactsDirectory"></a>
# **getArtifactsDirectory**
> String getArtifactsDirectory(buildLocator)

Get the artifacts&#39; directory of the matching build.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildApi;


BuildApi apiInstance = new BuildApi();
String buildLocator = "buildLocator_example"; // String | 
try {
    String result = apiInstance.getArtifactsDirectory(buildLocator);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildApi#getArtifactsDirectory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buildLocator** | **String**|  |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

<a name="getBuild"></a>
# **getBuild**
> Build getBuild(buildLocator, fields)

Get build matching the locator.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildApi;


BuildApi apiInstance = new BuildApi();
String buildLocator = "buildLocator_example"; // String | 
String fields = "fields_example"; // String | 
try {
    Build result = apiInstance.getBuild(buildLocator, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildApi#getBuild");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buildLocator** | **String**|  |
 **fields** | **String**|  | [optional]

### Return type

[**Build**](Build.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getBuildActualParameters"></a>
# **getBuildActualParameters**
> Properties getBuildActualParameters(buildLocator, fields)

Get actual build parameters of the matching build.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildApi;


BuildApi apiInstance = new BuildApi();
String buildLocator = "buildLocator_example"; // String | 
String fields = "fields_example"; // String | 
try {
    Properties result = apiInstance.getBuildActualParameters(buildLocator, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildApi#getBuildActualParameters");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buildLocator** | **String**|  |
 **fields** | **String**|  | [optional]

### Return type

[**Properties**](Properties.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getBuildField"></a>
# **getBuildField**
> String getBuildField(buildLocator, field)

Get a field of the matching build.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildApi;


BuildApi apiInstance = new BuildApi();
String buildLocator = "buildLocator_example"; // String | 
String field = "field_example"; // String | 
try {
    String result = apiInstance.getBuildField(buildLocator, field);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildApi#getBuildField");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buildLocator** | **String**|  |
 **field** | **String**|  |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

<a name="getBuildFinishDate"></a>
# **getBuildFinishDate**
> String getBuildFinishDate(buildLocator)

Get the finish date of the matching build.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildApi;


BuildApi apiInstance = new BuildApi();
String buildLocator = "buildLocator_example"; // String | 
try {
    String result = apiInstance.getBuildFinishDate(buildLocator);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildApi#getBuildFinishDate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buildLocator** | **String**|  |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

<a name="getBuildNumber"></a>
# **getBuildNumber**
> String getBuildNumber(buildLocator)

Get the number of the matching build.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildApi;


BuildApi apiInstance = new BuildApi();
String buildLocator = "buildLocator_example"; // String | 
try {
    String result = apiInstance.getBuildNumber(buildLocator);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildApi#getBuildNumber");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buildLocator** | **String**|  |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

<a name="getBuildPinInfo"></a>
# **getBuildPinInfo**
> PinInfo getBuildPinInfo(buildLocator, fields)

Check if the matching build is pinned.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildApi;


BuildApi apiInstance = new BuildApi();
String buildLocator = "buildLocator_example"; // String | 
String fields = "fields_example"; // String | 
try {
    PinInfo result = apiInstance.getBuildPinInfo(buildLocator, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildApi#getBuildPinInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buildLocator** | **String**|  |
 **fields** | **String**|  | [optional]

### Return type

[**PinInfo**](PinInfo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getBuildProblems"></a>
# **getBuildProblems**
> ProblemOccurrences getBuildProblems(buildLocator, fields)

Get build problems of the matching build.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildApi;


BuildApi apiInstance = new BuildApi();
String buildLocator = "buildLocator_example"; // String | 
String fields = "fields_example"; // String | 
try {
    ProblemOccurrences result = apiInstance.getBuildProblems(buildLocator, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildApi#getBuildProblems");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buildLocator** | **String**|  |
 **fields** | **String**|  | [optional]

### Return type

[**ProblemOccurrences**](ProblemOccurrences.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getBuildRelatedIssues"></a>
# **getBuildRelatedIssues**
> IssuesUsages getBuildRelatedIssues(buildLocator, fields)

Get related issues of the matching build.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildApi;


BuildApi apiInstance = new BuildApi();
String buildLocator = "buildLocator_example"; // String | 
String fields = "fields_example"; // String | 
try {
    IssuesUsages result = apiInstance.getBuildRelatedIssues(buildLocator, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildApi#getBuildRelatedIssues");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buildLocator** | **String**|  |
 **fields** | **String**|  | [optional]

### Return type

[**IssuesUsages**](IssuesUsages.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getBuildResolved"></a>
# **getBuildResolved**
> String getBuildResolved(buildLocator, value)

Get the resolvement status of the matching build.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildApi;


BuildApi apiInstance = new BuildApi();
String buildLocator = "buildLocator_example"; // String | 
String value = "value_example"; // String | 
try {
    String result = apiInstance.getBuildResolved(buildLocator, value);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildApi#getBuildResolved");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buildLocator** | **String**|  |
 **value** | **String**|  |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

<a name="getBuildResultingProperties"></a>
# **getBuildResultingProperties**
> String getBuildResultingProperties(buildLocator, propertyName)

Update a build parameter of the matching build.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildApi;


BuildApi apiInstance = new BuildApi();
String buildLocator = "buildLocator_example"; // String | 
String propertyName = "propertyName_example"; // String | 
try {
    String result = apiInstance.getBuildResultingProperties(buildLocator, propertyName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildApi#getBuildResultingProperties");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buildLocator** | **String**|  |
 **propertyName** | **String**|  |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

<a name="getBuildSourceFile"></a>
# **getBuildSourceFile**
> getBuildSourceFile(buildLocator, fileName)

Get a source file of the matching build.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildApi;


BuildApi apiInstance = new BuildApi();
String buildLocator = "buildLocator_example"; // String | 
String fileName = "fileName_example"; // String | 
try {
    apiInstance.getBuildSourceFile(buildLocator, fileName);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildApi#getBuildSourceFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buildLocator** | **String**|  |
 **fileName** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream

<a name="getBuildStatisticValue"></a>
# **getBuildStatisticValue**
> String getBuildStatisticValue(buildLocator, name)

Get a statistical value of the matching build.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildApi;


BuildApi apiInstance = new BuildApi();
String buildLocator = "buildLocator_example"; // String | 
String name = "name_example"; // String | 
try {
    String result = apiInstance.getBuildStatisticValue(buildLocator, name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildApi#getBuildStatisticValue");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buildLocator** | **String**|  |
 **name** | **String**|  |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

<a name="getBuildStatisticValues"></a>
# **getBuildStatisticValues**
> Properties getBuildStatisticValues(buildLocator, fields)

Get all statistical values of the matching build.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildApi;


BuildApi apiInstance = new BuildApi();
String buildLocator = "buildLocator_example"; // String | 
String fields = "fields_example"; // String | 
try {
    Properties result = apiInstance.getBuildStatisticValues(buildLocator, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildApi#getBuildStatisticValues");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buildLocator** | **String**|  |
 **fields** | **String**|  | [optional]

### Return type

[**Properties**](Properties.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getBuildStatus"></a>
# **getBuildStatus**
> String getBuildStatus(buildLocator)

Get status of the matching build.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildApi;


BuildApi apiInstance = new BuildApi();
String buildLocator = "buildLocator_example"; // String | 
try {
    String result = apiInstance.getBuildStatus(buildLocator);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildApi#getBuildStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buildLocator** | **String**|  |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

<a name="getBuildStatusIcon"></a>
# **getBuildStatusIcon**
> getBuildStatusIcon(buildLocator, suffix)

Get the status icon (in specified format) of the matching build.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildApi;


BuildApi apiInstance = new BuildApi();
String buildLocator = "buildLocator_example"; // String | 
String suffix = "suffix_example"; // String | 
try {
    apiInstance.getBuildStatusIcon(buildLocator, suffix);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildApi#getBuildStatusIcon");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buildLocator** | **String**|  |
 **suffix** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getBuildStatusText"></a>
# **getBuildStatusText**
> String getBuildStatusText(buildLocator)

Get the build status text of the matching build.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildApi;


BuildApi apiInstance = new BuildApi();
String buildLocator = "buildLocator_example"; // String | 
try {
    String result = apiInstance.getBuildStatusText(buildLocator);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildApi#getBuildStatusText");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buildLocator** | **String**|  |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

<a name="getBuildTags"></a>
# **getBuildTags**
> Tags getBuildTags(buildLocator, locator, fields)

Get tags of the matching build.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildApi;


BuildApi apiInstance = new BuildApi();
String buildLocator = "buildLocator_example"; // String | 
String locator = "locator_example"; // String | 
String fields = "fields_example"; // String | 
try {
    Tags result = apiInstance.getBuildTags(buildLocator, locator, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildApi#getBuildTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buildLocator** | **String**|  |
 **locator** | **String**|  | [optional]
 **fields** | **String**|  | [optional]

### Return type

[**Tags**](Tags.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getBuildTestOccurrences"></a>
# **getBuildTestOccurrences**
> TestOccurrences getBuildTestOccurrences(buildLocator, fields)

Get test occurrences of the matching build.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildApi;


BuildApi apiInstance = new BuildApi();
String buildLocator = "buildLocator_example"; // String | 
String fields = "fields_example"; // String | 
try {
    TestOccurrences result = apiInstance.getBuildTestOccurrences(buildLocator, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildApi#getBuildTestOccurrences");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buildLocator** | **String**|  |
 **fields** | **String**|  | [optional]

### Return type

[**TestOccurrences**](TestOccurrences.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getBuildVcsLabels"></a>
# **getBuildVcsLabels**
> VcsLabels getBuildVcsLabels(buildLocator, fields)

Get VCS labels of the matching build.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildApi;


BuildApi apiInstance = new BuildApi();
String buildLocator = "buildLocator_example"; // String | 
String fields = "fields_example"; // String | 
try {
    VcsLabels result = apiInstance.getBuildVcsLabels(buildLocator, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildApi#getBuildVcsLabels");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buildLocator** | **String**|  |
 **fields** | **String**|  | [optional]

### Return type

[**VcsLabels**](VcsLabels.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getCanceledInfo"></a>
# **getCanceledInfo**
> Comment getCanceledInfo(buildLocator, fields)

Check if the matching build is canceled.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildApi;


BuildApi apiInstance = new BuildApi();
String buildLocator = "buildLocator_example"; // String | 
String fields = "fields_example"; // String | 
try {
    Comment result = apiInstance.getCanceledInfo(buildLocator, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildApi#getCanceledInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buildLocator** | **String**|  |
 **fields** | **String**|  | [optional]

### Return type

[**Comment**](Comment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getFileMetadataOfBuild"></a>
# **getFileMetadataOfBuild**
> File getFileMetadataOfBuild(path, buildLocator, fields, resolveParameters, logBuildUsage)

Get metadata of specific file.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildApi;


BuildApi apiInstance = new BuildApi();
String path = "path_example"; // String | 
String buildLocator = "buildLocator_example"; // String | 
String fields = "fields_example"; // String | 
Boolean resolveParameters = true; // Boolean | 
Boolean logBuildUsage = true; // Boolean | 
try {
    File result = apiInstance.getFileMetadataOfBuild(path, buildLocator, fields, resolveParameters, logBuildUsage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildApi#getFileMetadataOfBuild");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**|  |
 **buildLocator** | **String**|  |
 **fields** | **String**|  | [optional]
 **resolveParameters** | **Boolean**|  | [optional]
 **logBuildUsage** | **Boolean**|  | [optional]

### Return type

[**File**](File.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getFilesListForSubpathOfBuild"></a>
# **getFilesListForSubpathOfBuild**
> Files getFilesListForSubpathOfBuild(path, buildLocator, basePath, locator, fields, resolveParameters, logBuildUsage)

List files under this path.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildApi;


BuildApi apiInstance = new BuildApi();
String path = "path_example"; // String | 
String buildLocator = "buildLocator_example"; // String | 
String basePath = "basePath_example"; // String | 
String locator = "locator_example"; // String | 
String fields = "fields_example"; // String | 
Boolean resolveParameters = true; // Boolean | 
Boolean logBuildUsage = true; // Boolean | 
try {
    Files result = apiInstance.getFilesListForSubpathOfBuild(path, buildLocator, basePath, locator, fields, resolveParameters, logBuildUsage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildApi#getFilesListForSubpathOfBuild");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**|  |
 **buildLocator** | **String**|  |
 **basePath** | **String**|  | [optional]
 **locator** | **String**|  | [optional]
 **fields** | **String**|  | [optional]
 **resolveParameters** | **Boolean**|  | [optional]
 **logBuildUsage** | **Boolean**|  | [optional]

### Return type

[**Files**](Files.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getFilesListOfBuild"></a>
# **getFilesListOfBuild**
> Files getFilesListOfBuild(buildLocator, basePath, locator, fields, resolveParameters, logBuildUsage)

List all files.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildApi;


BuildApi apiInstance = new BuildApi();
String buildLocator = "buildLocator_example"; // String | 
String basePath = "basePath_example"; // String | 
String locator = "locator_example"; // String | 
String fields = "fields_example"; // String | 
Boolean resolveParameters = true; // Boolean | 
Boolean logBuildUsage = true; // Boolean | 
try {
    Files result = apiInstance.getFilesListOfBuild(buildLocator, basePath, locator, fields, resolveParameters, logBuildUsage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildApi#getFilesListOfBuild");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buildLocator** | **String**|  |
 **basePath** | **String**|  | [optional]
 **locator** | **String**|  | [optional]
 **fields** | **String**|  | [optional]
 **resolveParameters** | **Boolean**|  | [optional]
 **logBuildUsage** | **Boolean**|  | [optional]

### Return type

[**Files**](Files.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getMultipleBuilds"></a>
# **getMultipleBuilds**
> Builds getMultipleBuilds(buildLocator, fields)

Get multiple builds matching the locator.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildApi;


BuildApi apiInstance = new BuildApi();
String buildLocator = "buildLocator_example"; // String | 
String fields = "fields_example"; // String | 
try {
    Builds result = apiInstance.getMultipleBuilds(buildLocator, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildApi#getMultipleBuilds");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buildLocator** | **String**|  |
 **fields** | **String**|  | [optional]

### Return type

[**Builds**](Builds.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getZippedFileOfBuild"></a>
# **getZippedFileOfBuild**
> getZippedFileOfBuild(path, buildLocator, basePath, locator, name, resolveParameters, logBuildUsage)

Get specific file zipped.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildApi;


BuildApi apiInstance = new BuildApi();
String path = "path_example"; // String | 
String buildLocator = "buildLocator_example"; // String | 
String basePath = "basePath_example"; // String | 
String locator = "locator_example"; // String | 
String name = "name_example"; // String | 
Boolean resolveParameters = true; // Boolean | 
Boolean logBuildUsage = true; // Boolean | 
try {
    apiInstance.getZippedFileOfBuild(path, buildLocator, basePath, locator, name, resolveParameters, logBuildUsage);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildApi#getZippedFileOfBuild");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**|  |
 **buildLocator** | **String**|  |
 **basePath** | **String**|  | [optional]
 **locator** | **String**|  | [optional]
 **name** | **String**|  | [optional]
 **resolveParameters** | **Boolean**|  | [optional]
 **logBuildUsage** | **Boolean**|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="markBuildAsRunning"></a>
# **markBuildAsRunning**
> Build markBuildAsRunning(buildLocator, body, fields)

Starts the queued build as an agent-less build and returns the corresponding running build.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildApi;


BuildApi apiInstance = new BuildApi();
String buildLocator = "buildLocator_example"; // String | 
String body = "body_example"; // String | 
String fields = "fields_example"; // String | 
try {
    Build result = apiInstance.markBuildAsRunning(buildLocator, body, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildApi#markBuildAsRunning");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buildLocator** | **String**|  |
 **body** | **String**|  | [optional]
 **fields** | **String**|  | [optional]

### Return type

[**Build**](Build.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: text/plain
 - **Accept**: application/xml, application/json

<a name="pinMultipleBuilds"></a>
# **pinMultipleBuilds**
> MultipleOperationResult pinMultipleBuilds(buildLocator, body, fields)

Pin multiple matching builds.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildApi;


BuildApi apiInstance = new BuildApi();
String buildLocator = "buildLocator_example"; // String | 
PinInfo body = new PinInfo(); // PinInfo | 
String fields = "fields_example"; // String | 
try {
    MultipleOperationResult result = apiInstance.pinMultipleBuilds(buildLocator, body, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildApi#pinMultipleBuilds");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buildLocator** | **String**|  |
 **body** | [**PinInfo**](PinInfo.md)|  | [optional]
 **fields** | **String**|  | [optional]

### Return type

[**MultipleOperationResult**](MultipleOperationResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="removeMultipleBuildTags"></a>
# **removeMultipleBuildTags**
> MultipleOperationResult removeMultipleBuildTags(buildLocator, body, fields)

Remove tags from multiple matching builds.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildApi;


BuildApi apiInstance = new BuildApi();
String buildLocator = "buildLocator_example"; // String | 
Tags body = new Tags(); // Tags | 
String fields = "fields_example"; // String | 
try {
    MultipleOperationResult result = apiInstance.removeMultipleBuildTags(buildLocator, body, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildApi#removeMultipleBuildTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buildLocator** | **String**|  |
 **body** | [**Tags**](Tags.md)|  | [optional]
 **fields** | **String**|  | [optional]

### Return type

[**MultipleOperationResult**](MultipleOperationResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="resetBuildFinishProperties"></a>
# **resetBuildFinishProperties**
> resetBuildFinishProperties(buildLocator)

Remove build parameters from the matching build.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildApi;


BuildApi apiInstance = new BuildApi();
String buildLocator = "buildLocator_example"; // String | 
try {
    apiInstance.resetBuildFinishProperties(buildLocator);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildApi#resetBuildFinishProperties");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buildLocator** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="setBuildComment"></a>
# **setBuildComment**
> setBuildComment(buildLocator, body)

Update the comment on the matching build.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildApi;


BuildApi apiInstance = new BuildApi();
String buildLocator = "buildLocator_example"; // String | 
String body = "body_example"; // String | 
try {
    apiInstance.setBuildComment(buildLocator, body);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildApi#setBuildComment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buildLocator** | **String**|  |
 **body** | **String**|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: text/plain
 - **Accept**: Not defined

<a name="setBuildFinishDate"></a>
# **setBuildFinishDate**
> String setBuildFinishDate(buildLocator, body)

Marks the running build as finished by passing agent the current time of the build to finish.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildApi;


BuildApi apiInstance = new BuildApi();
String buildLocator = "buildLocator_example"; // String | 
String body = "body_example"; // String | 
try {
    String result = apiInstance.setBuildFinishDate(buildLocator, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildApi#setBuildFinishDate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buildLocator** | **String**|  |
 **body** | **String**|  | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: text/plain
 - **Accept**: text/plain

<a name="setBuildNumber"></a>
# **setBuildNumber**
> String setBuildNumber(buildLocator, body)

Update the number of the matching build.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildApi;


BuildApi apiInstance = new BuildApi();
String buildLocator = "buildLocator_example"; // String | 
String body = "body_example"; // String | 
try {
    String result = apiInstance.setBuildNumber(buildLocator, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildApi#setBuildNumber");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buildLocator** | **String**|  |
 **body** | **String**|  | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: text/plain
 - **Accept**: text/plain

<a name="setBuildPinInfo"></a>
# **setBuildPinInfo**
> PinInfo setBuildPinInfo(buildLocator, body, fields)

Update the pin info of the matching build.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildApi;


BuildApi apiInstance = new BuildApi();
String buildLocator = "buildLocator_example"; // String | 
PinInfo body = new PinInfo(); // PinInfo | 
String fields = "fields_example"; // String | 
try {
    PinInfo result = apiInstance.setBuildPinInfo(buildLocator, body, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildApi#setBuildPinInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buildLocator** | **String**|  |
 **body** | [**PinInfo**](PinInfo.md)|  | [optional]
 **fields** | **String**|  | [optional]

### Return type

[**PinInfo**](PinInfo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="setBuildStatus"></a>
# **setBuildStatus**
> setBuildStatus(buildLocator, fields, body)

Change status of the build.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildApi;


BuildApi apiInstance = new BuildApi();
String buildLocator = "buildLocator_example"; // String | 
String fields = "fields_example"; // String | 
BuildStatusUpdate body = new BuildStatusUpdate(); // BuildStatusUpdate | 
try {
    apiInstance.setBuildStatus(buildLocator, fields, body);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildApi#setBuildStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buildLocator** | **String**|  |
 **fields** | **String**|  | [optional]
 **body** | [**BuildStatusUpdate**](BuildStatusUpdate.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="setBuildStatusText"></a>
# **setBuildStatusText**
> String setBuildStatusText(buildLocator, body)

Update the build status of the matching build.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildApi;


BuildApi apiInstance = new BuildApi();
String buildLocator = "buildLocator_example"; // String | 
String body = "body_example"; // String | 
try {
    String result = apiInstance.setBuildStatusText(buildLocator, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildApi#setBuildStatusText");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buildLocator** | **String**|  |
 **body** | **String**|  | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: text/plain
 - **Accept**: text/plain

<a name="setBuildTags"></a>
# **setBuildTags**
> Tags setBuildTags(buildLocator, locator, body, fields)

Update tags of the matching build.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildApi;


BuildApi apiInstance = new BuildApi();
String buildLocator = "buildLocator_example"; // String | 
String locator = "locator_example"; // String | 
Tags body = new Tags(); // Tags | 
String fields = "fields_example"; // String | 
try {
    Tags result = apiInstance.setBuildTags(buildLocator, locator, body, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildApi#setBuildTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buildLocator** | **String**|  |
 **locator** | **String**|  | [optional]
 **body** | [**Tags**](Tags.md)|  | [optional]
 **fields** | **String**|  | [optional]

### Return type

[**Tags**](Tags.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="setFinishedTime"></a>
# **setFinishedTime**
> String setFinishedTime(buildLocator)

Marks the running build as finished by passing agent the current time of the build to finish.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildApi;


BuildApi apiInstance = new BuildApi();
String buildLocator = "buildLocator_example"; // String | 
try {
    String result = apiInstance.setFinishedTime(buildLocator);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildApi#setFinishedTime");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buildLocator** | **String**|  |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: text/plain
 - **Accept**: text/plain

<a name="setMultipleBuildComments"></a>
# **setMultipleBuildComments**
> MultipleOperationResult setMultipleBuildComments(buildLocator, body, fields)

Update comments in multiple matching builds.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildApi;


BuildApi apiInstance = new BuildApi();
String buildLocator = "buildLocator_example"; // String | 
String body = "body_example"; // String | 
String fields = "fields_example"; // String | 
try {
    MultipleOperationResult result = apiInstance.setMultipleBuildComments(buildLocator, body, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildApi#setMultipleBuildComments");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buildLocator** | **String**|  |
 **body** | **String**|  | [optional]
 **fields** | **String**|  | [optional]

### Return type

[**MultipleOperationResult**](MultipleOperationResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: text/plain
 - **Accept**: application/xml, application/json

