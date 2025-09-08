# OpenPageDTOOpenInstanceDTO

分页实例数据传输对象，用于返回分页查询的实例列表结果

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**page** | **int** | 当前页码，从0开始计数 | [optional] 
**size** | **int** | 每页显示的记录数量 | [optional] 
**total** | **int** | 总记录数，符合查询条件的实例总数量 | [optional] 
**content** | [**List[OpenInstanceDTO]**](OpenInstanceDTO.md) | 当前页的实例列表，包含具体的实例数据 | [optional] 

## Example

```python
from apollo_openapi.models.open_page_dto_open_instance_dto import OpenPageDTOOpenInstanceDTO

# TODO update the JSON string below
json = "{}"
# create an instance of OpenPageDTOOpenInstanceDTO from a JSON string
open_page_dto_open_instance_dto_instance = OpenPageDTOOpenInstanceDTO.from_json(json)
# print the JSON string representation of the object
print(OpenPageDTOOpenInstanceDTO.to_json())

# convert the object into a dict
open_page_dto_open_instance_dto_dict = open_page_dto_open_instance_dto_instance.to_dict()
# create an instance of OpenPageDTOOpenInstanceDTO from a dict
open_page_dto_open_instance_dto_from_dict = OpenPageDTOOpenInstanceDTO.from_dict(open_page_dto_open_instance_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


