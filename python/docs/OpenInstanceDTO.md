# OpenInstanceDTO


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** |  | [optional] 
**app_id** | **str** |  | [optional] 
**cluster_name** | **str** |  | [optional] 
**data_center** | **str** |  | [optional] 
**ip** | **str** |  | [optional] 
**configs** | [**List[OpenInstanceConfigDTO]**](OpenInstanceConfigDTO.md) |  | [optional] 
**data_change_created_time** | **str** |  | [optional] 

## Example

```python
from apollo_openapi.models.open_instance_dto import OpenInstanceDTO

# TODO update the JSON string below
json = "{}"
# create an instance of OpenInstanceDTO from a JSON string
open_instance_dto_instance = OpenInstanceDTO.from_json(json)
# print the JSON string representation of the object
print(OpenInstanceDTO.to_json())

# convert the object into a dict
open_instance_dto_dict = open_instance_dto_instance.to_dict()
# create an instance of OpenInstanceDTO from a dict
open_instance_dto_from_dict = OpenInstanceDTO.from_dict(open_instance_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


