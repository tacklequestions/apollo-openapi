# OpenReleaseDTO

Apollo发布信息数据传输对象，表示一次配置发布的完整信息

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**data_change_created_by** | **str** | 发布创建者用户名，记录是谁创建了这次发布 | [optional] 
**data_change_last_modified_by** | **str** | 发布最后修改者用户名，记录最后一次修改发布信息的用户 | [optional] 
**data_change_created_time** | **str** | 发布创建时间，ISO 8601格式的时间戳 | [optional] 
**data_change_last_modified_time** | **str** | 发布最后修改时间，ISO 8601格式的时间戳 | [optional] 
**id** | **int** | 发布记录的唯一标识符，系统自动生成 | [optional] 
**app_id** | **str** | 所属应用的唯一标识符 | [optional] 
**cluster_name** | **str** | 所属集群的名称 | [optional] 
**namespace_name** | **str** | 所属命名空间的名称 | [optional] 
**name** | **str** | 发布名称，用于标识这次发布的版本或描述 | [optional] 
**configurations** | [**MapString**](MapString.md) |  | [optional] 
**comment** | **str** | 发布备注，描述本次发布的变更内容和目的 | [optional] 

## Example

```python
from apollo_openapi.models.open_release_dto import OpenReleaseDTO

# TODO update the JSON string below
json = "{}"
# create an instance of OpenReleaseDTO from a JSON string
open_release_dto_instance = OpenReleaseDTO.from_json(json)
# print the JSON string representation of the object
print(OpenReleaseDTO.to_json())

# convert the object into a dict
open_release_dto_dict = open_release_dto_instance.to_dict()
# create an instance of OpenReleaseDTO from a dict
open_release_dto_from_dict = OpenReleaseDTO.from_dict(open_release_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


