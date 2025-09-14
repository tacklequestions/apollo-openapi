# InstanceManagementApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**openapiV1AppsAppIdClustersClusterNameNamespacesNamespaceNameInstancesGet**](InstanceManagementApi.md#openapiV1AppsAppIdClustersClusterNameNamespacesNamespaceNameInstancesGet) | **GET** /openapi/v1/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/instances | 获取命名空间下的实例数量 |
| [**openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameInstancesGet**](InstanceManagementApi.md#openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameInstancesGet) | **GET** /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/instances | 查询不在指定发布版本中的实例 |
| [**openapiV1EnvsEnvReleasesReleaseIdInstancesGet**](InstanceManagementApi.md#openapiV1EnvsEnvReleasesReleaseIdInstancesGet) | **GET** /openapi/v1/envs/{env}/releases/{releaseId}/instances | 根据发布版本查询实例（支持分页） |


<a id="openapiV1AppsAppIdClustersClusterNameNamespacesNamespaceNameInstancesGet"></a>
# **openapiV1AppsAppIdClustersClusterNameNamespacesNamespaceNameInstancesGet**
> Integer openapiV1AppsAppIdClustersClusterNameNamespacesNamespaceNameInstancesGet(appId, clusterName, namespaceName)

获取命名空间下的实例数量

GET /openapi/v1/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/instances

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InstanceManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    InstanceManagementApi apiInstance = new InstanceManagementApi(defaultClient);
    String appId = "appId_example"; // String | 
    String clusterName = "clusterName_example"; // String | 
    String namespaceName = "namespaceName_example"; // String | 
    try {
      Integer result = apiInstance.openapiV1AppsAppIdClustersClusterNameNamespacesNamespaceNameInstancesGet(appId, clusterName, namespaceName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InstanceManagementApi#openapiV1AppsAppIdClustersClusterNameNamespacesNamespaceNameInstancesGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **appId** | **String**|  | |
| **clusterName** | **String**|  | |
| **namespaceName** | **String**|  | |

### Return type

**Integer**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a id="openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameInstancesGet"></a>
# **openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameInstancesGet**
> List&lt;OpenInstanceDTO&gt; openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameInstancesGet(env, appId, clusterName, namespaceName, excludeReleases)

查询不在指定发布版本中的实例

GET /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/instances?excludeReleases&#x3D;1,2,3

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InstanceManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    InstanceManagementApi apiInstance = new InstanceManagementApi(defaultClient);
    String env = "env_example"; // String | 
    String appId = "appId_example"; // String | 
    String clusterName = "clusterName_example"; // String | 
    String namespaceName = "namespaceName_example"; // String | 
    String excludeReleases = "excludeReleases_example"; // String | 排除的发布ID列表，用逗号分隔
    try {
      List<OpenInstanceDTO> result = apiInstance.openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameInstancesGet(env, appId, clusterName, namespaceName, excludeReleases);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InstanceManagementApi#openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameInstancesGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **env** | **String**|  | |
| **appId** | **String**|  | |
| **clusterName** | **String**|  | |
| **namespaceName** | **String**|  | |
| **excludeReleases** | **String**| 排除的发布ID列表，用逗号分隔 | [optional] |

### Return type

[**List&lt;OpenInstanceDTO&gt;**](OpenInstanceDTO.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a id="openapiV1EnvsEnvReleasesReleaseIdInstancesGet"></a>
# **openapiV1EnvsEnvReleasesReleaseIdInstancesGet**
> OpenPageDTOOpenInstanceDTO openapiV1EnvsEnvReleasesReleaseIdInstancesGet(env, releaseId, page, size)

根据发布版本查询实例（支持分页）

GET /openapi/v1/envs/{env}/releases/{releaseId}/instances

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InstanceManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    InstanceManagementApi apiInstance = new InstanceManagementApi(defaultClient);
    String env = "env_example"; // String | 
    Integer releaseId = 56; // Integer | 
    Integer page = 0; // Integer | 
    Integer size = 20; // Integer | 
    try {
      OpenPageDTOOpenInstanceDTO result = apiInstance.openapiV1EnvsEnvReleasesReleaseIdInstancesGet(env, releaseId, page, size);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InstanceManagementApi#openapiV1EnvsEnvReleasesReleaseIdInstancesGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **env** | **String**|  | |
| **releaseId** | **Integer**|  | |
| **page** | **Integer**|  | |
| **size** | **Integer**|  | |

### Return type

[**OpenPageDTOOpenInstanceDTO**](OpenPageDTOOpenInstanceDTO.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

