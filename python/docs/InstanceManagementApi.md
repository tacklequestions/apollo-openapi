# apollo_openapi.InstanceManagementApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**openapi_v1_apps_app_id_clusters_cluster_name_namespaces_namespace_name_instances_get**](InstanceManagementApi.md#openapi_v1_apps_app_id_clusters_cluster_name_namespaces_namespace_name_instances_get) | **GET** /openapi/v1/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/instances | 获取命名空间下的实例数量
[**openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_instances_get**](InstanceManagementApi.md#openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_instances_get) | **GET** /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/instances | 查询不在指定发布版本中的实例
[**openapi_v1_envs_env_releases_release_id_instances_get**](InstanceManagementApi.md#openapi_v1_envs_env_releases_release_id_instances_get) | **GET** /openapi/v1/envs/{env}/releases/{releaseId}/instances | 根据发布版本查询实例（支持分页）


# **openapi_v1_apps_app_id_clusters_cluster_name_namespaces_namespace_name_instances_get**
> int openapi_v1_apps_app_id_clusters_cluster_name_namespaces_namespace_name_instances_get(app_id, cluster_name, namespace_name)

获取命名空间下的实例数量

GET /openapi/v1/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/instances

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
    api_instance = apollo_openapi.InstanceManagementApi(api_client)
    app_id = 'app_id_example' # str | 
    cluster_name = 'cluster_name_example' # str | 
    namespace_name = 'namespace_name_example' # str | 

    try:
        # 获取命名空间下的实例数量
        api_response = api_instance.openapi_v1_apps_app_id_clusters_cluster_name_namespaces_namespace_name_instances_get(app_id, cluster_name, namespace_name)
        print("The response of InstanceManagementApi->openapi_v1_apps_app_id_clusters_cluster_name_namespaces_namespace_name_instances_get:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling InstanceManagementApi->openapi_v1_apps_app_id_clusters_cluster_name_namespaces_namespace_name_instances_get: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **app_id** | **str**|  | 
 **cluster_name** | **str**|  | 
 **namespace_name** | **str**|  | 

### Return type

**int**

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

# **openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_instances_get**
> List[OpenInstanceDTO] openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_instances_get(env, app_id, cluster_name, namespace_name, exclude_releases=exclude_releases)

查询不在指定发布版本中的实例

GET /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/instances?excludeReleases=1,2,3

### Example

* Api Key Authentication (ApiKeyAuth):

```python
import apollo_openapi
from apollo_openapi.models.open_instance_dto import OpenInstanceDTO
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
    api_instance = apollo_openapi.InstanceManagementApi(api_client)
    env = 'env_example' # str | 
    app_id = 'app_id_example' # str | 
    cluster_name = 'cluster_name_example' # str | 
    namespace_name = 'namespace_name_example' # str | 
    exclude_releases = 'exclude_releases_example' # str | 排除的发布ID列表，用逗号分隔 (optional)

    try:
        # 查询不在指定发布版本中的实例
        api_response = api_instance.openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_instances_get(env, app_id, cluster_name, namespace_name, exclude_releases=exclude_releases)
        print("The response of InstanceManagementApi->openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_instances_get:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling InstanceManagementApi->openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_instances_get: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **env** | **str**|  | 
 **app_id** | **str**|  | 
 **cluster_name** | **str**|  | 
 **namespace_name** | **str**|  | 
 **exclude_releases** | **str**| 排除的发布ID列表，用逗号分隔 | [optional] 

### Return type

[**List[OpenInstanceDTO]**](OpenInstanceDTO.md)

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

# **openapi_v1_envs_env_releases_release_id_instances_get**
> OpenPageDTOOpenInstanceDTO openapi_v1_envs_env_releases_release_id_instances_get(env, release_id, page, size)

根据发布版本查询实例（支持分页）

GET /openapi/v1/envs/{env}/releases/{releaseId}/instances

### Example

* Api Key Authentication (ApiKeyAuth):

```python
import apollo_openapi
from apollo_openapi.models.open_page_dto_open_instance_dto import OpenPageDTOOpenInstanceDTO
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
    api_instance = apollo_openapi.InstanceManagementApi(api_client)
    env = 'env_example' # str | 
    release_id = 56 # int | 
    page = 0 # int | 
    size = 20 # int | 

    try:
        # 根据发布版本查询实例（支持分页）
        api_response = api_instance.openapi_v1_envs_env_releases_release_id_instances_get(env, release_id, page, size)
        print("The response of InstanceManagementApi->openapi_v1_envs_env_releases_release_id_instances_get:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling InstanceManagementApi->openapi_v1_envs_env_releases_release_id_instances_get: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **env** | **str**|  | 
 **release_id** | **int**|  | 
 **page** | **int**|  | 
 **size** | **int**|  | 

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
**200** |  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

