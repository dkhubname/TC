# BuildTypeApi

All URIs are relative to *https://localhost:8111*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addAgentRequirementToBuildType**](BuildTypeApi.md#addAgentRequirementToBuildType) | **POST** /app/rest/buildTypes/{btLocator}/agent-requirements | Add an agent requirement to the matching build configuration.
[**addArtifactDependencyToBuildType**](BuildTypeApi.md#addArtifactDependencyToBuildType) | **POST** /app/rest/buildTypes/{btLocator}/artifact-dependencies | Add an artifact dependency to the matching build configuration.
[**addBuildFeatureToBuildType**](BuildTypeApi.md#addBuildFeatureToBuildType) | **POST** /app/rest/buildTypes/{btLocator}/features | Add build feature to the matching build configuration.
[**addBuildStepToBuildType**](BuildTypeApi.md#addBuildStepToBuildType) | **POST** /app/rest/buildTypes/{btLocator}/steps | Add a build step to the matching build configuration.
[**addBuildTemplate**](BuildTypeApi.md#addBuildTemplate) | **POST** /app/rest/buildTypes/{btLocator}/templates | Add a build template to the matching build configuration.
[**addParameterToBuildFeature**](BuildTypeApi.md#addParameterToBuildFeature) | **PUT** /app/rest/buildTypes/{btLocator}/features/{featureId}/parameters/{parameterName} | Update build feature parameter for the matching build configuration.
[**addParameterToBuildStep**](BuildTypeApi.md#addParameterToBuildStep) | **PUT** /app/rest/buildTypes/{btLocator}/steps/{stepId}/parameters/{parameterName} | Add a parameter to a build step of the matching build configuration.
[**addSnapshotDependencyToBuildType**](BuildTypeApi.md#addSnapshotDependencyToBuildType) | **POST** /app/rest/buildTypes/{btLocator}/snapshot-dependencies | Add a snapshot dependency to the matching build configuration.
[**addTriggerToBuildType**](BuildTypeApi.md#addTriggerToBuildType) | **POST** /app/rest/buildTypes/{btLocator}/triggers | Add a trigger to the matching build configuration.
[**addVcsRootToBuildType**](BuildTypeApi.md#addVcsRootToBuildType) | **POST** /app/rest/buildTypes/{btLocator}/vcs-root-entries | Add a VCS root to the matching build.
[**createBuildParameterOfBuildType**](BuildTypeApi.md#createBuildParameterOfBuildType) | **POST** /app/rest/buildTypes/{btLocator}/parameters | Create a build parameter.
[**createBuildType**](BuildTypeApi.md#createBuildType) | **POST** /app/rest/buildTypes | Create a new build configuration.
[**deleteAgentRequirement**](BuildTypeApi.md#deleteAgentRequirement) | **DELETE** /app/rest/buildTypes/{btLocator}/agent-requirements/{agentRequirementLocator} | Remove an agent requirement of the matching build configuration.
[**deleteArtifactDependency**](BuildTypeApi.md#deleteArtifactDependency) | **DELETE** /app/rest/buildTypes/{btLocator}/artifact-dependencies/{artifactDepLocator} | Remove an artifact dependency from the matching build configuration.
[**deleteBuildParameterOfBuildType**](BuildTypeApi.md#deleteBuildParameterOfBuildType) | **DELETE** /app/rest/buildTypes/{btLocator}/parameters/{name} | Delete build parameter.
[**deleteBuildParametersOfBuildType**](BuildTypeApi.md#deleteBuildParametersOfBuildType) | **DELETE** /app/rest/buildTypes/{btLocator}/parameters | Delete all build parameters.
[**deleteBuildStep**](BuildTypeApi.md#deleteBuildStep) | **DELETE** /app/rest/buildTypes/{btLocator}/steps/{stepId} | Delete a build step of the matching build configuration.
[**deleteBuildStepParameters**](BuildTypeApi.md#deleteBuildStepParameters) | **PUT** /app/rest/buildTypes/{btLocator}/steps/{stepId}/parameters | Update a parameter of a build step of the matching build configuration.
[**deleteBuildType**](BuildTypeApi.md#deleteBuildType) | **DELETE** /app/rest/buildTypes/{btLocator} | Delete build configuration matching the locator.
[**deleteFeatureOfBuildType**](BuildTypeApi.md#deleteFeatureOfBuildType) | **DELETE** /app/rest/buildTypes/{btLocator}/features/{featureId} | Remove a build feature of the matching build configuration.
[**deleteSnapshotDependency**](BuildTypeApi.md#deleteSnapshotDependency) | **DELETE** /app/rest/buildTypes/{btLocator}/snapshot-dependencies/{snapshotDepLocator} | Delete a snapshot dependency of the matching build configuration.
[**deleteTrigger**](BuildTypeApi.md#deleteTrigger) | **DELETE** /app/rest/buildTypes/{btLocator}/triggers/{triggerLocator} | Delete a trigger of the matching build configuration.
[**deleteVcsRootOfBuildType**](BuildTypeApi.md#deleteVcsRootOfBuildType) | **DELETE** /app/rest/buildTypes/{btLocator}/vcs-root-entries/{vcsRootLocator} | Remove a VCS root of the matching build configuration.
[**downloadFileOfBuildType**](BuildTypeApi.md#downloadFileOfBuildType) | **GET** /app/rest/buildTypes/{btLocator}/vcs/files/latest/files{path} | Download specific file.
[**getAgentRequirement**](BuildTypeApi.md#getAgentRequirement) | **GET** /app/rest/buildTypes/{btLocator}/agent-requirements/{agentRequirementLocator} | Get an agent requirement of the matching build configuration.
[**getAgentRequirementParameter**](BuildTypeApi.md#getAgentRequirementParameter) | **GET** /app/rest/buildTypes/{btLocator}/agent-requirements/{agentRequirementLocator}/{fieldName} | Get a setting of an agent requirement of the matching build configuration.
[**getAliases**](BuildTypeApi.md#getAliases) | **GET** /app/rest/buildTypes/{btLocator}/aliases | Get external IDs of the matching build configuration.
[**getAllAgentRequirements**](BuildTypeApi.md#getAllAgentRequirements) | **GET** /app/rest/buildTypes/{btLocator}/agent-requirements | Get all agent requirements of the matching build configuration.
[**getAllArtifactDependencies**](BuildTypeApi.md#getAllArtifactDependencies) | **GET** /app/rest/buildTypes/{btLocator}/artifact-dependencies | Get all artifact dependencies of the matching build configuration.
[**getAllBranchesOfBuildType**](BuildTypeApi.md#getAllBranchesOfBuildType) | **GET** /app/rest/buildTypes/{btLocator}/branches | Get all branches of the matching build configuration.
[**getAllBuildFeatureParameters**](BuildTypeApi.md#getAllBuildFeatureParameters) | **GET** /app/rest/buildTypes/{btLocator}/features/{featureId}/parameters | Get all parameters of a build feature of the matching build configuration.
[**getAllBuildFeatures**](BuildTypeApi.md#getAllBuildFeatures) | **GET** /app/rest/buildTypes/{btLocator}/features | Get all build features of the matching build configuration.
[**getAllBuildStepParameters**](BuildTypeApi.md#getAllBuildStepParameters) | **GET** /app/rest/buildTypes/{btLocator}/steps/{stepId}/parameters | Get all parameters of a build step of the matching build configuration.
[**getAllBuildSteps**](BuildTypeApi.md#getAllBuildSteps) | **GET** /app/rest/buildTypes/{btLocator}/steps | Get all build steps of the matching build configuration.
[**getAllBuildTemplates**](BuildTypeApi.md#getAllBuildTemplates) | **GET** /app/rest/buildTypes/{btLocator}/templates | Get all build templates of the matching build configuration.
[**getAllBuildTypes**](BuildTypeApi.md#getAllBuildTypes) | **GET** /app/rest/buildTypes | Get all build configurations.
[**getAllInvestigationsOfBuildType**](BuildTypeApi.md#getAllInvestigationsOfBuildType) | **GET** /app/rest/buildTypes/{btLocator}/investigations | Get all investigations of the matching build configuration.
[**getAllSnapshotDependencies**](BuildTypeApi.md#getAllSnapshotDependencies) | **GET** /app/rest/buildTypes/{btLocator}/snapshot-dependencies | Get all snapshot dependencies of the matching build configuration.
[**getAllTriggers**](BuildTypeApi.md#getAllTriggers) | **GET** /app/rest/buildTypes/{btLocator}/triggers | Get all triggers of the matching build configuration.
[**getAllVcsRootsOfBuildType**](BuildTypeApi.md#getAllVcsRootsOfBuildType) | **GET** /app/rest/buildTypes/{btLocator}/vcs-root-entries | Get all VCS roots of the matching build configuration.
[**getArtifactDependency**](BuildTypeApi.md#getArtifactDependency) | **GET** /app/rest/buildTypes/{btLocator}/artifact-dependencies/{artifactDepLocator} | Get an artifact dependency of the matching build configuration.
[**getArtifactDependencyParameter**](BuildTypeApi.md#getArtifactDependencyParameter) | **GET** /app/rest/buildTypes/{btLocator}/artifact-dependencies/{artifactDepLocator}/{fieldName} | Get a parameter of an artifact dependency of the matching build configuration.
[**getBuildFeature**](BuildTypeApi.md#getBuildFeature) | **GET** /app/rest/buildTypes/{btLocator}/features/{featureId} | Get a build feature of the matching build configuration.
[**getBuildFeatureParameter**](BuildTypeApi.md#getBuildFeatureParameter) | **GET** /app/rest/buildTypes/{btLocator}/features/{featureId}/parameters/{parameterName} | Get a parameter of a build feature of the matching build configuration.
[**getBuildFeatureSetting**](BuildTypeApi.md#getBuildFeatureSetting) | **GET** /app/rest/buildTypes/{btLocator}/features/{featureId}/{name} | Get the setting of a build feature of the matching build configuration.
[**getBuildParameterOfBuildType**](BuildTypeApi.md#getBuildParameterOfBuildType) | **GET** /app/rest/buildTypes/{btLocator}/parameters/{name} | Get build parameter.
[**getBuildParameterSpecificationOfBuildType**](BuildTypeApi.md#getBuildParameterSpecificationOfBuildType) | **GET** /app/rest/buildTypes/{btLocator}/parameters/{name}/type/rawValue | Get build parameter specification.
[**getBuildParameterTypeOfBuildType**](BuildTypeApi.md#getBuildParameterTypeOfBuildType) | **GET** /app/rest/buildTypes/{btLocator}/parameters/{name}/type | Get type of build parameter.
[**getBuildParameterValueOfBuildType**](BuildTypeApi.md#getBuildParameterValueOfBuildType) | **GET** /app/rest/buildTypes/{btLocator}/parameters/{name}/value | Get value of build parameter.
[**getBuildParametersOfBuildType**](BuildTypeApi.md#getBuildParametersOfBuildType) | **GET** /app/rest/buildTypes/{btLocator}/parameters | Get build parameters.
[**getBuildStep**](BuildTypeApi.md#getBuildStep) | **GET** /app/rest/buildTypes/{btLocator}/steps/{stepId} | Get a build step of the matching build configuration.
[**getBuildStepParameter**](BuildTypeApi.md#getBuildStepParameter) | **GET** /app/rest/buildTypes/{btLocator}/steps/{stepId}/parameters/{parameterName} | Get a parameter of a build step of the matching build configuration.
[**getBuildStepSetting**](BuildTypeApi.md#getBuildStepSetting) | **GET** /app/rest/buildTypes/{btLocator}/steps/{stepId}/{fieldName} | Get the setting of a build step of the matching build configuration.
[**getBuildTemplate**](BuildTypeApi.md#getBuildTemplate) | **GET** /app/rest/buildTypes/{btLocator}/templates/{templateLocator} | Get a template of the matching build configuration.
[**getBuildType**](BuildTypeApi.md#getBuildType) | **GET** /app/rest/buildTypes/{btLocator} | Get build configuration matching the locator.
[**getBuildTypeBuildTags**](BuildTypeApi.md#getBuildTypeBuildTags) | **GET** /app/rest/buildTypes/{btLocator}/buildTags | Get tags of builds of the matching build configuration.
[**getBuildTypeBuilds**](BuildTypeApi.md#getBuildTypeBuilds) | **GET** /app/rest/buildTypes/{btLocator}/builds | Get builds of the matching build configuration.
[**getBuildTypeField**](BuildTypeApi.md#getBuildTypeField) | **GET** /app/rest/buildTypes/{btLocator}/{field} | Get a field of the matching build configuration.
[**getBuildTypeSettingsFile**](BuildTypeApi.md#getBuildTypeSettingsFile) | **GET** /app/rest/buildTypes/{btLocator}/settingsFile | Get the settings file of the matching build configuration.
[**getFileMetadataOfBuildType**](BuildTypeApi.md#getFileMetadataOfBuildType) | **GET** /app/rest/buildTypes/{btLocator}/vcs/files/latest/metadata{path} | Get metadata of specific file.
[**getFilesListForSubpathOfBuildType**](BuildTypeApi.md#getFilesListForSubpathOfBuildType) | **GET** /app/rest/buildTypes/{btLocator}/vcs/files/latest/{path} | List files under this path.
[**getFilesListOfBuildType**](BuildTypeApi.md#getFilesListOfBuildType) | **GET** /app/rest/buildTypes/{btLocator}/vcs/files/latest | List all files.
[**getSnapshotDependency**](BuildTypeApi.md#getSnapshotDependency) | **GET** /app/rest/buildTypes/{btLocator}/snapshot-dependencies/{snapshotDepLocator} | Get a snapshot dependency of the matching build configuration.
[**getTrigger**](BuildTypeApi.md#getTrigger) | **GET** /app/rest/buildTypes/{btLocator}/triggers/{triggerLocator} | Get a trigger of the matching build configuration.
[**getTriggerParameter**](BuildTypeApi.md#getTriggerParameter) | **GET** /app/rest/buildTypes/{btLocator}/triggers/{triggerLocator}/{fieldName} | Get a parameter of a trigger of the matching build configuration.
[**getVcsRoot**](BuildTypeApi.md#getVcsRoot) | **GET** /app/rest/buildTypes/{btLocator}/vcs-root-entries/{vcsRootLocator} | Get a VCS root of the matching build configuration.
[**getVcsRootCheckoutRules**](BuildTypeApi.md#getVcsRootCheckoutRules) | **GET** /app/rest/buildTypes/{btLocator}/vcs-root-entries/{vcsRootLocator}/checkout-rules | Get checkout rules of a VCS root of the matching build configuration.
[**getVcsRootInstancesOfBuildType**](BuildTypeApi.md#getVcsRootInstancesOfBuildType) | **GET** /app/rest/buildTypes/{btLocator}/vcsRootInstances | Get all VCS root instances of the matching build configuration.
[**getZippedFileOfBuildType**](BuildTypeApi.md#getZippedFileOfBuildType) | **GET** /app/rest/buildTypes/{btLocator}/vcs/files/latest/archived{path} | Get specific file zipped.
[**removeAllTemplates**](BuildTypeApi.md#removeAllTemplates) | **DELETE** /app/rest/buildTypes/{btLocator}/templates | Detach all templates from the matching build configuration.
[**removeTemplate**](BuildTypeApi.md#removeTemplate) | **DELETE** /app/rest/buildTypes/{btLocator}/templates/{templateLocator} | Detach a template from the matching build configuration.
[**replaceAgentRequirement**](BuildTypeApi.md#replaceAgentRequirement) | **PUT** /app/rest/buildTypes/{btLocator}/agent-requirements/{agentRequirementLocator} | Update an agent requirement of the matching build configuration.
[**replaceAllAgentRequirements**](BuildTypeApi.md#replaceAllAgentRequirements) | **PUT** /app/rest/buildTypes/{btLocator}/agent-requirements | Update all agent requirements of the matching build configuration.
[**replaceAllArtifactDependencies**](BuildTypeApi.md#replaceAllArtifactDependencies) | **PUT** /app/rest/buildTypes/{btLocator}/artifact-dependencies | Update all artifact dependencies of the matching build configuration.
[**replaceAllBuildFeatures**](BuildTypeApi.md#replaceAllBuildFeatures) | **PUT** /app/rest/buildTypes/{btLocator}/features | Update all build features of the matching build configuration.
[**replaceAllBuildSteps**](BuildTypeApi.md#replaceAllBuildSteps) | **PUT** /app/rest/buildTypes/{btLocator}/steps | Update all build steps of the matching build configuration.
[**replaceAllSnapshotDependencies**](BuildTypeApi.md#replaceAllSnapshotDependencies) | **PUT** /app/rest/buildTypes/{btLocator}/snapshot-dependencies | Update all snapshot dependencies of the matching build configuration.
[**replaceAllTriggers**](BuildTypeApi.md#replaceAllTriggers) | **PUT** /app/rest/buildTypes/{btLocator}/triggers | Update all triggers of the matching build configuration.
[**replaceAllVcsRoots**](BuildTypeApi.md#replaceAllVcsRoots) | **PUT** /app/rest/buildTypes/{btLocator}/vcs-root-entries | Update all VCS roots of the matching build configuration.
[**replaceArtifactDependency**](BuildTypeApi.md#replaceArtifactDependency) | **PUT** /app/rest/buildTypes/{btLocator}/artifact-dependencies/{artifactDepLocator} | Update an artifact dependency of the matching build configuration.
[**replaceBuildFeature**](BuildTypeApi.md#replaceBuildFeature) | **PUT** /app/rest/buildTypes/{btLocator}/features/{featureId} | Update a build feature of the matching build configuration.
[**replaceBuildFeatureParameters**](BuildTypeApi.md#replaceBuildFeatureParameters) | **PUT** /app/rest/buildTypes/{btLocator}/features/{featureId}/parameters | Update a parameter of a build feature of the matching build configuration.
[**replaceBuildStep**](BuildTypeApi.md#replaceBuildStep) | **PUT** /app/rest/buildTypes/{btLocator}/steps/{stepId} | Replace a build step of the matching build configuration.
[**replaceSnapshotDependency**](BuildTypeApi.md#replaceSnapshotDependency) | **PUT** /app/rest/buildTypes/{btLocator}/snapshot-dependencies/{snapshotDepLocator} | Update a snapshot dependency of the matching build configuration.
[**replaceTrigger**](BuildTypeApi.md#replaceTrigger) | **PUT** /app/rest/buildTypes/{btLocator}/triggers/{triggerLocator} | Update a trigger of the matching build configuration.
[**setAgentRequirementParameter**](BuildTypeApi.md#setAgentRequirementParameter) | **PUT** /app/rest/buildTypes/{btLocator}/agent-requirements/{agentRequirementLocator}/{fieldName} | Update a parameter of an agent requirement of the matching build configuration.
[**setArtifactDependencyParameter**](BuildTypeApi.md#setArtifactDependencyParameter) | **PUT** /app/rest/buildTypes/{btLocator}/artifact-dependencies/{artifactDepLocator}/{fieldName} | Update a parameter of an artifact dependency of the matching build configuration.
[**setBuildFeatureParameter**](BuildTypeApi.md#setBuildFeatureParameter) | **PUT** /app/rest/buildTypes/{btLocator}/features/{featureId}/{name} | Update a parameter of a build feature of the matching build configuration.
[**setBuildStepParameter**](BuildTypeApi.md#setBuildStepParameter) | **PUT** /app/rest/buildTypes/{btLocator}/steps/{stepId}/{fieldName} | Update a parameter of a build step of the matching build configuration.
[**setBuildTypeField**](BuildTypeApi.md#setBuildTypeField) | **PUT** /app/rest/buildTypes/{btLocator}/{field} | Update a field of the matching build configuration.
[**setBuildTypeTemplates**](BuildTypeApi.md#setBuildTypeTemplates) | **PUT** /app/rest/buildTypes/{btLocator}/templates | Update all templates of the matching build configuration.
[**setTriggerParameter**](BuildTypeApi.md#setTriggerParameter) | **PUT** /app/rest/buildTypes/{btLocator}/triggers/{triggerLocator}/{fieldName} | Update a parameter of a trigger of the matching build configuration.
[**updateBuildParameterOfBuildType**](BuildTypeApi.md#updateBuildParameterOfBuildType) | **PUT** /app/rest/buildTypes/{btLocator}/parameters/{name} | Update build parameter.
[**updateBuildParameterSpecificationOfBuildType**](BuildTypeApi.md#updateBuildParameterSpecificationOfBuildType) | **PUT** /app/rest/buildTypes/{btLocator}/parameters/{name}/type/rawValue | Update build parameter specification.
[**updateBuildParameterTypeOfBuildType**](BuildTypeApi.md#updateBuildParameterTypeOfBuildType) | **PUT** /app/rest/buildTypes/{btLocator}/parameters/{name}/type | Update type of build parameter.
[**updateBuildParameterValueOfBuildType**](BuildTypeApi.md#updateBuildParameterValueOfBuildType) | **PUT** /app/rest/buildTypes/{btLocator}/parameters/{name}/value | Update value of build parameter.
[**updateBuildParametersOfBuildType**](BuildTypeApi.md#updateBuildParametersOfBuildType) | **PUT** /app/rest/buildTypes/{btLocator}/parameters | Update build parameters.
[**updateBuildTypeVcsRoot**](BuildTypeApi.md#updateBuildTypeVcsRoot) | **PUT** /app/rest/buildTypes/{btLocator}/vcs-root-entries/{vcsRootLocator} | Update a VCS root of the matching build configuration.
[**updateBuildTypeVcsRootCheckoutRules**](BuildTypeApi.md#updateBuildTypeVcsRootCheckoutRules) | **PUT** /app/rest/buildTypes/{btLocator}/vcs-root-entries/{vcsRootLocator}/checkout-rules | Update checkout rules of a VCS root of the matching build configuration.


<a name="addAgentRequirementToBuildType"></a>
# **addAgentRequirementToBuildType**
> AgentRequirement addAgentRequirementToBuildType(btLocator, fields, body)

Add an agent requirement to the matching build configuration.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildTypeApi;


BuildTypeApi apiInstance = new BuildTypeApi();
String btLocator = "btLocator_example"; // String | 
String fields = "fields_example"; // String | 
AgentRequirement body = new AgentRequirement(); // AgentRequirement | 
try {
    AgentRequirement result = apiInstance.addAgentRequirementToBuildType(btLocator, fields, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildTypeApi#addAgentRequirementToBuildType");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **btLocator** | **String**|  |
 **fields** | **String**|  | [optional]
 **body** | [**AgentRequirement**](AgentRequirement.md)|  | [optional]

### Return type

[**AgentRequirement**](AgentRequirement.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="addArtifactDependencyToBuildType"></a>
# **addArtifactDependencyToBuildType**
> ArtifactDependency addArtifactDependencyToBuildType(btLocator, fields, body)

Add an artifact dependency to the matching build configuration.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildTypeApi;


BuildTypeApi apiInstance = new BuildTypeApi();
String btLocator = "btLocator_example"; // String | 
String fields = "fields_example"; // String | 
ArtifactDependency body = new ArtifactDependency(); // ArtifactDependency | 
try {
    ArtifactDependency result = apiInstance.addArtifactDependencyToBuildType(btLocator, fields, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildTypeApi#addArtifactDependencyToBuildType");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **btLocator** | **String**|  |
 **fields** | **String**|  | [optional]
 **body** | [**ArtifactDependency**](ArtifactDependency.md)|  | [optional]

### Return type

[**ArtifactDependency**](ArtifactDependency.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="addBuildFeatureToBuildType"></a>
# **addBuildFeatureToBuildType**
> Feature addBuildFeatureToBuildType(btLocator, fields, body)

Add build feature to the matching build configuration.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildTypeApi;


BuildTypeApi apiInstance = new BuildTypeApi();
String btLocator = "btLocator_example"; // String | 
String fields = "fields_example"; // String | 
Feature body = new Feature(); // Feature | 
try {
    Feature result = apiInstance.addBuildFeatureToBuildType(btLocator, fields, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildTypeApi#addBuildFeatureToBuildType");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **btLocator** | **String**|  |
 **fields** | **String**|  | [optional]
 **body** | [**Feature**](Feature.md)|  | [optional]

### Return type

[**Feature**](Feature.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="addBuildStepToBuildType"></a>
# **addBuildStepToBuildType**
> Step addBuildStepToBuildType(btLocator, fields, body)

Add a build step to the matching build configuration.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildTypeApi;


BuildTypeApi apiInstance = new BuildTypeApi();
String btLocator = "btLocator_example"; // String | 
String fields = "fields_example"; // String | 
Step body = new Step(); // Step | 
try {
    Step result = apiInstance.addBuildStepToBuildType(btLocator, fields, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildTypeApi#addBuildStepToBuildType");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **btLocator** | **String**|  |
 **fields** | **String**|  | [optional]
 **body** | [**Step**](Step.md)|  | [optional]

### Return type

[**Step**](Step.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="addBuildTemplate"></a>
# **addBuildTemplate**
> BuildType addBuildTemplate(btLocator, body, optimizeSettings, fields)

Add a build template to the matching build configuration.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildTypeApi;


BuildTypeApi apiInstance = new BuildTypeApi();
String btLocator = "btLocator_example"; // String | 
BuildType body = new BuildType(); // BuildType | 
Boolean optimizeSettings = true; // Boolean | 
String fields = "fields_example"; // String | 
try {
    BuildType result = apiInstance.addBuildTemplate(btLocator, body, optimizeSettings, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildTypeApi#addBuildTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **btLocator** | **String**|  |
 **body** | [**BuildType**](BuildType.md)|  | [optional]
 **optimizeSettings** | **Boolean**|  | [optional]
 **fields** | **String**|  | [optional]

### Return type

[**BuildType**](BuildType.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="addParameterToBuildFeature"></a>
# **addParameterToBuildFeature**
> String addParameterToBuildFeature(btLocator, featureId, parameterName, body)

Update build feature parameter for the matching build configuration.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildTypeApi;


BuildTypeApi apiInstance = new BuildTypeApi();
String btLocator = "btLocator_example"; // String | 
String featureId = "featureId_example"; // String | 
String parameterName = "parameterName_example"; // String | 
String body = "body_example"; // String | 
try {
    String result = apiInstance.addParameterToBuildFeature(btLocator, featureId, parameterName, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildTypeApi#addParameterToBuildFeature");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **btLocator** | **String**|  |
 **featureId** | **String**|  |
 **parameterName** | **String**|  |
 **body** | **String**|  | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: text/plain
 - **Accept**: text/plain

<a name="addParameterToBuildStep"></a>
# **addParameterToBuildStep**
> String addParameterToBuildStep(btLocator, stepId, parameterName, body)

Add a parameter to a build step of the matching build configuration.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildTypeApi;


BuildTypeApi apiInstance = new BuildTypeApi();
String btLocator = "btLocator_example"; // String | 
String stepId = "stepId_example"; // String | 
String parameterName = "parameterName_example"; // String | 
String body = "body_example"; // String | 
try {
    String result = apiInstance.addParameterToBuildStep(btLocator, stepId, parameterName, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildTypeApi#addParameterToBuildStep");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **btLocator** | **String**|  |
 **stepId** | **String**|  |
 **parameterName** | **String**|  |
 **body** | **String**|  | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: text/plain
 - **Accept**: text/plain

<a name="addSnapshotDependencyToBuildType"></a>
# **addSnapshotDependencyToBuildType**
> SnapshotDependency addSnapshotDependencyToBuildType(btLocator, fields, body)

Add a snapshot dependency to the matching build configuration.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildTypeApi;


BuildTypeApi apiInstance = new BuildTypeApi();
String btLocator = "btLocator_example"; // String | 
String fields = "fields_example"; // String | 
SnapshotDependency body = new SnapshotDependency(); // SnapshotDependency | 
try {
    SnapshotDependency result = apiInstance.addSnapshotDependencyToBuildType(btLocator, fields, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildTypeApi#addSnapshotDependencyToBuildType");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **btLocator** | **String**|  |
 **fields** | **String**|  | [optional]
 **body** | [**SnapshotDependency**](SnapshotDependency.md)|  | [optional]

### Return type

[**SnapshotDependency**](SnapshotDependency.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="addTriggerToBuildType"></a>
# **addTriggerToBuildType**
> Trigger addTriggerToBuildType(btLocator, fields, body)

Add a trigger to the matching build configuration.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildTypeApi;


BuildTypeApi apiInstance = new BuildTypeApi();
String btLocator = "btLocator_example"; // String | 
String fields = "fields_example"; // String | 
Trigger body = new Trigger(); // Trigger | 
try {
    Trigger result = apiInstance.addTriggerToBuildType(btLocator, fields, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildTypeApi#addTriggerToBuildType");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **btLocator** | **String**|  |
 **fields** | **String**|  | [optional]
 **body** | [**Trigger**](Trigger.md)|  | [optional]

### Return type

[**Trigger**](Trigger.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="addVcsRootToBuildType"></a>
# **addVcsRootToBuildType**
> VcsRootEntry addVcsRootToBuildType(btLocator, body, fields)

Add a VCS root to the matching build.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildTypeApi;


BuildTypeApi apiInstance = new BuildTypeApi();
String btLocator = "btLocator_example"; // String | 
VcsRootEntry body = new VcsRootEntry(); // VcsRootEntry | 
String fields = "fields_example"; // String | 
try {
    VcsRootEntry result = apiInstance.addVcsRootToBuildType(btLocator, body, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildTypeApi#addVcsRootToBuildType");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **btLocator** | **String**|  |
 **body** | [**VcsRootEntry**](VcsRootEntry.md)|  | [optional]
 **fields** | **String**|  | [optional]

### Return type

[**VcsRootEntry**](VcsRootEntry.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="createBuildParameterOfBuildType"></a>
# **createBuildParameterOfBuildType**
> Property createBuildParameterOfBuildType(btLocator, body, fields)

Create a build parameter.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildTypeApi;


BuildTypeApi apiInstance = new BuildTypeApi();
String btLocator = "btLocator_example"; // String | 
Property body = new Property(); // Property | 
String fields = "fields_example"; // String | 
try {
    Property result = apiInstance.createBuildParameterOfBuildType(btLocator, body, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildTypeApi#createBuildParameterOfBuildType");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **btLocator** | **String**|  |
 **body** | [**Property**](Property.md)|  | [optional]
 **fields** | **String**|  | [optional]

### Return type

[**Property**](Property.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="createBuildType"></a>
# **createBuildType**
> BuildType createBuildType(body, fields)

Create a new build configuration.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildTypeApi;


BuildTypeApi apiInstance = new BuildTypeApi();
BuildType body = new BuildType(); // BuildType | 
String fields = "fields_example"; // String | 
try {
    BuildType result = apiInstance.createBuildType(body, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildTypeApi#createBuildType");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**BuildType**](BuildType.md)|  | [optional]
 **fields** | **String**|  | [optional]

### Return type

[**BuildType**](BuildType.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="deleteAgentRequirement"></a>
# **deleteAgentRequirement**
> deleteAgentRequirement(btLocator, agentRequirementLocator)

Remove an agent requirement of the matching build configuration.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildTypeApi;


BuildTypeApi apiInstance = new BuildTypeApi();
String btLocator = "btLocator_example"; // String | 
String agentRequirementLocator = "agentRequirementLocator_example"; // String | 
try {
    apiInstance.deleteAgentRequirement(btLocator, agentRequirementLocator);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildTypeApi#deleteAgentRequirement");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **btLocator** | **String**|  |
 **agentRequirementLocator** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteArtifactDependency"></a>
# **deleteArtifactDependency**
> deleteArtifactDependency(btLocator, artifactDepLocator)

Remove an artifact dependency from the matching build configuration.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildTypeApi;


BuildTypeApi apiInstance = new BuildTypeApi();
String btLocator = "btLocator_example"; // String | 
String artifactDepLocator = "artifactDepLocator_example"; // String | 
try {
    apiInstance.deleteArtifactDependency(btLocator, artifactDepLocator);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildTypeApi#deleteArtifactDependency");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **btLocator** | **String**|  |
 **artifactDepLocator** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteBuildParameterOfBuildType"></a>
# **deleteBuildParameterOfBuildType**
> deleteBuildParameterOfBuildType(name, btLocator)

Delete build parameter.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildTypeApi;


BuildTypeApi apiInstance = new BuildTypeApi();
String name = "name_example"; // String | 
String btLocator = "btLocator_example"; // String | 
try {
    apiInstance.deleteBuildParameterOfBuildType(name, btLocator);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildTypeApi#deleteBuildParameterOfBuildType");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **btLocator** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteBuildParametersOfBuildType"></a>
# **deleteBuildParametersOfBuildType**
> deleteBuildParametersOfBuildType(btLocator)

Delete all build parameters.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildTypeApi;


BuildTypeApi apiInstance = new BuildTypeApi();
String btLocator = "btLocator_example"; // String | 
try {
    apiInstance.deleteBuildParametersOfBuildType(btLocator);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildTypeApi#deleteBuildParametersOfBuildType");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **btLocator** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteBuildStep"></a>
# **deleteBuildStep**
> deleteBuildStep(btLocator, stepId)

Delete a build step of the matching build configuration.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildTypeApi;


BuildTypeApi apiInstance = new BuildTypeApi();
String btLocator = "btLocator_example"; // String | 
String stepId = "stepId_example"; // String | 
try {
    apiInstance.deleteBuildStep(btLocator, stepId);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildTypeApi#deleteBuildStep");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **btLocator** | **String**|  |
 **stepId** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteBuildStepParameters"></a>
# **deleteBuildStepParameters**
> Properties deleteBuildStepParameters(btLocator, stepId, body, fields)

Update a parameter of a build step of the matching build configuration.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildTypeApi;


BuildTypeApi apiInstance = new BuildTypeApi();
String btLocator = "btLocator_example"; // String | 
String stepId = "stepId_example"; // String | 
Properties body = new Properties(); // Properties | 
String fields = "fields_example"; // String | 
try {
    Properties result = apiInstance.deleteBuildStepParameters(btLocator, stepId, body, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildTypeApi#deleteBuildStepParameters");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **btLocator** | **String**|  |
 **stepId** | **String**|  |
 **body** | [**Properties**](Properties.md)|  | [optional]
 **fields** | **String**|  | [optional]

### Return type

[**Properties**](Properties.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="deleteBuildType"></a>
# **deleteBuildType**
> deleteBuildType(btLocator)

Delete build configuration matching the locator.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildTypeApi;


BuildTypeApi apiInstance = new BuildTypeApi();
String btLocator = "btLocator_example"; // String | 
try {
    apiInstance.deleteBuildType(btLocator);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildTypeApi#deleteBuildType");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **btLocator** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteFeatureOfBuildType"></a>
# **deleteFeatureOfBuildType**
> deleteFeatureOfBuildType(btLocator, featureId)

Remove a build feature of the matching build configuration.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildTypeApi;


BuildTypeApi apiInstance = new BuildTypeApi();
String btLocator = "btLocator_example"; // String | 
String featureId = "featureId_example"; // String | 
try {
    apiInstance.deleteFeatureOfBuildType(btLocator, featureId);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildTypeApi#deleteFeatureOfBuildType");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **btLocator** | **String**|  |
 **featureId** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteSnapshotDependency"></a>
# **deleteSnapshotDependency**
> deleteSnapshotDependency(btLocator, snapshotDepLocator)

Delete a snapshot dependency of the matching build configuration.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildTypeApi;


BuildTypeApi apiInstance = new BuildTypeApi();
String btLocator = "btLocator_example"; // String | 
String snapshotDepLocator = "snapshotDepLocator_example"; // String | 
try {
    apiInstance.deleteSnapshotDependency(btLocator, snapshotDepLocator);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildTypeApi#deleteSnapshotDependency");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **btLocator** | **String**|  |
 **snapshotDepLocator** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteTrigger"></a>
# **deleteTrigger**
> deleteTrigger(btLocator, triggerLocator)

Delete a trigger of the matching build configuration.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildTypeApi;


BuildTypeApi apiInstance = new BuildTypeApi();
String btLocator = "btLocator_example"; // String | 
String triggerLocator = "triggerLocator_example"; // String | 
try {
    apiInstance.deleteTrigger(btLocator, triggerLocator);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildTypeApi#deleteTrigger");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **btLocator** | **String**|  |
 **triggerLocator** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteVcsRootOfBuildType"></a>
# **deleteVcsRootOfBuildType**
> deleteVcsRootOfBuildType(btLocator, vcsRootLocator)

Remove a VCS root of the matching build configuration.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildTypeApi;


BuildTypeApi apiInstance = new BuildTypeApi();
String btLocator = "btLocator_example"; // String | 
String vcsRootLocator = "vcsRootLocator_example"; // String | 
try {
    apiInstance.deleteVcsRootOfBuildType(btLocator, vcsRootLocator);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildTypeApi#deleteVcsRootOfBuildType");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **btLocator** | **String**|  |
 **vcsRootLocator** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="downloadFileOfBuildType"></a>
# **downloadFileOfBuildType**
> downloadFileOfBuildType(path, btLocator, resolveParameters)

Download specific file.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildTypeApi;


BuildTypeApi apiInstance = new BuildTypeApi();
String path = "path_example"; // String | 
String btLocator = "btLocator_example"; // String | 
Boolean resolveParameters = true; // Boolean | 
try {
    apiInstance.downloadFileOfBuildType(path, btLocator, resolveParameters);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildTypeApi#downloadFileOfBuildType");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**|  |
 **btLocator** | **String**|  |
 **resolveParameters** | **Boolean**|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getAgentRequirement"></a>
# **getAgentRequirement**
> AgentRequirement getAgentRequirement(btLocator, agentRequirementLocator, fields)

Get an agent requirement of the matching build configuration.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildTypeApi;


BuildTypeApi apiInstance = new BuildTypeApi();
String btLocator = "btLocator_example"; // String | 
String agentRequirementLocator = "agentRequirementLocator_example"; // String | 
String fields = "fields_example"; // String | 
try {
    AgentRequirement result = apiInstance.getAgentRequirement(btLocator, agentRequirementLocator, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildTypeApi#getAgentRequirement");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **btLocator** | **String**|  |
 **agentRequirementLocator** | **String**|  |
 **fields** | **String**|  | [optional]

### Return type

[**AgentRequirement**](AgentRequirement.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getAgentRequirementParameter"></a>
# **getAgentRequirementParameter**
> String getAgentRequirementParameter(btLocator, agentRequirementLocator, fieldName)

Get a setting of an agent requirement of the matching build configuration.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildTypeApi;


BuildTypeApi apiInstance = new BuildTypeApi();
String btLocator = "btLocator_example"; // String | 
String agentRequirementLocator = "agentRequirementLocator_example"; // String | 
String fieldName = "fieldName_example"; // String | 
try {
    String result = apiInstance.getAgentRequirementParameter(btLocator, agentRequirementLocator, fieldName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildTypeApi#getAgentRequirementParameter");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **btLocator** | **String**|  |
 **agentRequirementLocator** | **String**|  |
 **fieldName** | **String**|  |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

<a name="getAliases"></a>
# **getAliases**
> Items getAliases(btLocator, field)

Get external IDs of the matching build configuration.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildTypeApi;


BuildTypeApi apiInstance = new BuildTypeApi();
String btLocator = "btLocator_example"; // String | 
String field = "field_example"; // String | 
try {
    Items result = apiInstance.getAliases(btLocator, field);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildTypeApi#getAliases");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **btLocator** | **String**|  |
 **field** | **String**|  | [optional]

### Return type

[**Items**](Items.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getAllAgentRequirements"></a>
# **getAllAgentRequirements**
> AgentRequirements getAllAgentRequirements(btLocator, fields)

Get all agent requirements of the matching build configuration.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildTypeApi;


BuildTypeApi apiInstance = new BuildTypeApi();
String btLocator = "btLocator_example"; // String | 
String fields = "fields_example"; // String | 
try {
    AgentRequirements result = apiInstance.getAllAgentRequirements(btLocator, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildTypeApi#getAllAgentRequirements");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **btLocator** | **String**|  |
 **fields** | **String**|  | [optional]

### Return type

[**AgentRequirements**](AgentRequirements.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getAllArtifactDependencies"></a>
# **getAllArtifactDependencies**
> ArtifactDependencies getAllArtifactDependencies(btLocator, fields)

Get all artifact dependencies of the matching build configuration.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildTypeApi;


BuildTypeApi apiInstance = new BuildTypeApi();
String btLocator = "btLocator_example"; // String | 
String fields = "fields_example"; // String | 
try {
    ArtifactDependencies result = apiInstance.getAllArtifactDependencies(btLocator, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildTypeApi#getAllArtifactDependencies");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **btLocator** | **String**|  |
 **fields** | **String**|  | [optional]

### Return type

[**ArtifactDependencies**](ArtifactDependencies.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getAllBranchesOfBuildType"></a>
# **getAllBranchesOfBuildType**
> Branches getAllBranchesOfBuildType(btLocator, locator, fields)

Get all branches of the matching build configuration.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildTypeApi;


BuildTypeApi apiInstance = new BuildTypeApi();
String btLocator = "btLocator_example"; // String | 
String locator = "locator_example"; // String | 
String fields = "fields_example"; // String | 
try {
    Branches result = apiInstance.getAllBranchesOfBuildType(btLocator, locator, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildTypeApi#getAllBranchesOfBuildType");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **btLocator** | **String**|  |
 **locator** | **String**|  | [optional]
 **fields** | **String**|  | [optional]

### Return type

[**Branches**](Branches.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getAllBuildFeatureParameters"></a>
# **getAllBuildFeatureParameters**
> Properties getAllBuildFeatureParameters(btLocator, featureId, fields)

Get all parameters of a build feature of the matching build configuration.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildTypeApi;


BuildTypeApi apiInstance = new BuildTypeApi();
String btLocator = "btLocator_example"; // String | 
String featureId = "featureId_example"; // String | 
String fields = "fields_example"; // String | 
try {
    Properties result = apiInstance.getAllBuildFeatureParameters(btLocator, featureId, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildTypeApi#getAllBuildFeatureParameters");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **btLocator** | **String**|  |
 **featureId** | **String**|  |
 **fields** | **String**|  | [optional]

### Return type

[**Properties**](Properties.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getAllBuildFeatures"></a>
# **getAllBuildFeatures**
> Features getAllBuildFeatures(btLocator, fields)

Get all build features of the matching build configuration.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildTypeApi;


BuildTypeApi apiInstance = new BuildTypeApi();
String btLocator = "btLocator_example"; // String | 
String fields = "fields_example"; // String | 
try {
    Features result = apiInstance.getAllBuildFeatures(btLocator, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildTypeApi#getAllBuildFeatures");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **btLocator** | **String**|  |
 **fields** | **String**|  | [optional]

### Return type

[**Features**](Features.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getAllBuildStepParameters"></a>
# **getAllBuildStepParameters**
> Properties getAllBuildStepParameters(btLocator, stepId, fields)

Get all parameters of a build step of the matching build configuration.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildTypeApi;


BuildTypeApi apiInstance = new BuildTypeApi();
String btLocator = "btLocator_example"; // String | 
String stepId = "stepId_example"; // String | 
String fields = "fields_example"; // String | 
try {
    Properties result = apiInstance.getAllBuildStepParameters(btLocator, stepId, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildTypeApi#getAllBuildStepParameters");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **btLocator** | **String**|  |
 **stepId** | **String**|  |
 **fields** | **String**|  | [optional]

### Return type

[**Properties**](Properties.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getAllBuildSteps"></a>
# **getAllBuildSteps**
> Steps getAllBuildSteps(btLocator, fields)

Get all build steps of the matching build configuration.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildTypeApi;


BuildTypeApi apiInstance = new BuildTypeApi();
String btLocator = "btLocator_example"; // String | 
String fields = "fields_example"; // String | 
try {
    Steps result = apiInstance.getAllBuildSteps(btLocator, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildTypeApi#getAllBuildSteps");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **btLocator** | **String**|  |
 **fields** | **String**|  | [optional]

### Return type

[**Steps**](Steps.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getAllBuildTemplates"></a>
# **getAllBuildTemplates**
> BuildTypes getAllBuildTemplates(btLocator, fields)

Get all build templates of the matching build configuration.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildTypeApi;


BuildTypeApi apiInstance = new BuildTypeApi();
String btLocator = "btLocator_example"; // String | 
String fields = "fields_example"; // String | 
try {
    BuildTypes result = apiInstance.getAllBuildTemplates(btLocator, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildTypeApi#getAllBuildTemplates");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **btLocator** | **String**|  |
 **fields** | **String**|  | [optional]

### Return type

[**BuildTypes**](BuildTypes.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getAllBuildTypes"></a>
# **getAllBuildTypes**
> BuildTypes getAllBuildTypes(locator, fields)

Get all build configurations.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildTypeApi;


BuildTypeApi apiInstance = new BuildTypeApi();
String locator = "locator_example"; // String | 
String fields = "fields_example"; // String | 
try {
    BuildTypes result = apiInstance.getAllBuildTypes(locator, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildTypeApi#getAllBuildTypes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **locator** | **String**|  | [optional]
 **fields** | **String**|  | [optional]

### Return type

[**BuildTypes**](BuildTypes.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getAllInvestigationsOfBuildType"></a>
# **getAllInvestigationsOfBuildType**
> Investigations getAllInvestigationsOfBuildType(btLocator, fields)

Get all investigations of the matching build configuration.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildTypeApi;


BuildTypeApi apiInstance = new BuildTypeApi();
String btLocator = "btLocator_example"; // String | 
String fields = "fields_example"; // String | 
try {
    Investigations result = apiInstance.getAllInvestigationsOfBuildType(btLocator, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildTypeApi#getAllInvestigationsOfBuildType");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **btLocator** | **String**|  |
 **fields** | **String**|  | [optional]

### Return type

[**Investigations**](Investigations.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getAllSnapshotDependencies"></a>
# **getAllSnapshotDependencies**
> SnapshotDependencies getAllSnapshotDependencies(btLocator, fields)

Get all snapshot dependencies of the matching build configuration.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildTypeApi;


BuildTypeApi apiInstance = new BuildTypeApi();
String btLocator = "btLocator_example"; // String | 
String fields = "fields_example"; // String | 
try {
    SnapshotDependencies result = apiInstance.getAllSnapshotDependencies(btLocator, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildTypeApi#getAllSnapshotDependencies");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **btLocator** | **String**|  |
 **fields** | **String**|  | [optional]

### Return type

[**SnapshotDependencies**](SnapshotDependencies.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getAllTriggers"></a>
# **getAllTriggers**
> Triggers getAllTriggers(btLocator, fields)

Get all triggers of the matching build configuration.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildTypeApi;


BuildTypeApi apiInstance = new BuildTypeApi();
String btLocator = "btLocator_example"; // String | 
String fields = "fields_example"; // String | 
try {
    Triggers result = apiInstance.getAllTriggers(btLocator, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildTypeApi#getAllTriggers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **btLocator** | **String**|  |
 **fields** | **String**|  | [optional]

### Return type

[**Triggers**](Triggers.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getAllVcsRootsOfBuildType"></a>
# **getAllVcsRootsOfBuildType**
> VcsRootEntries getAllVcsRootsOfBuildType(btLocator, fields)

Get all VCS roots of the matching build configuration.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildTypeApi;


BuildTypeApi apiInstance = new BuildTypeApi();
String btLocator = "btLocator_example"; // String | 
String fields = "fields_example"; // String | 
try {
    VcsRootEntries result = apiInstance.getAllVcsRootsOfBuildType(btLocator, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildTypeApi#getAllVcsRootsOfBuildType");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **btLocator** | **String**|  |
 **fields** | **String**|  | [optional]

### Return type

[**VcsRootEntries**](VcsRootEntries.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getArtifactDependency"></a>
# **getArtifactDependency**
> ArtifactDependency getArtifactDependency(btLocator, artifactDepLocator, fields)

Get an artifact dependency of the matching build configuration.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildTypeApi;


BuildTypeApi apiInstance = new BuildTypeApi();
String btLocator = "btLocator_example"; // String | 
String artifactDepLocator = "artifactDepLocator_example"; // String | 
String fields = "fields_example"; // String | 
try {
    ArtifactDependency result = apiInstance.getArtifactDependency(btLocator, artifactDepLocator, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildTypeApi#getArtifactDependency");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **btLocator** | **String**|  |
 **artifactDepLocator** | **String**|  |
 **fields** | **String**|  | [optional]

### Return type

[**ArtifactDependency**](ArtifactDependency.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getArtifactDependencyParameter"></a>
# **getArtifactDependencyParameter**
> String getArtifactDependencyParameter(btLocator, artifactDepLocator, fieldName)

Get a parameter of an artifact dependency of the matching build configuration.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildTypeApi;


BuildTypeApi apiInstance = new BuildTypeApi();
String btLocator = "btLocator_example"; // String | 
String artifactDepLocator = "artifactDepLocator_example"; // String | 
String fieldName = "fieldName_example"; // String | 
try {
    String result = apiInstance.getArtifactDependencyParameter(btLocator, artifactDepLocator, fieldName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildTypeApi#getArtifactDependencyParameter");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **btLocator** | **String**|  |
 **artifactDepLocator** | **String**|  |
 **fieldName** | **String**|  |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

<a name="getBuildFeature"></a>
# **getBuildFeature**
> Feature getBuildFeature(btLocator, featureId, fields)

Get a build feature of the matching build configuration.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildTypeApi;


BuildTypeApi apiInstance = new BuildTypeApi();
String btLocator = "btLocator_example"; // String | 
String featureId = "featureId_example"; // String | 
String fields = "fields_example"; // String | 
try {
    Feature result = apiInstance.getBuildFeature(btLocator, featureId, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildTypeApi#getBuildFeature");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **btLocator** | **String**|  |
 **featureId** | **String**|  |
 **fields** | **String**|  | [optional]

### Return type

[**Feature**](Feature.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getBuildFeatureParameter"></a>
# **getBuildFeatureParameter**
> String getBuildFeatureParameter(btLocator, featureId, parameterName)

Get a parameter of a build feature of the matching build configuration.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildTypeApi;


BuildTypeApi apiInstance = new BuildTypeApi();
String btLocator = "btLocator_example"; // String | 
String featureId = "featureId_example"; // String | 
String parameterName = "parameterName_example"; // String | 
try {
    String result = apiInstance.getBuildFeatureParameter(btLocator, featureId, parameterName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildTypeApi#getBuildFeatureParameter");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **btLocator** | **String**|  |
 **featureId** | **String**|  |
 **parameterName** | **String**|  |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

<a name="getBuildFeatureSetting"></a>
# **getBuildFeatureSetting**
> String getBuildFeatureSetting(btLocator, featureId, name)

Get the setting of a build feature of the matching build configuration.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildTypeApi;


BuildTypeApi apiInstance = new BuildTypeApi();
String btLocator = "btLocator_example"; // String | 
String featureId = "featureId_example"; // String | 
String name = "name_example"; // String | 
try {
    String result = apiInstance.getBuildFeatureSetting(btLocator, featureId, name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildTypeApi#getBuildFeatureSetting");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **btLocator** | **String**|  |
 **featureId** | **String**|  |
 **name** | **String**|  |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

<a name="getBuildParameterOfBuildType"></a>
# **getBuildParameterOfBuildType**
> Property getBuildParameterOfBuildType(name, btLocator, fields)

Get build parameter.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildTypeApi;


BuildTypeApi apiInstance = new BuildTypeApi();
String name = "name_example"; // String | 
String btLocator = "btLocator_example"; // String | 
String fields = "fields_example"; // String | 
try {
    Property result = apiInstance.getBuildParameterOfBuildType(name, btLocator, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildTypeApi#getBuildParameterOfBuildType");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **btLocator** | **String**|  |
 **fields** | **String**|  | [optional]

### Return type

[**Property**](Property.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getBuildParameterSpecificationOfBuildType"></a>
# **getBuildParameterSpecificationOfBuildType**
> String getBuildParameterSpecificationOfBuildType(name, btLocator)

Get build parameter specification.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildTypeApi;


BuildTypeApi apiInstance = new BuildTypeApi();
String name = "name_example"; // String | 
String btLocator = "btLocator_example"; // String | 
try {
    String result = apiInstance.getBuildParameterSpecificationOfBuildType(name, btLocator);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildTypeApi#getBuildParameterSpecificationOfBuildType");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **btLocator** | **String**|  |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

<a name="getBuildParameterTypeOfBuildType"></a>
# **getBuildParameterTypeOfBuildType**
> Type getBuildParameterTypeOfBuildType(name, btLocator)

Get type of build parameter.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildTypeApi;


BuildTypeApi apiInstance = new BuildTypeApi();
String name = "name_example"; // String | 
String btLocator = "btLocator_example"; // String | 
try {
    Type result = apiInstance.getBuildParameterTypeOfBuildType(name, btLocator);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildTypeApi#getBuildParameterTypeOfBuildType");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **btLocator** | **String**|  |

### Return type

[**Type**](Type.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getBuildParameterValueOfBuildType"></a>
# **getBuildParameterValueOfBuildType**
> String getBuildParameterValueOfBuildType(name, btLocator)

Get value of build parameter.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildTypeApi;


BuildTypeApi apiInstance = new BuildTypeApi();
String name = "name_example"; // String | 
String btLocator = "btLocator_example"; // String | 
try {
    String result = apiInstance.getBuildParameterValueOfBuildType(name, btLocator);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildTypeApi#getBuildParameterValueOfBuildType");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **btLocator** | **String**|  |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

<a name="getBuildParametersOfBuildType"></a>
# **getBuildParametersOfBuildType**
> Properties getBuildParametersOfBuildType(btLocator, locator, fields)

Get build parameters.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildTypeApi;


BuildTypeApi apiInstance = new BuildTypeApi();
String btLocator = "btLocator_example"; // String | 
String locator = "locator_example"; // String | 
String fields = "fields_example"; // String | 
try {
    Properties result = apiInstance.getBuildParametersOfBuildType(btLocator, locator, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildTypeApi#getBuildParametersOfBuildType");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **btLocator** | **String**|  |
 **locator** | **String**|  | [optional]
 **fields** | **String**|  | [optional]

### Return type

[**Properties**](Properties.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getBuildStep"></a>
# **getBuildStep**
> Step getBuildStep(btLocator, stepId, fields)

Get a build step of the matching build configuration.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildTypeApi;


BuildTypeApi apiInstance = new BuildTypeApi();
String btLocator = "btLocator_example"; // String | 
String stepId = "stepId_example"; // String | 
String fields = "fields_example"; // String | 
try {
    Step result = apiInstance.getBuildStep(btLocator, stepId, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildTypeApi#getBuildStep");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **btLocator** | **String**|  |
 **stepId** | **String**|  |
 **fields** | **String**|  | [optional]

### Return type

[**Step**](Step.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getBuildStepParameter"></a>
# **getBuildStepParameter**
> String getBuildStepParameter(btLocator, stepId, parameterName)

Get a parameter of a build step of the matching build configuration.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildTypeApi;


BuildTypeApi apiInstance = new BuildTypeApi();
String btLocator = "btLocator_example"; // String | 
String stepId = "stepId_example"; // String | 
String parameterName = "parameterName_example"; // String | 
try {
    String result = apiInstance.getBuildStepParameter(btLocator, stepId, parameterName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildTypeApi#getBuildStepParameter");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **btLocator** | **String**|  |
 **stepId** | **String**|  |
 **parameterName** | **String**|  |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

<a name="getBuildStepSetting"></a>
# **getBuildStepSetting**
> String getBuildStepSetting(btLocator, stepId, fieldName)

Get the setting of a build step of the matching build configuration.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildTypeApi;


BuildTypeApi apiInstance = new BuildTypeApi();
String btLocator = "btLocator_example"; // String | 
String stepId = "stepId_example"; // String | 
String fieldName = "fieldName_example"; // String | 
try {
    String result = apiInstance.getBuildStepSetting(btLocator, stepId, fieldName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildTypeApi#getBuildStepSetting");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **btLocator** | **String**|  |
 **stepId** | **String**|  |
 **fieldName** | **String**|  |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

<a name="getBuildTemplate"></a>
# **getBuildTemplate**
> BuildType getBuildTemplate(btLocator, templateLocator, fields)

Get a template of the matching build configuration.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildTypeApi;


BuildTypeApi apiInstance = new BuildTypeApi();
String btLocator = "btLocator_example"; // String | 
String templateLocator = "templateLocator_example"; // String | 
String fields = "fields_example"; // String | 
try {
    BuildType result = apiInstance.getBuildTemplate(btLocator, templateLocator, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildTypeApi#getBuildTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **btLocator** | **String**|  |
 **templateLocator** | **String**|  |
 **fields** | **String**|  | [optional]

### Return type

[**BuildType**](BuildType.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getBuildType"></a>
# **getBuildType**
> BuildType getBuildType(btLocator, fields)

Get build configuration matching the locator.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildTypeApi;


BuildTypeApi apiInstance = new BuildTypeApi();
String btLocator = "btLocator_example"; // String | 
String fields = "fields_example"; // String | 
try {
    BuildType result = apiInstance.getBuildType(btLocator, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildTypeApi#getBuildType");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **btLocator** | **String**|  |
 **fields** | **String**|  | [optional]

### Return type

[**BuildType**](BuildType.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getBuildTypeBuildTags"></a>
# **getBuildTypeBuildTags**
> Tags getBuildTypeBuildTags(btLocator, field)

Get tags of builds of the matching build configuration.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildTypeApi;


BuildTypeApi apiInstance = new BuildTypeApi();
String btLocator = "btLocator_example"; // String | 
String field = "field_example"; // String | 
try {
    Tags result = apiInstance.getBuildTypeBuildTags(btLocator, field);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildTypeApi#getBuildTypeBuildTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **btLocator** | **String**|  |
 **field** | **String**|  | [optional]

### Return type

[**Tags**](Tags.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getBuildTypeBuilds"></a>
# **getBuildTypeBuilds**
> Builds getBuildTypeBuilds(btLocator, fields)

Get builds of the matching build configuration.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildTypeApi;


BuildTypeApi apiInstance = new BuildTypeApi();
String btLocator = "btLocator_example"; // String | 
String fields = "fields_example"; // String | 
try {
    Builds result = apiInstance.getBuildTypeBuilds(btLocator, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildTypeApi#getBuildTypeBuilds");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **btLocator** | **String**|  |
 **fields** | **String**|  | [optional]

### Return type

[**Builds**](Builds.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getBuildTypeField"></a>
# **getBuildTypeField**
> String getBuildTypeField(btLocator, field)

Get a field of the matching build configuration.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildTypeApi;


BuildTypeApi apiInstance = new BuildTypeApi();
String btLocator = "btLocator_example"; // String | 
String field = "field_example"; // String | 
try {
    String result = apiInstance.getBuildTypeField(btLocator, field);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildTypeApi#getBuildTypeField");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **btLocator** | **String**|  |
 **field** | **String**|  |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

<a name="getBuildTypeSettingsFile"></a>
# **getBuildTypeSettingsFile**
> String getBuildTypeSettingsFile(btLocator)

Get the settings file of the matching build configuration.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildTypeApi;


BuildTypeApi apiInstance = new BuildTypeApi();
String btLocator = "btLocator_example"; // String | 
try {
    String result = apiInstance.getBuildTypeSettingsFile(btLocator);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildTypeApi#getBuildTypeSettingsFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **btLocator** | **String**|  |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

<a name="getFileMetadataOfBuildType"></a>
# **getFileMetadataOfBuildType**
> File getFileMetadataOfBuildType(path, btLocator, fields, resolveParameters)

Get metadata of specific file.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildTypeApi;


BuildTypeApi apiInstance = new BuildTypeApi();
String path = "path_example"; // String | 
String btLocator = "btLocator_example"; // String | 
String fields = "fields_example"; // String | 
Boolean resolveParameters = true; // Boolean | 
try {
    File result = apiInstance.getFileMetadataOfBuildType(path, btLocator, fields, resolveParameters);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildTypeApi#getFileMetadataOfBuildType");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**|  |
 **btLocator** | **String**|  |
 **fields** | **String**|  | [optional]
 **resolveParameters** | **Boolean**|  | [optional]

### Return type

[**File**](File.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getFilesListForSubpathOfBuildType"></a>
# **getFilesListForSubpathOfBuildType**
> Files getFilesListForSubpathOfBuildType(path, btLocator, basePath, locator, fields, resolveParameters)

List files under this path.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildTypeApi;


BuildTypeApi apiInstance = new BuildTypeApi();
String path = "path_example"; // String | 
String btLocator = "btLocator_example"; // String | 
String basePath = "basePath_example"; // String | 
String locator = "locator_example"; // String | 
String fields = "fields_example"; // String | 
Boolean resolveParameters = true; // Boolean | 
try {
    Files result = apiInstance.getFilesListForSubpathOfBuildType(path, btLocator, basePath, locator, fields, resolveParameters);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildTypeApi#getFilesListForSubpathOfBuildType");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**|  |
 **btLocator** | **String**|  |
 **basePath** | **String**|  | [optional]
 **locator** | **String**|  | [optional]
 **fields** | **String**|  | [optional]
 **resolveParameters** | **Boolean**|  | [optional]

### Return type

[**Files**](Files.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getFilesListOfBuildType"></a>
# **getFilesListOfBuildType**
> Files getFilesListOfBuildType(btLocator, basePath, locator, fields, resolveParameters)

List all files.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildTypeApi;


BuildTypeApi apiInstance = new BuildTypeApi();
String btLocator = "btLocator_example"; // String | 
String basePath = "basePath_example"; // String | 
String locator = "locator_example"; // String | 
String fields = "fields_example"; // String | 
Boolean resolveParameters = true; // Boolean | 
try {
    Files result = apiInstance.getFilesListOfBuildType(btLocator, basePath, locator, fields, resolveParameters);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildTypeApi#getFilesListOfBuildType");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **btLocator** | **String**|  |
 **basePath** | **String**|  | [optional]
 **locator** | **String**|  | [optional]
 **fields** | **String**|  | [optional]
 **resolveParameters** | **Boolean**|  | [optional]

### Return type

[**Files**](Files.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getSnapshotDependency"></a>
# **getSnapshotDependency**
> SnapshotDependency getSnapshotDependency(btLocator, snapshotDepLocator, fields)

Get a snapshot dependency of the matching build configuration.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildTypeApi;


BuildTypeApi apiInstance = new BuildTypeApi();
String btLocator = "btLocator_example"; // String | 
String snapshotDepLocator = "snapshotDepLocator_example"; // String | 
String fields = "fields_example"; // String | 
try {
    SnapshotDependency result = apiInstance.getSnapshotDependency(btLocator, snapshotDepLocator, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildTypeApi#getSnapshotDependency");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **btLocator** | **String**|  |
 **snapshotDepLocator** | **String**|  |
 **fields** | **String**|  | [optional]

### Return type

[**SnapshotDependency**](SnapshotDependency.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getTrigger"></a>
# **getTrigger**
> Trigger getTrigger(btLocator, triggerLocator, fields)

Get a trigger of the matching build configuration.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildTypeApi;


BuildTypeApi apiInstance = new BuildTypeApi();
String btLocator = "btLocator_example"; // String | 
String triggerLocator = "triggerLocator_example"; // String | 
String fields = "fields_example"; // String | 
try {
    Trigger result = apiInstance.getTrigger(btLocator, triggerLocator, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildTypeApi#getTrigger");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **btLocator** | **String**|  |
 **triggerLocator** | **String**|  |
 **fields** | **String**|  | [optional]

### Return type

[**Trigger**](Trigger.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getTriggerParameter"></a>
# **getTriggerParameter**
> String getTriggerParameter(btLocator, triggerLocator, fieldName)

Get a parameter of a trigger of the matching build configuration.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildTypeApi;


BuildTypeApi apiInstance = new BuildTypeApi();
String btLocator = "btLocator_example"; // String | 
String triggerLocator = "triggerLocator_example"; // String | 
String fieldName = "fieldName_example"; // String | 
try {
    String result = apiInstance.getTriggerParameter(btLocator, triggerLocator, fieldName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildTypeApi#getTriggerParameter");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **btLocator** | **String**|  |
 **triggerLocator** | **String**|  |
 **fieldName** | **String**|  |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

<a name="getVcsRoot"></a>
# **getVcsRoot**
> VcsRootEntry getVcsRoot(btLocator, vcsRootLocator, fields)

Get a VCS root of the matching build configuration.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildTypeApi;


BuildTypeApi apiInstance = new BuildTypeApi();
String btLocator = "btLocator_example"; // String | 
String vcsRootLocator = "vcsRootLocator_example"; // String | 
String fields = "fields_example"; // String | 
try {
    VcsRootEntry result = apiInstance.getVcsRoot(btLocator, vcsRootLocator, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildTypeApi#getVcsRoot");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **btLocator** | **String**|  |
 **vcsRootLocator** | **String**|  |
 **fields** | **String**|  | [optional]

### Return type

[**VcsRootEntry**](VcsRootEntry.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getVcsRootCheckoutRules"></a>
# **getVcsRootCheckoutRules**
> String getVcsRootCheckoutRules(btLocator, vcsRootLocator)

Get checkout rules of a VCS root of the matching build configuration.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildTypeApi;


BuildTypeApi apiInstance = new BuildTypeApi();
String btLocator = "btLocator_example"; // String | 
String vcsRootLocator = "vcsRootLocator_example"; // String | 
try {
    String result = apiInstance.getVcsRootCheckoutRules(btLocator, vcsRootLocator);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildTypeApi#getVcsRootCheckoutRules");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **btLocator** | **String**|  |
 **vcsRootLocator** | **String**|  |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

<a name="getVcsRootInstancesOfBuildType"></a>
# **getVcsRootInstancesOfBuildType**
> VcsRootInstances getVcsRootInstancesOfBuildType(btLocator, fields)

Get all VCS root instances of the matching build configuration.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildTypeApi;


BuildTypeApi apiInstance = new BuildTypeApi();
String btLocator = "btLocator_example"; // String | 
String fields = "fields_example"; // String | 
try {
    VcsRootInstances result = apiInstance.getVcsRootInstancesOfBuildType(btLocator, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildTypeApi#getVcsRootInstancesOfBuildType");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **btLocator** | **String**|  |
 **fields** | **String**|  | [optional]

### Return type

[**VcsRootInstances**](VcsRootInstances.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getZippedFileOfBuildType"></a>
# **getZippedFileOfBuildType**
> getZippedFileOfBuildType(path, btLocator, basePath, locator, name, resolveParameters)

Get specific file zipped.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildTypeApi;


BuildTypeApi apiInstance = new BuildTypeApi();
String path = "path_example"; // String | 
String btLocator = "btLocator_example"; // String | 
String basePath = "basePath_example"; // String | 
String locator = "locator_example"; // String | 
String name = "name_example"; // String | 
Boolean resolveParameters = true; // Boolean | 
try {
    apiInstance.getZippedFileOfBuildType(path, btLocator, basePath, locator, name, resolveParameters);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildTypeApi#getZippedFileOfBuildType");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**|  |
 **btLocator** | **String**|  |
 **basePath** | **String**|  | [optional]
 **locator** | **String**|  | [optional]
 **name** | **String**|  | [optional]
 **resolveParameters** | **Boolean**|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="removeAllTemplates"></a>
# **removeAllTemplates**
> removeAllTemplates(btLocator, inlineSettings)

Detach all templates from the matching build configuration.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildTypeApi;


BuildTypeApi apiInstance = new BuildTypeApi();
String btLocator = "btLocator_example"; // String | 
Boolean inlineSettings = true; // Boolean | 
try {
    apiInstance.removeAllTemplates(btLocator, inlineSettings);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildTypeApi#removeAllTemplates");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **btLocator** | **String**|  |
 **inlineSettings** | **Boolean**|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="removeTemplate"></a>
# **removeTemplate**
> removeTemplate(btLocator, templateLocator, inlineSettings)

Detach a template from the matching build configuration.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildTypeApi;


BuildTypeApi apiInstance = new BuildTypeApi();
String btLocator = "btLocator_example"; // String | 
String templateLocator = "templateLocator_example"; // String | 
Boolean inlineSettings = true; // Boolean | 
try {
    apiInstance.removeTemplate(btLocator, templateLocator, inlineSettings);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildTypeApi#removeTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **btLocator** | **String**|  |
 **templateLocator** | **String**|  |
 **inlineSettings** | **Boolean**|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="replaceAgentRequirement"></a>
# **replaceAgentRequirement**
> AgentRequirement replaceAgentRequirement(btLocator, agentRequirementLocator, fields, body)

Update an agent requirement of the matching build configuration.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildTypeApi;


BuildTypeApi apiInstance = new BuildTypeApi();
String btLocator = "btLocator_example"; // String | 
String agentRequirementLocator = "agentRequirementLocator_example"; // String | 
String fields = "fields_example"; // String | 
AgentRequirement body = new AgentRequirement(); // AgentRequirement | 
try {
    AgentRequirement result = apiInstance.replaceAgentRequirement(btLocator, agentRequirementLocator, fields, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildTypeApi#replaceAgentRequirement");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **btLocator** | **String**|  |
 **agentRequirementLocator** | **String**|  |
 **fields** | **String**|  | [optional]
 **body** | [**AgentRequirement**](AgentRequirement.md)|  | [optional]

### Return type

[**AgentRequirement**](AgentRequirement.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="replaceAllAgentRequirements"></a>
# **replaceAllAgentRequirements**
> AgentRequirements replaceAllAgentRequirements(btLocator, fields, body)

Update all agent requirements of the matching build configuration.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildTypeApi;


BuildTypeApi apiInstance = new BuildTypeApi();
String btLocator = "btLocator_example"; // String | 
String fields = "fields_example"; // String | 
AgentRequirements body = new AgentRequirements(); // AgentRequirements | 
try {
    AgentRequirements result = apiInstance.replaceAllAgentRequirements(btLocator, fields, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildTypeApi#replaceAllAgentRequirements");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **btLocator** | **String**|  |
 **fields** | **String**|  | [optional]
 **body** | [**AgentRequirements**](AgentRequirements.md)|  | [optional]

### Return type

[**AgentRequirements**](AgentRequirements.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="replaceAllArtifactDependencies"></a>
# **replaceAllArtifactDependencies**
> ArtifactDependencies replaceAllArtifactDependencies(btLocator, fields, body)

Update all artifact dependencies of the matching build configuration.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildTypeApi;


BuildTypeApi apiInstance = new BuildTypeApi();
String btLocator = "btLocator_example"; // String | 
String fields = "fields_example"; // String | 
ArtifactDependencies body = new ArtifactDependencies(); // ArtifactDependencies | 
try {
    ArtifactDependencies result = apiInstance.replaceAllArtifactDependencies(btLocator, fields, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildTypeApi#replaceAllArtifactDependencies");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **btLocator** | **String**|  |
 **fields** | **String**|  | [optional]
 **body** | [**ArtifactDependencies**](ArtifactDependencies.md)|  | [optional]

### Return type

[**ArtifactDependencies**](ArtifactDependencies.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="replaceAllBuildFeatures"></a>
# **replaceAllBuildFeatures**
> Features replaceAllBuildFeatures(btLocator, fields, body)

Update all build features of the matching build configuration.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildTypeApi;


BuildTypeApi apiInstance = new BuildTypeApi();
String btLocator = "btLocator_example"; // String | 
String fields = "fields_example"; // String | 
Features body = new Features(); // Features | 
try {
    Features result = apiInstance.replaceAllBuildFeatures(btLocator, fields, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildTypeApi#replaceAllBuildFeatures");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **btLocator** | **String**|  |
 **fields** | **String**|  | [optional]
 **body** | [**Features**](Features.md)|  | [optional]

### Return type

[**Features**](Features.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="replaceAllBuildSteps"></a>
# **replaceAllBuildSteps**
> Steps replaceAllBuildSteps(btLocator, fields, body)

Update all build steps of the matching build configuration.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildTypeApi;


BuildTypeApi apiInstance = new BuildTypeApi();
String btLocator = "btLocator_example"; // String | 
String fields = "fields_example"; // String | 
Steps body = new Steps(); // Steps | 
try {
    Steps result = apiInstance.replaceAllBuildSteps(btLocator, fields, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildTypeApi#replaceAllBuildSteps");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **btLocator** | **String**|  |
 **fields** | **String**|  | [optional]
 **body** | [**Steps**](Steps.md)|  | [optional]

### Return type

[**Steps**](Steps.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="replaceAllSnapshotDependencies"></a>
# **replaceAllSnapshotDependencies**
> SnapshotDependencies replaceAllSnapshotDependencies(btLocator, fields, body)

Update all snapshot dependencies of the matching build configuration.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildTypeApi;


BuildTypeApi apiInstance = new BuildTypeApi();
String btLocator = "btLocator_example"; // String | 
String fields = "fields_example"; // String | 
SnapshotDependencies body = new SnapshotDependencies(); // SnapshotDependencies | 
try {
    SnapshotDependencies result = apiInstance.replaceAllSnapshotDependencies(btLocator, fields, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildTypeApi#replaceAllSnapshotDependencies");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **btLocator** | **String**|  |
 **fields** | **String**|  | [optional]
 **body** | [**SnapshotDependencies**](SnapshotDependencies.md)|  | [optional]

### Return type

[**SnapshotDependencies**](SnapshotDependencies.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="replaceAllTriggers"></a>
# **replaceAllTriggers**
> Triggers replaceAllTriggers(btLocator, fields, body)

Update all triggers of the matching build configuration.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildTypeApi;


BuildTypeApi apiInstance = new BuildTypeApi();
String btLocator = "btLocator_example"; // String | 
String fields = "fields_example"; // String | 
Triggers body = new Triggers(); // Triggers | 
try {
    Triggers result = apiInstance.replaceAllTriggers(btLocator, fields, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildTypeApi#replaceAllTriggers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **btLocator** | **String**|  |
 **fields** | **String**|  | [optional]
 **body** | [**Triggers**](Triggers.md)|  | [optional]

### Return type

[**Triggers**](Triggers.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="replaceAllVcsRoots"></a>
# **replaceAllVcsRoots**
> VcsRootEntries replaceAllVcsRoots(btLocator, body, fields)

Update all VCS roots of the matching build configuration.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildTypeApi;


BuildTypeApi apiInstance = new BuildTypeApi();
String btLocator = "btLocator_example"; // String | 
VcsRootEntries body = new VcsRootEntries(); // VcsRootEntries | 
String fields = "fields_example"; // String | 
try {
    VcsRootEntries result = apiInstance.replaceAllVcsRoots(btLocator, body, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildTypeApi#replaceAllVcsRoots");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **btLocator** | **String**|  |
 **body** | [**VcsRootEntries**](VcsRootEntries.md)|  | [optional]
 **fields** | **String**|  | [optional]

### Return type

[**VcsRootEntries**](VcsRootEntries.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="replaceArtifactDependency"></a>
# **replaceArtifactDependency**
> ArtifactDependency replaceArtifactDependency(btLocator, artifactDepLocator, fields, body)

Update an artifact dependency of the matching build configuration.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildTypeApi;


BuildTypeApi apiInstance = new BuildTypeApi();
String btLocator = "btLocator_example"; // String | 
String artifactDepLocator = "artifactDepLocator_example"; // String | 
String fields = "fields_example"; // String | 
ArtifactDependency body = new ArtifactDependency(); // ArtifactDependency | 
try {
    ArtifactDependency result = apiInstance.replaceArtifactDependency(btLocator, artifactDepLocator, fields, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildTypeApi#replaceArtifactDependency");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **btLocator** | **String**|  |
 **artifactDepLocator** | **String**|  |
 **fields** | **String**|  | [optional]
 **body** | [**ArtifactDependency**](ArtifactDependency.md)|  | [optional]

### Return type

[**ArtifactDependency**](ArtifactDependency.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="replaceBuildFeature"></a>
# **replaceBuildFeature**
> Feature replaceBuildFeature(btLocator, featureId, fields, body)

Update a build feature of the matching build configuration.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildTypeApi;


BuildTypeApi apiInstance = new BuildTypeApi();
String btLocator = "btLocator_example"; // String | 
String featureId = "featureId_example"; // String | 
String fields = "fields_example"; // String | 
Feature body = new Feature(); // Feature | 
try {
    Feature result = apiInstance.replaceBuildFeature(btLocator, featureId, fields, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildTypeApi#replaceBuildFeature");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **btLocator** | **String**|  |
 **featureId** | **String**|  |
 **fields** | **String**|  | [optional]
 **body** | [**Feature**](Feature.md)|  | [optional]

### Return type

[**Feature**](Feature.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="replaceBuildFeatureParameters"></a>
# **replaceBuildFeatureParameters**
> Properties replaceBuildFeatureParameters(btLocator, featureId, body, fields)

Update a parameter of a build feature of the matching build configuration.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildTypeApi;


BuildTypeApi apiInstance = new BuildTypeApi();
String btLocator = "btLocator_example"; // String | 
String featureId = "featureId_example"; // String | 
Properties body = new Properties(); // Properties | 
String fields = "fields_example"; // String | 
try {
    Properties result = apiInstance.replaceBuildFeatureParameters(btLocator, featureId, body, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildTypeApi#replaceBuildFeatureParameters");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **btLocator** | **String**|  |
 **featureId** | **String**|  |
 **body** | [**Properties**](Properties.md)|  | [optional]
 **fields** | **String**|  | [optional]

### Return type

[**Properties**](Properties.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="replaceBuildStep"></a>
# **replaceBuildStep**
> Step replaceBuildStep(btLocator, stepId, fields, body)

Replace a build step of the matching build configuration.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildTypeApi;


BuildTypeApi apiInstance = new BuildTypeApi();
String btLocator = "btLocator_example"; // String | 
String stepId = "stepId_example"; // String | 
String fields = "fields_example"; // String | 
Step body = new Step(); // Step | 
try {
    Step result = apiInstance.replaceBuildStep(btLocator, stepId, fields, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildTypeApi#replaceBuildStep");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **btLocator** | **String**|  |
 **stepId** | **String**|  |
 **fields** | **String**|  | [optional]
 **body** | [**Step**](Step.md)|  | [optional]

### Return type

[**Step**](Step.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="replaceSnapshotDependency"></a>
# **replaceSnapshotDependency**
> SnapshotDependency replaceSnapshotDependency(btLocator, snapshotDepLocator, fields, body)

Update a snapshot dependency of the matching build configuration.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildTypeApi;


BuildTypeApi apiInstance = new BuildTypeApi();
String btLocator = "btLocator_example"; // String | 
String snapshotDepLocator = "snapshotDepLocator_example"; // String | 
String fields = "fields_example"; // String | 
SnapshotDependency body = new SnapshotDependency(); // SnapshotDependency | 
try {
    SnapshotDependency result = apiInstance.replaceSnapshotDependency(btLocator, snapshotDepLocator, fields, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildTypeApi#replaceSnapshotDependency");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **btLocator** | **String**|  |
 **snapshotDepLocator** | **String**|  |
 **fields** | **String**|  | [optional]
 **body** | [**SnapshotDependency**](SnapshotDependency.md)|  | [optional]

### Return type

[**SnapshotDependency**](SnapshotDependency.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="replaceTrigger"></a>
# **replaceTrigger**
> Trigger replaceTrigger(btLocator, triggerLocator, fields, body)

Update a trigger of the matching build configuration.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildTypeApi;


BuildTypeApi apiInstance = new BuildTypeApi();
String btLocator = "btLocator_example"; // String | 
String triggerLocator = "triggerLocator_example"; // String | 
String fields = "fields_example"; // String | 
Trigger body = new Trigger(); // Trigger | 
try {
    Trigger result = apiInstance.replaceTrigger(btLocator, triggerLocator, fields, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildTypeApi#replaceTrigger");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **btLocator** | **String**|  |
 **triggerLocator** | **String**|  |
 **fields** | **String**|  | [optional]
 **body** | [**Trigger**](Trigger.md)|  | [optional]

### Return type

[**Trigger**](Trigger.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="setAgentRequirementParameter"></a>
# **setAgentRequirementParameter**
> String setAgentRequirementParameter(btLocator, agentRequirementLocator, fieldName, body)

Update a parameter of an agent requirement of the matching build configuration.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildTypeApi;


BuildTypeApi apiInstance = new BuildTypeApi();
String btLocator = "btLocator_example"; // String | 
String agentRequirementLocator = "agentRequirementLocator_example"; // String | 
String fieldName = "fieldName_example"; // String | 
String body = "body_example"; // String | 
try {
    String result = apiInstance.setAgentRequirementParameter(btLocator, agentRequirementLocator, fieldName, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildTypeApi#setAgentRequirementParameter");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **btLocator** | **String**|  |
 **agentRequirementLocator** | **String**|  |
 **fieldName** | **String**|  |
 **body** | **String**|  | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: text/plain
 - **Accept**: text/plain

<a name="setArtifactDependencyParameter"></a>
# **setArtifactDependencyParameter**
> String setArtifactDependencyParameter(btLocator, artifactDepLocator, fieldName, body)

Update a parameter of an artifact dependency of the matching build configuration.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildTypeApi;


BuildTypeApi apiInstance = new BuildTypeApi();
String btLocator = "btLocator_example"; // String | 
String artifactDepLocator = "artifactDepLocator_example"; // String | 
String fieldName = "fieldName_example"; // String | 
String body = "body_example"; // String | 
try {
    String result = apiInstance.setArtifactDependencyParameter(btLocator, artifactDepLocator, fieldName, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildTypeApi#setArtifactDependencyParameter");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **btLocator** | **String**|  |
 **artifactDepLocator** | **String**|  |
 **fieldName** | **String**|  |
 **body** | **String**|  | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: text/plain
 - **Accept**: text/plain

<a name="setBuildFeatureParameter"></a>
# **setBuildFeatureParameter**
> String setBuildFeatureParameter(btLocator, featureId, name, body)

Update a parameter of a build feature of the matching build configuration.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildTypeApi;


BuildTypeApi apiInstance = new BuildTypeApi();
String btLocator = "btLocator_example"; // String | 
String featureId = "featureId_example"; // String | 
String name = "name_example"; // String | 
String body = "body_example"; // String | 
try {
    String result = apiInstance.setBuildFeatureParameter(btLocator, featureId, name, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildTypeApi#setBuildFeatureParameter");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **btLocator** | **String**|  |
 **featureId** | **String**|  |
 **name** | **String**|  |
 **body** | **String**|  | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: text/plain
 - **Accept**: text/plain

<a name="setBuildStepParameter"></a>
# **setBuildStepParameter**
> String setBuildStepParameter(btLocator, stepId, fieldName, body)

Update a parameter of a build step of the matching build configuration.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildTypeApi;


BuildTypeApi apiInstance = new BuildTypeApi();
String btLocator = "btLocator_example"; // String | 
String stepId = "stepId_example"; // String | 
String fieldName = "fieldName_example"; // String | 
String body = "body_example"; // String | 
try {
    String result = apiInstance.setBuildStepParameter(btLocator, stepId, fieldName, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildTypeApi#setBuildStepParameter");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **btLocator** | **String**|  |
 **stepId** | **String**|  |
 **fieldName** | **String**|  |
 **body** | **String**|  | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: text/plain
 - **Accept**: text/plain

<a name="setBuildTypeField"></a>
# **setBuildTypeField**
> String setBuildTypeField(btLocator, field, body)

Update a field of the matching build configuration.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildTypeApi;


BuildTypeApi apiInstance = new BuildTypeApi();
String btLocator = "btLocator_example"; // String | 
String field = "field_example"; // String | 
String body = "body_example"; // String | 
try {
    String result = apiInstance.setBuildTypeField(btLocator, field, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildTypeApi#setBuildTypeField");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **btLocator** | **String**|  |
 **field** | **String**|  |
 **body** | **String**|  | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: text/plain
 - **Accept**: text/plain

<a name="setBuildTypeTemplates"></a>
# **setBuildTypeTemplates**
> BuildTypes setBuildTypeTemplates(btLocator, body, optimizeSettings, fields)

Update all templates of the matching build configuration.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildTypeApi;


BuildTypeApi apiInstance = new BuildTypeApi();
String btLocator = "btLocator_example"; // String | 
BuildTypes body = new BuildTypes(); // BuildTypes | 
Boolean optimizeSettings = true; // Boolean | 
String fields = "fields_example"; // String | 
try {
    BuildTypes result = apiInstance.setBuildTypeTemplates(btLocator, body, optimizeSettings, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildTypeApi#setBuildTypeTemplates");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **btLocator** | **String**|  |
 **body** | [**BuildTypes**](BuildTypes.md)|  | [optional]
 **optimizeSettings** | **Boolean**|  | [optional]
 **fields** | **String**|  | [optional]

### Return type

[**BuildTypes**](BuildTypes.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="setTriggerParameter"></a>
# **setTriggerParameter**
> String setTriggerParameter(btLocator, triggerLocator, fieldName, body)

Update a parameter of a trigger of the matching build configuration.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildTypeApi;


BuildTypeApi apiInstance = new BuildTypeApi();
String btLocator = "btLocator_example"; // String | 
String triggerLocator = "triggerLocator_example"; // String | 
String fieldName = "fieldName_example"; // String | 
String body = "body_example"; // String | 
try {
    String result = apiInstance.setTriggerParameter(btLocator, triggerLocator, fieldName, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildTypeApi#setTriggerParameter");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **btLocator** | **String**|  |
 **triggerLocator** | **String**|  |
 **fieldName** | **String**|  |
 **body** | **String**|  | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: text/plain
 - **Accept**: text/plain

<a name="updateBuildParameterOfBuildType"></a>
# **updateBuildParameterOfBuildType**
> Property updateBuildParameterOfBuildType(name, btLocator, body, fields)

Update build parameter.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildTypeApi;


BuildTypeApi apiInstance = new BuildTypeApi();
String name = "name_example"; // String | 
String btLocator = "btLocator_example"; // String | 
Property body = new Property(); // Property | 
String fields = "fields_example"; // String | 
try {
    Property result = apiInstance.updateBuildParameterOfBuildType(name, btLocator, body, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildTypeApi#updateBuildParameterOfBuildType");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **btLocator** | **String**|  |
 **body** | [**Property**](Property.md)|  | [optional]
 **fields** | **String**|  | [optional]

### Return type

[**Property**](Property.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="updateBuildParameterSpecificationOfBuildType"></a>
# **updateBuildParameterSpecificationOfBuildType**
> String updateBuildParameterSpecificationOfBuildType(name, btLocator, body)

Update build parameter specification.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildTypeApi;


BuildTypeApi apiInstance = new BuildTypeApi();
String name = "name_example"; // String | 
String btLocator = "btLocator_example"; // String | 
String body = "body_example"; // String | 
try {
    String result = apiInstance.updateBuildParameterSpecificationOfBuildType(name, btLocator, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildTypeApi#updateBuildParameterSpecificationOfBuildType");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **btLocator** | **String**|  |
 **body** | **String**|  | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: text/plain
 - **Accept**: text/plain

<a name="updateBuildParameterTypeOfBuildType"></a>
# **updateBuildParameterTypeOfBuildType**
> Type updateBuildParameterTypeOfBuildType(name, btLocator, body)

Update type of build parameter.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildTypeApi;


BuildTypeApi apiInstance = new BuildTypeApi();
String name = "name_example"; // String | 
String btLocator = "btLocator_example"; // String | 
Type body = new Type(); // Type | 
try {
    Type result = apiInstance.updateBuildParameterTypeOfBuildType(name, btLocator, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildTypeApi#updateBuildParameterTypeOfBuildType");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **btLocator** | **String**|  |
 **body** | [**Type**](Type.md)|  | [optional]

### Return type

[**Type**](Type.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="updateBuildParameterValueOfBuildType"></a>
# **updateBuildParameterValueOfBuildType**
> String updateBuildParameterValueOfBuildType(name, btLocator, body)

Update value of build parameter.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildTypeApi;


BuildTypeApi apiInstance = new BuildTypeApi();
String name = "name_example"; // String | 
String btLocator = "btLocator_example"; // String | 
String body = "body_example"; // String | 
try {
    String result = apiInstance.updateBuildParameterValueOfBuildType(name, btLocator, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildTypeApi#updateBuildParameterValueOfBuildType");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **btLocator** | **String**|  |
 **body** | **String**|  | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: text/plain
 - **Accept**: text/plain

<a name="updateBuildParametersOfBuildType"></a>
# **updateBuildParametersOfBuildType**
> Properties updateBuildParametersOfBuildType(btLocator, body, fields)

Update build parameters.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildTypeApi;


BuildTypeApi apiInstance = new BuildTypeApi();
String btLocator = "btLocator_example"; // String | 
Properties body = new Properties(); // Properties | 
String fields = "fields_example"; // String | 
try {
    Properties result = apiInstance.updateBuildParametersOfBuildType(btLocator, body, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildTypeApi#updateBuildParametersOfBuildType");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **btLocator** | **String**|  |
 **body** | [**Properties**](Properties.md)|  | [optional]
 **fields** | **String**|  | [optional]

### Return type

[**Properties**](Properties.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="updateBuildTypeVcsRoot"></a>
# **updateBuildTypeVcsRoot**
> VcsRootEntry updateBuildTypeVcsRoot(btLocator, vcsRootLocator, body, fields)

Update a VCS root of the matching build configuration.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildTypeApi;


BuildTypeApi apiInstance = new BuildTypeApi();
String btLocator = "btLocator_example"; // String | 
String vcsRootLocator = "vcsRootLocator_example"; // String | 
VcsRootEntry body = new VcsRootEntry(); // VcsRootEntry | 
String fields = "fields_example"; // String | 
try {
    VcsRootEntry result = apiInstance.updateBuildTypeVcsRoot(btLocator, vcsRootLocator, body, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildTypeApi#updateBuildTypeVcsRoot");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **btLocator** | **String**|  |
 **vcsRootLocator** | **String**|  |
 **body** | [**VcsRootEntry**](VcsRootEntry.md)|  | [optional]
 **fields** | **String**|  | [optional]

### Return type

[**VcsRootEntry**](VcsRootEntry.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="updateBuildTypeVcsRootCheckoutRules"></a>
# **updateBuildTypeVcsRootCheckoutRules**
> String updateBuildTypeVcsRootCheckoutRules(btLocator, vcsRootLocator, body)

Update checkout rules of a VCS root of the matching build configuration.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BuildTypeApi;


BuildTypeApi apiInstance = new BuildTypeApi();
String btLocator = "btLocator_example"; // String | 
String vcsRootLocator = "vcsRootLocator_example"; // String | 
String body = "body_example"; // String | 
try {
    String result = apiInstance.updateBuildTypeVcsRootCheckoutRules(btLocator, vcsRootLocator, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildTypeApi#updateBuildTypeVcsRootCheckoutRules");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **btLocator** | **String**|  |
 **vcsRootLocator** | **String**|  |
 **body** | **String**|  | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: text/plain
 - **Accept**: text/plain

