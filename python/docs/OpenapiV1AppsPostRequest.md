# OpenapiV1AppsPostRequest



## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**app** | [**OpenAppDTO**](OpenAppDTO.md) |  | 
**assign_app_role_to_self** | **bool** | 是否将应用角色分配给当前用户。当设置为true时，当前token用户将获得该应用的完全操作权限 | 
**admins** | **List[str]** | 应用管理员用户名列表。应用负责人默认具有项目管理员权限。管理员可以创建命名空间、集群并分配用户权限 | 

## Example

```python
from apollo_openapi.models.openapi_v1_apps_post_request import OpenapiV1AppsPostRequest

# TODO update the JSON string below
json = "{}"
# create an instance of OpenapiV1AppsPostRequest from a JSON string
openapi_v1_apps_post_request_instance = OpenapiV1AppsPostRequest.from_json(json)
# print the JSON string representation of the object
print(OpenapiV1AppsPostRequest.to_json())

# convert the object into a dict
openapi_v1_apps_post_request_dict = openapi_v1_apps_post_request_instance.to_dict()
# create an instance of OpenapiV1AppsPostRequest from a dict
openapi_v1_apps_post_request_from_dict = OpenapiV1AppsPostRequest.from_dict(openapi_v1_apps_post_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


