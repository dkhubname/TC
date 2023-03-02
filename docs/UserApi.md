# UserApi

All URIs are relative to *https://localhost:8111*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addRoleToUser**](UserApi.md#addRoleToUser) | **POST** /app/rest/users/{userLocator}/roles | Add a role to the matching user.
[**addRoleToUserAtScope**](UserApi.md#addRoleToUserAtScope) | **PUT** /app/rest/users/{userLocator}/roles/{roleId}/{scope} | Add a role with the specific scope to the matching user.
[**addUser**](UserApi.md#addUser) | **POST** /app/rest/users | Create a new user.
[**addUserToken**](UserApi.md#addUserToken) | **POST** /app/rest/users/{userLocator}/tokens | Create a new authentication token for the matching user.
[**deleteUser**](UserApi.md#deleteUser) | **DELETE** /app/rest/users/{userLocator} | Delete user matching the locator.
[**deleteUserField**](UserApi.md#deleteUserField) | **DELETE** /app/rest/users/{userLocator}/{field} | Remove a property of the matching user.
[**deleteUserToken**](UserApi.md#deleteUserToken) | **DELETE** /app/rest/users/{userLocator}/tokens/{name} | Remove an authentication token from the matching user.
[**getAllUserGroups**](UserApi.md#getAllUserGroups) | **GET** /app/rest/users/{userLocator}/groups | Get all groups of the matching user.
[**getAllUserRoles**](UserApi.md#getAllUserRoles) | **GET** /app/rest/users/{userLocator}/roles | Get all user roles of the matching user.
[**getAllUsers**](UserApi.md#getAllUsers) | **GET** /app/rest/users | Get all users.
[**getUser**](UserApi.md#getUser) | **GET** /app/rest/users/{userLocator} | Get user matching the locator.
[**getUserField**](UserApi.md#getUserField) | **GET** /app/rest/users/{userLocator}/{field} | Get a field of the matching user.
[**getUserGroup**](UserApi.md#getUserGroup) | **GET** /app/rest/users/{userLocator}/groups/{groupLocator} | Get a user group of the matching user.
[**getUserPermissions**](UserApi.md#getUserPermissions) | **GET** /app/rest/users/{userLocator}/permissions | Get all permissions effective for the matching user.
[**getUserProperties**](UserApi.md#getUserProperties) | **GET** /app/rest/users/{userLocator}/properties | Get all properties of the matching user.
[**getUserProperty**](UserApi.md#getUserProperty) | **GET** /app/rest/users/{userLocator}/properties/{name} | Get a property of the matching user.
[**getUserRolesAtScope**](UserApi.md#getUserRolesAtScope) | **GET** /app/rest/users/{userLocator}/roles/{roleId}/{scope} | Get a user role with the specific scope from the matching user.
[**getUserTokens**](UserApi.md#getUserTokens) | **GET** /app/rest/users/{userLocator}/tokens | Get all authentication tokens of the matching user.
[**removeUserFromGroup**](UserApi.md#removeUserFromGroup) | **DELETE** /app/rest/users/{userLocator}/groups/{groupLocator} | Remove the matching user from the specific group.
[**removeUserProperty**](UserApi.md#removeUserProperty) | **DELETE** /app/rest/users/{userLocator}/properties/{name} | Remove a property of the matching user.
[**removeUserRememberMe**](UserApi.md#removeUserRememberMe) | **DELETE** /app/rest/users/{userLocator}/debug/rememberMe | Remove the RememberMe data of the matching user.
[**removeUserRoleAtScope**](UserApi.md#removeUserRoleAtScope) | **DELETE** /app/rest/users/{userLocator}/roles/{roleId}/{scope} | Remove a role with the specific scope from the matching user.
[**replaceUser**](UserApi.md#replaceUser) | **PUT** /app/rest/users/{userLocator} | Update user matching the locator.
[**setUserField**](UserApi.md#setUserField) | **PUT** /app/rest/users/{userLocator}/{field} | Update a field of the matching user.
[**setUserGroups**](UserApi.md#setUserGroups) | **PUT** /app/rest/users/{userLocator}/groups | Update groups of the matching user.
[**setUserProperty**](UserApi.md#setUserProperty) | **PUT** /app/rest/users/{userLocator}/properties/{name} | Update a property of the matching user.
[**setUserRoles**](UserApi.md#setUserRoles) | **PUT** /app/rest/users/{userLocator}/roles | Update user roles of the matching user.


<a name="addRoleToUser"></a>
# **addRoleToUser**
> Role addRoleToUser(userLocator, body)

Add a role to the matching user.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserApi;


UserApi apiInstance = new UserApi();
String userLocator = "userLocator_example"; // String | 
Role body = new Role(); // Role | 
try {
    Role result = apiInstance.addRoleToUser(userLocator, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#addRoleToUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userLocator** | **String**|  |
 **body** | [**Role**](Role.md)|  | [optional]

### Return type

[**Role**](Role.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="addRoleToUserAtScope"></a>
# **addRoleToUserAtScope**
> Role addRoleToUserAtScope(userLocator, roleId, scope)

Add a role with the specific scope to the matching user.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserApi;


UserApi apiInstance = new UserApi();
String userLocator = "userLocator_example"; // String | 
String roleId = "roleId_example"; // String | 
String scope = "scope_example"; // String | 
try {
    Role result = apiInstance.addRoleToUserAtScope(userLocator, roleId, scope);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#addRoleToUserAtScope");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userLocator** | **String**|  |
 **roleId** | **String**|  |
 **scope** | **String**|  |

### Return type

[**Role**](Role.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="addUser"></a>
# **addUser**
> User addUser(body, fields)

Create a new user.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserApi;


UserApi apiInstance = new UserApi();
User body = new User(); // User | 
String fields = "fields_example"; // String | 
try {
    User result = apiInstance.addUser(body, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#addUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**User**](User.md)|  | [optional]
 **fields** | **String**|  | [optional]

### Return type

[**User**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="addUserToken"></a>
# **addUserToken**
> Token addUserToken(userLocator, body, fields)

Create a new authentication token for the matching user.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserApi;


UserApi apiInstance = new UserApi();
String userLocator = "userLocator_example"; // String | 
Token body = new Token(); // Token | 
String fields = "fields_example"; // String | 
try {
    Token result = apiInstance.addUserToken(userLocator, body, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#addUserToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userLocator** | **String**|  |
 **body** | [**Token**](Token.md)|  | [optional]
 **fields** | **String**|  | [optional]

### Return type

[**Token**](Token.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="deleteUser"></a>
# **deleteUser**
> deleteUser(userLocator)

Delete user matching the locator.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserApi;


UserApi apiInstance = new UserApi();
String userLocator = "userLocator_example"; // String | 
try {
    apiInstance.deleteUser(userLocator);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#deleteUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userLocator** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteUserField"></a>
# **deleteUserField**
> deleteUserField(userLocator, field)

Remove a property of the matching user.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserApi;


UserApi apiInstance = new UserApi();
String userLocator = "userLocator_example"; // String | 
String field = "field_example"; // String | 
try {
    apiInstance.deleteUserField(userLocator, field);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#deleteUserField");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userLocator** | **String**|  |
 **field** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteUserToken"></a>
# **deleteUserToken**
> deleteUserToken(userLocator, name)

Remove an authentication token from the matching user.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserApi;


UserApi apiInstance = new UserApi();
String userLocator = "userLocator_example"; // String | 
String name = "name_example"; // String | 
try {
    apiInstance.deleteUserToken(userLocator, name);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#deleteUserToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userLocator** | **String**|  |
 **name** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getAllUserGroups"></a>
# **getAllUserGroups**
> Groups getAllUserGroups(userLocator, fields)

Get all groups of the matching user.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserApi;


UserApi apiInstance = new UserApi();
String userLocator = "userLocator_example"; // String | 
String fields = "fields_example"; // String | 
try {
    Groups result = apiInstance.getAllUserGroups(userLocator, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#getAllUserGroups");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userLocator** | **String**|  |
 **fields** | **String**|  | [optional]

### Return type

[**Groups**](Groups.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getAllUserRoles"></a>
# **getAllUserRoles**
> Roles getAllUserRoles(userLocator)

Get all user roles of the matching user.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserApi;


UserApi apiInstance = new UserApi();
String userLocator = "userLocator_example"; // String | 
try {
    Roles result = apiInstance.getAllUserRoles(userLocator);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#getAllUserRoles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userLocator** | **String**|  |

### Return type

[**Roles**](Roles.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getAllUsers"></a>
# **getAllUsers**
> Users getAllUsers(locator, fields)

Get all users.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserApi;


UserApi apiInstance = new UserApi();
String locator = "locator_example"; // String | 
String fields = "fields_example"; // String | 
try {
    Users result = apiInstance.getAllUsers(locator, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#getAllUsers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **locator** | **String**|  | [optional]
 **fields** | **String**|  | [optional]

### Return type

[**Users**](Users.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getUser"></a>
# **getUser**
> User getUser(userLocator, fields)

Get user matching the locator.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserApi;


UserApi apiInstance = new UserApi();
String userLocator = "userLocator_example"; // String | 
String fields = "fields_example"; // String | 
try {
    User result = apiInstance.getUser(userLocator, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#getUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userLocator** | **String**|  |
 **fields** | **String**|  | [optional]

### Return type

[**User**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getUserField"></a>
# **getUserField**
> String getUserField(userLocator, field)

Get a field of the matching user.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserApi;


UserApi apiInstance = new UserApi();
String userLocator = "userLocator_example"; // String | 
String field = "field_example"; // String | 
try {
    String result = apiInstance.getUserField(userLocator, field);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#getUserField");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userLocator** | **String**|  |
 **field** | **String**|  |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

<a name="getUserGroup"></a>
# **getUserGroup**
> Group getUserGroup(userLocator, groupLocator, fields)

Get a user group of the matching user.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserApi;


UserApi apiInstance = new UserApi();
String userLocator = "userLocator_example"; // String | 
String groupLocator = "groupLocator_example"; // String | 
String fields = "fields_example"; // String | 
try {
    Group result = apiInstance.getUserGroup(userLocator, groupLocator, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#getUserGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userLocator** | **String**|  |
 **groupLocator** | **String**|  |
 **fields** | **String**|  | [optional]

### Return type

[**Group**](Group.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getUserPermissions"></a>
# **getUserPermissions**
> PermissionAssignments getUserPermissions(userLocator, locator, fields)

Get all permissions effective for the matching user.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserApi;


UserApi apiInstance = new UserApi();
String userLocator = "userLocator_example"; // String | 
String locator = "locator_example"; // String | 
String fields = "fields_example"; // String | 
try {
    PermissionAssignments result = apiInstance.getUserPermissions(userLocator, locator, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#getUserPermissions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userLocator** | **String**|  |
 **locator** | **String**|  | [optional]
 **fields** | **String**|  | [optional]

### Return type

[**PermissionAssignments**](PermissionAssignments.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getUserProperties"></a>
# **getUserProperties**
> Properties getUserProperties(userLocator, fields)

Get all properties of the matching user.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserApi;


UserApi apiInstance = new UserApi();
String userLocator = "userLocator_example"; // String | 
String fields = "fields_example"; // String | 
try {
    Properties result = apiInstance.getUserProperties(userLocator, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#getUserProperties");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userLocator** | **String**|  |
 **fields** | **String**|  | [optional]

### Return type

[**Properties**](Properties.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getUserProperty"></a>
# **getUserProperty**
> String getUserProperty(userLocator, name)

Get a property of the matching user.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserApi;


UserApi apiInstance = new UserApi();
String userLocator = "userLocator_example"; // String | 
String name = "name_example"; // String | 
try {
    String result = apiInstance.getUserProperty(userLocator, name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#getUserProperty");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userLocator** | **String**|  |
 **name** | **String**|  |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

<a name="getUserRolesAtScope"></a>
# **getUserRolesAtScope**
> Role getUserRolesAtScope(userLocator, roleId, scope)

Get a user role with the specific scope from the matching user.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserApi;


UserApi apiInstance = new UserApi();
String userLocator = "userLocator_example"; // String | 
String roleId = "roleId_example"; // String | 
String scope = "scope_example"; // String | 
try {
    Role result = apiInstance.getUserRolesAtScope(userLocator, roleId, scope);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#getUserRolesAtScope");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userLocator** | **String**|  |
 **roleId** | **String**|  |
 **scope** | **String**|  |

### Return type

[**Role**](Role.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getUserTokens"></a>
# **getUserTokens**
> Tokens getUserTokens(userLocator, fields)

Get all authentication tokens of the matching user.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserApi;


UserApi apiInstance = new UserApi();
String userLocator = "userLocator_example"; // String | 
String fields = "fields_example"; // String | 
try {
    Tokens result = apiInstance.getUserTokens(userLocator, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#getUserTokens");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userLocator** | **String**|  |
 **fields** | **String**|  | [optional]

### Return type

[**Tokens**](Tokens.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="removeUserFromGroup"></a>
# **removeUserFromGroup**
> removeUserFromGroup(userLocator, groupLocator, fields)

Remove the matching user from the specific group.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserApi;


UserApi apiInstance = new UserApi();
String userLocator = "userLocator_example"; // String | 
String groupLocator = "groupLocator_example"; // String | 
String fields = "fields_example"; // String | 
try {
    apiInstance.removeUserFromGroup(userLocator, groupLocator, fields);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#removeUserFromGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userLocator** | **String**|  |
 **groupLocator** | **String**|  |
 **fields** | **String**|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="removeUserProperty"></a>
# **removeUserProperty**
> removeUserProperty(userLocator, name)

Remove a property of the matching user.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserApi;


UserApi apiInstance = new UserApi();
String userLocator = "userLocator_example"; // String | 
String name = "name_example"; // String | 
try {
    apiInstance.removeUserProperty(userLocator, name);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#removeUserProperty");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userLocator** | **String**|  |
 **name** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="removeUserRememberMe"></a>
# **removeUserRememberMe**
> removeUserRememberMe(userLocator)

Remove the RememberMe data of the matching user.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserApi;


UserApi apiInstance = new UserApi();
String userLocator = "userLocator_example"; // String | 
try {
    apiInstance.removeUserRememberMe(userLocator);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#removeUserRememberMe");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userLocator** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

<a name="removeUserRoleAtScope"></a>
# **removeUserRoleAtScope**
> removeUserRoleAtScope(userLocator, roleId, scope)

Remove a role with the specific scope from the matching user.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserApi;


UserApi apiInstance = new UserApi();
String userLocator = "userLocator_example"; // String | 
String roleId = "roleId_example"; // String | 
String scope = "scope_example"; // String | 
try {
    apiInstance.removeUserRoleAtScope(userLocator, roleId, scope);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#removeUserRoleAtScope");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userLocator** | **String**|  |
 **roleId** | **String**|  |
 **scope** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="replaceUser"></a>
# **replaceUser**
> User replaceUser(userLocator, body, fields)

Update user matching the locator.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserApi;


UserApi apiInstance = new UserApi();
String userLocator = "userLocator_example"; // String | 
User body = new User(); // User | 
String fields = "fields_example"; // String | 
try {
    User result = apiInstance.replaceUser(userLocator, body, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#replaceUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userLocator** | **String**|  |
 **body** | [**User**](User.md)|  | [optional]
 **fields** | **String**|  | [optional]

### Return type

[**User**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="setUserField"></a>
# **setUserField**
> String setUserField(userLocator, field, body)

Update a field of the matching user.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserApi;


UserApi apiInstance = new UserApi();
String userLocator = "userLocator_example"; // String | 
String field = "field_example"; // String | 
String body = "body_example"; // String | 
try {
    String result = apiInstance.setUserField(userLocator, field, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#setUserField");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userLocator** | **String**|  |
 **field** | **String**|  |
 **body** | **String**|  | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: text/plain
 - **Accept**: text/plain

<a name="setUserGroups"></a>
# **setUserGroups**
> Groups setUserGroups(userLocator, body, fields)

Update groups of the matching user.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserApi;


UserApi apiInstance = new UserApi();
String userLocator = "userLocator_example"; // String | 
Groups body = new Groups(); // Groups | 
String fields = "fields_example"; // String | 
try {
    Groups result = apiInstance.setUserGroups(userLocator, body, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#setUserGroups");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userLocator** | **String**|  |
 **body** | [**Groups**](Groups.md)|  | [optional]
 **fields** | **String**|  | [optional]

### Return type

[**Groups**](Groups.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="setUserProperty"></a>
# **setUserProperty**
> String setUserProperty(userLocator, name, body)

Update a property of the matching user.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserApi;


UserApi apiInstance = new UserApi();
String userLocator = "userLocator_example"; // String | 
String name = "name_example"; // String | 
String body = "body_example"; // String | 
try {
    String result = apiInstance.setUserProperty(userLocator, name, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#setUserProperty");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userLocator** | **String**|  |
 **name** | **String**|  |
 **body** | **String**|  | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: text/plain
 - **Accept**: text/plain

<a name="setUserRoles"></a>
# **setUserRoles**
> Roles setUserRoles(userLocator, body)

Update user roles of the matching user.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserApi;


UserApi apiInstance = new UserApi();
String userLocator = "userLocator_example"; // String | 
Roles body = new Roles(); // Roles | 
try {
    Roles result = apiInstance.setUserRoles(userLocator, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#setUserRoles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userLocator** | **String**|  |
 **body** | [**Roles**](Roles.md)|  | [optional]

### Return type

[**Roles**](Roles.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

