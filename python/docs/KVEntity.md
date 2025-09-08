# KVEntity


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**key** | **str** |  | [optional] 
**value** | **str** |  | [optional] 

## Example

```python
from apollo_openapi.models.kv_entity import KVEntity

# TODO update the JSON string below
json = "{}"
# create an instance of KVEntity from a JSON string
kv_entity_instance = KVEntity.from_json(json)
# print the JSON string representation of the object
print(KVEntity.to_json())

# convert the object into a dict
kv_entity_dict = kv_entity_instance.to_dict()
# create an instance of KVEntity from a dict
kv_entity_from_dict = KVEntity.from_dict(kv_entity_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


