# ProjectApi

All URIs are relative to *https://localhost:8111*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addAgentPoolsProject**](ProjectApi.md#addAgentPoolsProject) | **POST** /app/rest/projects/{projectLocator}/agentPools | Assign the matching project to the agent pool.
[**addBuildType**](ProjectApi.md#addBuildType) | **POST** /app/rest/projects/{projectLocator}/buildTypes | Add a build configuration to the matching project.
[**addFeature**](ProjectApi.md#addFeature) | **POST** /app/rest/projects/{projectLocator}/projectFeatures | Add a feature.
[**addProject**](ProjectApi.md#addProject) | **POST** /app/rest/projects | Create a new project.
[**addSecureToken**](ProjectApi.md#addSecureToken) | **POST** /app/rest/projects/{projectLocator}/secure/tokens | Create a new secure token for the matching project.
[**addTemplate**](ProjectApi.md#addTemplate) | **POST** /app/rest/projects/{projectLocator}/templates | Add a build configuration template to the matching project.
[**createBuildParameter**](ProjectApi.md#createBuildParameter) | **POST** /app/rest/projects/{projectLocator}/parameters | Create a build parameter.
[**deleteBuildParameter**](ProjectApi.md#deleteBuildParameter) | **DELETE** /app/rest/projects/{projectLocator}/parameters/{name} | Delete build parameter.
[**deleteBuildParameters**](ProjectApi.md#deleteBuildParameters) | **DELETE** /app/rest/projects/{projectLocator}/parameters | Delete all build parameters.
[**deleteFeature**](ProjectApi.md#deleteFeature) | **DELETE** /app/rest/projects/{projectLocator}/projectFeatures/{featureLocator} | Delete a matching feature.
[**deleteProject**](ProjectApi.md#deleteProject) | **DELETE** /app/rest/projects/{projectLocator} | Delete project matching the locator.
[**getAgentPoolsProject**](ProjectApi.md#getAgentPoolsProject) | **GET** /app/rest/projects/{projectLocator}/agentPools | Get agent pools appointed to the matching project.
[**getAllBranches**](ProjectApi.md#getAllBranches) | **GET** /app/rest/projects/{projectLocator}/branches | Get all branches of the matching project.
[**getAllBuildTypesOrdered**](ProjectApi.md#getAllBuildTypesOrdered) | **GET** /app/rest/projects/{projectLocator}/order/buildTypes | Get all build configurations from the matching project, with custom ordering applied.
[**getAllProjects**](ProjectApi.md#getAllProjects) | **GET** /app/rest/projects | Get all projects.
[**getAllSubprojectsOrdered**](ProjectApi.md#getAllSubprojectsOrdered) | **GET** /app/rest/projects/{projectLocator}/order/projects | Get all subprojects of the matching project, with custom ordering applied.
[**getBuildParameter**](ProjectApi.md#getBuildParameter) | **GET** /app/rest/projects/{projectLocator}/parameters/{name} | Get build parameter.
[**getBuildParameterSpecification**](ProjectApi.md#getBuildParameterSpecification) | **GET** /app/rest/projects/{projectLocator}/parameters/{name}/type/rawValue | Get build parameter specification.
[**getBuildParameterType**](ProjectApi.md#getBuildParameterType) | **GET** /app/rest/projects/{projectLocator}/parameters/{name}/type | Get type of build parameter.
[**getBuildParameterValue**](ProjectApi.md#getBuildParameterValue) | **GET** /app/rest/projects/{projectLocator}/parameters/{name}/value | Get value of build parameter.
[**getBuildParameters**](ProjectApi.md#getBuildParameters) | **GET** /app/rest/projects/{projectLocator}/parameters | Get build parameters.
[**getDefaultTemplate**](ProjectApi.md#getDefaultTemplate) | **GET** /app/rest/projects/{projectLocator}/defaultTemplate | Get the default template of the matching project.
[**getFeature**](ProjectApi.md#getFeature) | **GET** /app/rest/projects/{projectLocator}/projectFeatures/{featureLocator} | Get a matching feature.
[**getFeatures**](ProjectApi.md#getFeatures) | **GET** /app/rest/projects/{projectLocator}/projectFeatures | Get all features.
[**getProject**](ProjectApi.md#getProject) | **GET** /app/rest/projects/{projectLocator} | Get project matching the locator.
[**getProjectField**](ProjectApi.md#getProjectField) | **GET** /app/rest/projects/{projectLocator}/{field} | Get a field of the matching project.
[**getProjectParentProject**](ProjectApi.md#getProjectParentProject) | **GET** /app/rest/projects/{projectLocator}/parentProject | Get the parent project of the matching project.
[**getProjectSettingsFile**](ProjectApi.md#getProjectSettingsFile) | **GET** /app/rest/projects/{projectLocator}/settingsFile | Get the settings file of the matching build configuration.
[**getProjectTemplates**](ProjectApi.md#getProjectTemplates) | **GET** /app/rest/projects/{projectLocator}/templates | Get all templates of the matching project.
[**getSecureValue**](ProjectApi.md#getSecureValue) | **GET** /app/rest/projects/{projectLocator}/secure/values/{token} | Get a secure token of the matching project.
[**removeDefaultTemplate**](ProjectApi.md#removeDefaultTemplate) | **DELETE** /app/rest/projects/{projectLocator}/defaultTemplate | Remove the default template from the matching project.
[**removeProjectFromAgentPool**](ProjectApi.md#removeProjectFromAgentPool) | **DELETE** /app/rest/projects/{projectLocator}/agentPools/{agentPoolLocator} | Unassign a project from the matching agent pool.
[**setAgentPoolsProject**](ProjectApi.md#setAgentPoolsProject) | **PUT** /app/rest/projects/{projectLocator}/agentPools | Update agent pools apppointed to the matching project.
[**setBuildTypesOrder**](ProjectApi.md#setBuildTypesOrder) | **PUT** /app/rest/projects/{projectLocator}/order/buildTypes | Update custom ordering of build configurations of the matching project.
[**setDefaultTemplate**](ProjectApi.md#setDefaultTemplate) | **PUT** /app/rest/projects/{projectLocator}/defaultTemplate | Update the default template of the matching project.
[**setParentProject**](ProjectApi.md#setParentProject) | **PUT** /app/rest/projects/{projectLocator}/parentProject | Update the parent project of the matching project.
[**setProjectField**](ProjectApi.md#setProjectField) | **PUT** /app/rest/projects/{projectLocator}/{field} | Update a field of the matching project.
[**setSubprojectsOrder**](ProjectApi.md#setSubprojectsOrder) | **PUT** /app/rest/projects/{projectLocator}/order/projects | Update custom ordering of subprojects of the matching project.
[**updateBuildParameter**](ProjectApi.md#updateBuildParameter) | **PUT** /app/rest/projects/{projectLocator}/parameters/{name} | Update build parameter.
[**updateBuildParameterSpecification**](ProjectApi.md#updateBuildParameterSpecification) | **PUT** /app/rest/projects/{projectLocator}/parameters/{name}/type/rawValue | Update build parameter specification.
[**updateBuildParameterType**](ProjectApi.md#updateBuildParameterType) | **PUT** /app/rest/projects/{projectLocator}/parameters/{name}/type | Update type of build parameter.
[**updateBuildParameterValue**](ProjectApi.md#updateBuildParameterValue) | **PUT** /app/rest/projects/{projectLocator}/parameters/{name}/value | Update value of build parameter.
[**updateBuildParameters**](ProjectApi.md#updateBuildParameters) | **PUT** /app/rest/projects/{projectLocator}/parameters | Update build parameters.
[**updateFeature**](ProjectApi.md#updateFeature) | **PUT** /app/rest/projects/{projectLocator}/projectFeatures/{featureLocator} | Update a matching feature.
[**updateFeatures**](ProjectApi.md#updateFeatures) | **PUT** /app/rest/projects/{projectLocator}/projectFeatures | Update all features.


<a name="addAgentPoolsProject"></a>
# **addAgentPoolsProject**
> AgentPool addAgentPoolsProject(projectLocator, body)

Assign the matching project to the agent pool.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProjectApi;


ProjectApi apiInstance = new ProjectApi();
String projectLocator = "projectLocator_example"; // String | 
AgentPool body = new AgentPool(); // AgentPool | 
try {
    AgentPool result = apiInstance.addAgentPoolsProject(projectLocator, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectApi#addAgentPoolsProject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectLocator** | **String**|  |
 **body** | [**AgentPool**](AgentPool.md)|  | [optional]

### Return type

[**AgentPool**](AgentPool.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="addBuildType"></a>
# **addBuildType**
> BuildType addBuildType(projectLocator, body, fields)

Add a build configuration to the matching project.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProjectApi;


ProjectApi apiInstance = new ProjectApi();
String projectLocator = "projectLocator_example"; // String | 
NewBuildTypeDescription body = new NewBuildTypeDescription(); // NewBuildTypeDescription | 
String fields = "fields_example"; // String | 
try {
    BuildType result = apiInstance.addBuildType(projectLocator, body, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectApi#addBuildType");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectLocator** | **String**|  |
 **body** | [**NewBuildTypeDescription**](NewBuildTypeDescription.md)|  | [optional]
 **fields** | **String**|  | [optional]

### Return type

[**BuildType**](BuildType.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="addFeature"></a>
# **addFeature**
> Object addFeature(projectLocator, body, fields)

Add a feature.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProjectApi;


ProjectApi apiInstance = new ProjectApi();
String projectLocator = "projectLocator_example"; // String | 
ProjectFeature body = new ProjectFeature(); // ProjectFeature | 
String fields = "fields_example"; // String | 
try {
    Object result = apiInstance.addFeature(projectLocator, body, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectApi#addFeature");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectLocator** | **String**|  |
 **body** | [**ProjectFeature**](ProjectFeature.md)|  | [optional]
 **fields** | **String**|  | [optional]

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="addProject"></a>
# **addProject**
> Project addProject(body)

Create a new project.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProjectApi;


ProjectApi apiInstance = new ProjectApi();
NewProjectDescription body = new NewProjectDescription(); // NewProjectDescription | 
try {
    Project result = apiInstance.addProject(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectApi#addProject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**NewProjectDescription**](NewProjectDescription.md)|  | [optional]

### Return type

[**Project**](Project.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="addSecureToken"></a>
# **addSecureToken**
> String addSecureToken(projectLocator, body)

Create a new secure token for the matching project.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProjectApi;


ProjectApi apiInstance = new ProjectApi();
String projectLocator = "projectLocator_example"; // String | 
String body = "body_example"; // String | 
try {
    String result = apiInstance.addSecureToken(projectLocator, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectApi#addSecureToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectLocator** | **String**|  |
 **body** | **String**|  | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: text/plain
 - **Accept**: text/plain

<a name="addTemplate"></a>
# **addTemplate**
> BuildType addTemplate(projectLocator, body, fields)

Add a build configuration template to the matching project.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProjectApi;


ProjectApi apiInstance = new ProjectApi();
String projectLocator = "projectLocator_example"; // String | 
NewBuildTypeDescription body = new NewBuildTypeDescription(); // NewBuildTypeDescription | 
String fields = "fields_example"; // String | 
try {
    BuildType result = apiInstance.addTemplate(projectLocator, body, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectApi#addTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectLocator** | **String**|  |
 **body** | [**NewBuildTypeDescription**](NewBuildTypeDescription.md)|  | [optional]
 **fields** | **String**|  | [optional]

### Return type

[**BuildType**](BuildType.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="createBuildParameter"></a>
# **createBuildParameter**
> Property createBuildParameter(projectLocator, body, fields)

Create a build parameter.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProjectApi;


ProjectApi apiInstance = new ProjectApi();
String projectLocator = "projectLocator_example"; // String | 
Property body = new Property(); // Property | 
String fields = "fields_example"; // String | 
try {
    Property result = apiInstance.createBuildParameter(projectLocator, body, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectApi#createBuildParameter");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectLocator** | **String**|  |
 **body** | [**Property**](Property.md)|  | [optional]
 **fields** | **String**|  | [optional]

### Return type

[**Property**](Property.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="deleteBuildParameter"></a>
# **deleteBuildParameter**
> deleteBuildParameter(name, projectLocator)

Delete build parameter.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProjectApi;


ProjectApi apiInstance = new ProjectApi();
String name = "name_example"; // String | 
String projectLocator = "projectLocator_example"; // String | 
try {
    apiInstance.deleteBuildParameter(name, projectLocator);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectApi#deleteBuildParameter");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **projectLocator** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteBuildParameters"></a>
# **deleteBuildParameters**
> deleteBuildParameters(projectLocator)

Delete all build parameters.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProjectApi;


ProjectApi apiInstance = new ProjectApi();
String projectLocator = "projectLocator_example"; // String | 
try {
    apiInstance.deleteBuildParameters(projectLocator);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectApi#deleteBuildParameters");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectLocator** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteFeature"></a>
# **deleteFeature**
> deleteFeature(featureLocator, projectLocator)

Delete a matching feature.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProjectApi;


ProjectApi apiInstance = new ProjectApi();
String featureLocator = "featureLocator_example"; // String | 
String projectLocator = "projectLocator_example"; // String | 
try {
    apiInstance.deleteFeature(featureLocator, projectLocator);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectApi#deleteFeature");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **featureLocator** | **String**|  |
 **projectLocator** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteProject"></a>
# **deleteProject**
> deleteProject(projectLocator)

Delete project matching the locator.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProjectApi;


ProjectApi apiInstance = new ProjectApi();
String projectLocator = "projectLocator_example"; // String | 
try {
    apiInstance.deleteProject(projectLocator);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectApi#deleteProject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectLocator** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getAgentPoolsProject"></a>
# **getAgentPoolsProject**
> AgentPools getAgentPoolsProject(projectLocator, fields)

Get agent pools appointed to the matching project.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProjectApi;


ProjectApi apiInstance = new ProjectApi();
String projectLocator = "projectLocator_example"; // String | 
String fields = "fields_example"; // String | 
try {
    AgentPools result = apiInstance.getAgentPoolsProject(projectLocator, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectApi#getAgentPoolsProject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectLocator** | **String**|  |
 **fields** | **String**|  | [optional]

### Return type

[**AgentPools**](AgentPools.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getAllBranches"></a>
# **getAllBranches**
> Branches getAllBranches(projectLocator, locator, fields)

Get all branches of the matching project.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProjectApi;


ProjectApi apiInstance = new ProjectApi();
String projectLocator = "projectLocator_example"; // String | 
String locator = "locator_example"; // String | 
String fields = "fields_example"; // String | 
try {
    Branches result = apiInstance.getAllBranches(projectLocator, locator, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectApi#getAllBranches");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectLocator** | **String**|  |
 **locator** | **String**|  | [optional]
 **fields** | **String**|  | [optional]

### Return type

[**Branches**](Branches.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getAllBuildTypesOrdered"></a>
# **getAllBuildTypesOrdered**
> BuildTypes getAllBuildTypesOrdered(projectLocator, field)

Get all build configurations from the matching project, with custom ordering applied.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProjectApi;


ProjectApi apiInstance = new ProjectApi();
String projectLocator = "projectLocator_example"; // String | 
String field = "field_example"; // String | 
try {
    BuildTypes result = apiInstance.getAllBuildTypesOrdered(projectLocator, field);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectApi#getAllBuildTypesOrdered");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectLocator** | **String**|  |
 **field** | **String**|  | [optional]

### Return type

[**BuildTypes**](BuildTypes.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getAllProjects"></a>
# **getAllProjects**
> Projects getAllProjects(locator, fields)

Get all projects.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProjectApi;


ProjectApi apiInstance = new ProjectApi();
String locator = "locator_example"; // String | 
String fields = "fields_example"; // String | 
try {
    Projects result = apiInstance.getAllProjects(locator, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectApi#getAllProjects");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **locator** | **String**|  | [optional]
 **fields** | **String**|  | [optional]

### Return type

[**Projects**](Projects.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getAllSubprojectsOrdered"></a>
# **getAllSubprojectsOrdered**
> Projects getAllSubprojectsOrdered(projectLocator, field)

Get all subprojects of the matching project, with custom ordering applied.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProjectApi;


ProjectApi apiInstance = new ProjectApi();
String projectLocator = "projectLocator_example"; // String | 
String field = "field_example"; // String | 
try {
    Projects result = apiInstance.getAllSubprojectsOrdered(projectLocator, field);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectApi#getAllSubprojectsOrdered");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectLocator** | **String**|  |
 **field** | **String**|  | [optional]

### Return type

[**Projects**](Projects.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getBuildParameter"></a>
# **getBuildParameter**
> Property getBuildParameter(name, projectLocator, fields)

Get build parameter.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProjectApi;


ProjectApi apiInstance = new ProjectApi();
String name = "name_example"; // String | 
String projectLocator = "projectLocator_example"; // String | 
String fields = "fields_example"; // String | 
try {
    Property result = apiInstance.getBuildParameter(name, projectLocator, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectApi#getBuildParameter");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **projectLocator** | **String**|  |
 **fields** | **String**|  | [optional]

### Return type

[**Property**](Property.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getBuildParameterSpecification"></a>
# **getBuildParameterSpecification**
> String getBuildParameterSpecification(name, projectLocator)

Get build parameter specification.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProjectApi;


ProjectApi apiInstance = new ProjectApi();
String name = "name_example"; // String | 
String projectLocator = "projectLocator_example"; // String | 
try {
    String result = apiInstance.getBuildParameterSpecification(name, projectLocator);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectApi#getBuildParameterSpecification");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **projectLocator** | **String**|  |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

<a name="getBuildParameterType"></a>
# **getBuildParameterType**
> Type getBuildParameterType(name, projectLocator)

Get type of build parameter.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProjectApi;


ProjectApi apiInstance = new ProjectApi();
String name = "name_example"; // String | 
String projectLocator = "projectLocator_example"; // String | 
try {
    Type result = apiInstance.getBuildParameterType(name, projectLocator);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectApi#getBuildParameterType");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **projectLocator** | **String**|  |

### Return type

[**Type**](Type.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getBuildParameterValue"></a>
# **getBuildParameterValue**
> String getBuildParameterValue(name, projectLocator)

Get value of build parameter.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProjectApi;


ProjectApi apiInstance = new ProjectApi();
String name = "name_example"; // String | 
String projectLocator = "projectLocator_example"; // String | 
try {
    String result = apiInstance.getBuildParameterValue(name, projectLocator);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectApi#getBuildParameterValue");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **projectLocator** | **String**|  |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

<a name="getBuildParameters"></a>
# **getBuildParameters**
> Properties getBuildParameters(projectLocator, locator, fields)

Get build parameters.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProjectApi;


ProjectApi apiInstance = new ProjectApi();
String projectLocator = "projectLocator_example"; // String | 
String locator = "locator_example"; // String | 
String fields = "fields_example"; // String | 
try {
    Properties result = apiInstance.getBuildParameters(projectLocator, locator, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectApi#getBuildParameters");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectLocator** | **String**|  |
 **locator** | **String**|  | [optional]
 **fields** | **String**|  | [optional]

### Return type

[**Properties**](Properties.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getDefaultTemplate"></a>
# **getDefaultTemplate**
> BuildType getDefaultTemplate(projectLocator, fields)

Get the default template of the matching project.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProjectApi;


ProjectApi apiInstance = new ProjectApi();
String projectLocator = "projectLocator_example"; // String | 
String fields = "fields_example"; // String | 
try {
    BuildType result = apiInstance.getDefaultTemplate(projectLocator, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectApi#getDefaultTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectLocator** | **String**|  |
 **fields** | **String**|  | [optional]

### Return type

[**BuildType**](BuildType.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getFeature"></a>
# **getFeature**
> Object getFeature(featureLocator, projectLocator, fields)

Get a matching feature.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProjectApi;


ProjectApi apiInstance = new ProjectApi();
String featureLocator = "featureLocator_example"; // String | 
String projectLocator = "projectLocator_example"; // String | 
String fields = "fields_example"; // String | 
try {
    Object result = apiInstance.getFeature(featureLocator, projectLocator, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectApi#getFeature");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **featureLocator** | **String**|  |
 **projectLocator** | **String**|  |
 **fields** | **String**|  | [optional]

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getFeatures"></a>
# **getFeatures**
> Object getFeatures(projectLocator, locator, fields)

Get all features.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProjectApi;


ProjectApi apiInstance = new ProjectApi();
String projectLocator = "projectLocator_example"; // String | 
String locator = "locator_example"; // String | 
String fields = "fields_example"; // String | 
try {
    Object result = apiInstance.getFeatures(projectLocator, locator, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectApi#getFeatures");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectLocator** | **String**|  |
 **locator** | **String**|  | [optional]
 **fields** | **String**|  | [optional]

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getProject"></a>
# **getProject**
> Project getProject(projectLocator, fields)

Get project matching the locator.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProjectApi;


ProjectApi apiInstance = new ProjectApi();
String projectLocator = "projectLocator_example"; // String | 
String fields = "fields_example"; // String | 
try {
    Project result = apiInstance.getProject(projectLocator, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectApi#getProject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectLocator** | **String**|  |
 **fields** | **String**|  | [optional]

### Return type

[**Project**](Project.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getProjectField"></a>
# **getProjectField**
> String getProjectField(projectLocator, field)

Get a field of the matching project.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProjectApi;


ProjectApi apiInstance = new ProjectApi();
String projectLocator = "projectLocator_example"; // String | 
String field = "field_example"; // String | 
try {
    String result = apiInstance.getProjectField(projectLocator, field);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectApi#getProjectField");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectLocator** | **String**|  |
 **field** | **String**|  |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

<a name="getProjectParentProject"></a>
# **getProjectParentProject**
> Project getProjectParentProject(projectLocator, fields)

Get the parent project of the matching project.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProjectApi;


ProjectApi apiInstance = new ProjectApi();
String projectLocator = "projectLocator_example"; // String | 
String fields = "fields_example"; // String | 
try {
    Project result = apiInstance.getProjectParentProject(projectLocator, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectApi#getProjectParentProject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectLocator** | **String**|  |
 **fields** | **String**|  | [optional]

### Return type

[**Project**](Project.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getProjectSettingsFile"></a>
# **getProjectSettingsFile**
> String getProjectSettingsFile(projectLocator)

Get the settings file of the matching build configuration.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProjectApi;


ProjectApi apiInstance = new ProjectApi();
String projectLocator = "projectLocator_example"; // String | 
try {
    String result = apiInstance.getProjectSettingsFile(projectLocator);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectApi#getProjectSettingsFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectLocator** | **String**|  |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

<a name="getProjectTemplates"></a>
# **getProjectTemplates**
> BuildTypes getProjectTemplates(projectLocator, fields)

Get all templates of the matching project.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProjectApi;


ProjectApi apiInstance = new ProjectApi();
String projectLocator = "projectLocator_example"; // String | 
String fields = "fields_example"; // String | 
try {
    BuildTypes result = apiInstance.getProjectTemplates(projectLocator, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectApi#getProjectTemplates");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectLocator** | **String**|  |
 **fields** | **String**|  | [optional]

### Return type

[**BuildTypes**](BuildTypes.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getSecureValue"></a>
# **getSecureValue**
> String getSecureValue(projectLocator, token)

Get a secure token of the matching project.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProjectApi;


ProjectApi apiInstance = new ProjectApi();
String projectLocator = "projectLocator_example"; // String | 
String token = "token_example"; // String | 
try {
    String result = apiInstance.getSecureValue(projectLocator, token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectApi#getSecureValue");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectLocator** | **String**|  |
 **token** | **String**|  |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: text/plain
 - **Accept**: text/plain

<a name="removeDefaultTemplate"></a>
# **removeDefaultTemplate**
> removeDefaultTemplate(projectLocator, fields)

Remove the default template from the matching project.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProjectApi;


ProjectApi apiInstance = new ProjectApi();
String projectLocator = "projectLocator_example"; // String | 
String fields = "fields_example"; // String | 
try {
    apiInstance.removeDefaultTemplate(projectLocator, fields);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectApi#removeDefaultTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectLocator** | **String**|  |
 **fields** | **String**|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="removeProjectFromAgentPool"></a>
# **removeProjectFromAgentPool**
> removeProjectFromAgentPool(projectLocator, agentPoolLocator)

Unassign a project from the matching agent pool.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProjectApi;


ProjectApi apiInstance = new ProjectApi();
String projectLocator = "projectLocator_example"; // String | 
String agentPoolLocator = "agentPoolLocator_example"; // String | 
try {
    apiInstance.removeProjectFromAgentPool(projectLocator, agentPoolLocator);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectApi#removeProjectFromAgentPool");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectLocator** | **String**|  |
 **agentPoolLocator** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="setAgentPoolsProject"></a>
# **setAgentPoolsProject**
> AgentPools setAgentPoolsProject(projectLocator, body, fields)

Update agent pools apppointed to the matching project.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProjectApi;


ProjectApi apiInstance = new ProjectApi();
String projectLocator = "projectLocator_example"; // String | 
AgentPools body = new AgentPools(); // AgentPools | 
String fields = "fields_example"; // String | 
try {
    AgentPools result = apiInstance.setAgentPoolsProject(projectLocator, body, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectApi#setAgentPoolsProject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectLocator** | **String**|  |
 **body** | [**AgentPools**](AgentPools.md)|  | [optional]
 **fields** | **String**|  | [optional]

### Return type

[**AgentPools**](AgentPools.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="setBuildTypesOrder"></a>
# **setBuildTypesOrder**
> BuildTypes setBuildTypesOrder(projectLocator, body, field)

Update custom ordering of build configurations of the matching project.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProjectApi;


ProjectApi apiInstance = new ProjectApi();
String projectLocator = "projectLocator_example"; // String | 
BuildTypes body = new BuildTypes(); // BuildTypes | 
String field = "field_example"; // String | 
try {
    BuildTypes result = apiInstance.setBuildTypesOrder(projectLocator, body, field);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectApi#setBuildTypesOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectLocator** | **String**|  |
 **body** | [**BuildTypes**](BuildTypes.md)|  | [optional]
 **field** | **String**|  | [optional]

### Return type

[**BuildTypes**](BuildTypes.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="setDefaultTemplate"></a>
# **setDefaultTemplate**
> BuildType setDefaultTemplate(projectLocator, body, fields)

Update the default template of the matching project.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProjectApi;


ProjectApi apiInstance = new ProjectApi();
String projectLocator = "projectLocator_example"; // String | 
BuildType body = new BuildType(); // BuildType | 
String fields = "fields_example"; // String | 
try {
    BuildType result = apiInstance.setDefaultTemplate(projectLocator, body, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectApi#setDefaultTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectLocator** | **String**|  |
 **body** | [**BuildType**](BuildType.md)|  | [optional]
 **fields** | **String**|  | [optional]

### Return type

[**BuildType**](BuildType.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="setParentProject"></a>
# **setParentProject**
> Project setParentProject(projectLocator, body, fields)

Update the parent project of the matching project.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProjectApi;


ProjectApi apiInstance = new ProjectApi();
String projectLocator = "projectLocator_example"; // String | 
Project body = new Project(); // Project | 
String fields = "fields_example"; // String | 
try {
    Project result = apiInstance.setParentProject(projectLocator, body, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectApi#setParentProject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectLocator** | **String**|  |
 **body** | [**Project**](Project.md)|  | [optional]
 **fields** | **String**|  | [optional]

### Return type

[**Project**](Project.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="setProjectField"></a>
# **setProjectField**
> String setProjectField(projectLocator, field, body)

Update a field of the matching project.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProjectApi;


ProjectApi apiInstance = new ProjectApi();
String projectLocator = "projectLocator_example"; // String | 
String field = "field_example"; // String | 
String body = "body_example"; // String | 
try {
    String result = apiInstance.setProjectField(projectLocator, field, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectApi#setProjectField");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectLocator** | **String**|  |
 **field** | **String**|  |
 **body** | **String**|  | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: text/plain
 - **Accept**: text/plain

<a name="setSubprojectsOrder"></a>
# **setSubprojectsOrder**
> Projects setSubprojectsOrder(projectLocator, body, field)

Update custom ordering of subprojects of the matching project.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProjectApi;


ProjectApi apiInstance = new ProjectApi();
String projectLocator = "projectLocator_example"; // String | 
Projects body = new Projects(); // Projects | 
String field = "field_example"; // String | 
try {
    Projects result = apiInstance.setSubprojectsOrder(projectLocator, body, field);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectApi#setSubprojectsOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectLocator** | **String**|  |
 **body** | [**Projects**](Projects.md)|  | [optional]
 **field** | **String**|  | [optional]

### Return type

[**Projects**](Projects.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="updateBuildParameter"></a>
# **updateBuildParameter**
> Property updateBuildParameter(name, projectLocator, body, fields)

Update build parameter.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProjectApi;


ProjectApi apiInstance = new ProjectApi();
String name = "name_example"; // String | 
String projectLocator = "projectLocator_example"; // String | 
Property body = new Property(); // Property | 
String fields = "fields_example"; // String | 
try {
    Property result = apiInstance.updateBuildParameter(name, projectLocator, body, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectApi#updateBuildParameter");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **projectLocator** | **String**|  |
 **body** | [**Property**](Property.md)|  | [optional]
 **fields** | **String**|  | [optional]

### Return type

[**Property**](Property.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="updateBuildParameterSpecification"></a>
# **updateBuildParameterSpecification**
> String updateBuildParameterSpecification(name, projectLocator, body)

Update build parameter specification.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProjectApi;


ProjectApi apiInstance = new ProjectApi();
String name = "name_example"; // String | 
String projectLocator = "projectLocator_example"; // String | 
String body = "body_example"; // String | 
try {
    String result = apiInstance.updateBuildParameterSpecification(name, projectLocator, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectApi#updateBuildParameterSpecification");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **projectLocator** | **String**|  |
 **body** | **String**|  | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: text/plain
 - **Accept**: text/plain

<a name="updateBuildParameterType"></a>
# **updateBuildParameterType**
> Type updateBuildParameterType(name, projectLocator, body)

Update type of build parameter.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProjectApi;


ProjectApi apiInstance = new ProjectApi();
String name = "name_example"; // String | 
String projectLocator = "projectLocator_example"; // String | 
Type body = new Type(); // Type | 
try {
    Type result = apiInstance.updateBuildParameterType(name, projectLocator, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectApi#updateBuildParameterType");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **projectLocator** | **String**|  |
 **body** | [**Type**](Type.md)|  | [optional]

### Return type

[**Type**](Type.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="updateBuildParameterValue"></a>
# **updateBuildParameterValue**
> String updateBuildParameterValue(name, projectLocator, body)

Update value of build parameter.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProjectApi;


ProjectApi apiInstance = new ProjectApi();
String name = "name_example"; // String | 
String projectLocator = "projectLocator_example"; // String | 
String body = "body_example"; // String | 
try {
    String result = apiInstance.updateBuildParameterValue(name, projectLocator, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectApi#updateBuildParameterValue");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **projectLocator** | **String**|  |
 **body** | **String**|  | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: text/plain
 - **Accept**: text/plain

<a name="updateBuildParameters"></a>
# **updateBuildParameters**
> Properties updateBuildParameters(projectLocator, body, fields)

Update build parameters.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProjectApi;


ProjectApi apiInstance = new ProjectApi();
String projectLocator = "projectLocator_example"; // String | 
Properties body = new Properties(); // Properties | 
String fields = "fields_example"; // String | 
try {
    Properties result = apiInstance.updateBuildParameters(projectLocator, body, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectApi#updateBuildParameters");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectLocator** | **String**|  |
 **body** | [**Properties**](Properties.md)|  | [optional]
 **fields** | **String**|  | [optional]

### Return type

[**Properties**](Properties.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="updateFeature"></a>
# **updateFeature**
> Object updateFeature(featureLocator, projectLocator, body, fields)

Update a matching feature.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProjectApi;


ProjectApi apiInstance = new ProjectApi();
String featureLocator = "featureLocator_example"; // String | 
String projectLocator = "projectLocator_example"; // String | 
ProjectFeature body = new ProjectFeature(); // ProjectFeature | 
String fields = "fields_example"; // String | 
try {
    Object result = apiInstance.updateFeature(featureLocator, projectLocator, body, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectApi#updateFeature");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **featureLocator** | **String**|  |
 **projectLocator** | **String**|  |
 **body** | [**ProjectFeature**](ProjectFeature.md)|  | [optional]
 **fields** | **String**|  | [optional]

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="updateFeatures"></a>
# **updateFeatures**
> Object updateFeatures(projectLocator, body, fields)

Update all features.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProjectApi;


ProjectApi apiInstance = new ProjectApi();
String projectLocator = "projectLocator_example"; // String | 
ProjectFeatures body = new ProjectFeatures(); // ProjectFeatures | 
String fields = "fields_example"; // String | 
try {
    Object result = apiInstance.updateFeatures(projectLocator, body, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectApi#updateFeatures");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectLocator** | **String**|  |
 **body** | [**ProjectFeatures**](ProjectFeatures.md)|  | [optional]
 **fields** | **String**|  | [optional]

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

