# OpenGrayReleaseRuleItemDTO

Apollo灰度发布规则项数据传输对象，表示灰度发布的具体规则条件

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**client_app_id** | **str** | 客户端应用ID，指定哪个应用可以获取灰度配置 | [optional] 
**client_ip_list** | **List[str]** | 客户端IP地址列表，指定哪些IP地址可以获取灰度配置 | [optional] 
**client_label_list** | **List[str]** | 客户端标签列表，通过标签来识别可以获取灰度配置的客户端 | [optional] 

## Example

```python
from apollo_openapi.models.open_gray_release_rule_item_dto import OpenGrayReleaseRuleItemDTO

# TODO update the JSON string below
json = "{}"
# create an instance of OpenGrayReleaseRuleItemDTO from a JSON string
open_gray_release_rule_item_dto_instance = OpenGrayReleaseRuleItemDTO.from_json(json)
# print the JSON string representation of the object
print(OpenGrayReleaseRuleItemDTO.to_json())

# convert the object into a dict
open_gray_release_rule_item_dto_dict = open_gray_release_rule_item_dto_instance.to_dict()
# create an instance of OpenGrayReleaseRuleItemDTO from a dict
open_gray_release_rule_item_dto_from_dict = OpenGrayReleaseRuleItemDTO.from_dict(open_gray_release_rule_item_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


