# OpenCreateAppDTO

创建Apollo应用的请求数据传输对象，包含创建应用所需的所有信息

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**assign_app_role_to_self** | **bool** | 是否将应用角色分配给当前用户。当设置为true时，当前token用户将获得该应用的完全操作权限 | [optional] 
**admins** | **List[str]** | 应用管理员用户名列表。应用负责人默认具有项目管理员权限。管理员可以创建命名空间、集群并分配用户权限 | [optional] 
**app** | [**OpenAppDTO**](OpenAppDTO.md) |  | [optional] 

## Example

```python
from apollo_openapi.models.open_create_app_dto import OpenCreateAppDTO

# TODO update the JSON string below
json = "{}"
# create an instance of OpenCreateAppDTO from a JSON string
open_create_app_dto_instance = OpenCreateAppDTO.from_json(json)
# print the JSON string representation of the object
print(OpenCreateAppDTO.to_json())

# convert the object into a dict
open_create_app_dto_dict = open_create_app_dto_instance.to_dict()
# create an instance of OpenCreateAppDTO from a dict
open_create_app_dto_from_dict = OpenCreateAppDTO.from_dict(open_create_app_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


