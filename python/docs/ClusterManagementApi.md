# apollo_openapi.ClusterManagementApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**openapi_v1_apps_app_id_clusters_cluster_name_get**](ClusterManagementApi.md#openapi_v1_apps_app_id_clusters_cluster_name_get) | **GET** /openapi/v1/apps/{appId}/clusters/{clusterName} | 获取指定集群信息
[**openapi_v1_apps_app_id_clusters_post**](ClusterManagementApi.md#openapi_v1_apps_app_id_clusters_post) | **POST** /openapi/v1/apps/{appId}/clusters | 创建集群
[**openapi_v1_envs_env_apps_app_id_clusters_cluster_name_delete**](ClusterManagementApi.md#openapi_v1_envs_env_apps_app_id_clusters_cluster_name_delete) | **DELETE** /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName} | 删除集群
[**openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_branches_get**](ClusterManagementApi.md#openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_branches_get) | **GET** /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/branches | 获取命名空间分支信息
[**openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_get**](ClusterManagementApi.md#openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_get) | **GET** /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName} | 获取指定的Namespace


# **openapi_v1_apps_app_id_clusters_cluster_name_get**
> OpenClusterDTO openapi_v1_apps_app_id_clusters_cluster_name_get(app_id, cluster_name)

获取指定集群信息

GET /openapi/v1/apps/{appId}/clusters/{clusterName}

### Example

* Api Key Authentication (ApiKeyAuth):

```python
import apollo_openapi
from apollo_openapi.models.open_cluster_dto import OpenClusterDTO
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
    api_instance = apollo_openapi.ClusterManagementApi(api_client)
    app_id = 'app_id_example' # str | 
    cluster_name = 'cluster_name_example' # str | 

    try:
        # 获取指定集群信息
        api_response = api_instance.openapi_v1_apps_app_id_clusters_cluster_name_get(app_id, cluster_name)
        print("The response of ClusterManagementApi->openapi_v1_apps_app_id_clusters_cluster_name_get:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ClusterManagementApi->openapi_v1_apps_app_id_clusters_cluster_name_get: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **app_id** | **str**|  | 
 **cluster_name** | **str**|  | 

### Return type

[**OpenClusterDTO**](OpenClusterDTO.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | 成功获取集群信息 |  -  |
**404** | 集群不存在 |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **openapi_v1_apps_app_id_clusters_post**
> OpenClusterDTO openapi_v1_apps_app_id_clusters_post(app_id, open_cluster_dto)

创建集群

POST /openapi/v1/apps/{appId}/clusters

### Example

* Api Key Authentication (ApiKeyAuth):

```python
import apollo_openapi
from apollo_openapi.models.open_cluster_dto import OpenClusterDTO
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
    api_instance = apollo_openapi.ClusterManagementApi(api_client)
    app_id = 'app_id_example' # str | 
    open_cluster_dto = apollo_openapi.OpenClusterDTO() # OpenClusterDTO | 

    try:
        # 创建集群
        api_response = api_instance.openapi_v1_apps_app_id_clusters_post(app_id, open_cluster_dto)
        print("The response of ClusterManagementApi->openapi_v1_apps_app_id_clusters_post:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ClusterManagementApi->openapi_v1_apps_app_id_clusters_post: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **app_id** | **str**|  | 
 **open_cluster_dto** | [**OpenClusterDTO**](OpenClusterDTO.md)|  | 

### Return type

[**OpenClusterDTO**](OpenClusterDTO.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | 集群创建成功 |  -  |
**400** | 请求参数错误 |  -  |
**403** | 权限不足 |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **openapi_v1_envs_env_apps_app_id_clusters_cluster_name_delete**
> OpenapiV1AppsGet401Response openapi_v1_envs_env_apps_app_id_clusters_cluster_name_delete(env, app_id, cluster_name)

删除集群

DELETE /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}

### Example

* Api Key Authentication (ApiKeyAuth):

```python
import apollo_openapi
from apollo_openapi.models.openapi_v1_apps_get401_response import OpenapiV1AppsGet401Response
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
    api_instance = apollo_openapi.ClusterManagementApi(api_client)
    env = 'env_example' # str | 
    app_id = 'app_id_example' # str | 
    cluster_name = 'cluster_name_example' # str | 

    try:
        # 删除集群
        api_response = api_instance.openapi_v1_envs_env_apps_app_id_clusters_cluster_name_delete(env, app_id, cluster_name)
        print("The response of ClusterManagementApi->openapi_v1_envs_env_apps_app_id_clusters_cluster_name_delete:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ClusterManagementApi->openapi_v1_envs_env_apps_app_id_clusters_cluster_name_delete: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **env** | **str**|  | 
 **app_id** | **str**|  | 
 **cluster_name** | **str**|  | 

### Return type

[**OpenapiV1AppsGet401Response**](OpenapiV1AppsGet401Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | 集群删除成功 |  -  |
**400** | 删除失败，集群可能包含配置 |  -  |
**403** | 权限不足 |  -  |
**404** | 集群不存在 |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_branches_get**
> OpenNamespaceDTO openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_branches_get(app_id, env, cluster_name, namespace_name)

获取命名空间分支信息

GET /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/branches

### Example

* Api Key Authentication (ApiKeyAuth):

```python
import apollo_openapi
from apollo_openapi.models.open_namespace_dto import OpenNamespaceDTO
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
    api_instance = apollo_openapi.ClusterManagementApi(api_client)
    app_id = 'app_id_example' # str | 
    env = 'env_example' # str | 
    cluster_name = 'cluster_name_example' # str | 
    namespace_name = 'namespace_name_example' # str | 

    try:
        # 获取命名空间分支信息
        api_response = api_instance.openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_branches_get(app_id, env, cluster_name, namespace_name)
        print("The response of ClusterManagementApi->openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_branches_get:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ClusterManagementApi->openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_branches_get: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **app_id** | **str**|  | 
 **env** | **str**|  | 
 **cluster_name** | **str**|  | 
 **namespace_name** | **str**|  | 

### Return type

[**OpenNamespaceDTO**](OpenNamespaceDTO.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |
**404** | 分支不存在 |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_get**
> OpenNamespaceDTO openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_get(app_id, env, cluster_name, namespace_name, fill_item_detail)

获取指定的Namespace

GET /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}

### Example

* Api Key Authentication (ApiKeyAuth):

```python
import apollo_openapi
from apollo_openapi.models.open_namespace_dto import OpenNamespaceDTO
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
    api_instance = apollo_openapi.ClusterManagementApi(api_client)
    app_id = 'app_id_example' # str | 
    env = 'env_example' # str | 
    cluster_name = 'cluster_name_example' # str | 
    namespace_name = 'namespace_name_example' # str | 
    fill_item_detail = true # bool | 

    try:
        # 获取指定的Namespace
        api_response = api_instance.openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_get(app_id, env, cluster_name, namespace_name, fill_item_detail)
        print("The response of ClusterManagementApi->openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_get:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ClusterManagementApi->openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_get: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **app_id** | **str**|  | 
 **env** | **str**|  | 
 **cluster_name** | **str**|  | 
 **namespace_name** | **str**|  | 
 **fill_item_detail** | **bool**|  | 

### Return type

[**OpenNamespaceDTO**](OpenNamespaceDTO.md)

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

