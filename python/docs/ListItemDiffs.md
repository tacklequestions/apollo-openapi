# ListItemDiffs


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**namespace** | [**NamespaceIdentifier**](NamespaceIdentifier.md) |  | [optional] 
**diffs** | [**ItemChangeSets**](ItemChangeSets.md) |  | [optional] 
**ext_info** | **str** |  | [optional] 

## Example

```python
from apollo_openapi.models.list_item_diffs import ListItemDiffs

# TODO update the JSON string below
json = "{}"
# create an instance of ListItemDiffs from a JSON string
list_item_diffs_instance = ListItemDiffs.from_json(json)
# print the JSON string representation of the object
print(ListItemDiffs.to_json())

# convert the object into a dict
list_item_diffs_dict = list_item_diffs_instance.to_dict()
# create an instance of ListItemDiffs from a dict
list_item_diffs_from_dict = ListItemDiffs.from_dict(list_item_diffs_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


