# NamespaceTextModel


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**app_id** | **str** |  | [optional] 
**env** | **str** |  | [optional] 
**cluster_name** | **str** |  | [optional] 
**namespace_name** | **str** |  | [optional] 
**namespace_id** | **int** |  | [optional] 
**format** | **str** |  | [optional] 
**config_text** | **str** |  | [optional] 
**operator** | **str** |  | [optional] 

## Example

```python
from apollo_openapi.models.namespace_text_model import NamespaceTextModel

# TODO update the JSON string below
json = "{}"
# create an instance of NamespaceTextModel from a JSON string
namespace_text_model_instance = NamespaceTextModel.from_json(json)
# print the JSON string representation of the object
print(NamespaceTextModel.to_json())

# convert the object into a dict
namespace_text_model_dict = namespace_text_model_instance.to_dict()
# create an instance of NamespaceTextModel from a dict
namespace_text_model_from_dict = NamespaceTextModel.from_dict(namespace_text_model_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


