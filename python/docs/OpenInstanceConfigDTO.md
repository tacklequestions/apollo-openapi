# OpenInstanceConfigDTO


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**release** | [**OpenReleaseDTO**](OpenReleaseDTO.md) |  | [optional] 
**release_delivery_time** | **str** |  | [optional] 
**data_change_last_modified_time** | **str** |  | [optional] 

## Example

```python
from apollo_openapi.models.open_instance_config_dto import OpenInstanceConfigDTO

# TODO update the JSON string below
json = "{}"
# create an instance of OpenInstanceConfigDTO from a JSON string
open_instance_config_dto_instance = OpenInstanceConfigDTO.from_json(json)
# print the JSON string representation of the object
print(OpenInstanceConfigDTO.to_json())

# convert the object into a dict
open_instance_config_dto_dict = open_instance_config_dto_instance.to_dict()
# create an instance of OpenInstanceConfigDTO from a dict
open_instance_config_dto_from_dict = OpenInstanceConfigDTO.from_dict(open_instance_config_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


