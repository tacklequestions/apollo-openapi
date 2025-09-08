# OpenOrganizationDto


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**org_id** | **str** |  | [optional] 
**org_name** | **str** |  | [optional] 

## Example

```python
from apollo_openapi.models.open_organization_dto import OpenOrganizationDto

# TODO update the JSON string below
json = "{}"
# create an instance of OpenOrganizationDto from a JSON string
open_organization_dto_instance = OpenOrganizationDto.from_json(json)
# print the JSON string representation of the object
print(OpenOrganizationDto.to_json())

# convert the object into a dict
open_organization_dto_dict = open_organization_dto_instance.to_dict()
# create an instance of OpenOrganizationDto from a dict
open_organization_dto_from_dict = OpenOrganizationDto.from_dict(open_organization_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


