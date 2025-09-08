# NamespaceSyncModel


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sync_to_namespaces** | [**List[NamespaceIdentifier]**](NamespaceIdentifier.md) |  | [optional] 
**sync_items** | [**List[ItemDTO]**](ItemDTO.md) |  | [optional] 

## Example

```python
from apollo_openapi.models.namespace_sync_model import NamespaceSyncModel

# TODO update the JSON string below
json = "{}"
# create an instance of NamespaceSyncModel from a JSON string
namespace_sync_model_instance = NamespaceSyncModel.from_json(json)
# print the JSON string representation of the object
print(NamespaceSyncModel.to_json())

# convert the object into a dict
namespace_sync_model_dict = namespace_sync_model_instance.to_dict()
# create an instance of NamespaceSyncModel from a dict
namespace_sync_model_from_dict = NamespaceSyncModel.from_dict(namespace_sync_model_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


