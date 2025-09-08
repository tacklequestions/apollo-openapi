# apollo_openapi.AppManagementApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**openapi_v1_apps_app_id_appnamespaces_namespace_name_delete**](AppManagementApi.md#openapi_v1_apps_app_id_appnamespaces_namespace_name_delete) | **DELETE** /openapi/v1/apps/{appId}/appnamespaces/{namespaceName} | 删除AppNamespace
[**openapi_v1_apps_app_id_delete**](AppManagementApi.md#openapi_v1_apps_app_id_delete) | **DELETE** /openapi/v1/apps/{appId} | 删除应用
[**openapi_v1_apps_app_id_env_clusters_get**](AppManagementApi.md#openapi_v1_apps_app_id_env_clusters_get) | **GET** /openapi/v1/apps/{appId}/env-clusters | 获取应用的环境集群信息
[**openapi_v1_apps_app_id_envs_env_clusters_cluster_name_namespaces_namespace_name_links_delete**](AppManagementApi.md#openapi_v1_apps_app_id_envs_env_clusters_cluster_name_namespaces_namespace_name_links_delete) | **DELETE** /openapi/v1/apps/{appId}/envs/{env}/clusters/{clusterName}/namespaces/{namespaceName}/links | 删除关联的Namespace
[**openapi_v1_apps_app_id_get**](AppManagementApi.md#openapi_v1_apps_app_id_get) | **GET** /openapi/v1/apps/{appId} | 获取单个应用信息
[**openapi_v1_apps_app_id_miss_envs_get**](AppManagementApi.md#openapi_v1_apps_app_id_miss_envs_get) | **GET** /openapi/v1/apps/{appId}/miss_envs | 查找缺失的环境
[**openapi_v1_apps_app_id_namespaces_releases_status_get**](AppManagementApi.md#openapi_v1_apps_app_id_namespaces_releases_status_get) | **GET** /openapi/v1/apps/{appId}/namespaces/releases/status | 获取应用下所有Namespace的发布状态
[**openapi_v1_apps_app_id_navtree_get**](AppManagementApi.md#openapi_v1_apps_app_id_navtree_get) | **GET** /openapi/v1/apps/{appId}/navtree | 获取应用导航树
[**openapi_v1_apps_app_id_put**](AppManagementApi.md#openapi_v1_apps_app_id_put) | **PUT** /openapi/v1/apps/{appId} | 更新应用
[**openapi_v1_apps_by_self_get**](AppManagementApi.md#openapi_v1_apps_by_self_get) | **GET** /openapi/v1/apps/by-self | 获取当前Consumer的应用列表（分页）
[**openapi_v1_apps_envs_env_post**](AppManagementApi.md#openapi_v1_apps_envs_env_post) | **POST** /openapi/v1/apps/envs/{env} | 在指定环境创建应用
[**openapi_v1_apps_get**](AppManagementApi.md#openapi_v1_apps_get) | **GET** /openapi/v1/apps | 获取当前Consumer授权的应用列表
[**openapi_v1_apps_post**](AppManagementApi.md#openapi_v1_apps_post) | **POST** /openapi/v1/apps | 创建应用


# **openapi_v1_apps_app_id_appnamespaces_namespace_name_delete**
> object openapi_v1_apps_app_id_appnamespaces_namespace_name_delete(app_id, namespace_name)

删除AppNamespace

DELETE /openapi/v1/apps/{appId}/appnamespaces/{namespaceName}

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
    api_instance = apollo_openapi.AppManagementApi(api_client)
    app_id = 'app_id_example' # str | 
    namespace_name = 'namespace_name_example' # str | 

    try:
        # 删除AppNamespace
        api_response = api_instance.openapi_v1_apps_app_id_appnamespaces_namespace_name_delete(app_id, namespace_name)
        print("The response of AppManagementApi->openapi_v1_apps_app_id_appnamespaces_namespace_name_delete:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AppManagementApi->openapi_v1_apps_app_id_appnamespaces_namespace_name_delete: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **app_id** | **str**|  | 
 **namespace_name** | **str**|  | 

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

# **openapi_v1_apps_app_id_delete**
> OpenapiV1AppsGet401Response openapi_v1_apps_app_id_delete(app_id)

删除应用

DELETE /openapi/v1/apps/{appId}

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
    api_instance = apollo_openapi.AppManagementApi(api_client)
    app_id = 'app_id_example' # str | 

    try:
        # 删除应用
        api_response = api_instance.openapi_v1_apps_app_id_delete(app_id)
        print("The response of AppManagementApi->openapi_v1_apps_app_id_delete:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AppManagementApi->openapi_v1_apps_app_id_delete: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **app_id** | **str**|  | 

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
**200** | 应用删除成功 |  -  |
**403** | 权限不足，需要超级管理员权限 |  -  |
**404** | 应用不存在 |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **openapi_v1_apps_app_id_env_clusters_get**
> List[OpenEnvClusterDTO] openapi_v1_apps_app_id_env_clusters_get(app_id)

获取应用的环境集群信息

GET /openapi/v1/apps/{appId}/env-clusters

### Example

* Api Key Authentication (ApiKeyAuth):

```python
import apollo_openapi
from apollo_openapi.models.open_env_cluster_dto import OpenEnvClusterDTO
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
    api_instance = apollo_openapi.AppManagementApi(api_client)
    app_id = 'app_id_example' # str | 

    try:
        # 获取应用的环境集群信息
        api_response = api_instance.openapi_v1_apps_app_id_env_clusters_get(app_id)
        print("The response of AppManagementApi->openapi_v1_apps_app_id_env_clusters_get:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AppManagementApi->openapi_v1_apps_app_id_env_clusters_get: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **app_id** | **str**|  | 

### Return type

[**List[OpenEnvClusterDTO]**](OpenEnvClusterDTO.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | 成功获取应用环境集群信息 |  -  |
**404** | 应用不存在 |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **openapi_v1_apps_app_id_envs_env_clusters_cluster_name_namespaces_namespace_name_links_delete**
> object openapi_v1_apps_app_id_envs_env_clusters_cluster_name_namespaces_namespace_name_links_delete(app_id, env, cluster_name, namespace_name)

删除关联的Namespace

DELETE /openapi/v1/apps/{appId}/envs/{env}/clusters/{clusterName}/namespaces/{namespaceName}/links

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
    api_instance = apollo_openapi.AppManagementApi(api_client)
    app_id = 'app_id_example' # str | 
    env = 'env_example' # str | 
    cluster_name = 'cluster_name_example' # str | 
    namespace_name = 'namespace_name_example' # str | 

    try:
        # 删除关联的Namespace
        api_response = api_instance.openapi_v1_apps_app_id_envs_env_clusters_cluster_name_namespaces_namespace_name_links_delete(app_id, env, cluster_name, namespace_name)
        print("The response of AppManagementApi->openapi_v1_apps_app_id_envs_env_clusters_cluster_name_namespaces_namespace_name_links_delete:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AppManagementApi->openapi_v1_apps_app_id_envs_env_clusters_cluster_name_namespaces_namespace_name_links_delete: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **app_id** | **str**|  | 
 **env** | **str**|  | 
 **cluster_name** | **str**|  | 
 **namespace_name** | **str**|  | 

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

# **openapi_v1_apps_app_id_get**
> OpenAppDTO openapi_v1_apps_app_id_get(app_id)

获取单个应用信息

GET /openapi/v1/apps/{appId}

### Example

* Api Key Authentication (ApiKeyAuth):

```python
import apollo_openapi
from apollo_openapi.models.open_app_dto import OpenAppDTO
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
    api_instance = apollo_openapi.AppManagementApi(api_client)
    app_id = 'app_id_example' # str | 

    try:
        # 获取单个应用信息
        api_response = api_instance.openapi_v1_apps_app_id_get(app_id)
        print("The response of AppManagementApi->openapi_v1_apps_app_id_get:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AppManagementApi->openapi_v1_apps_app_id_get: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **app_id** | **str**|  | 

### Return type

[**OpenAppDTO**](OpenAppDTO.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | 成功获取应用信息 |  -  |
**404** | 应用不存在 |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **openapi_v1_apps_app_id_miss_envs_get**
> List[str] openapi_v1_apps_app_id_miss_envs_get(app_id)

查找缺失的环境

GET /openapi/v1/apps/{appId}/miss_envs

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
    api_instance = apollo_openapi.AppManagementApi(api_client)
    app_id = 'app_id_example' # str | 

    try:
        # 查找缺失的环境
        api_response = api_instance.openapi_v1_apps_app_id_miss_envs_get(app_id)
        print("The response of AppManagementApi->openapi_v1_apps_app_id_miss_envs_get:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AppManagementApi->openapi_v1_apps_app_id_miss_envs_get: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **app_id** | **str**|  | 

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
**200** | 成功获取应用缺失的环境列表 |  -  |
**404** | 应用不存在 |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **openapi_v1_apps_app_id_namespaces_releases_status_get**
> Dict[str, Dict[str, bool]] openapi_v1_apps_app_id_namespaces_releases_status_get(app_id)

获取应用下所有Namespace的发布状态

GET /openapi/v1/apps/{appId}/namespaces/releases/status

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
    api_instance = apollo_openapi.AppManagementApi(api_client)
    app_id = 'app_id_example' # str | 

    try:
        # 获取应用下所有Namespace的发布状态
        api_response = api_instance.openapi_v1_apps_app_id_namespaces_releases_status_get(app_id)
        print("The response of AppManagementApi->openapi_v1_apps_app_id_namespaces_releases_status_get:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AppManagementApi->openapi_v1_apps_app_id_namespaces_releases_status_get: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **app_id** | **str**|  | 

### Return type

**Dict[str, Dict[str, bool]]**

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

# **openapi_v1_apps_app_id_navtree_get**
> List[EnvClusterInfo] openapi_v1_apps_app_id_navtree_get(app_id)

获取应用导航树

GET /openapi/v1/apps/{appId}/navtree

### Example

* Api Key Authentication (ApiKeyAuth):

```python
import apollo_openapi
from apollo_openapi.models.env_cluster_info import EnvClusterInfo
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
    api_instance = apollo_openapi.AppManagementApi(api_client)
    app_id = 'app_id_example' # str | 

    try:
        # 获取应用导航树
        api_response = api_instance.openapi_v1_apps_app_id_navtree_get(app_id)
        print("The response of AppManagementApi->openapi_v1_apps_app_id_navtree_get:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AppManagementApi->openapi_v1_apps_app_id_navtree_get: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **app_id** | **str**|  | 

### Return type

[**List[EnvClusterInfo]**](EnvClusterInfo.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | 成功获取应用导航树 |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **openapi_v1_apps_app_id_put**
> OpenAppDTO openapi_v1_apps_app_id_put(app_id, open_app_dto)

更新应用

PUT /openapi/v1/apps/{appId}

### Example

* Api Key Authentication (ApiKeyAuth):

```python
import apollo_openapi
from apollo_openapi.models.open_app_dto import OpenAppDTO
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
    api_instance = apollo_openapi.AppManagementApi(api_client)
    app_id = 'app_id_example' # str | 
    open_app_dto = apollo_openapi.OpenAppDTO() # OpenAppDTO | 

    try:
        # 更新应用
        api_response = api_instance.openapi_v1_apps_app_id_put(app_id, open_app_dto)
        print("The response of AppManagementApi->openapi_v1_apps_app_id_put:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AppManagementApi->openapi_v1_apps_app_id_put: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **app_id** | **str**|  | 
 **open_app_dto** | [**OpenAppDTO**](OpenAppDTO.md)|  | 

### Return type

[**OpenAppDTO**](OpenAppDTO.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |
**400** | 请求参数错误 |  -  |
**403** | 权限不足 |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **openapi_v1_apps_by_self_get**
> List[OpenAppDTO] openapi_v1_apps_by_self_get()

获取当前Consumer的应用列表（分页）

GET /openapi/v1/apps/by-self

### Example

* Api Key Authentication (ApiKeyAuth):

```python
import apollo_openapi
from apollo_openapi.models.open_app_dto import OpenAppDTO
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
    api_instance = apollo_openapi.AppManagementApi(api_client)

    try:
        # 获取当前Consumer的应用列表（分页）
        api_response = api_instance.openapi_v1_apps_by_self_get()
        print("The response of AppManagementApi->openapi_v1_apps_by_self_get:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AppManagementApi->openapi_v1_apps_by_self_get: %s\n" % e)
```



### Parameters

This endpoint does not need any parameter.

### Return type

[**List[OpenAppDTO]**](OpenAppDTO.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | 成功获取Consumer的应用列表 |  -  |
**401** | 未授权访问 |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **openapi_v1_apps_envs_env_post**
> OpenapiV1AppsGet401Response openapi_v1_apps_envs_env_post(env, open_app_dto)

在指定环境创建应用

POST /openapi/v1/apps/envs/{env}

### Example

* Api Key Authentication (ApiKeyAuth):

```python
import apollo_openapi
from apollo_openapi.models.open_app_dto import OpenAppDTO
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
    api_instance = apollo_openapi.AppManagementApi(api_client)
    env = 'env_example' # str | 
    open_app_dto = apollo_openapi.OpenAppDTO() # OpenAppDTO | 

    try:
        # 在指定环境创建应用
        api_response = api_instance.openapi_v1_apps_envs_env_post(env, open_app_dto)
        print("The response of AppManagementApi->openapi_v1_apps_envs_env_post:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AppManagementApi->openapi_v1_apps_envs_env_post: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **env** | **str**|  | 
 **open_app_dto** | [**OpenAppDTO**](OpenAppDTO.md)|  | 

### Return type

[**OpenapiV1AppsGet401Response**](OpenapiV1AppsGet401Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | 应用在指定环境创建成功 |  -  |
**400** | 请求参数错误 |  -  |
**403** | 权限不足 |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **openapi_v1_apps_get**
> List[OpenAppDTO] openapi_v1_apps_get(authorized=authorized)

获取当前Consumer授权的应用列表

GET /openapi/v1/apps?authorized=true

### Example

* Api Key Authentication (ApiKeyAuth):

```python
import apollo_openapi
from apollo_openapi.models.open_app_dto import OpenAppDTO
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
    api_instance = apollo_openapi.AppManagementApi(api_client)
    authorized = 'true' # str | 是否只返回授权的应用 (optional)

    try:
        # 获取当前Consumer授权的应用列表
        api_response = api_instance.openapi_v1_apps_get(authorized=authorized)
        print("The response of AppManagementApi->openapi_v1_apps_get:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AppManagementApi->openapi_v1_apps_get: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorized** | **str**| 是否只返回授权的应用 | [optional] 

### Return type

[**List[OpenAppDTO]**](OpenAppDTO.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | 成功获取授权应用列表 |  -  |
**401** | 未授权访问 |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **openapi_v1_apps_post**
> OpenAppDTO openapi_v1_apps_post(openapi_v1_apps_post_request)

创建应用

POST /openapi/v1/apps

### Example

* Api Key Authentication (ApiKeyAuth):

```python
import apollo_openapi
from apollo_openapi.models.open_app_dto import OpenAppDTO
from apollo_openapi.models.openapi_v1_apps_post_request import OpenapiV1AppsPostRequest
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
    api_instance = apollo_openapi.AppManagementApi(api_client)
    openapi_v1_apps_post_request = apollo_openapi.OpenapiV1AppsPostRequest() # OpenapiV1AppsPostRequest | 

    try:
        # 创建应用
        api_response = api_instance.openapi_v1_apps_post(openapi_v1_apps_post_request)
        print("The response of AppManagementApi->openapi_v1_apps_post:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AppManagementApi->openapi_v1_apps_post: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **openapi_v1_apps_post_request** | [**OpenapiV1AppsPostRequest**](OpenapiV1AppsPostRequest.md)|  | 

### Return type

[**OpenAppDTO**](OpenAppDTO.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | 应用创建成功 |  -  |
**400** | 请求参数错误 |  -  |
**403** | 权限不足 |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

