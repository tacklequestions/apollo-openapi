# apollo_openapi.NamespaceManagementApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**openapi_v1_appnamespaces_get**](NamespaceManagementApi.md#openapi_v1_appnamespaces_get) | **GET** /openapi/v1/appnamespaces | 获取所有公共AppNamespace
[**openapi_v1_apps_app_id_appnamespaces_get**](NamespaceManagementApi.md#openapi_v1_apps_app_id_appnamespaces_get) | **GET** /openapi/v1/apps/{appId}/appnamespaces | 获取指定应用的AppNamespace
[**openapi_v1_apps_app_id_appnamespaces_namespace_name_get**](NamespaceManagementApi.md#openapi_v1_apps_app_id_appnamespaces_namespace_name_get) | **GET** /openapi/v1/apps/{appId}/appnamespaces/{namespaceName} | 获取指定的AppNamespace
[**openapi_v1_apps_app_id_appnamespaces_post**](NamespaceManagementApi.md#openapi_v1_apps_app_id_appnamespaces_post) | **POST** /openapi/v1/apps/{appId}/appnamespaces | 创建AppNamespace
[**openapi_v1_apps_app_id_envs_env_clusters_cluster_name_namespaces_integrity_check_get**](NamespaceManagementApi.md#openapi_v1_apps_app_id_envs_env_clusters_cluster_name_namespaces_integrity_check_get) | **GET** /openapi/v1/apps/{appId}/envs/{env}/clusters/{clusterName}/namespaces/integrity-check | 检查缺失的Namespace
[**openapi_v1_apps_app_id_envs_env_clusters_cluster_name_namespaces_namespace_name_public_association_get**](NamespaceManagementApi.md#openapi_v1_apps_app_id_envs_env_clusters_cluster_name_namespaces_namespace_name_public_association_get) | **GET** /openapi/v1/apps/{appId}/envs/{env}/clusters/{clusterName}/namespaces/{namespaceName}/public-association | 获取关联的公共Namespace
[**openapi_v1_envs_env_appnamespaces_public_namespace_name_instances_get**](NamespaceManagementApi.md#openapi_v1_envs_env_appnamespaces_public_namespace_name_instances_get) | **GET** /openapi/v1/envs/{env}/appnamespaces/{publicNamespaceName}/instances | 获取公共AppNamespace的所有实例
[**openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_get**](NamespaceManagementApi.md#openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_get) | **GET** /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces | 获取指定集群下的所有Namespace
[**openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_lock_get**](NamespaceManagementApi.md#openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_lock_get) | **GET** /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/lock | 获取Namespace的锁状态


# **openapi_v1_appnamespaces_get**
> List[OpenAppNamespaceDTO] openapi_v1_appnamespaces_get(public_only)

获取所有公共AppNamespace

GET /openapi/v1/appnamespaces?public=true

### Example

* Api Key Authentication (ApiKeyAuth):

```python
import apollo_openapi
from apollo_openapi.models.open_app_namespace_dto import OpenAppNamespaceDTO
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
    api_instance = apollo_openapi.NamespaceManagementApi(api_client)
    public_only = false # bool | 

    try:
        # 获取所有公共AppNamespace
        api_response = api_instance.openapi_v1_appnamespaces_get(public_only)
        print("The response of NamespaceManagementApi->openapi_v1_appnamespaces_get:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling NamespaceManagementApi->openapi_v1_appnamespaces_get: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **public_only** | **bool**|  | 

### Return type

[**List[OpenAppNamespaceDTO]**](OpenAppNamespaceDTO.md)

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

# **openapi_v1_apps_app_id_appnamespaces_get**
> List[OpenAppNamespaceDTO] openapi_v1_apps_app_id_appnamespaces_get(app_id)

获取指定应用的AppNamespace

GET /openapi/v1/apps/{appId}/appnamespaces

### Example

* Api Key Authentication (ApiKeyAuth):

```python
import apollo_openapi
from apollo_openapi.models.open_app_namespace_dto import OpenAppNamespaceDTO
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
    api_instance = apollo_openapi.NamespaceManagementApi(api_client)
    app_id = 'app_id_example' # str | 

    try:
        # 获取指定应用的AppNamespace
        api_response = api_instance.openapi_v1_apps_app_id_appnamespaces_get(app_id)
        print("The response of NamespaceManagementApi->openapi_v1_apps_app_id_appnamespaces_get:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling NamespaceManagementApi->openapi_v1_apps_app_id_appnamespaces_get: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **app_id** | **str**|  | 

### Return type

[**List[OpenAppNamespaceDTO]**](OpenAppNamespaceDTO.md)

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

# **openapi_v1_apps_app_id_appnamespaces_namespace_name_get**
> OpenAppNamespaceDTO openapi_v1_apps_app_id_appnamespaces_namespace_name_get(app_id, namespace_name)

获取指定的AppNamespace

GET /openapi/v1/apps/{appId}/appnamespaces/{namespaceName}

### Example

* Api Key Authentication (ApiKeyAuth):

```python
import apollo_openapi
from apollo_openapi.models.open_app_namespace_dto import OpenAppNamespaceDTO
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
    api_instance = apollo_openapi.NamespaceManagementApi(api_client)
    app_id = 'app_id_example' # str | 
    namespace_name = 'namespace_name_example' # str | 

    try:
        # 获取指定的AppNamespace
        api_response = api_instance.openapi_v1_apps_app_id_appnamespaces_namespace_name_get(app_id, namespace_name)
        print("The response of NamespaceManagementApi->openapi_v1_apps_app_id_appnamespaces_namespace_name_get:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling NamespaceManagementApi->openapi_v1_apps_app_id_appnamespaces_namespace_name_get: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **app_id** | **str**|  | 
 **namespace_name** | **str**|  | 

### Return type

[**OpenAppNamespaceDTO**](OpenAppNamespaceDTO.md)

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

# **openapi_v1_apps_app_id_appnamespaces_post**
> OpenAppNamespaceDTO openapi_v1_apps_app_id_appnamespaces_post(app_id, open_app_namespace_dto)

创建AppNamespace

POST /openapi/v1/apps/{appId}/appnamespaces

### Example

* Api Key Authentication (ApiKeyAuth):

```python
import apollo_openapi
from apollo_openapi.models.open_app_namespace_dto import OpenAppNamespaceDTO
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
    api_instance = apollo_openapi.NamespaceManagementApi(api_client)
    app_id = 'app_id_example' # str | 
    open_app_namespace_dto = apollo_openapi.OpenAppNamespaceDTO() # OpenAppNamespaceDTO | 

    try:
        # 创建AppNamespace
        api_response = api_instance.openapi_v1_apps_app_id_appnamespaces_post(app_id, open_app_namespace_dto)
        print("The response of NamespaceManagementApi->openapi_v1_apps_app_id_appnamespaces_post:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling NamespaceManagementApi->openapi_v1_apps_app_id_appnamespaces_post: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **app_id** | **str**|  | 
 **open_app_namespace_dto** | [**OpenAppNamespaceDTO**](OpenAppNamespaceDTO.md)|  | 

### Return type

[**OpenAppNamespaceDTO**](OpenAppNamespaceDTO.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | AppNamespace创建成功 |  -  |
**400** | 请求参数错误 |  -  |
**403** | 权限不足 |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **openapi_v1_apps_app_id_envs_env_clusters_cluster_name_namespaces_integrity_check_get**
> List[str] openapi_v1_apps_app_id_envs_env_clusters_cluster_name_namespaces_integrity_check_get(app_id, env, cluster_name)

检查缺失的Namespace

GET /openapi/v1/apps/{appId}/envs/{env}/clusters/{clusterName}/namespaces/integrity-check

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
    api_instance = apollo_openapi.NamespaceManagementApi(api_client)
    app_id = 'app_id_example' # str | 
    env = 'env_example' # str | 
    cluster_name = 'cluster_name_example' # str | 

    try:
        # 检查缺失的Namespace
        api_response = api_instance.openapi_v1_apps_app_id_envs_env_clusters_cluster_name_namespaces_integrity_check_get(app_id, env, cluster_name)
        print("The response of NamespaceManagementApi->openapi_v1_apps_app_id_envs_env_clusters_cluster_name_namespaces_integrity_check_get:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling NamespaceManagementApi->openapi_v1_apps_app_id_envs_env_clusters_cluster_name_namespaces_integrity_check_get: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **app_id** | **str**|  | 
 **env** | **str**|  | 
 **cluster_name** | **str**|  | 

### Return type

**List[str]**

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

# **openapi_v1_apps_app_id_envs_env_clusters_cluster_name_namespaces_namespace_name_public_association_get**
> OpenNamespaceDTO openapi_v1_apps_app_id_envs_env_clusters_cluster_name_namespaces_namespace_name_public_association_get(app_id, env, cluster_name, namespace_name)

获取关联的公共Namespace

GET /openapi/v1/apps/{appId}/envs/{env}/clusters/{clusterName}/namespaces/{namespaceName}/public-association

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
    api_instance = apollo_openapi.NamespaceManagementApi(api_client)
    app_id = 'app_id_example' # str | 
    env = 'env_example' # str | 
    cluster_name = 'cluster_name_example' # str | 
    namespace_name = 'namespace_name_example' # str | 

    try:
        # 获取关联的公共Namespace
        api_response = api_instance.openapi_v1_apps_app_id_envs_env_clusters_cluster_name_namespaces_namespace_name_public_association_get(app_id, env, cluster_name, namespace_name)
        print("The response of NamespaceManagementApi->openapi_v1_apps_app_id_envs_env_clusters_cluster_name_namespaces_namespace_name_public_association_get:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling NamespaceManagementApi->openapi_v1_apps_app_id_envs_env_clusters_cluster_name_namespaces_namespace_name_public_association_get: %s\n" % e)
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **openapi_v1_envs_env_appnamespaces_public_namespace_name_instances_get**
> List[OpenNamespaceDTO] openapi_v1_envs_env_appnamespaces_public_namespace_name_instances_get(env, public_namespace_name, page, size)

获取公共AppNamespace的所有实例

GET /openapi/v1/envs/{env}/appnamespaces/{publicNamespaceName}/instances

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
    api_instance = apollo_openapi.NamespaceManagementApi(api_client)
    env = 'env_example' # str | 
    public_namespace_name = 'public_namespace_name_example' # str | 
    page = 0 # int | 
    size = 10 # int | 

    try:
        # 获取公共AppNamespace的所有实例
        api_response = api_instance.openapi_v1_envs_env_appnamespaces_public_namespace_name_instances_get(env, public_namespace_name, page, size)
        print("The response of NamespaceManagementApi->openapi_v1_envs_env_appnamespaces_public_namespace_name_instances_get:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling NamespaceManagementApi->openapi_v1_envs_env_appnamespaces_public_namespace_name_instances_get: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **env** | **str**|  | 
 **public_namespace_name** | **str**|  | 
 **page** | **int**|  | 
 **size** | **int**|  | 

### Return type

[**List[OpenNamespaceDTO]**](OpenNamespaceDTO.md)

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

# **openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_get**
> List[OpenNamespaceDTO] openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_get(app_id, env, cluster_name, fill_item_detail)

获取指定集群下的所有Namespace

GET /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces

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
    api_instance = apollo_openapi.NamespaceManagementApi(api_client)
    app_id = 'app_id_example' # str | 
    env = 'env_example' # str | 
    cluster_name = 'cluster_name_example' # str | 
    fill_item_detail = true # bool | 

    try:
        # 获取指定集群下的所有Namespace
        api_response = api_instance.openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_get(app_id, env, cluster_name, fill_item_detail)
        print("The response of NamespaceManagementApi->openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_get:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling NamespaceManagementApi->openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_get: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **app_id** | **str**|  | 
 **env** | **str**|  | 
 **cluster_name** | **str**|  | 
 **fill_item_detail** | **bool**|  | 

### Return type

[**List[OpenNamespaceDTO]**](OpenNamespaceDTO.md)

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

# **openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_lock_get**
> OpenNamespaceLockDTO openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_lock_get(app_id, env, cluster_name, namespace_name)

获取Namespace的锁状态

GET /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/lock

### Example

* Api Key Authentication (ApiKeyAuth):

```python
import apollo_openapi
from apollo_openapi.models.open_namespace_lock_dto import OpenNamespaceLockDTO
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
    api_instance = apollo_openapi.NamespaceManagementApi(api_client)
    app_id = 'app_id_example' # str | 
    env = 'env_example' # str | 
    cluster_name = 'cluster_name_example' # str | 
    namespace_name = 'namespace_name_example' # str | 

    try:
        # 获取Namespace的锁状态
        api_response = api_instance.openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_lock_get(app_id, env, cluster_name, namespace_name)
        print("The response of NamespaceManagementApi->openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_lock_get:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling NamespaceManagementApi->openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_lock_get: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **app_id** | **str**|  | 
 **env** | **str**|  | 
 **cluster_name** | **str**|  | 
 **namespace_name** | **str**|  | 

### Return type

[**OpenNamespaceLockDTO**](OpenNamespaceLockDTO.md)

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

