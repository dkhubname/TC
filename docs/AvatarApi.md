# AvatarApi

All URIs are relative to *https://localhost:8111*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteAvatar**](AvatarApi.md#deleteAvatar) | **DELETE** /app/rest/avatars/{userLocator} | Delete a users avatar
[**getAvatar**](AvatarApi.md#getAvatar) | **GET** /app/rest/avatars/{userLocator}/{size}/avatar.png | Get a users avatar
[**getAvatarWithHash**](AvatarApi.md#getAvatarWithHash) | **GET** /app/rest/avatars/{userLocator}/{size}/avatar.{hash}.png | Get a users avatar
[**putAvatar**](AvatarApi.md#putAvatar) | **PUT** /app/rest/avatars/{userLocator} | Update a users avatar


<a name="deleteAvatar"></a>
# **deleteAvatar**
> deleteAvatar(userLocator)

Delete a users avatar



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AvatarApi;


AvatarApi apiInstance = new AvatarApi();
String userLocator = "userLocator_example"; // String | 
try {
    apiInstance.deleteAvatar(userLocator);
} catch (ApiException e) {
    System.err.println("Exception when calling AvatarApi#deleteAvatar");
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

<a name="getAvatar"></a>
# **getAvatar**
> getAvatar(userLocator, size)

Get a users avatar



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AvatarApi;


AvatarApi apiInstance = new AvatarApi();
String userLocator = "userLocator_example"; // String | 
Integer size = 56; // Integer | avatar's size
try {
    apiInstance.getAvatar(userLocator, size);
} catch (ApiException e) {
    System.err.println("Exception when calling AvatarApi#getAvatar");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userLocator** | **String**|  |
 **size** | **Integer**| avatar&#39;s size |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: image/png

<a name="getAvatarWithHash"></a>
# **getAvatarWithHash**
> getAvatarWithHash(userLocator, size, hash)

Get a users avatar



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AvatarApi;


AvatarApi apiInstance = new AvatarApi();
String userLocator = "userLocator_example"; // String | 
Integer size = 56; // Integer | avatar's size
String hash = "hash_example"; // String | 
try {
    apiInstance.getAvatarWithHash(userLocator, size, hash);
} catch (ApiException e) {
    System.err.println("Exception when calling AvatarApi#getAvatarWithHash");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userLocator** | **String**|  |
 **size** | **Integer**| avatar&#39;s size |
 **hash** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: image/png

<a name="putAvatar"></a>
# **putAvatar**
> putAvatar(userLocator, avatar)

Update a users avatar



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AvatarApi;


AvatarApi apiInstance = new AvatarApi();
String userLocator = "userLocator_example"; // String | 
File avatar = new File("/path/to/file.txt"); // File | 
try {
    apiInstance.putAvatar(userLocator, avatar);
} catch (ApiException e) {
    System.err.println("Exception when calling AvatarApi#putAvatar");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userLocator** | **String**|  |
 **avatar** | **File**|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: Not defined

