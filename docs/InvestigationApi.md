# InvestigationApi

All URIs are relative to *https://localhost:8111*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addInvestigation**](InvestigationApi.md#addInvestigation) | **POST** /app/rest/investigations | Create a new investigation.
[**addMultipleInvestigations**](InvestigationApi.md#addMultipleInvestigations) | **POST** /app/rest/investigations/multiple | Create multiple new investigations.
[**deleteInvestigation**](InvestigationApi.md#deleteInvestigation) | **DELETE** /app/rest/investigations/{investigationLocator} | Delete investigation matching the locator.
[**getAllInvestigations**](InvestigationApi.md#getAllInvestigations) | **GET** /app/rest/investigations | Get all investigations.
[**getInvestigation**](InvestigationApi.md#getInvestigation) | **GET** /app/rest/investigations/{investigationLocator} | Get investigation matching the locator.
[**replaceInvestigation**](InvestigationApi.md#replaceInvestigation) | **PUT** /app/rest/investigations/{investigationLocator} | Update investigation matching the locator.


<a name="addInvestigation"></a>
# **addInvestigation**
> Investigation addInvestigation(body, fields)

Create a new investigation.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.InvestigationApi;


InvestigationApi apiInstance = new InvestigationApi();
Investigation body = new Investigation(); // Investigation | 
String fields = "fields_example"; // String | 
try {
    Investigation result = apiInstance.addInvestigation(body, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InvestigationApi#addInvestigation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Investigation**](Investigation.md)|  | [optional]
 **fields** | **String**|  | [optional]

### Return type

[**Investigation**](Investigation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="addMultipleInvestigations"></a>
# **addMultipleInvestigations**
> Investigations addMultipleInvestigations(body, fields)

Create multiple new investigations.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.InvestigationApi;


InvestigationApi apiInstance = new InvestigationApi();
Investigations body = new Investigations(); // Investigations | 
String fields = "fields_example"; // String | 
try {
    Investigations result = apiInstance.addMultipleInvestigations(body, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InvestigationApi#addMultipleInvestigations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Investigations**](Investigations.md)|  | [optional]
 **fields** | **String**|  | [optional]

### Return type

[**Investigations**](Investigations.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="deleteInvestigation"></a>
# **deleteInvestigation**
> deleteInvestigation(investigationLocator)

Delete investigation matching the locator.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.InvestigationApi;


InvestigationApi apiInstance = new InvestigationApi();
String investigationLocator = "investigationLocator_example"; // String | 
try {
    apiInstance.deleteInvestigation(investigationLocator);
} catch (ApiException e) {
    System.err.println("Exception when calling InvestigationApi#deleteInvestigation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **investigationLocator** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getAllInvestigations"></a>
# **getAllInvestigations**
> Investigations getAllInvestigations(locator, fields)

Get all investigations.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.InvestigationApi;


InvestigationApi apiInstance = new InvestigationApi();
String locator = "locator_example"; // String | 
String fields = "fields_example"; // String | 
try {
    Investigations result = apiInstance.getAllInvestigations(locator, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InvestigationApi#getAllInvestigations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **locator** | **String**|  | [optional]
 **fields** | **String**|  | [optional]

### Return type

[**Investigations**](Investigations.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getInvestigation"></a>
# **getInvestigation**
> Investigation getInvestigation(investigationLocator, fields)

Get investigation matching the locator.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.InvestigationApi;


InvestigationApi apiInstance = new InvestigationApi();
String investigationLocator = "investigationLocator_example"; // String | 
String fields = "fields_example"; // String | 
try {
    Investigation result = apiInstance.getInvestigation(investigationLocator, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InvestigationApi#getInvestigation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **investigationLocator** | **String**|  |
 **fields** | **String**|  | [optional]

### Return type

[**Investigation**](Investigation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="replaceInvestigation"></a>
# **replaceInvestigation**
> Investigation replaceInvestigation(investigationLocator, body, fields)

Update investigation matching the locator.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.InvestigationApi;


InvestigationApi apiInstance = new InvestigationApi();
String investigationLocator = "investigationLocator_example"; // String | 
Investigation body = new Investigation(); // Investigation | 
String fields = "fields_example"; // String | 
try {
    Investigation result = apiInstance.replaceInvestigation(investigationLocator, body, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InvestigationApi#replaceInvestigation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **investigationLocator** | **String**|  |
 **body** | [**Investigation**](Investigation.md)|  | [optional]
 **fields** | **String**|  | [optional]

### Return type

[**Investigation**](Investigation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

