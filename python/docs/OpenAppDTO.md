# OpenAppDTO

Apollo应用信息数据传输对象，包含应用的基本信息和元数据

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**data_change_created_by** | **str** | 数据创建者用户名，记录是谁创建了这个应用 | [optional] 
**data_change_last_modified_by** | **str** | 数据最后修改者用户名，记录最后一次修改应用信息的用户 | [optional] 
**data_change_created_time** | **str** | 数据创建时间，ISO 8601格式的时间戳 | [optional] 
**data_change_last_modified_time** | **str** | 数据最后修改时间，ISO 8601格式的时间戳 | [optional] 
**name** | **str** | 应用名称，用于显示的友好名称 | [optional] 
**app_id** | **str** | 应用唯一标识符，全局唯一的应用ID | [optional] 
**org_id** | **str** | 组织ID，应用所属组织的唯一标识 | [optional] 
**org_name** | **str** | 组织名称，应用所属组织的显示名称 | [optional] 
**owner_name** | **str** | 应用负责人姓名，应用的主要负责人 | [optional] 
**owner_email** | **str** | 应用负责人邮箱地址，用于接收应用相关通知 | [optional] 

## Example

```python
from apollo_openapi.models.open_app_dto import OpenAppDTO

# TODO update the JSON string below
json = "{}"
# create an instance of OpenAppDTO from a JSON string
open_app_dto_instance = OpenAppDTO.from_json(json)
# print the JSON string representation of the object
print(OpenAppDTO.to_json())

# convert the object into a dict
open_app_dto_dict = open_app_dto_instance.to_dict()
# create an instance of OpenAppDTO from a dict
open_app_dto_from_dict = OpenAppDTO.from_dict(open_app_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


