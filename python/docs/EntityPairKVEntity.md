# EntityPairKVEntity


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**first_entity** | [**KVEntity**](KVEntity.md) |  | [optional] 
**second_entity** | [**KVEntity**](KVEntity.md) |  | [optional] 

## Example

```python
from apollo_openapi.models.entity_pair_kv_entity import EntityPairKVEntity

# TODO update the JSON string below
json = "{}"
# create an instance of EntityPairKVEntity from a JSON string
entity_pair_kv_entity_instance = EntityPairKVEntity.from_json(json)
# print the JSON string representation of the object
print(EntityPairKVEntity.to_json())

# convert the object into a dict
entity_pair_kv_entity_dict = entity_pair_kv_entity_instance.to_dict()
# create an instance of EntityPairKVEntity from a dict
entity_pair_kv_entity_from_dict = EntityPairKVEntity.from_dict(entity_pair_kv_entity_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


