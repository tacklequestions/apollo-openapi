# ItemDTO


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**data_change_created_by** | **str** |  | [optional] 
**data_change_last_modified_by** | **str** |  | [optional] 
**data_change_created_by_display_name** | **str** |  | [optional] 
**data_change_last_modified_by_display_name** | **str** |  | [optional] 
**data_change_created_time** | **str** |  | [optional] 
**data_change_last_modified_time** | **str** |  | [optional] 
**id** | **int** |  | [optional] 
**namespace_id** | **int** |  | [optional] 
**key** | **str** |  | [optional] 
**type** | **int** |  | [optional] 
**value** | **str** |  | [optional] 
**comment** | **str** |  | [optional] 
**line_num** | **int** |  | [optional] 

## Example

```python
from apollo_openapi.models.item_dto import ItemDTO

# TODO update the JSON string below
json = "{}"
# create an instance of ItemDTO from a JSON string
item_dto_instance = ItemDTO.from_json(json)
# print the JSON string representation of the object
print(ItemDTO.to_json())

# convert the object into a dict
item_dto_dict = item_dto_instance.to_dict()
# create an instance of ItemDTO from a dict
item_dto_from_dict = ItemDTO.from_dict(item_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


