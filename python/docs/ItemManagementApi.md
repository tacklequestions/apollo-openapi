# apollo_openapi.ItemManagementApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_encoded_items_key_delete**](ItemManagementApi.md#openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_encoded_items_key_delete) | **DELETE** /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/encodedItems/{key} | 通过编码的key删除配置项
[**openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_encoded_items_key_get**](ItemManagementApi.md#openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_encoded_items_key_get) | **GET** /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/encodedItems/{key} | 通过查询参数获取配置项（支持编码的key）
[**openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_encoded_items_key_put**](ItemManagementApi.md#openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_encoded_items_key_put) | **PUT** /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/encodedItems/{key} | 通过编码的key更新配置项
[**openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_items_batch_update_put**](ItemManagementApi.md#openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_items_batch_update_put) | **PUT** /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/items:batchUpdate | 通过文本批量修改配置项
[**openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_items_compare_post**](ItemManagementApi.md#openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_items_compare_post) | **POST** /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/items:compare | 对比命名空间配置差异
[**openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_items_get**](ItemManagementApi.md#openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_items_get) | **GET** /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/items | 获取命名空间下的配置项列表
[**openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_items_key_delete**](ItemManagementApi.md#openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_items_key_delete) | **DELETE** /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/items/{key} | 删除配置项
[**openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_items_key_get**](ItemManagementApi.md#openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_items_key_get) | **GET** /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/items/{key} | 获取单个配置项
[**openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_items_key_put**](ItemManagementApi.md#openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_items_key_put) | **PUT** /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/items/{key} | 更新配置项
[**openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_items_post**](ItemManagementApi.md#openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_items_post) | **POST** /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/items | 创建新的配置项
[**openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_items_revert_post**](ItemManagementApi.md#openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_items_revert_post) | **POST** /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/items:revert | 撤销配置项更改
[**openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_items_sync_post**](ItemManagementApi.md#openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_items_sync_post) | **POST** /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/items:sync | 同步配置项到多个命名空间
[**openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_items_validate_post**](ItemManagementApi.md#openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_items_validate_post) | **POST** /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/items:validate | 验证配置文本语法


# **openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_encoded_items_key_delete**
> object openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_encoded_items_key_delete(app_id, env, cluster_name, namespace_name, key, operator)

通过编码的key删除配置项

DELETE /apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/encodedItems/{key}

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
    api_instance = apollo_openapi.ItemManagementApi(api_client)
    app_id = 'app_id_example' # str | 
    env = 'env_example' # str | 
    cluster_name = 'cluster_name_example' # str | 
    namespace_name = 'namespace_name_example' # str | 
    key = 'key_example' # str | 
    operator = 'operator_example' # str | 

    try:
        # 通过编码的key删除配置项
        api_response = api_instance.openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_encoded_items_key_delete(app_id, env, cluster_name, namespace_name, key, operator)
        print("The response of ItemManagementApi->openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_encoded_items_key_delete:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ItemManagementApi->openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_encoded_items_key_delete: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **app_id** | **str**|  | 
 **env** | **str**|  | 
 **cluster_name** | **str**|  | 
 **namespace_name** | **str**|  | 
 **key** | **str**|  | 
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

# **openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_encoded_items_key_get**
> OpenItemDTO openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_encoded_items_key_get(app_id, env, cluster_name, namespace_name, key)

通过查询参数获取配置项（支持编码的key）

GET /apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/items?key={key}&encoded={true|false}

### Example

* Api Key Authentication (ApiKeyAuth):

```python
import apollo_openapi
from apollo_openapi.models.open_item_dto import OpenItemDTO
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
    api_instance = apollo_openapi.ItemManagementApi(api_client)
    app_id = 'app_id_example' # str | 
    env = 'env_example' # str | 
    cluster_name = 'cluster_name_example' # str | 
    namespace_name = 'namespace_name_example' # str | 
    key = 'key_example' # str | 

    try:
        # 通过查询参数获取配置项（支持编码的key）
        api_response = api_instance.openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_encoded_items_key_get(app_id, env, cluster_name, namespace_name, key)
        print("The response of ItemManagementApi->openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_encoded_items_key_get:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ItemManagementApi->openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_encoded_items_key_get: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **app_id** | **str**|  | 
 **env** | **str**|  | 
 **cluster_name** | **str**|  | 
 **namespace_name** | **str**|  | 
 **key** | **str**|  | 

### Return type

[**OpenItemDTO**](OpenItemDTO.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | 成功获取配置项（支持编码key） |  -  |
**404** | 配置项不存在 |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_encoded_items_key_put**
> OpenapiV1AppsGet401Response openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_encoded_items_key_put(app_id, env, cluster_name, namespace_name, key, create_if_not_exists, open_item_dto)

通过编码的key更新配置项

PUT /apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/encodedItems/{key}

### Example

* Api Key Authentication (ApiKeyAuth):

```python
import apollo_openapi
from apollo_openapi.models.open_item_dto import OpenItemDTO
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
    api_instance = apollo_openapi.ItemManagementApi(api_client)
    app_id = 'app_id_example' # str | 
    env = 'env_example' # str | 
    cluster_name = 'cluster_name_example' # str | 
    namespace_name = 'namespace_name_example' # str | 
    key = 'key_example' # str | 
    create_if_not_exists = false # bool | 
    open_item_dto = apollo_openapi.OpenItemDTO() # OpenItemDTO | 

    try:
        # 通过编码的key更新配置项
        api_response = api_instance.openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_encoded_items_key_put(app_id, env, cluster_name, namespace_name, key, create_if_not_exists, open_item_dto)
        print("The response of ItemManagementApi->openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_encoded_items_key_put:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ItemManagementApi->openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_encoded_items_key_put: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **app_id** | **str**|  | 
 **env** | **str**|  | 
 **cluster_name** | **str**|  | 
 **namespace_name** | **str**|  | 
 **key** | **str**|  | 
 **create_if_not_exists** | **bool**|  | 
 **open_item_dto** | [**OpenItemDTO**](OpenItemDTO.md)|  | 

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
**200** | 配置项更新成功（编码key） |  -  |
**400** | 请求参数错误 |  -  |
**403** | 权限不足 |  -  |
**404** | 配置项不存在 |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_items_batch_update_put**
> OpenapiV1AppsGet401Response openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_items_batch_update_put(app_id, env, cluster_name, namespace_name, namespace_text_model)

通过文本批量修改配置项

PUT /apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/items:batchUpdate

### Example

* Api Key Authentication (ApiKeyAuth):

```python
import apollo_openapi
from apollo_openapi.models.namespace_text_model import NamespaceTextModel
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
    api_instance = apollo_openapi.ItemManagementApi(api_client)
    app_id = 'app_id_example' # str | 
    env = 'env_example' # str | 
    cluster_name = 'cluster_name_example' # str | 
    namespace_name = 'namespace_name_example' # str | 
    namespace_text_model = apollo_openapi.NamespaceTextModel() # NamespaceTextModel | 

    try:
        # 通过文本批量修改配置项
        api_response = api_instance.openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_items_batch_update_put(app_id, env, cluster_name, namespace_name, namespace_text_model)
        print("The response of ItemManagementApi->openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_items_batch_update_put:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ItemManagementApi->openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_items_batch_update_put: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **app_id** | **str**|  | 
 **env** | **str**|  | 
 **cluster_name** | **str**|  | 
 **namespace_name** | **str**|  | 
 **namespace_text_model** | [**NamespaceTextModel**](NamespaceTextModel.md)|  | 

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
**200** | 批量更新配置项成功 |  -  |
**400** | 请求参数错误 |  -  |
**403** | 权限不足 |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_items_compare_post**
> List[ListItemDiffs] openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_items_compare_post(app_id, env, cluster_name, namespace_name, namespace_sync_model)

对比命名空间配置差异

POST /apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/items:compare

### Example

* Api Key Authentication (ApiKeyAuth):

```python
import apollo_openapi
from apollo_openapi.models.list_item_diffs import ListItemDiffs
from apollo_openapi.models.namespace_sync_model import NamespaceSyncModel
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
    api_instance = apollo_openapi.ItemManagementApi(api_client)
    app_id = 'app_id_example' # str | 
    env = 'env_example' # str | 
    cluster_name = 'cluster_name_example' # str | 
    namespace_name = 'namespace_name_example' # str | 
    namespace_sync_model = apollo_openapi.NamespaceSyncModel() # NamespaceSyncModel | 

    try:
        # 对比命名空间配置差异
        api_response = api_instance.openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_items_compare_post(app_id, env, cluster_name, namespace_name, namespace_sync_model)
        print("The response of ItemManagementApi->openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_items_compare_post:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ItemManagementApi->openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_items_compare_post: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **app_id** | **str**|  | 
 **env** | **str**|  | 
 **cluster_name** | **str**|  | 
 **namespace_name** | **str**|  | 
 **namespace_sync_model** | [**NamespaceSyncModel**](NamespaceSyncModel.md)|  | 

### Return type

[**List[ListItemDiffs]**](ListItemDiffs.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | 成功对比命名空间配置差异 |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_items_get**
> OpenPageDTOOpenItemDTO openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_items_get(app_id, env, cluster_name, namespace_name, page, size)

获取命名空间下的配置项列表



### Example

* Api Key Authentication (ApiKeyAuth):

```python
import apollo_openapi
from apollo_openapi.models.open_page_dto_open_item_dto import OpenPageDTOOpenItemDTO
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
    api_instance = apollo_openapi.ItemManagementApi(api_client)
    app_id = 'app_id_example' # str | 
    env = 'env_example' # str | 
    cluster_name = 'cluster_name_example' # str | 
    namespace_name = 'namespace_name_example' # str | 
    page = 0 # int | 
    size = 50 # int | 

    try:
        # 获取命名空间下的配置项列表
        api_response = api_instance.openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_items_get(app_id, env, cluster_name, namespace_name, page, size)
        print("The response of ItemManagementApi->openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_items_get:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ItemManagementApi->openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_items_get: %s\n" % e)
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

[**OpenPageDTOOpenItemDTO**](OpenPageDTOOpenItemDTO.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | 成功获取配置项列表 |  -  |
**404** | 命名空间不存在 |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_items_key_delete**
> object openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_items_key_delete(app_id, env, cluster_name, namespace_name, key, operator)

删除配置项

DELETE /apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/items/{key}

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
    api_instance = apollo_openapi.ItemManagementApi(api_client)
    app_id = 'app_id_example' # str | 
    env = 'env_example' # str | 
    cluster_name = 'cluster_name_example' # str | 
    namespace_name = 'namespace_name_example' # str | 
    key = 'key_example' # str | 
    operator = 'operator_example' # str | 

    try:
        # 删除配置项
        api_response = api_instance.openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_items_key_delete(app_id, env, cluster_name, namespace_name, key, operator)
        print("The response of ItemManagementApi->openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_items_key_delete:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ItemManagementApi->openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_items_key_delete: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **app_id** | **str**|  | 
 **env** | **str**|  | 
 **cluster_name** | **str**|  | 
 **namespace_name** | **str**|  | 
 **key** | **str**|  | 
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

# **openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_items_key_get**
> OpenItemDTO openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_items_key_get(app_id, env, cluster_name, namespace_name, key)

获取单个配置项

GET /apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/items/{key}

### Example

* Api Key Authentication (ApiKeyAuth):

```python
import apollo_openapi
from apollo_openapi.models.open_item_dto import OpenItemDTO
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
    api_instance = apollo_openapi.ItemManagementApi(api_client)
    app_id = 'app_id_example' # str | 
    env = 'env_example' # str | 
    cluster_name = 'cluster_name_example' # str | 
    namespace_name = 'namespace_name_example' # str | 
    key = 'key_example' # str | 

    try:
        # 获取单个配置项
        api_response = api_instance.openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_items_key_get(app_id, env, cluster_name, namespace_name, key)
        print("The response of ItemManagementApi->openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_items_key_get:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ItemManagementApi->openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_items_key_get: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **app_id** | **str**|  | 
 **env** | **str**|  | 
 **cluster_name** | **str**|  | 
 **namespace_name** | **str**|  | 
 **key** | **str**|  | 

### Return type

[**OpenItemDTO**](OpenItemDTO.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | 成功获取配置项 |  -  |
**404** | 配置项不存在 |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_items_key_put**
> OpenapiV1AppsGet401Response openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_items_key_put(app_id, env, cluster_name, namespace_name, key, create_if_not_exists, open_item_dto)

更新配置项

PUT /apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/items/{key}

### Example

* Api Key Authentication (ApiKeyAuth):

```python
import apollo_openapi
from apollo_openapi.models.open_item_dto import OpenItemDTO
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
    api_instance = apollo_openapi.ItemManagementApi(api_client)
    app_id = 'app_id_example' # str | 
    env = 'env_example' # str | 
    cluster_name = 'cluster_name_example' # str | 
    namespace_name = 'namespace_name_example' # str | 
    key = 'key_example' # str | 
    create_if_not_exists = false # bool | 
    open_item_dto = apollo_openapi.OpenItemDTO() # OpenItemDTO | 

    try:
        # 更新配置项
        api_response = api_instance.openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_items_key_put(app_id, env, cluster_name, namespace_name, key, create_if_not_exists, open_item_dto)
        print("The response of ItemManagementApi->openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_items_key_put:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ItemManagementApi->openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_items_key_put: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **app_id** | **str**|  | 
 **env** | **str**|  | 
 **cluster_name** | **str**|  | 
 **namespace_name** | **str**|  | 
 **key** | **str**|  | 
 **create_if_not_exists** | **bool**|  | 
 **open_item_dto** | [**OpenItemDTO**](OpenItemDTO.md)|  | 

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
**200** | 配置项更新成功 |  -  |
**400** | 请求参数错误 |  -  |
**403** | 权限不足 |  -  |
**404** | 配置项不存在 |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_items_post**
> OpenItemDTO openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_items_post(app_id, env, cluster_name, namespace_name, open_item_dto)

创建新的配置项

POST /apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/items

### Example

* Api Key Authentication (ApiKeyAuth):

```python
import apollo_openapi
from apollo_openapi.models.open_item_dto import OpenItemDTO
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
    api_instance = apollo_openapi.ItemManagementApi(api_client)
    app_id = 'app_id_example' # str | 
    env = 'env_example' # str | 
    cluster_name = 'cluster_name_example' # str | 
    namespace_name = 'namespace_name_example' # str | 
    open_item_dto = apollo_openapi.OpenItemDTO() # OpenItemDTO | 

    try:
        # 创建新的配置项
        api_response = api_instance.openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_items_post(app_id, env, cluster_name, namespace_name, open_item_dto)
        print("The response of ItemManagementApi->openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_items_post:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ItemManagementApi->openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_items_post: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **app_id** | **str**|  | 
 **env** | **str**|  | 
 **cluster_name** | **str**|  | 
 **namespace_name** | **str**|  | 
 **open_item_dto** | [**OpenItemDTO**](OpenItemDTO.md)|  | 

### Return type

[**OpenItemDTO**](OpenItemDTO.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | 配置项创建成功 |  -  |
**400** | 请求参数错误 |  -  |
**403** | 权限不足 |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_items_revert_post**
> OpenapiV1AppsGet401Response openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_items_revert_post(app_id, env, cluster_name, namespace_name)

撤销配置项更改

POST /apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/items:revert

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
    api_instance = apollo_openapi.ItemManagementApi(api_client)
    app_id = 'app_id_example' # str | 
    env = 'env_example' # str | 
    cluster_name = 'cluster_name_example' # str | 
    namespace_name = 'namespace_name_example' # str | 

    try:
        # 撤销配置项更改
        api_response = api_instance.openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_items_revert_post(app_id, env, cluster_name, namespace_name)
        print("The response of ItemManagementApi->openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_items_revert_post:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ItemManagementApi->openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_items_revert_post: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **app_id** | **str**|  | 
 **env** | **str**|  | 
 **cluster_name** | **str**|  | 
 **namespace_name** | **str**|  | 

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
**200** | 配置项更改撤销成功 |  -  |
**400** | 请求参数错误 |  -  |
**403** | 权限不足 |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_items_sync_post**
> OpenapiV1AppsGet401Response openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_items_sync_post(app_id, env, cluster_name, namespace_name, namespace_sync_model)

同步配置项到多个命名空间

POST /apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/items:sync

### Example

* Api Key Authentication (ApiKeyAuth):

```python
import apollo_openapi
from apollo_openapi.models.namespace_sync_model import NamespaceSyncModel
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
    api_instance = apollo_openapi.ItemManagementApi(api_client)
    app_id = 'app_id_example' # str | 
    env = 'env_example' # str | 
    cluster_name = 'cluster_name_example' # str | 
    namespace_name = 'namespace_name_example' # str | 
    namespace_sync_model = apollo_openapi.NamespaceSyncModel() # NamespaceSyncModel | 

    try:
        # 同步配置项到多个命名空间
        api_response = api_instance.openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_items_sync_post(app_id, env, cluster_name, namespace_name, namespace_sync_model)
        print("The response of ItemManagementApi->openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_items_sync_post:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ItemManagementApi->openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_items_sync_post: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **app_id** | **str**|  | 
 **env** | **str**|  | 
 **cluster_name** | **str**|  | 
 **namespace_name** | **str**|  | 
 **namespace_sync_model** | [**NamespaceSyncModel**](NamespaceSyncModel.md)|  | 

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
**200** | 配置项同步成功 |  -  |
**400** | 请求参数错误 |  -  |
**403** | 权限不足 |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_items_validate_post**
> OpenapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameItemsValidatePost200Response openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_items_validate_post(app_id, env, cluster_name, namespace_name, namespace_text_model)

验证配置文本语法

POST /apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/items:validate

### Example

* Api Key Authentication (ApiKeyAuth):

```python
import apollo_openapi
from apollo_openapi.models.namespace_text_model import NamespaceTextModel
from apollo_openapi.models.openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_items_validate_post200_response import OpenapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameItemsValidatePost200Response
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
    api_instance = apollo_openapi.ItemManagementApi(api_client)
    app_id = 'app_id_example' # str | 
    env = 'env_example' # str | 
    cluster_name = 'cluster_name_example' # str | 
    namespace_name = 'namespace_name_example' # str | 
    namespace_text_model = apollo_openapi.NamespaceTextModel() # NamespaceTextModel | 

    try:
        # 验证配置文本语法
        api_response = api_instance.openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_items_validate_post(app_id, env, cluster_name, namespace_name, namespace_text_model)
        print("The response of ItemManagementApi->openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_items_validate_post:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ItemManagementApi->openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_items_validate_post: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **app_id** | **str**|  | 
 **env** | **str**|  | 
 **cluster_name** | **str**|  | 
 **namespace_name** | **str**|  | 
 **namespace_text_model** | [**NamespaceTextModel**](NamespaceTextModel.md)|  | 

### Return type

[**OpenapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameItemsValidatePost200Response**](OpenapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameItemsValidatePost200Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | 配置文本语法验证通过 |  -  |
**400** | 配置文本语法错误 |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

