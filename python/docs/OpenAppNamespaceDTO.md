# OpenAppNamespaceDTO

Apollo应用命名空间数据传输对象，表示应用级别的命名空间配置信息

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**data_change_created_by** | **str** | 命名空间创建者用户名，记录是谁创建了这个应用命名空间 | [optional] 
**data_change_last_modified_by** | **str** | 命名空间最后修改者用户名，记录最后一次修改命名空间信息的用户 | [optional] 
**data_change_created_time** | **str** | 命名空间创建时间，ISO 8601格式的时间戳 | [optional] 
**data_change_last_modified_time** | **str** | 命名空间最后修改时间，ISO 8601格式的时间戳 | [optional] 
**name** | **str** | 命名空间名称，在同一应用内唯一标识一个命名空间 | [optional] 
**app_id** | **str** | 所属应用的唯一标识符 | [optional] 
**format** | **str** | 命名空间格式类型，如properties、xml、json、yml等 | [optional] 
**is_public** | **bool** | 是否为公共命名空间，公共命名空间可以被其他应用关联使用 | [optional] 
**append_namespace_prefix** | **bool** | 对于公共命名空间，是否在命名空间名称前添加前缀 | [optional] [default to True]
**comment** | **str** | 命名空间备注说明，描述命名空间的用途和包含的配置类型 | [optional] 

## Example

```python
from apollo_openapi.models.open_app_namespace_dto import OpenAppNamespaceDTO

# TODO update the JSON string below
json = "{}"
# create an instance of OpenAppNamespaceDTO from a JSON string
open_app_namespace_dto_instance = OpenAppNamespaceDTO.from_json(json)
# print the JSON string representation of the object
print(OpenAppNamespaceDTO.to_json())

# convert the object into a dict
open_app_namespace_dto_dict = open_app_namespace_dto_instance.to_dict()
# create an instance of OpenAppNamespaceDTO from a dict
open_app_namespace_dto_from_dict = OpenAppNamespaceDTO.from_dict(open_app_namespace_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


