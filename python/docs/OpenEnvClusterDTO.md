# OpenEnvClusterDTO


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**env** | **str** |  | [optional] 
**clusters** | **List[str]** |  | [optional] 

## Example

```python
from apollo_openapi.models.open_env_cluster_dto import OpenEnvClusterDTO

# TODO update the JSON string below
json = "{}"
# create an instance of OpenEnvClusterDTO from a JSON string
open_env_cluster_dto_instance = OpenEnvClusterDTO.from_json(json)
# print the JSON string representation of the object
print(OpenEnvClusterDTO.to_json())

# convert the object into a dict
open_env_cluster_dto_dict = open_env_cluster_dto_instance.to_dict()
# create an instance of OpenEnvClusterDTO from a dict
open_env_cluster_dto_from_dict = OpenEnvClusterDTO.from_dict(open_env_cluster_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


