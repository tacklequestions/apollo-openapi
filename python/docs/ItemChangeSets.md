# ItemChangeSets


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**data_change_created_by** | **str** |  | [optional] 
**data_change_last_modified_by** | **str** |  | [optional] 
**data_change_created_by_display_name** | **str** |  | [optional] 
**data_change_last_modified_by_display_name** | **str** |  | [optional] 
**data_change_created_time** | **str** |  | [optional] 
**data_change_last_modified_time** | **str** |  | [optional] 
**create_items** | [**List[ItemDTO]**](ItemDTO.md) |  | [optional] [default to []]
**update_items** | [**List[ItemDTO]**](ItemDTO.md) |  | [optional] [default to []]
**delete_items** | [**List[ItemDTO]**](ItemDTO.md) |  | [optional] [default to []]

## Example

```python
from apollo_openapi.models.item_change_sets import ItemChangeSets

# TODO update the JSON string below
json = "{}"
# create an instance of ItemChangeSets from a JSON string
item_change_sets_instance = ItemChangeSets.from_json(json)
# print the JSON string representation of the object
print(ItemChangeSets.to_json())

# convert the object into a dict
item_change_sets_dict = item_change_sets_instance.to_dict()
# create an instance of ItemChangeSets from a dict
item_change_sets_from_dict = ItemChangeSets.from_dict(item_change_sets_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


