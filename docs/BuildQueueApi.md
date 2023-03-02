# BuildQueueApi

All URIs are relative to *https://localhost:8111*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addBuildToQueue**](BuildQueueApi.md#addBuildToQueue) | **POST** /app/rest/buildQueue | Add a new build to the queue.
[**addTagsToBuildOfBuildQueue**](BuildQueueApi.md#addTagsToBuildOfBuildQueue) | **POST** /app/rest/buildQueue/{buildLocator}/tags | Add tags to the matching build.
[**approveQueuedBuild**](BuildQueueApi.md#approveQueuedBuild) | **POST** /app/rest/buildQueue/{buildLocator}/approve | Approve queued build with approval feature enabled.
[**cancelQueuedBuild**](BuildQueueApi.md#cancelQueuedBuild) | **POST** /app/rest/buildQueue/{queuedBuildLocator} | Cancel a queued matching build.
[**deleteAllQueuedBuilds**](BuildQueueApi.md#deleteAllQueuedBuilds) | **DELETE** /app/rest/buildQueue | Delete all queued builds.
[**deleteQueuedBuild**](BuildQueueApi.md#deleteQueuedBuild) | **DELETE** /app/rest/buildQueue/{queuedBuildLocator} | Delete a queued matching build.
[**getAllQueuedBuilds**](BuildQueueApi.md#getAllQueuedBuilds) | **GET** /app/rest/buildQueue | Get all queued builds.
[**getApprovalInfo**](BuildQueueApi.md#getApprovalInfo) | **GET** /app/rest/buildQueue/{buildLocator}/approvalInfo | Get approval info of a queued matching build.
[**getCompatibleAgentsForBuild**](BuildQueueApi.md#getCompatibleAgentsForBuild) | **GET** /app/rest/buildQueue/{queuedBuildLocator}/compatibleAgents | Get compatible agents for a queued matching build.
[**getQueuedBuild**](BuildQueueApi.md#getQueuedBuild) | **GET** /app/rest/buildQueue/{queuedBuildLocator} | Get a queued matching build.
[**getQueuedBuildPosition**](BuildQueueApi.md#getQueuedBuildPosition) | **GET** /app/rest/buildQueue/order/{queuePosition} | Get the queue position of a queued matching build.
[**getQueuedBuildTags**](BuildQueueApi.md#getQueuedBuildTags) | **GET** /app/rest/buildQueue/{buildLocator}/tags | Get tags of the queued matching build.
[**setQueuedBuildPosition**](BuildQueueApi.md#setQueuedBuildPosition) | **PUT** /app/rest/buildQueue/order/{queuePosition} | Update the queue position of a queued matching build.
[**setQueuedBuildsOrder**](BuildQueueApi.md#setQueuedBuildsOrder) | **PUT** /app/rest/buildQueue/order | Update the build queue order.


<a name="addBuildToQueue"></a>
# **addBuildToQueue**
> Build addBuildToQueue(body, moveToTop)

Add a new build to the queue.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildQueueApi;


BuildQueueApi apiInstance = new BuildQueueApi();
Build body = new Build(); // Build | 
Boolean moveToTop = true; // Boolean | 
try {
    Build result = apiInstance.addBuildToQueue(body, moveToTop);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildQueueApi#addBuildToQueue");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Build**](Build.md)|  | [optional]
 **moveToTop** | **Boolean**|  | [optional]

### Return type

[**Build**](Build.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="addTagsToBuildOfBuildQueue"></a>
# **addTagsToBuildOfBuildQueue**
> addTagsToBuildOfBuildQueue(buildLocator, body)

Add tags to the matching build.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildQueueApi;


BuildQueueApi apiInstance = new BuildQueueApi();
String buildLocator = "buildLocator_example"; // String | 
Tags body = new Tags(); // Tags | 
try {
    apiInstance.addTagsToBuildOfBuildQueue(buildLocator, body);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildQueueApi#addTagsToBuildOfBuildQueue");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buildLocator** | **String**|  |
 **body** | [**Tags**](Tags.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: Not defined

<a name="approveQueuedBuild"></a>
# **approveQueuedBuild**
> ApprovalInfo approveQueuedBuild(buildLocator, body, fields)

Approve queued build with approval feature enabled.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildQueueApi;


BuildQueueApi apiInstance = new BuildQueueApi();
String buildLocator = "buildLocator_example"; // String | 
String body = "body_example"; // String | 
String fields = "fields_example"; // String | 
try {
    ApprovalInfo result = apiInstance.approveQueuedBuild(buildLocator, body, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildQueueApi#approveQueuedBuild");
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

[**ApprovalInfo**](ApprovalInfo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="cancelQueuedBuild"></a>
# **cancelQueuedBuild**
> Build cancelQueuedBuild(queuedBuildLocator, body)

Cancel a queued matching build.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildQueueApi;


BuildQueueApi apiInstance = new BuildQueueApi();
String queuedBuildLocator = "queuedBuildLocator_example"; // String | 
BuildCancelRequest body = new BuildCancelRequest(); // BuildCancelRequest | 
try {
    Build result = apiInstance.cancelQueuedBuild(queuedBuildLocator, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildQueueApi#cancelQueuedBuild");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **queuedBuildLocator** | **String**|  |
 **body** | [**BuildCancelRequest**](BuildCancelRequest.md)|  | [optional]

### Return type

[**Build**](Build.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="deleteAllQueuedBuilds"></a>
# **deleteAllQueuedBuilds**
> deleteAllQueuedBuilds(locator, fields)

Delete all queued builds.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildQueueApi;


BuildQueueApi apiInstance = new BuildQueueApi();
String locator = "locator_example"; // String | 
String fields = "fields_example"; // String | 
try {
    apiInstance.deleteAllQueuedBuilds(locator, fields);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildQueueApi#deleteAllQueuedBuilds");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **locator** | **String**|  | [optional]
 **fields** | **String**|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteQueuedBuild"></a>
# **deleteQueuedBuild**
> deleteQueuedBuild(queuedBuildLocator)

Delete a queued matching build.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildQueueApi;


BuildQueueApi apiInstance = new BuildQueueApi();
String queuedBuildLocator = "queuedBuildLocator_example"; // String | 
try {
    apiInstance.deleteQueuedBuild(queuedBuildLocator);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildQueueApi#deleteQueuedBuild");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **queuedBuildLocator** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getAllQueuedBuilds"></a>
# **getAllQueuedBuilds**
> Builds getAllQueuedBuilds(locator, fields)

Get all queued builds.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildQueueApi;


BuildQueueApi apiInstance = new BuildQueueApi();
String locator = "locator_example"; // String | 
String fields = "fields_example"; // String | 
try {
    Builds result = apiInstance.getAllQueuedBuilds(locator, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildQueueApi#getAllQueuedBuilds");
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

<a name="getApprovalInfo"></a>
# **getApprovalInfo**
> ApprovalInfo getApprovalInfo(buildLocator, fields)

Get approval info of a queued matching build.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildQueueApi;


BuildQueueApi apiInstance = new BuildQueueApi();
String buildLocator = "buildLocator_example"; // String | 
String fields = "fields_example"; // String | 
try {
    ApprovalInfo result = apiInstance.getApprovalInfo(buildLocator, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildQueueApi#getApprovalInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buildLocator** | **String**|  |
 **fields** | **String**|  | [optional]

### Return type

[**ApprovalInfo**](ApprovalInfo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getCompatibleAgentsForBuild"></a>
# **getCompatibleAgentsForBuild**
> Agents getCompatibleAgentsForBuild(queuedBuildLocator, fields)

Get compatible agents for a queued matching build.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildQueueApi;


BuildQueueApi apiInstance = new BuildQueueApi();
String queuedBuildLocator = "queuedBuildLocator_example"; // String | 
String fields = "fields_example"; // String | 
try {
    Agents result = apiInstance.getCompatibleAgentsForBuild(queuedBuildLocator, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildQueueApi#getCompatibleAgentsForBuild");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **queuedBuildLocator** | **String**|  |
 **fields** | **String**|  | [optional]

### Return type

[**Agents**](Agents.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getQueuedBuild"></a>
# **getQueuedBuild**
> Build getQueuedBuild(queuedBuildLocator, fields)

Get a queued matching build.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildQueueApi;


BuildQueueApi apiInstance = new BuildQueueApi();
String queuedBuildLocator = "queuedBuildLocator_example"; // String | 
String fields = "fields_example"; // String | 
try {
    Build result = apiInstance.getQueuedBuild(queuedBuildLocator, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildQueueApi#getQueuedBuild");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **queuedBuildLocator** | **String**|  |
 **fields** | **String**|  | [optional]

### Return type

[**Build**](Build.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getQueuedBuildPosition"></a>
# **getQueuedBuildPosition**
> Build getQueuedBuildPosition(queuePosition, fields)

Get the queue position of a queued matching build.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildQueueApi;


BuildQueueApi apiInstance = new BuildQueueApi();
String queuePosition = "queuePosition_example"; // String | 
String fields = "fields_example"; // String | 
try {
    Build result = apiInstance.getQueuedBuildPosition(queuePosition, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildQueueApi#getQueuedBuildPosition");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **queuePosition** | **String**|  |
 **fields** | **String**|  | [optional]

### Return type

[**Build**](Build.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="getQueuedBuildTags"></a>
# **getQueuedBuildTags**
> Tags getQueuedBuildTags(buildLocator, locator, fields)

Get tags of the queued matching build.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildQueueApi;


BuildQueueApi apiInstance = new BuildQueueApi();
String buildLocator = "buildLocator_example"; // String | 
String locator = "locator_example"; // String | 
String fields = "fields_example"; // String | 
try {
    Tags result = apiInstance.getQueuedBuildTags(buildLocator, locator, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildQueueApi#getQueuedBuildTags");
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

<a name="setQueuedBuildPosition"></a>
# **setQueuedBuildPosition**
> Build setQueuedBuildPosition(queuePosition, body, fields)

Update the queue position of a queued matching build.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildQueueApi;


BuildQueueApi apiInstance = new BuildQueueApi();
String queuePosition = "queuePosition_example"; // String | 
Build body = new Build(); // Build | 
String fields = "fields_example"; // String | 
try {
    Build result = apiInstance.setQueuedBuildPosition(queuePosition, body, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildQueueApi#setQueuedBuildPosition");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **queuePosition** | **String**|  |
 **body** | [**Build**](Build.md)|  | [optional]
 **fields** | **String**|  | [optional]

### Return type

[**Build**](Build.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="setQueuedBuildsOrder"></a>
# **setQueuedBuildsOrder**
> Builds setQueuedBuildsOrder(body, fields)

Update the build queue order.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildQueueApi;


BuildQueueApi apiInstance = new BuildQueueApi();
Builds body = new Builds(); // Builds | 
String fields = "fields_example"; // String | 
try {
    Builds result = apiInstance.setQueuedBuildsOrder(body, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildQueueApi#setQueuedBuildsOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Builds**](Builds.md)|  | [optional]
 **fields** | **String**|  | [optional]

### Return type

[**Builds**](Builds.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

