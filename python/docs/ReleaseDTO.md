# ReleaseDTO


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
**release_key** | **str** |  | [optional] 
**name** | **str** |  | [optional] 
**app_id** | **str** |  | [optional] 
**cluster_name** | **str** |  | [optional] 
**namespace_name** | **str** |  | [optional] 
**configurations** | **str** |  | [optional] 
**comment** | **str** |  | [optional] 
**is_abandoned** | **bool** |  | [optional] 

## Example

```python
from apollo_openapi.models.release_dto import ReleaseDTO

# TODO update the JSON string below
json = "{}"
# create an instance of ReleaseDTO from a JSON string
release_dto_instance = ReleaseDTO.from_json(json)
# print the JSON string representation of the object
print(ReleaseDTO.to_json())

# convert the object into a dict
release_dto_dict = release_dto_instance.to_dict()
# create an instance of ReleaseDTO from a dict
release_dto_from_dict = ReleaseDTO.from_dict(release_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


