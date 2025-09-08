# MapString

字符串映射对象，用于表示键值对的配置数据结构

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**key** | **str** |  | [optional] 

## Example

```python
from apollo_openapi.models.map_string import MapString

# TODO update the JSON string below
json = "{}"
# create an instance of MapString from a JSON string
map_string_instance = MapString.from_json(json)
# print the JSON string representation of the object
print(MapString.to_json())

# convert the object into a dict
map_string_dict = map_string_instance.to_dict()
# create an instance of MapString from a dict
map_string_from_dict = MapString.from_dict(map_string_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


