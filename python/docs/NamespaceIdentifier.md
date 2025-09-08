# NamespaceIdentifier


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**app_id** | **str** |  | [optional] 
**env** | **str** |  | [optional] 
**cluster_name** | **str** |  | [optional] 
**namespace_name** | **str** |  | [optional] 

## Example

```python
from apollo_openapi.models.namespace_identifier import NamespaceIdentifier

# TODO update the JSON string below
json = "{}"
# create an instance of NamespaceIdentifier from a JSON string
namespace_identifier_instance = NamespaceIdentifier.from_json(json)
# print the JSON string representation of the object
print(NamespaceIdentifier.to_json())

# convert the object into a dict
namespace_identifier_dict = namespace_identifier_instance.to_dict()
# create an instance of NamespaceIdentifier from a dict
namespace_identifier_from_dict = NamespaceIdentifier.from_dict(namespace_identifier_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


