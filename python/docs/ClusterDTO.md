# ClusterDTO


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
**name** | **str** |  | 
**app_id** | **str** |  | 
**parent_cluster_id** | **int** |  | [optional] 
**comment** | **str** |  | [optional] 

## Example

```python
from apollo_openapi.models.cluster_dto import ClusterDTO

# TODO update the JSON string below
json = "{}"
# create an instance of ClusterDTO from a JSON string
cluster_dto_instance = ClusterDTO.from_json(json)
# print the JSON string representation of the object
print(ClusterDTO.to_json())

# convert the object into a dict
cluster_dto_dict = cluster_dto_instance.to_dict()
# create an instance of ClusterDTO from a dict
cluster_dto_from_dict = ClusterDTO.from_dict(cluster_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


