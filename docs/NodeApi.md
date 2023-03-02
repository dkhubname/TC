# NodeApi

All URIs are relative to *https://localhost:8111*

Method | HTTP request | Description
------------- | ------------- | -------------
[**changeNodeResponsibility**](NodeApi.md#changeNodeResponsibility) | **PUT** /app/rest/server/nodes/{nodeLocator}/enabledResponsibilities/{name} | Enables or disables responsibility for a node.
[**getAllNodes**](NodeApi.md#getAllNodes) | **GET** /app/rest/server/nodes | Get all TeamCity nodes.
[**getDisabledResponsibilities**](NodeApi.md#getDisabledResponsibilities) | **GET** /app/rest/server/nodes/{nodeLocator}/disabledResponsibilities | Get all effective responsibilities for a node matching the locator.
[**getEffectiveResponsibilities**](NodeApi.md#getEffectiveResponsibilities) | **GET** /app/rest/server/nodes/{nodeLocator}/effectiveResponsibilities | Get all effective responsibilities for a node matching the locator.
[**getEnabledResponsibilities**](NodeApi.md#getEnabledResponsibilities) | **GET** /app/rest/server/nodes/{nodeLocator}/enabledResponsibilities | Get all enabled responsibilities for a node matching the locator.
[**getNode**](NodeApi.md#getNode) | **GET** /app/rest/server/nodes/{nodeLocator} | Get a node matching the locator.


<a name="changeNodeResponsibility"></a>
# **changeNodeResponsibility**
> EnabledResponsibilities changeNodeResponsibility(nodeLocator, name, body)

Enables or disables responsibility for a node.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.NodeApi;


NodeApi apiInstance = new NodeApi();
String nodeLocator = "nodeLocator_example"; // String | 
String name = "name_example"; // String | 
String body = "body_example"; // String | 
try {
    EnabledResponsibilities result = apiInstance.changeNodeResponsibility(nodeLocator, name, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NodeApi#changeNodeResponsibility");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nodeLocator** | **String**|  |
 **name** | **String**|  |
 **body** | **String**|  | [optional]

### Return type

[**EnabledResponsibilities**](EnabledResponsibilities.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: text/plain
 - **Accept**: application/xml, application/json

<a name="getAllNodes"></a>
# **getAllNodes**
> Nodes getAllNodes(locator, fields)

Get all TeamCity nodes.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.NodeApi;


NodeApi apiInstance = new NodeApi();
String locator = "locator_example"; // String | 
String fields = "fields_example"; // String | 
try {
    Nodes result = apiInstance.getAllNodes(locator, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NodeApi#getAllNodes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **locator** | **String**|  | [optional]
 **fields** | **String**|  | [optional]

### Return type

[**Nodes**](Nodes.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getDisabledResponsibilities"></a>
# **getDisabledResponsibilities**
> DisabledResponsibilities getDisabledResponsibilities(nodeLocator, fields)

Get all effective responsibilities for a node matching the locator.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.NodeApi;


NodeApi apiInstance = new NodeApi();
String nodeLocator = "nodeLocator_example"; // String | 
String fields = "fields_example"; // String | 
try {
    DisabledResponsibilities result = apiInstance.getDisabledResponsibilities(nodeLocator, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NodeApi#getDisabledResponsibilities");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nodeLocator** | **String**|  |
 **fields** | **String**|  | [optional]

### Return type

[**DisabledResponsibilities**](DisabledResponsibilities.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getEffectiveResponsibilities"></a>
# **getEffectiveResponsibilities**
> EffectiveResponsibilities getEffectiveResponsibilities(nodeLocator, fields)

Get all effective responsibilities for a node matching the locator.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.NodeApi;


NodeApi apiInstance = new NodeApi();
String nodeLocator = "nodeLocator_example"; // String | 
String fields = "fields_example"; // String | 
try {
    EffectiveResponsibilities result = apiInstance.getEffectiveResponsibilities(nodeLocator, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NodeApi#getEffectiveResponsibilities");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nodeLocator** | **String**|  |
 **fields** | **String**|  | [optional]

### Return type

[**EffectiveResponsibilities**](EffectiveResponsibilities.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getEnabledResponsibilities"></a>
# **getEnabledResponsibilities**
> EnabledResponsibilities getEnabledResponsibilities(nodeLocator, fields)

Get all enabled responsibilities for a node matching the locator.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.NodeApi;


NodeApi apiInstance = new NodeApi();
String nodeLocator = "nodeLocator_example"; // String | 
String fields = "fields_example"; // String | 
try {
    EnabledResponsibilities result = apiInstance.getEnabledResponsibilities(nodeLocator, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NodeApi#getEnabledResponsibilities");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nodeLocator** | **String**|  |
 **fields** | **String**|  | [optional]

### Return type

[**EnabledResponsibilities**](EnabledResponsibilities.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getNode"></a>
# **getNode**
> Node getNode(nodeLocator, fields)

Get a node matching the locator.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.NodeApi;


NodeApi apiInstance = new NodeApi();
String nodeLocator = "nodeLocator_example"; // String | 
String fields = "fields_example"; // String | 
try {
    Node result = apiInstance.getNode(nodeLocator, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NodeApi#getNode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nodeLocator** | **String**|  |
 **fields** | **String**|  | [optional]

### Return type

[**Node**](Node.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

