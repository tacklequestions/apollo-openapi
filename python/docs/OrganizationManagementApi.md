# apollo_openapi.OrganizationManagementApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**openapi_v1_organizations_get**](OrganizationManagementApi.md#openapi_v1_organizations_get) | **GET** /openapi/v1/organizations | 获取所有组织信息


# **openapi_v1_organizations_get**
> List[OpenOrganizationDto] openapi_v1_organizations_get()

获取所有组织信息

GET /openapi/v1/organizations

### Example

* Api Key Authentication (ApiKeyAuth):

```python
import apollo_openapi
from apollo_openapi.models.open_organization_dto import OpenOrganizationDto
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
    api_instance = apollo_openapi.OrganizationManagementApi(api_client)

    try:
        # 获取所有组织信息
        api_response = api_instance.openapi_v1_organizations_get()
        print("The response of OrganizationManagementApi->openapi_v1_organizations_get:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling OrganizationManagementApi->openapi_v1_organizations_get: %s\n" % e)
```



### Parameters

This endpoint does not need any parameter.

### Return type

[**List[OpenOrganizationDto]**](OpenOrganizationDto.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | 成功获取组织列表 |  -  |
**401** | 未授权访问 |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

