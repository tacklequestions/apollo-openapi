# apollo_openapi.ReleaseManagementApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_releases_active_get**](ReleaseManagementApi.md#openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_releases_active_get) | **GET** /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/releases/active | 获取活跃发布（分页）
[**openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_releases_all_get**](ReleaseManagementApi.md#openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_releases_all_get) | **GET** /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/releases/all | 获取所有发布（分页）
[**openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_releases_latest_get**](ReleaseManagementApi.md#openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_releases_latest_get) | **GET** /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/releases/latest | 获取最新活跃发布
[**openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_releases_post**](ReleaseManagementApi.md#openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_releases_post) | **POST** /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/releases | 创建发布
[**openapi_v1_envs_env_releases_compare_get**](ReleaseManagementApi.md#openapi_v1_envs_env_releases_compare_get) | **GET** /openapi/v1/envs/{env}/releases/compare | 对比发布
[**openapi_v1_envs_env_releases_release_id_get**](ReleaseManagementApi.md#openapi_v1_envs_env_releases_release_id_get) | **GET** /openapi/v1/envs/{env}/releases/{releaseId} | 获取发布详情
[**openapi_v1_envs_env_releases_release_id_rollback_put**](ReleaseManagementApi.md#openapi_v1_envs_env_releases_release_id_rollback_put) | **PUT** /openapi/v1/envs/{env}/releases/{releaseId}/rollback | 回滚发布


# **openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_releases_active_get**
> List[OpenReleaseDTO] openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_releases_active_get(app_id, env, cluster_name, namespace_name, page, size)

获取活跃发布（分页）

GET /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/releases/active

### Example

* Api Key Authentication (ApiKeyAuth):

```python
import apollo_openapi
from apollo_openapi.models.open_release_dto import OpenReleaseDTO
from apollo_openapi.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = apollo_openapi.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: ApiKeyAuth
configuration.api_key['ApiKeyAuth'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ApiKeyAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with apollo_openapi.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = apollo_openapi.ReleaseManagementApi(api_client)
    app_id = 'app_id_example' # str | 
    env = 'env_example' # str | 
    cluster_name = 'cluster_name_example' # str | 
    namespace_name = 'namespace_name_example' # str | 
    page = 0 # int | 
    size = 5 # int | 

    try:
        # 获取活跃发布（分页）
        api_response = api_instance.openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_releases_active_get(app_id, env, cluster_name, namespace_name, page, size)
        print("The response of ReleaseManagementApi->openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_releases_active_get:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReleaseManagementApi->openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_releases_active_get: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **app_id** | **str**|  | 
 **env** | **str**|  | 
 **cluster_name** | **str**|  | 
 **namespace_name** | **str**|  | 
 **page** | **int**|  | 
 **size** | **int**|  | 

### Return type

[**List[OpenReleaseDTO]**](OpenReleaseDTO.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_releases_all_get**
> List[ListReleaseBO] openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_releases_all_get(app_id, env, cluster_name, namespace_name, page, size)

获取所有发布（分页）

GET /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/releases/all

### Example

* Api Key Authentication (ApiKeyAuth):

```python
import apollo_openapi
from apollo_openapi.models.list_release_bo import ListReleaseBO
from apollo_openapi.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = apollo_openapi.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: ApiKeyAuth
configuration.api_key['ApiKeyAuth'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ApiKeyAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with apollo_openapi.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = apollo_openapi.ReleaseManagementApi(api_client)
    app_id = 'app_id_example' # str | 
    env = 'env_example' # str | 
    cluster_name = 'cluster_name_example' # str | 
    namespace_name = 'namespace_name_example' # str | 
    page = 0 # int | 
    size = 5 # int | 

    try:
        # 获取所有发布（分页）
        api_response = api_instance.openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_releases_all_get(app_id, env, cluster_name, namespace_name, page, size)
        print("The response of ReleaseManagementApi->openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_releases_all_get:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReleaseManagementApi->openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_releases_all_get: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **app_id** | **str**|  | 
 **env** | **str**|  | 
 **cluster_name** | **str**|  | 
 **namespace_name** | **str**|  | 
 **page** | **int**|  | 
 **size** | **int**|  | 

### Return type

[**List[ListReleaseBO]**](ListReleaseBO.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_releases_latest_get**
> OpenReleaseDTO openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_releases_latest_get(app_id, env, cluster_name, namespace_name)

获取最新活跃发布



### Example

* Api Key Authentication (ApiKeyAuth):

```python
import apollo_openapi
from apollo_openapi.models.open_release_dto import OpenReleaseDTO
from apollo_openapi.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = apollo_openapi.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: ApiKeyAuth
configuration.api_key['ApiKeyAuth'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ApiKeyAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with apollo_openapi.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = apollo_openapi.ReleaseManagementApi(api_client)
    app_id = 'app_id_example' # str | 
    env = 'env_example' # str | 
    cluster_name = 'cluster_name_example' # str | 
    namespace_name = 'namespace_name_example' # str | 

    try:
        # 获取最新活跃发布
        api_response = api_instance.openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_releases_latest_get(app_id, env, cluster_name, namespace_name)
        print("The response of ReleaseManagementApi->openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_releases_latest_get:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReleaseManagementApi->openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_releases_latest_get: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **app_id** | **str**|  | 
 **env** | **str**|  | 
 **cluster_name** | **str**|  | 
 **namespace_name** | **str**|  | 

### Return type

[**OpenReleaseDTO**](OpenReleaseDTO.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | 成功获取最新活跃发布 |  -  |
**404** | 未找到活跃发布 |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_releases_post**
> OpenReleaseDTO openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_releases_post(app_id, env, cluster_name, namespace_name, namespace_release_dto)

创建发布



### Example

* Api Key Authentication (ApiKeyAuth):

```python
import apollo_openapi
from apollo_openapi.models.namespace_release_dto import NamespaceReleaseDTO
from apollo_openapi.models.open_release_dto import OpenReleaseDTO
from apollo_openapi.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = apollo_openapi.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: ApiKeyAuth
configuration.api_key['ApiKeyAuth'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ApiKeyAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with apollo_openapi.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = apollo_openapi.ReleaseManagementApi(api_client)
    app_id = 'app_id_example' # str | 
    env = 'env_example' # str | 
    cluster_name = 'cluster_name_example' # str | 
    namespace_name = 'namespace_name_example' # str | 
    namespace_release_dto = apollo_openapi.NamespaceReleaseDTO() # NamespaceReleaseDTO | 

    try:
        # 创建发布
        api_response = api_instance.openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_releases_post(app_id, env, cluster_name, namespace_name, namespace_release_dto)
        print("The response of ReleaseManagementApi->openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_releases_post:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReleaseManagementApi->openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_releases_post: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **app_id** | **str**|  | 
 **env** | **str**|  | 
 **cluster_name** | **str**|  | 
 **namespace_name** | **str**|  | 
 **namespace_release_dto** | [**NamespaceReleaseDTO**](NamespaceReleaseDTO.md)|  | 

### Return type

[**OpenReleaseDTO**](OpenReleaseDTO.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | 发布创建成功 |  -  |
**400** | 发布参数错误 |  -  |
**403** | 权限不足 |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **openapi_v1_envs_env_releases_compare_get**
> OpenapiV1EnvsEnvReleasesCompareGet200Response openapi_v1_envs_env_releases_compare_get(env, base_release_id, to_compare_release_id)

对比发布

GET /openapi/v1/envs/{env}/releases/compare

### Example

* Api Key Authentication (ApiKeyAuth):

```python
import apollo_openapi
from apollo_openapi.models.openapi_v1_envs_env_releases_compare_get200_response import OpenapiV1EnvsEnvReleasesCompareGet200Response
from apollo_openapi.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = apollo_openapi.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: ApiKeyAuth
configuration.api_key['ApiKeyAuth'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ApiKeyAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with apollo_openapi.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = apollo_openapi.ReleaseManagementApi(api_client)
    env = 'env_example' # str | 
    base_release_id = 56 # int | 
    to_compare_release_id = 56 # int | 

    try:
        # 对比发布
        api_response = api_instance.openapi_v1_envs_env_releases_compare_get(env, base_release_id, to_compare_release_id)
        print("The response of ReleaseManagementApi->openapi_v1_envs_env_releases_compare_get:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReleaseManagementApi->openapi_v1_envs_env_releases_compare_get: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **env** | **str**|  | 
 **base_release_id** | **int**|  | 
 **to_compare_release_id** | **int**|  | 

### Return type

[**OpenapiV1EnvsEnvReleasesCompareGet200Response**](OpenapiV1EnvsEnvReleasesCompareGet200Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **openapi_v1_envs_env_releases_release_id_get**
> OpenReleaseDTO openapi_v1_envs_env_releases_release_id_get(env, release_id)

获取发布详情

GET /openapi/v1/envs/{env}/releases/{releaseId}

### Example

* Api Key Authentication (ApiKeyAuth):

```python
import apollo_openapi
from apollo_openapi.models.open_release_dto import OpenReleaseDTO
from apollo_openapi.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = apollo_openapi.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: ApiKeyAuth
configuration.api_key['ApiKeyAuth'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ApiKeyAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with apollo_openapi.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = apollo_openapi.ReleaseManagementApi(api_client)
    env = 'env_example' # str | 
    release_id = 56 # int | 

    try:
        # 获取发布详情
        api_response = api_instance.openapi_v1_envs_env_releases_release_id_get(env, release_id)
        print("The response of ReleaseManagementApi->openapi_v1_envs_env_releases_release_id_get:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReleaseManagementApi->openapi_v1_envs_env_releases_release_id_get: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **env** | **str**|  | 
 **release_id** | **int**|  | 

### Return type

[**OpenReleaseDTO**](OpenReleaseDTO.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **openapi_v1_envs_env_releases_release_id_rollback_put**
> object openapi_v1_envs_env_releases_release_id_rollback_put(env, release_id, operator)

回滚发布



### Example

* Api Key Authentication (ApiKeyAuth):

```python
import apollo_openapi
from apollo_openapi.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = apollo_openapi.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: ApiKeyAuth
configuration.api_key['ApiKeyAuth'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ApiKeyAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with apollo_openapi.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = apollo_openapi.ReleaseManagementApi(api_client)
    env = 'env_example' # str | 
    release_id = 56 # int | 
    operator = 'operator_example' # str | 

    try:
        # 回滚发布
        api_response = api_instance.openapi_v1_envs_env_releases_release_id_rollback_put(env, release_id, operator)
        print("The response of ReleaseManagementApi->openapi_v1_envs_env_releases_release_id_rollback_put:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReleaseManagementApi->openapi_v1_envs_env_releases_release_id_rollback_put: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **env** | **str**|  | 
 **release_id** | **int**|  | 
 **operator** | **str**|  | 

### Return type

**object**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

