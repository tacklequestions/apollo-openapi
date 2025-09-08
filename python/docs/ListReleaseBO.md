# ListReleaseBO


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**base_info** | [**ReleaseDTO**](ReleaseDTO.md) |  | [optional] 
**items** | [**List[KVEntity]**](KVEntity.md) |  | [optional] 

## Example

```python
from apollo_openapi.models.list_release_bo import ListReleaseBO

# TODO update the JSON string below
json = "{}"
# create an instance of ListReleaseBO from a JSON string
list_release_bo_instance = ListReleaseBO.from_json(json)
# print the JSON string representation of the object
print(ListReleaseBO.to_json())

# convert the object into a dict
list_release_bo_dict = list_release_bo_instance.to_dict()
# create an instance of ListReleaseBO from a dict
list_release_bo_from_dict = ListReleaseBO.from_dict(list_release_bo_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


