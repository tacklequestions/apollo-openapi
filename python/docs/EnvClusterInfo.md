# EnvClusterInfo


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**env** | **str** |  | [optional] 
**clusters** | [**List[ClusterDTO]**](ClusterDTO.md) |  | [optional] 

## Example

```python
from apollo_openapi.models.env_cluster_info import EnvClusterInfo

# TODO update the JSON string below
json = "{}"
# create an instance of EnvClusterInfo from a JSON string
env_cluster_info_instance = EnvClusterInfo.from_json(json)
# print the JSON string representation of the object
print(EnvClusterInfo.to_json())

# convert the object into a dict
env_cluster_info_dict = env_cluster_info_instance.to_dict()
# create an instance of EnvClusterInfo from a dict
env_cluster_info_from_dict = EnvClusterInfo.from_dict(env_cluster_info_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


