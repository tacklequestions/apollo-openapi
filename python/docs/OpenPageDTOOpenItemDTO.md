# OpenPageDTOOpenItemDTO

分页配置项数据传输对象，用于返回分页查询的配置项列表结果

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**page** | **int** | 当前页码，从0开始计数 | [optional] 
**size** | **int** | 每页显示的记录数量 | [optional] 
**total** | **int** | 总记录数，符合查询条件的配置项总数量 | [optional] 
**content** | [**List[OpenItemDTO]**](OpenItemDTO.md) | 当前页的配置项列表，包含具体的配置项数据 | [optional] 

## Example

```python
from apollo_openapi.models.open_page_dto_open_item_dto import OpenPageDTOOpenItemDTO

# TODO update the JSON string below
json = "{}"
# create an instance of OpenPageDTOOpenItemDTO from a JSON string
open_page_dto_open_item_dto_instance = OpenPageDTOOpenItemDTO.from_json(json)
# print the JSON string representation of the object
print(OpenPageDTOOpenItemDTO.to_json())

# convert the object into a dict
open_page_dto_open_item_dto_dict = open_page_dto_open_item_dto_instance.to_dict()
# create an instance of OpenPageDTOOpenItemDTO from a dict
open_page_dto_open_item_dto_from_dict = OpenPageDTOOpenItemDTO.from_dict(open_page_dto_open_item_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


