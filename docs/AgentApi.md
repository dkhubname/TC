# AgentApi

All URIs are relative to *https://localhost:8111*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteAgent**](AgentApi.md#deleteAgent) | **DELETE** /app/rest/agents/{agentLocator} | Delete an inactive agent.
[**getAgent**](AgentApi.md#getAgent) | **GET** /app/rest/agents/{agentLocator} | Get agent matching the locator.
[**getAgentField**](AgentApi.md#getAgentField) | **GET** /app/rest/agents/{agentLocator}/{field} | Get a field of the matching agent.
[**getAgentPool**](AgentApi.md#getAgentPool) | **GET** /app/rest/agents/{agentLocator}/pool | Get the agent pool of the matching agent.
[**getAllAgents**](AgentApi.md#getAllAgents) | **GET** /app/rest/agents | Get all known agents.
[**getAuthorizedInfo**](AgentApi.md#getAuthorizedInfo) | **GET** /app/rest/agents/{agentLocator}/authorizedInfo | Get the authorization info of the matching agent.
[**getBuildConfigurationRunPolicy**](AgentApi.md#getBuildConfigurationRunPolicy) | **GET** /app/rest/agents/{agentLocator}/compatibilityPolicy | Get the build configuration run policy of the matching agent.
[**getCompatibleBuildTypes**](AgentApi.md#getCompatibleBuildTypes) | **GET** /app/rest/agents/{agentLocator}/compatibleBuildTypes | Get build types compatible with the matching agent.
[**getEnabledInfo**](AgentApi.md#getEnabledInfo) | **GET** /app/rest/agents/{agentLocator}/enabledInfo | Check if the matching agent is enabled.
[**getIncompatibleBuildTypes**](AgentApi.md#getIncompatibleBuildTypes) | **GET** /app/rest/agents/{agentLocator}/incompatibleBuildTypes | Get build types incompatible with the matching agent.
[**setAgentField**](AgentApi.md#setAgentField) | **PUT** /app/rest/agents/{agentLocator}/{field} | Update a field of the matching agent.
[**setAgentPool**](AgentApi.md#setAgentPool) | **PUT** /app/rest/agents/{agentLocator}/pool | Assign the matching agent to the specified agent pool.
[**setAuthorizedInfo**](AgentApi.md#setAuthorizedInfo) | **PUT** /app/rest/agents/{agentLocator}/authorizedInfo | Update the authorization info of the matching agent.
[**setBuildConfigurationRunPolicy**](AgentApi.md#setBuildConfigurationRunPolicy) | **PUT** /app/rest/agents/{agentLocator}/compatibilityPolicy | Update build configuration run policy of agent matching locator.
[**setEnabledInfo**](AgentApi.md#setEnabledInfo) | **PUT** /app/rest/agents/{agentLocator}/enabledInfo | Update the enablement status of the matching agent.


<a name="deleteAgent"></a>
# **deleteAgent**
> deleteAgent(agentLocator)

Delete an inactive agent.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AgentApi;


AgentApi apiInstance = new AgentApi();
String agentLocator = "agentLocator_example"; // String | 
try {
    apiInstance.deleteAgent(agentLocator);
} catch (ApiException e) {
    System.err.println("Exception when calling AgentApi#deleteAgent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **agentLocator** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getAgent"></a>
# **getAgent**
> Agent getAgent(agentLocator, fields)

Get agent matching the locator.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AgentApi;


AgentApi apiInstance = new AgentApi();
String agentLocator = "agentLocator_example"; // String | 
String fields = "fields_example"; // String | 
try {
    Agent result = apiInstance.getAgent(agentLocator, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AgentApi#getAgent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **agentLocator** | **String**|  |
 **fields** | **String**|  | [optional]

### Return type

[**Agent**](Agent.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getAgentField"></a>
# **getAgentField**
> String getAgentField(agentLocator, field)

Get a field of the matching agent.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AgentApi;


AgentApi apiInstance = new AgentApi();
String agentLocator = "agentLocator_example"; // String | 
String field = "field_example"; // String | 
try {
    String result = apiInstance.getAgentField(agentLocator, field);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AgentApi#getAgentField");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **agentLocator** | **String**|  |
 **field** | **String**|  |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

<a name="getAgentPool"></a>
# **getAgentPool**
> AgentPool getAgentPool(agentLocator, fields)

Get the agent pool of the matching agent.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AgentApi;


AgentApi apiInstance = new AgentApi();
String agentLocator = "agentLocator_example"; // String | 
String fields = "fields_example"; // String | 
try {
    AgentPool result = apiInstance.getAgentPool(agentLocator, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AgentApi#getAgentPool");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **agentLocator** | **String**|  |
 **fields** | **String**|  | [optional]

### Return type

[**AgentPool**](AgentPool.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getAllAgents"></a>
# **getAllAgents**
> Agents getAllAgents(locator, fields)

Get all known agents.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AgentApi;


AgentApi apiInstance = new AgentApi();
String locator = "locator_example"; // String | 
String fields = "fields_example"; // String | 
try {
    Agents result = apiInstance.getAllAgents(locator, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AgentApi#getAllAgents");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **locator** | **String**|  | [optional]
 **fields** | **String**|  | [optional]

### Return type

[**Agents**](Agents.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getAuthorizedInfo"></a>
# **getAuthorizedInfo**
> AuthorizedInfo getAuthorizedInfo(agentLocator, fields)

Get the authorization info of the matching agent.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AgentApi;


AgentApi apiInstance = new AgentApi();
String agentLocator = "agentLocator_example"; // String | 
String fields = "fields_example"; // String | 
try {
    AuthorizedInfo result = apiInstance.getAuthorizedInfo(agentLocator, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AgentApi#getAuthorizedInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **agentLocator** | **String**|  |
 **fields** | **String**|  | [optional]

### Return type

[**AuthorizedInfo**](AuthorizedInfo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getBuildConfigurationRunPolicy"></a>
# **getBuildConfigurationRunPolicy**
> CompatibilityPolicy getBuildConfigurationRunPolicy(agentLocator, fields)

Get the build configuration run policy of the matching agent.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AgentApi;


AgentApi apiInstance = new AgentApi();
String agentLocator = "agentLocator_example"; // String | 
String fields = "fields_example"; // String | 
try {
    CompatibilityPolicy result = apiInstance.getBuildConfigurationRunPolicy(agentLocator, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AgentApi#getBuildConfigurationRunPolicy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **agentLocator** | **String**|  |
 **fields** | **String**|  | [optional]

### Return type

[**CompatibilityPolicy**](CompatibilityPolicy.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getCompatibleBuildTypes"></a>
# **getCompatibleBuildTypes**
> BuildTypes getCompatibleBuildTypes(agentLocator, fields)

Get build types compatible with the matching agent.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AgentApi;


AgentApi apiInstance = new AgentApi();
String agentLocator = "agentLocator_example"; // String | 
String fields = "fields_example"; // String | 
try {
    BuildTypes result = apiInstance.getCompatibleBuildTypes(agentLocator, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AgentApi#getCompatibleBuildTypes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **agentLocator** | **String**|  |
 **fields** | **String**|  | [optional]

### Return type

[**BuildTypes**](BuildTypes.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getEnabledInfo"></a>
# **getEnabledInfo**
> EnabledInfo getEnabledInfo(agentLocator, fields)

Check if the matching agent is enabled.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AgentApi;


AgentApi apiInstance = new AgentApi();
String agentLocator = "agentLocator_example"; // String | 
String fields = "fields_example"; // String | 
try {
    EnabledInfo result = apiInstance.getEnabledInfo(agentLocator, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AgentApi#getEnabledInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **agentLocator** | **String**|  |
 **fields** | **String**|  | [optional]

### Return type

[**EnabledInfo**](EnabledInfo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getIncompatibleBuildTypes"></a>
# **getIncompatibleBuildTypes**
> Compatibilities getIncompatibleBuildTypes(agentLocator, fields)

Get build types incompatible with the matching agent.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AgentApi;


AgentApi apiInstance = new AgentApi();
String agentLocator = "agentLocator_example"; // String | 
String fields = "fields_example"; // String | 
try {
    Compatibilities result = apiInstance.getIncompatibleBuildTypes(agentLocator, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AgentApi#getIncompatibleBuildTypes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **agentLocator** | **String**|  |
 **fields** | **String**|  | [optional]

### Return type

[**Compatibilities**](Compatibilities.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="setAgentField"></a>
# **setAgentField**
> String setAgentField(agentLocator, field, body)

Update a field of the matching agent.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AgentApi;


AgentApi apiInstance = new AgentApi();
String agentLocator = "agentLocator_example"; // String | 
String field = "field_example"; // String | 
String body = "body_example"; // String | 
try {
    String result = apiInstance.setAgentField(agentLocator, field, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AgentApi#setAgentField");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **agentLocator** | **String**|  |
 **field** | **String**|  |
 **body** | **String**|  | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: text/plain
 - **Accept**: text/plain

<a name="setAgentPool"></a>
# **setAgentPool**
> AgentPool setAgentPool(agentLocator, body, fields)

Assign the matching agent to the specified agent pool.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AgentApi;


AgentApi apiInstance = new AgentApi();
String agentLocator = "agentLocator_example"; // String | 
AgentPool body = new AgentPool(); // AgentPool | 
String fields = "fields_example"; // String | 
try {
    AgentPool result = apiInstance.setAgentPool(agentLocator, body, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AgentApi#setAgentPool");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **agentLocator** | **String**|  |
 **body** | [**AgentPool**](AgentPool.md)|  | [optional]
 **fields** | **String**|  | [optional]

### Return type

[**AgentPool**](AgentPool.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="setAuthorizedInfo"></a>
# **setAuthorizedInfo**
> AuthorizedInfo setAuthorizedInfo(agentLocator, body, fields)

Update the authorization info of the matching agent.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AgentApi;


AgentApi apiInstance = new AgentApi();
String agentLocator = "agentLocator_example"; // String | 
AuthorizedInfo body = new AuthorizedInfo(); // AuthorizedInfo | 
String fields = "fields_example"; // String | 
try {
    AuthorizedInfo result = apiInstance.setAuthorizedInfo(agentLocator, body, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AgentApi#setAuthorizedInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **agentLocator** | **String**|  |
 **body** | [**AuthorizedInfo**](AuthorizedInfo.md)|  | [optional]
 **fields** | **String**|  | [optional]

### Return type

[**AuthorizedInfo**](AuthorizedInfo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="setBuildConfigurationRunPolicy"></a>
# **setBuildConfigurationRunPolicy**
> CompatibilityPolicy setBuildConfigurationRunPolicy(agentLocator, body, fields)

Update build configuration run policy of agent matching locator.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AgentApi;


AgentApi apiInstance = new AgentApi();
String agentLocator = "agentLocator_example"; // String | 
CompatibilityPolicy body = new CompatibilityPolicy(); // CompatibilityPolicy | 
String fields = "fields_example"; // String | 
try {
    CompatibilityPolicy result = apiInstance.setBuildConfigurationRunPolicy(agentLocator, body, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AgentApi#setBuildConfigurationRunPolicy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **agentLocator** | **String**|  |
 **body** | [**CompatibilityPolicy**](CompatibilityPolicy.md)|  | [optional]
 **fields** | **String**|  | [optional]

### Return type

[**CompatibilityPolicy**](CompatibilityPolicy.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="setEnabledInfo"></a>
# **setEnabledInfo**
> EnabledInfo setEnabledInfo(agentLocator, body, fields)

Update the enablement status of the matching agent.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AgentApi;


AgentApi apiInstance = new AgentApi();
String agentLocator = "agentLocator_example"; // String | 
EnabledInfo body = new EnabledInfo(); // EnabledInfo | 
String fields = "fields_example"; // String | 
try {
    EnabledInfo result = apiInstance.setEnabledInfo(agentLocator, body, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AgentApi#setEnabledInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **agentLocator** | **String**|  |
 **body** | [**EnabledInfo**](EnabledInfo.md)|  | [optional]
 **fields** | **String**|  | [optional]

### Return type

[**EnabledInfo**](EnabledInfo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

