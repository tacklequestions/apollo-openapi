# OpenItemDTO

Apollo配置项数据传输对象，表示一个具体的配置键值对及其元数据

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**data_change_created_by** | **str** | 配置项创建者用户名，记录是谁创建了这个配置项 | [optional] 
**data_change_last_modified_by** | **str** | 配置项最后修改者用户名，记录最后一次修改配置的用户 | [optional] 
**data_change_created_time** | **str** | 配置项创建时间，ISO 8601格式的时间戳 | [optional] 
**data_change_last_modified_time** | **str** | 配置项最后修改时间，ISO 8601格式的时间戳 | [optional] 
**key** | **str** | 配置项的键名，在同一命名空间内唯一标识一个配置项 | [optional] 
**type** | **int** | 配置项类型，0表示普通配置项，1表示文件类型配置项 | [optional] 
**value** | **str** | 配置项的值，可以是字符串、数字、JSON等格式 | [optional] 
**comment** | **str** | 配置项的注释说明，用于描述配置项的用途和含义 | [optional] 

## Example

```python
from apollo_openapi.models.open_item_dto import OpenItemDTO

# TODO update the JSON string below
json = "{}"
# create an instance of OpenItemDTO from a JSON string
open_item_dto_instance = OpenItemDTO.from_json(json)
# print the JSON string representation of the object
print(OpenItemDTO.to_json())

# convert the object into a dict
open_item_dto_dict = open_item_dto_instance.to_dict()
# create an instance of OpenItemDTO from a dict
open_item_dto_from_dict = OpenItemDTO.from_dict(open_item_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


