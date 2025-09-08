# apollo_openapi.NamespaceBranchManagementApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_branch_post**](NamespaceBranchManagementApi.md#openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_branch_post) | **POST** /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/branch | 创建命名空间分支
[**openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_branches_branch_name_delete**](NamespaceBranchManagementApi.md#openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_branches_branch_name_delete) | **DELETE** /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/branches/{branchName} | 删除命名空间分支
[**openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_branches_branch_name_gray_del_releases_post**](NamespaceBranchManagementApi.md#openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_branches_branch_name_gray_del_releases_post) | **POST** /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/branches/{branchName}/gray-del-releases | 创建灰度删除发布
[**openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_branches_branch_name_gray_rules_get**](NamespaceBranchManagementApi.md#openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_branches_branch_name_gray_rules_get) | **GET** /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/branches/{branchName}/gray-rules | 获取分支灰度发布规则
[**openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_branches_branch_name_gray_rules_put**](NamespaceBranchManagementApi.md#openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_branches_branch_name_gray_rules_put) | **PUT** /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/branches/{branchName}/gray-rules | 更新分支灰度发布规则
[**openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_branches_branch_name_items_get**](NamespaceBranchManagementApi.md#openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_branches_branch_name_items_get) | **GET** /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/branches/{branchName}/items | 获取分支下的配置项
[**openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_branches_branch_name_merge_post**](NamespaceBranchManagementApi.md#openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_branches_branch_name_merge_post) | **POST** /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/branches/{branchName}/merge | 合并分支
[**openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_branches_branch_name_patch**](NamespaceBranchManagementApi.md#openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_branches_branch_name_patch) | **PATCH** /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/branches/{branchName} | 合并分支到主分支
[**openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_branches_branch_name_releases_post**](NamespaceBranchManagementApi.md#openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_branches_branch_name_releases_post) | **POST** /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/branches/{branchName}/releases | 创建灰度发布


# **openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_branch_post**
> OpenNamespaceDTO openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_branch_post(app_id, env, cluster_name, namespace_name, operator)

创建命名空间分支

POST /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/branch

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
    api_instance = apollo_openapi.NamespaceBranchManagementApi(api_client)
    app_id = 'app_id_example' # str | 
    env = 'env_example' # str | 
    cluster_name = 'cluster_name_example' # str | 
    namespace_name = 'namespace_name_example' # str | 
    operator = 'operator_example' # str | 

    try:
        # 创建命名空间分支
        api_response = api_instance.openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_branch_post(app_id, env, cluster_name, namespace_name, operator)
        print("The response of NamespaceBranchManagementApi->openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_branch_post:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling NamespaceBranchManagementApi->openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_branch_post: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **app_id** | **str**|  | 
 **env** | **str**|  | 
 **cluster_name** | **str**|  | 
 **namespace_name** | **str**|  | 
 **operator** | **str**|  | 

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

# **openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_branches_branch_name_delete**
> object openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_branches_branch_name_delete(env, app_id, cluster_name, namespace_name, branch_name, operator)

删除命名空间分支

DELETE /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/branches/{branchName}

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
    api_instance = apollo_openapi.NamespaceBranchManagementApi(api_client)
    env = 'env_example' # str | 
    app_id = 'app_id_example' # str | 
    cluster_name = 'cluster_name_example' # str | 
    namespace_name = 'namespace_name_example' # str | 
    branch_name = 'branch_name_example' # str | 
    operator = 'operator_example' # str | 

    try:
        # 删除命名空间分支
        api_response = api_instance.openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_branches_branch_name_delete(env, app_id, cluster_name, namespace_name, branch_name, operator)
        print("The response of NamespaceBranchManagementApi->openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_branches_branch_name_delete:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling NamespaceBranchManagementApi->openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_branches_branch_name_delete: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **env** | **str**|  | 
 **app_id** | **str**|  | 
 **cluster_name** | **str**|  | 
 **namespace_name** | **str**|  | 
 **branch_name** | **str**|  | 
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

# **openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_branches_branch_name_gray_del_releases_post**
> OpenReleaseDTO openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_branches_branch_name_gray_del_releases_post(app_id, env, cluster_name, namespace_name, branch_name, namespace_gray_del_release_dto)

创建灰度删除发布



### Example

* Api Key Authentication (ApiKeyAuth):

```python
import apollo_openapi
from apollo_openapi.models.namespace_gray_del_release_dto import NamespaceGrayDelReleaseDTO
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
    api_instance = apollo_openapi.NamespaceBranchManagementApi(api_client)
    app_id = 'app_id_example' # str | 
    env = 'env_example' # str | 
    cluster_name = 'cluster_name_example' # str | 
    namespace_name = 'namespace_name_example' # str | 
    branch_name = 'branch_name_example' # str | 
    namespace_gray_del_release_dto = apollo_openapi.NamespaceGrayDelReleaseDTO() # NamespaceGrayDelReleaseDTO | 

    try:
        # 创建灰度删除发布
        api_response = api_instance.openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_branches_branch_name_gray_del_releases_post(app_id, env, cluster_name, namespace_name, branch_name, namespace_gray_del_release_dto)
        print("The response of NamespaceBranchManagementApi->openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_branches_branch_name_gray_del_releases_post:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling NamespaceBranchManagementApi->openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_branches_branch_name_gray_del_releases_post: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **app_id** | **str**|  | 
 **env** | **str**|  | 
 **cluster_name** | **str**|  | 
 **namespace_name** | **str**|  | 
 **branch_name** | **str**|  | 
 **namespace_gray_del_release_dto** | [**NamespaceGrayDelReleaseDTO**](NamespaceGrayDelReleaseDTO.md)|  | 

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
**200** |  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_branches_branch_name_gray_rules_get**
> OpenGrayReleaseRuleDTO openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_branches_branch_name_gray_rules_get(app_id, env, cluster_name, namespace_name, branch_name)

获取分支灰度发布规则

GET /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/branches/{branchName}/gray-rules

### Example

* Api Key Authentication (ApiKeyAuth):

```python
import apollo_openapi
from apollo_openapi.models.open_gray_release_rule_dto import OpenGrayReleaseRuleDTO
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
    api_instance = apollo_openapi.NamespaceBranchManagementApi(api_client)
    app_id = 'app_id_example' # str | 
    env = 'env_example' # str | 
    cluster_name = 'cluster_name_example' # str | 
    namespace_name = 'namespace_name_example' # str | 
    branch_name = 'branch_name_example' # str | 

    try:
        # 获取分支灰度发布规则
        api_response = api_instance.openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_branches_branch_name_gray_rules_get(app_id, env, cluster_name, namespace_name, branch_name)
        print("The response of NamespaceBranchManagementApi->openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_branches_branch_name_gray_rules_get:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling NamespaceBranchManagementApi->openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_branches_branch_name_gray_rules_get: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **app_id** | **str**|  | 
 **env** | **str**|  | 
 **cluster_name** | **str**|  | 
 **namespace_name** | **str**|  | 
 **branch_name** | **str**|  | 

### Return type

[**OpenGrayReleaseRuleDTO**](OpenGrayReleaseRuleDTO.md)

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

# **openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_branches_branch_name_gray_rules_put**
> object openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_branches_branch_name_gray_rules_put(app_id, env, cluster_name, namespace_name, branch_name, operator, open_gray_release_rule_dto)

更新分支灰度发布规则

PUT /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/branches/{branchName}/gray-rules

### Example

* Api Key Authentication (ApiKeyAuth):

```python
import apollo_openapi
from apollo_openapi.models.open_gray_release_rule_dto import OpenGrayReleaseRuleDTO
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
    api_instance = apollo_openapi.NamespaceBranchManagementApi(api_client)
    app_id = 'app_id_example' # str | 
    env = 'env_example' # str | 
    cluster_name = 'cluster_name_example' # str | 
    namespace_name = 'namespace_name_example' # str | 
    branch_name = 'branch_name_example' # str | 
    operator = 'operator_example' # str | 
    open_gray_release_rule_dto = apollo_openapi.OpenGrayReleaseRuleDTO() # OpenGrayReleaseRuleDTO | 

    try:
        # 更新分支灰度发布规则
        api_response = api_instance.openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_branches_branch_name_gray_rules_put(app_id, env, cluster_name, namespace_name, branch_name, operator, open_gray_release_rule_dto)
        print("The response of NamespaceBranchManagementApi->openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_branches_branch_name_gray_rules_put:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling NamespaceBranchManagementApi->openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_branches_branch_name_gray_rules_put: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **app_id** | **str**|  | 
 **env** | **str**|  | 
 **cluster_name** | **str**|  | 
 **namespace_name** | **str**|  | 
 **branch_name** | **str**|  | 
 **operator** | **str**|  | 
 **open_gray_release_rule_dto** | [**OpenGrayReleaseRuleDTO**](OpenGrayReleaseRuleDTO.md)|  | 

### Return type

**object**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_branches_branch_name_items_get**
> List[OpenItemDTO] openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_branches_branch_name_items_get(app_id, env, cluster_name, namespace_name, branch_name)

获取分支下的配置项

GET /apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/branches/{branchName}/items

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
    api_instance = apollo_openapi.NamespaceBranchManagementApi(api_client)
    app_id = 'app_id_example' # str | 
    env = 'env_example' # str | 
    cluster_name = 'cluster_name_example' # str | 
    namespace_name = 'namespace_name_example' # str | 
    branch_name = 'branch_name_example' # str | 

    try:
        # 获取分支下的配置项
        api_response = api_instance.openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_branches_branch_name_items_get(app_id, env, cluster_name, namespace_name, branch_name)
        print("The response of NamespaceBranchManagementApi->openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_branches_branch_name_items_get:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling NamespaceBranchManagementApi->openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_branches_branch_name_items_get: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **app_id** | **str**|  | 
 **env** | **str**|  | 
 **cluster_name** | **str**|  | 
 **namespace_name** | **str**|  | 
 **branch_name** | **str**|  | 

### Return type

[**List[OpenItemDTO]**](OpenItemDTO.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | 成功获取分支下的配置项列表 |  -  |
**404** | 分支不存在 |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_branches_branch_name_merge_post**
> OpenReleaseDTO openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_branches_branch_name_merge_post(app_id, env, cluster_name, namespace_name, branch_name, delete_branch, namespace_release_dto)

合并分支



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
    api_instance = apollo_openapi.NamespaceBranchManagementApi(api_client)
    app_id = 'app_id_example' # str | 
    env = 'env_example' # str | 
    cluster_name = 'cluster_name_example' # str | 
    namespace_name = 'namespace_name_example' # str | 
    branch_name = 'branch_name_example' # str | 
    delete_branch = true # bool | 
    namespace_release_dto = apollo_openapi.NamespaceReleaseDTO() # NamespaceReleaseDTO | 

    try:
        # 合并分支
        api_response = api_instance.openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_branches_branch_name_merge_post(app_id, env, cluster_name, namespace_name, branch_name, delete_branch, namespace_release_dto)
        print("The response of NamespaceBranchManagementApi->openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_branches_branch_name_merge_post:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling NamespaceBranchManagementApi->openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_branches_branch_name_merge_post: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **app_id** | **str**|  | 
 **env** | **str**|  | 
 **cluster_name** | **str**|  | 
 **namespace_name** | **str**|  | 
 **branch_name** | **str**|  | 
 **delete_branch** | **bool**|  | 
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
**200** | 分支合并成功 |  -  |
**400** | 合并参数错误 |  -  |
**403** | 权限不足 |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_branches_branch_name_patch**
> OpenReleaseDTO openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_branches_branch_name_patch(env, app_id, cluster_name, namespace_name, branch_name, delete_branch, x_apollo_operator, namespace_release_dto)

合并分支到主分支

PATCH /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/branches/{branchName}

使用 PATCH 方法表示部分更新操作（将分支状态从"独立"更新为"合并"）

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
    api_instance = apollo_openapi.NamespaceBranchManagementApi(api_client)
    env = 'env_example' # str | 
    app_id = 'app_id_example' # str | 
    cluster_name = 'cluster_name_example' # str | 
    namespace_name = 'namespace_name_example' # str | 
    branch_name = 'branch_name_example' # str | 
    delete_branch = true # bool | 
    x_apollo_operator = 'x_apollo_operator_example' # str | 
    namespace_release_dto = apollo_openapi.NamespaceReleaseDTO() # NamespaceReleaseDTO | 

    try:
        # 合并分支到主分支
        api_response = api_instance.openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_branches_branch_name_patch(env, app_id, cluster_name, namespace_name, branch_name, delete_branch, x_apollo_operator, namespace_release_dto)
        print("The response of NamespaceBranchManagementApi->openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_branches_branch_name_patch:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling NamespaceBranchManagementApi->openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_branches_branch_name_patch: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **env** | **str**|  | 
 **app_id** | **str**|  | 
 **cluster_name** | **str**|  | 
 **namespace_name** | **str**|  | 
 **branch_name** | **str**|  | 
 **delete_branch** | **bool**|  | 
 **x_apollo_operator** | **str**|  | 
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
**200** |  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_branches_branch_name_releases_post**
> OpenReleaseDTO openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_branches_branch_name_releases_post(app_id, env, cluster_name, namespace_name, branch_name, namespace_release_dto)

创建灰度发布



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
    api_instance = apollo_openapi.NamespaceBranchManagementApi(api_client)
    app_id = 'app_id_example' # str | 
    env = 'env_example' # str | 
    cluster_name = 'cluster_name_example' # str | 
    namespace_name = 'namespace_name_example' # str | 
    branch_name = 'branch_name_example' # str | 
    namespace_release_dto = apollo_openapi.NamespaceReleaseDTO() # NamespaceReleaseDTO | 

    try:
        # 创建灰度发布
        api_response = api_instance.openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_branches_branch_name_releases_post(app_id, env, cluster_name, namespace_name, branch_name, namespace_release_dto)
        print("The response of NamespaceBranchManagementApi->openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_branches_branch_name_releases_post:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling NamespaceBranchManagementApi->openapi_v1_envs_env_apps_app_id_clusters_cluster_name_namespaces_namespace_name_branches_branch_name_releases_post: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **app_id** | **str**|  | 
 **env** | **str**|  | 
 **cluster_name** | **str**|  | 
 **namespace_name** | **str**|  | 
 **branch_name** | **str**|  | 
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
**200** |  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

