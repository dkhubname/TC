# ChangeApi

All URIs are relative to *https://localhost:8111*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAllChanges**](ChangeApi.md#getAllChanges) | **GET** /app/rest/changes | Get all changes.
[**getChange**](ChangeApi.md#getChange) | **GET** /app/rest/changes/{changeLocator} | Get change matching the locator.
[**getChangeAttributes**](ChangeApi.md#getChangeAttributes) | **GET** /app/rest/changes/{changeLocator}/attributes | Get attributes of the matching change.
[**getChangeDuplicates**](ChangeApi.md#getChangeDuplicates) | **GET** /app/rest/changes/{changeLocator}/duplicates | Get duplicates of the matching change.
[**getChangeField**](ChangeApi.md#getChangeField) | **GET** /app/rest/changes/{changeLocator}/{field} | Get a field of the matching change.
[**getChangeIssue**](ChangeApi.md#getChangeIssue) | **GET** /app/rest/changes/{changeLocator}/issues | Get issues of the matching change.
[**getChangeParentChanges**](ChangeApi.md#getChangeParentChanges) | **GET** /app/rest/changes/{changeLocator}/parentChanges | Get parent changes of the matching change.
[**getChangeParentRevisions**](ChangeApi.md#getChangeParentRevisions) | **GET** /app/rest/changes/{changeLocator}/parentRevisions | Get parent revisions of the matching change.
[**getChangeVcsRoot**](ChangeApi.md#getChangeVcsRoot) | **GET** /app/rest/changes/{changeLocator}/vcsRootInstance | Get a VCS root instance of the matching change.


<a name="getAllChanges"></a>
# **getAllChanges**
> Changes getAllChanges(locator, fields)

Get all changes.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ChangeApi;


ChangeApi apiInstance = new ChangeApi();
String locator = "locator_example"; // String | 
String fields = "fields_example"; // String | 
try {
    Changes result = apiInstance.getAllChanges(locator, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChangeApi#getAllChanges");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **locator** | **String**|  | [optional]
 **fields** | **String**|  | [optional]

### Return type

[**Changes**](Changes.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getChange"></a>
# **getChange**
> Change getChange(changeLocator, fields)

Get change matching the locator.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ChangeApi;


ChangeApi apiInstance = new ChangeApi();
String changeLocator = "changeLocator_example"; // String | 
String fields = "fields_example"; // String | 
try {
    Change result = apiInstance.getChange(changeLocator, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChangeApi#getChange");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **changeLocator** | **String**|  |
 **fields** | **String**|  | [optional]

### Return type

[**Change**](Change.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getChangeAttributes"></a>
# **getChangeAttributes**
> Entries getChangeAttributes(changeLocator, fields)

Get attributes of the matching change.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ChangeApi;


ChangeApi apiInstance = new ChangeApi();
String changeLocator = "changeLocator_example"; // String | 
String fields = "fields_example"; // String | 
try {
    Entries result = apiInstance.getChangeAttributes(changeLocator, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChangeApi#getChangeAttributes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **changeLocator** | **String**|  |
 **fields** | **String**|  | [optional]

### Return type

[**Entries**](Entries.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getChangeDuplicates"></a>
# **getChangeDuplicates**
> Changes getChangeDuplicates(changeLocator, fields)

Get duplicates of the matching change.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ChangeApi;


ChangeApi apiInstance = new ChangeApi();
String changeLocator = "changeLocator_example"; // String | 
String fields = "fields_example"; // String | 
try {
    Changes result = apiInstance.getChangeDuplicates(changeLocator, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChangeApi#getChangeDuplicates");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **changeLocator** | **String**|  |
 **fields** | **String**|  | [optional]

### Return type

[**Changes**](Changes.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getChangeField"></a>
# **getChangeField**
> String getChangeField(changeLocator, field)

Get a field of the matching change.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ChangeApi;


ChangeApi apiInstance = new ChangeApi();
String changeLocator = "changeLocator_example"; // String | 
String field = "field_example"; // String | 
try {
    String result = apiInstance.getChangeField(changeLocator, field);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChangeApi#getChangeField");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **changeLocator** | **String**|  |
 **field** | **String**|  |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

<a name="getChangeIssue"></a>
# **getChangeIssue**
> Issues getChangeIssue(changeLocator)

Get issues of the matching change.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ChangeApi;


ChangeApi apiInstance = new ChangeApi();
String changeLocator = "changeLocator_example"; // String | 
try {
    Issues result = apiInstance.getChangeIssue(changeLocator);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChangeApi#getChangeIssue");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **changeLocator** | **String**|  |

### Return type

[**Issues**](Issues.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getChangeParentChanges"></a>
# **getChangeParentChanges**
> Changes getChangeParentChanges(changeLocator, fields)

Get parent changes of the matching change.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ChangeApi;


ChangeApi apiInstance = new ChangeApi();
String changeLocator = "changeLocator_example"; // String | 
String fields = "fields_example"; // String | 
try {
    Changes result = apiInstance.getChangeParentChanges(changeLocator, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChangeApi#getChangeParentChanges");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **changeLocator** | **String**|  |
 **fields** | **String**|  | [optional]

### Return type

[**Changes**](Changes.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getChangeParentRevisions"></a>
# **getChangeParentRevisions**
> Items getChangeParentRevisions(changeLocator)

Get parent revisions of the matching change.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ChangeApi;


ChangeApi apiInstance = new ChangeApi();
String changeLocator = "changeLocator_example"; // String | 
try {
    Items result = apiInstance.getChangeParentRevisions(changeLocator);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChangeApi#getChangeParentRevisions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **changeLocator** | **String**|  |

### Return type

[**Items**](Items.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getChangeVcsRoot"></a>
# **getChangeVcsRoot**
> VcsRootInstance getChangeVcsRoot(changeLocator, fields)

Get a VCS root instance of the matching change.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ChangeApi;


ChangeApi apiInstance = new ChangeApi();
String changeLocator = "changeLocator_example"; // String | 
String fields = "fields_example"; // String | 
try {
    VcsRootInstance result = apiInstance.getChangeVcsRoot(changeLocator, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChangeApi#getChangeVcsRoot");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **changeLocator** | **String**|  |
 **fields** | **String**|  | [optional]

### Return type

[**VcsRootInstance**](VcsRootInstance.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

