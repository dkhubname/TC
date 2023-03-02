# AgentPoolApi

All URIs are relative to *https://localhost:8111*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addAgentToAgentPool**](AgentPoolApi.md#addAgentToAgentPool) | **POST** /app/rest/agentPools/{agentPoolLocator}/agents | Assign the agent to the matching agent pool.
[**addProjectToAgentPool**](AgentPoolApi.md#addProjectToAgentPool) | **POST** /app/rest/agentPools/{agentPoolLocator}/projects | Assign the project to the matching agent pool.
[**createAgentPool**](AgentPoolApi.md#createAgentPool) | **POST** /app/rest/agentPools | Create a new agent pool.
[**deleteAgentPool**](AgentPoolApi.md#deleteAgentPool) | **DELETE** /app/rest/agentPools/{agentPoolLocator} | Delete the agent pool matching the locator.
[**deleteAllProjectsFromAgentPool**](AgentPoolApi.md#deleteAllProjectsFromAgentPool) | **DELETE** /app/rest/agentPools/{agentPoolLocator}/projects | Unassign all projects from the matching agent pool.
[**deleteProjectFromAgentPool**](AgentPoolApi.md#deleteProjectFromAgentPool) | **DELETE** /app/rest/agentPools/{agentPoolLocator}/projects/{projectLocator} | Unassign the project from the matching agent pool.
[**getAgentPoolOfAgentPool**](AgentPoolApi.md#getAgentPoolOfAgentPool) | **GET** /app/rest/agentPools/{agentPoolLocator} | Get the agent pool matching the locator.
[**getAllAgentPools**](AgentPoolApi.md#getAllAgentPools) | **GET** /app/rest/agentPools | Get all agent pools.
[**getAllAgentsFromAgentPool**](AgentPoolApi.md#getAllAgentsFromAgentPool) | **GET** /app/rest/agentPools/{agentPoolLocator}/agents | Get the agent of the matching agent pool.
[**getAllProjectsFromAgentPool**](AgentPoolApi.md#getAllProjectsFromAgentPool) | **GET** /app/rest/agentPools/{agentPoolLocator}/projects | Get all projects of the matching agent pool.
[**getFieldFromAgentPool**](AgentPoolApi.md#getFieldFromAgentPool) | **GET** /app/rest/agentPools/{agentPoolLocator}/{field} | Get a field of the matching agent pool.
[**setAgentPoolField**](AgentPoolApi.md#setAgentPoolField) | **PUT** /app/rest/agentPools/{agentPoolLocator}/{field} | Update a field of the matching agent pool.
[**setAgentPoolProjects**](AgentPoolApi.md#setAgentPoolProjects) | **PUT** /app/rest/agentPools/{agentPoolLocator}/projects | Update projects of the matching agent pool.


<a name="addAgentToAgentPool"></a>
# **addAgentToAgentPool**
> Agent addAgentToAgentPool(agentPoolLocator, body, fields)

Assign the agent to the matching agent pool.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AgentPoolApi;


AgentPoolApi apiInstance = new AgentPoolApi();
String agentPoolLocator = "agentPoolLocator_example"; // String | 
Agent body = new Agent(); // Agent | 
String fields = "fields_example"; // String | 
try {
    Agent result = apiInstance.addAgentToAgentPool(agentPoolLocator, body, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AgentPoolApi#addAgentToAgentPool");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **agentPoolLocator** | **String**|  |
 **body** | [**Agent**](Agent.md)|  | [optional]
 **fields** | **String**|  | [optional]

### Return type

[**Agent**](Agent.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="addProjectToAgentPool"></a>
# **addProjectToAgentPool**
> Project addProjectToAgentPool(agentPoolLocator, body)

Assign the project to the matching agent pool.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AgentPoolApi;


AgentPoolApi apiInstance = new AgentPoolApi();
String agentPoolLocator = "agentPoolLocator_example"; // String | 
Project body = new Project(); // Project | 
try {
    Project result = apiInstance.addProjectToAgentPool(agentPoolLocator, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AgentPoolApi#addProjectToAgentPool");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **agentPoolLocator** | **String**|  |
 **body** | [**Project**](Project.md)|  | [optional]

### Return type

[**Project**](Project.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="createAgentPool"></a>
# **createAgentPool**
> AgentPool createAgentPool(body)

Create a new agent pool.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AgentPoolApi;


AgentPoolApi apiInstance = new AgentPoolApi();
AgentPool body = new AgentPool(); // AgentPool | 
try {
    AgentPool result = apiInstance.createAgentPool(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AgentPoolApi#createAgentPool");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AgentPool**](AgentPool.md)|  | [optional]

### Return type

[**AgentPool**](AgentPool.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="deleteAgentPool"></a>
# **deleteAgentPool**
> deleteAgentPool(agentPoolLocator)

Delete the agent pool matching the locator.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AgentPoolApi;


AgentPoolApi apiInstance = new AgentPoolApi();
String agentPoolLocator = "agentPoolLocator_example"; // String | 
try {
    apiInstance.deleteAgentPool(agentPoolLocator);
} catch (ApiException e) {
    System.err.println("Exception when calling AgentPoolApi#deleteAgentPool");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **agentPoolLocator** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteAllProjectsFromAgentPool"></a>
# **deleteAllProjectsFromAgentPool**
> deleteAllProjectsFromAgentPool(agentPoolLocator)

Unassign all projects from the matching agent pool.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AgentPoolApi;


AgentPoolApi apiInstance = new AgentPoolApi();
String agentPoolLocator = "agentPoolLocator_example"; // String | 
try {
    apiInstance.deleteAllProjectsFromAgentPool(agentPoolLocator);
} catch (ApiException e) {
    System.err.println("Exception when calling AgentPoolApi#deleteAllProjectsFromAgentPool");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **agentPoolLocator** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteProjectFromAgentPool"></a>
# **deleteProjectFromAgentPool**
> deleteProjectFromAgentPool(agentPoolLocator, projectLocator)

Unassign the project from the matching agent pool.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AgentPoolApi;


AgentPoolApi apiInstance = new AgentPoolApi();
String agentPoolLocator = "agentPoolLocator_example"; // String | 
String projectLocator = "projectLocator_example"; // String | 
try {
    apiInstance.deleteProjectFromAgentPool(agentPoolLocator, projectLocator);
} catch (ApiException e) {
    System.err.println("Exception when calling AgentPoolApi#deleteProjectFromAgentPool");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **agentPoolLocator** | **String**|  |
 **projectLocator** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getAgentPoolOfAgentPool"></a>
# **getAgentPoolOfAgentPool**
> AgentPool getAgentPoolOfAgentPool(agentPoolLocator, fields)

Get the agent pool matching the locator.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AgentPoolApi;


AgentPoolApi apiInstance = new AgentPoolApi();
String agentPoolLocator = "agentPoolLocator_example"; // String | 
String fields = "fields_example"; // String | 
try {
    AgentPool result = apiInstance.getAgentPoolOfAgentPool(agentPoolLocator, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AgentPoolApi#getAgentPoolOfAgentPool");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **agentPoolLocator** | **String**|  |
 **fields** | **String**|  | [optional]

### Return type

[**AgentPool**](AgentPool.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getAllAgentPools"></a>
# **getAllAgentPools**
> AgentPools getAllAgentPools(locator, fields)

Get all agent pools.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AgentPoolApi;


AgentPoolApi apiInstance = new AgentPoolApi();
String locator = "locator_example"; // String | 
String fields = "fields_example"; // String | 
try {
    AgentPools result = apiInstance.getAllAgentPools(locator, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AgentPoolApi#getAllAgentPools");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **locator** | **String**|  | [optional]
 **fields** | **String**|  | [optional]

### Return type

[**AgentPools**](AgentPools.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getAllAgentsFromAgentPool"></a>
# **getAllAgentsFromAgentPool**
> Agents getAllAgentsFromAgentPool(agentPoolLocator, locator, fields)

Get the agent of the matching agent pool.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AgentPoolApi;


AgentPoolApi apiInstance = new AgentPoolApi();
String agentPoolLocator = "agentPoolLocator_example"; // String | 
String locator = "locator_example"; // String | 
String fields = "fields_example"; // String | 
try {
    Agents result = apiInstance.getAllAgentsFromAgentPool(agentPoolLocator, locator, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AgentPoolApi#getAllAgentsFromAgentPool");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **agentPoolLocator** | **String**|  |
 **locator** | **String**|  | [optional]
 **fields** | **String**|  | [optional]

### Return type

[**Agents**](Agents.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getAllProjectsFromAgentPool"></a>
# **getAllProjectsFromAgentPool**
> Projects getAllProjectsFromAgentPool(agentPoolLocator, fields)

Get all projects of the matching agent pool.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AgentPoolApi;


AgentPoolApi apiInstance = new AgentPoolApi();
String agentPoolLocator = "agentPoolLocator_example"; // String | 
String fields = "fields_example"; // String | 
try {
    Projects result = apiInstance.getAllProjectsFromAgentPool(agentPoolLocator, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AgentPoolApi#getAllProjectsFromAgentPool");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **agentPoolLocator** | **String**|  |
 **fields** | **String**|  | [optional]

### Return type

[**Projects**](Projects.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getFieldFromAgentPool"></a>
# **getFieldFromAgentPool**
> String getFieldFromAgentPool(agentPoolLocator, field)

Get a field of the matching agent pool.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AgentPoolApi;


AgentPoolApi apiInstance = new AgentPoolApi();
String agentPoolLocator = "agentPoolLocator_example"; // String | 
String field = "field_example"; // String | 
try {
    String result = apiInstance.getFieldFromAgentPool(agentPoolLocator, field);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AgentPoolApi#getFieldFromAgentPool");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **agentPoolLocator** | **String**|  |
 **field** | **String**|  |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

<a name="setAgentPoolField"></a>
# **setAgentPoolField**
> String setAgentPoolField(agentPoolLocator, field, body)

Update a field of the matching agent pool.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AgentPoolApi;


AgentPoolApi apiInstance = new AgentPoolApi();
String agentPoolLocator = "agentPoolLocator_example"; // String | 
String field = "field_example"; // String | 
String body = "body_example"; // String | 
try {
    String result = apiInstance.setAgentPoolField(agentPoolLocator, field, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AgentPoolApi#setAgentPoolField");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **agentPoolLocator** | **String**|  |
 **field** | **String**|  |
 **body** | **String**|  | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: text/plain
 - **Accept**: text/plain

<a name="setAgentPoolProjects"></a>
# **setAgentPoolProjects**
> Projects setAgentPoolProjects(agentPoolLocator, body)

Update projects of the matching agent pool.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AgentPoolApi;


AgentPoolApi apiInstance = new AgentPoolApi();
String agentPoolLocator = "agentPoolLocator_example"; // String | 
Projects body = new Projects(); // Projects | 
try {
    Projects result = apiInstance.setAgentPoolProjects(agentPoolLocator, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AgentPoolApi#setAgentPoolProjects");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **agentPoolLocator** | **String**|  |
 **body** | [**Projects**](Projects.md)|  | [optional]

### Return type

[**Projects**](Projects.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

