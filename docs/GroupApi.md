# GroupApi

All URIs are relative to *https://localhost:8111*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addGroup**](GroupApi.md#addGroup) | **POST** /app/rest/userGroups | Add a new user group.
[**addRoleAtScopeToGroup**](GroupApi.md#addRoleAtScopeToGroup) | **POST** /app/rest/userGroups/{groupLocator}/roles/{roleId}/{scope} | Add a role with the specific scope to the matching user group.
[**addRoleToGroup**](GroupApi.md#addRoleToGroup) | **POST** /app/rest/userGroups/{groupLocator}/roles | Add a role to the matching user group.
[**deleteGroup**](GroupApi.md#deleteGroup) | **DELETE** /app/rest/userGroups/{groupLocator} | Delete user group matching the locator.
[**getAllGroups**](GroupApi.md#getAllGroups) | **GET** /app/rest/userGroups | Get all user groups.
[**getGroupParentGroups**](GroupApi.md#getGroupParentGroups) | **GET** /app/rest/userGroups/{groupLocator}/parent-groups | Get parent groups of the matching user group.
[**getGroupProperties**](GroupApi.md#getGroupProperties) | **GET** /app/rest/userGroups/{groupLocator}/properties | Get properties of the matching user group.
[**getGroupProperty**](GroupApi.md#getGroupProperty) | **GET** /app/rest/userGroups/{groupLocator}/properties/{name} | Get a property of the matching user group.
[**getGroupRoleAtScope**](GroupApi.md#getGroupRoleAtScope) | **GET** /app/rest/userGroups/{groupLocator}/roles/{roleId}/{scope} | Get a role with the specific scope of the matching user group.
[**getGroupRoles**](GroupApi.md#getGroupRoles) | **GET** /app/rest/userGroups/{groupLocator}/roles | Get all roles of the matching user group.
[**getUserGroupOfGroup**](GroupApi.md#getUserGroupOfGroup) | **GET** /app/rest/userGroups/{groupLocator} | Get user group matching the locator.
[**removeGroupProperty**](GroupApi.md#removeGroupProperty) | **DELETE** /app/rest/userGroups/{groupLocator}/properties/{name} | Remove a property of the matching user group.
[**removeRoleAtScopeFromGroup**](GroupApi.md#removeRoleAtScopeFromGroup) | **DELETE** /app/rest/userGroups/{groupLocator}/roles/{roleId}/{scope} | Remove a role with the specific scope from the matching user group.
[**setGroupParentGroups**](GroupApi.md#setGroupParentGroups) | **PUT** /app/rest/userGroups/{groupLocator}/parent-groups | Update parent groups of the matching user group.
[**setGroupProperty**](GroupApi.md#setGroupProperty) | **PUT** /app/rest/userGroups/{groupLocator}/properties/{name} | Update a property of the matching user group.
[**setGroupRoles**](GroupApi.md#setGroupRoles) | **PUT** /app/rest/userGroups/{groupLocator}/roles | Update roles of the matching user group.


<a name="addGroup"></a>
# **addGroup**
> Group addGroup(body, fields)

Add a new user group.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.GroupApi;


GroupApi apiInstance = new GroupApi();
Group body = new Group(); // Group | 
String fields = "fields_example"; // String | 
try {
    Group result = apiInstance.addGroup(body, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupApi#addGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Group**](Group.md)|  | [optional]
 **fields** | **String**|  | [optional]

### Return type

[**Group**](Group.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="addRoleAtScopeToGroup"></a>
# **addRoleAtScopeToGroup**
> Role addRoleAtScopeToGroup(groupLocator, roleId, scope)

Add a role with the specific scope to the matching user group.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.GroupApi;


GroupApi apiInstance = new GroupApi();
String groupLocator = "groupLocator_example"; // String | 
String roleId = "roleId_example"; // String | 
String scope = "scope_example"; // String | 
try {
    Role result = apiInstance.addRoleAtScopeToGroup(groupLocator, roleId, scope);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupApi#addRoleAtScopeToGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupLocator** | **String**|  |
 **roleId** | **String**|  |
 **scope** | **String**|  |

### Return type

[**Role**](Role.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="addRoleToGroup"></a>
# **addRoleToGroup**
> Role addRoleToGroup(groupLocator, body)

Add a role to the matching user group.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.GroupApi;


GroupApi apiInstance = new GroupApi();
String groupLocator = "groupLocator_example"; // String | 
Role body = new Role(); // Role | 
try {
    Role result = apiInstance.addRoleToGroup(groupLocator, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupApi#addRoleToGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupLocator** | **String**|  |
 **body** | [**Role**](Role.md)|  | [optional]

### Return type

[**Role**](Role.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="deleteGroup"></a>
# **deleteGroup**
> deleteGroup(groupLocator)

Delete user group matching the locator.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.GroupApi;


GroupApi apiInstance = new GroupApi();
String groupLocator = "groupLocator_example"; // String | 
try {
    apiInstance.deleteGroup(groupLocator);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupApi#deleteGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupLocator** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getAllGroups"></a>
# **getAllGroups**
> Groups getAllGroups(fields)

Get all user groups.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.GroupApi;


GroupApi apiInstance = new GroupApi();
String fields = "fields_example"; // String | 
try {
    Groups result = apiInstance.getAllGroups(fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupApi#getAllGroups");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fields** | **String**|  | [optional]

### Return type

[**Groups**](Groups.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getGroupParentGroups"></a>
# **getGroupParentGroups**
> Groups getGroupParentGroups(groupLocator, fields)

Get parent groups of the matching user group.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.GroupApi;


GroupApi apiInstance = new GroupApi();
String groupLocator = "groupLocator_example"; // String | 
String fields = "fields_example"; // String | 
try {
    Groups result = apiInstance.getGroupParentGroups(groupLocator, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupApi#getGroupParentGroups");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupLocator** | **String**|  |
 **fields** | **String**|  | [optional]

### Return type

[**Groups**](Groups.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getGroupProperties"></a>
# **getGroupProperties**
> Properties getGroupProperties(groupLocator, fields)

Get properties of the matching user group.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.GroupApi;


GroupApi apiInstance = new GroupApi();
String groupLocator = "groupLocator_example"; // String | 
String fields = "fields_example"; // String | 
try {
    Properties result = apiInstance.getGroupProperties(groupLocator, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupApi#getGroupProperties");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupLocator** | **String**|  |
 **fields** | **String**|  | [optional]

### Return type

[**Properties**](Properties.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getGroupProperty"></a>
# **getGroupProperty**
> String getGroupProperty(groupLocator, name)

Get a property of the matching user group.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.GroupApi;


GroupApi apiInstance = new GroupApi();
String groupLocator = "groupLocator_example"; // String | 
String name = "name_example"; // String | 
try {
    String result = apiInstance.getGroupProperty(groupLocator, name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupApi#getGroupProperty");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupLocator** | **String**|  |
 **name** | **String**|  |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

<a name="getGroupRoleAtScope"></a>
# **getGroupRoleAtScope**
> Role getGroupRoleAtScope(groupLocator, roleId, scope)

Get a role with the specific scope of the matching user group.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.GroupApi;


GroupApi apiInstance = new GroupApi();
String groupLocator = "groupLocator_example"; // String | 
String roleId = "roleId_example"; // String | 
String scope = "scope_example"; // String | 
try {
    Role result = apiInstance.getGroupRoleAtScope(groupLocator, roleId, scope);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupApi#getGroupRoleAtScope");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupLocator** | **String**|  |
 **roleId** | **String**|  |
 **scope** | **String**|  |

### Return type

[**Role**](Role.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getGroupRoles"></a>
# **getGroupRoles**
> Roles getGroupRoles(groupLocator)

Get all roles of the matching user group.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.GroupApi;


GroupApi apiInstance = new GroupApi();
String groupLocator = "groupLocator_example"; // String | 
try {
    Roles result = apiInstance.getGroupRoles(groupLocator);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupApi#getGroupRoles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupLocator** | **String**|  |

### Return type

[**Roles**](Roles.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getUserGroupOfGroup"></a>
# **getUserGroupOfGroup**
> Group getUserGroupOfGroup(groupLocator, fields)

Get user group matching the locator.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.GroupApi;


GroupApi apiInstance = new GroupApi();
String groupLocator = "groupLocator_example"; // String | 
String fields = "fields_example"; // String | 
try {
    Group result = apiInstance.getUserGroupOfGroup(groupLocator, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupApi#getUserGroupOfGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupLocator** | **String**|  |
 **fields** | **String**|  | [optional]

### Return type

[**Group**](Group.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="removeGroupProperty"></a>
# **removeGroupProperty**
> removeGroupProperty(groupLocator, name)

Remove a property of the matching user group.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.GroupApi;


GroupApi apiInstance = new GroupApi();
String groupLocator = "groupLocator_example"; // String | 
String name = "name_example"; // String | 
try {
    apiInstance.removeGroupProperty(groupLocator, name);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupApi#removeGroupProperty");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupLocator** | **String**|  |
 **name** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="removeRoleAtScopeFromGroup"></a>
# **removeRoleAtScopeFromGroup**
> removeRoleAtScopeFromGroup(groupLocator, roleId, scope)

Remove a role with the specific scope from the matching user group.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.GroupApi;


GroupApi apiInstance = new GroupApi();
String groupLocator = "groupLocator_example"; // String | 
String roleId = "roleId_example"; // String | 
String scope = "scope_example"; // String | 
try {
    apiInstance.removeRoleAtScopeFromGroup(groupLocator, roleId, scope);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupApi#removeRoleAtScopeFromGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupLocator** | **String**|  |
 **roleId** | **String**|  |
 **scope** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="setGroupParentGroups"></a>
# **setGroupParentGroups**
> Groups setGroupParentGroups(groupLocator, body, fields)

Update parent groups of the matching user group.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.GroupApi;


GroupApi apiInstance = new GroupApi();
String groupLocator = "groupLocator_example"; // String | 
Groups body = new Groups(); // Groups | 
String fields = "fields_example"; // String | 
try {
    Groups result = apiInstance.setGroupParentGroups(groupLocator, body, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupApi#setGroupParentGroups");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupLocator** | **String**|  |
 **body** | [**Groups**](Groups.md)|  | [optional]
 **fields** | **String**|  | [optional]

### Return type

[**Groups**](Groups.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="setGroupProperty"></a>
# **setGroupProperty**
> String setGroupProperty(groupLocator, name, body)

Update a property of the matching user group.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.GroupApi;


GroupApi apiInstance = new GroupApi();
String groupLocator = "groupLocator_example"; // String | 
String name = "name_example"; // String | 
String body = "body_example"; // String | 
try {
    String result = apiInstance.setGroupProperty(groupLocator, name, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupApi#setGroupProperty");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupLocator** | **String**|  |
 **name** | **String**|  |
 **body** | **String**|  | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: text/plain
 - **Accept**: text/plain

<a name="setGroupRoles"></a>
# **setGroupRoles**
> Roles setGroupRoles(groupLocator, body)

Update roles of the matching user group.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.GroupApi;


GroupApi apiInstance = new GroupApi();
String groupLocator = "groupLocator_example"; // String | 
Roles body = new Roles(); // Roles | 
try {
    Roles result = apiInstance.setGroupRoles(groupLocator, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupApi#setGroupRoles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupLocator** | **String**|  |
 **body** | [**Roles**](Roles.md)|  | [optional]

### Return type

[**Roles**](Roles.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

