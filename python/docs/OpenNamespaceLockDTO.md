# OpenNamespaceLockDTO

Apollo命名空间锁状态数据传输对象

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**namespace_name** | **str** | 命名空间名称 | [optional] 
**is_locked** | **bool** | 是否被锁定 | [optional] 
**locked_by** | **str** | 锁定者用户名 | [optional] 

## Example

```python
from apollo_openapi.models.open_namespace_lock_dto import OpenNamespaceLockDTO

# TODO update the JSON string below
json = "{}"
# create an instance of OpenNamespaceLockDTO from a JSON string
open_namespace_lock_dto_instance = OpenNamespaceLockDTO.from_json(json)
# print the JSON string representation of the object
print(OpenNamespaceLockDTO.to_json())

# convert the object into a dict
open_namespace_lock_dto_dict = open_namespace_lock_dto_instance.to_dict()
# create an instance of OpenNamespaceLockDTO from a dict
open_namespace_lock_dto_from_dict = OpenNamespaceLockDTO.from_dict(open_namespace_lock_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


