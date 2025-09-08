# OpenNamespaceDTO

Apollo命名空间数据传输对象，表示一个完整的命名空间及其配置项

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**data_change_created_by** | **str** | 命名空间创建者用户名，记录是谁创建了这个命名空间 | [optional] 
**data_change_last_modified_by** | **str** | 命名空间最后修改者用户名，记录最后一次修改命名空间信息的用户 | [optional] 
**data_change_created_time** | **str** | 命名空间创建时间，ISO 8601格式的时间戳 | [optional] 
**data_change_last_modified_time** | **str** | 命名空间最后修改时间，ISO 8601格式的时间戳 | [optional] 
**app_id** | **str** | 所属应用的唯一标识符 | [optional] 
**cluster_name** | **str** | 所属集群的名称 | [optional] 
**namespace_name** | **str** | 命名空间名称，在同一应用和集群下唯一标识一个命名空间 | [optional] 
**comment** | **str** | 命名空间备注说明，描述命名空间的用途 | [optional] 
**format** | **str** | 命名空间格式类型，如properties、xml、json、yml等 | [optional] 
**is_public** | **bool** | 是否为公共命名空间，公共命名空间可以被其他应用关联使用 | [optional] 
**items** | [**List[OpenItemDTO]**](OpenItemDTO.md) | 命名空间包含的配置项列表 | [optional] 

## Example

```python
from apollo_openapi.models.open_namespace_dto import OpenNamespaceDTO

# TODO update the JSON string below
json = "{}"
# create an instance of OpenNamespaceDTO from a JSON string
open_namespace_dto_instance = OpenNamespaceDTO.from_json(json)
# print the JSON string representation of the object
print(OpenNamespaceDTO.to_json())

# convert the object into a dict
open_namespace_dto_dict = open_namespace_dto_instance.to_dict()
# create an instance of OpenNamespaceDTO from a dict
open_namespace_dto_from_dict = OpenNamespaceDTO.from_dict(open_namespace_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


