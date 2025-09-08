# OpenGrayReleaseRuleDTO

Apollo灰度发布规则数据传输对象，表示完整的灰度发布规则配置

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**data_change_created_by** | **str** | 灰度规则创建者用户名，记录是谁创建了这个灰度发布规则 | [optional] 
**data_change_last_modified_by** | **str** | 灰度规则最后修改者用户名，记录最后一次修改规则的用户 | [optional] 
**data_change_created_time** | **str** | 灰度规则创建时间，ISO 8601格式的时间戳 | [optional] 
**data_change_last_modified_time** | **str** | 灰度规则最后修改时间，ISO 8601格式的时间戳 | [optional] 
**app_id** | **str** | 所属应用的唯一标识符 | [optional] 
**cluster_name** | **str** | 所属集群的名称 | [optional] 
**namespace_name** | **str** | 所属命名空间的名称 | [optional] 
**branch_name** | **str** | 灰度分支名称，标识灰度发布的分支 | [optional] 
**rule_items** | [**List[OpenGrayReleaseRuleItemDTO]**](OpenGrayReleaseRuleItemDTO.md) | 灰度发布规则项列表，包含具体的灰度规则条件 | [optional] 

## Example

```python
from apollo_openapi.models.open_gray_release_rule_dto import OpenGrayReleaseRuleDTO

# TODO update the JSON string below
json = "{}"
# create an instance of OpenGrayReleaseRuleDTO from a JSON string
open_gray_release_rule_dto_instance = OpenGrayReleaseRuleDTO.from_json(json)
# print the JSON string representation of the object
print(OpenGrayReleaseRuleDTO.to_json())

# convert the object into a dict
open_gray_release_rule_dto_dict = open_gray_release_rule_dto_instance.to_dict()
# create an instance of OpenGrayReleaseRuleDTO from a dict
open_gray_release_rule_dto_from_dict = OpenGrayReleaseRuleDTO.from_dict(open_gray_release_rule_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


