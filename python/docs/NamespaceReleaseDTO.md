# NamespaceReleaseDTO

命名空间发布请求数据传输对象，用于创建新的配置发布

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**release_title** | **str** | 发布标题，用于标识这次发布的名称或版本号 | [optional] 
**release_comment** | **str** | 发布备注，详细描述本次发布的变更内容和目的 | [optional] 
**released_by** | **str** | 发布操作者用户名，记录是谁执行了这次发布操作 | [optional] 
**is_emergency_publish** | **bool** | 是否为紧急发布，紧急发布可能会跳过某些审核流程 | [optional] 

## Example

```python
from apollo_openapi.models.namespace_release_dto import NamespaceReleaseDTO

# TODO update the JSON string below
json = "{}"
# create an instance of NamespaceReleaseDTO from a JSON string
namespace_release_dto_instance = NamespaceReleaseDTO.from_json(json)
# print the JSON string representation of the object
print(NamespaceReleaseDTO.to_json())

# convert the object into a dict
namespace_release_dto_dict = namespace_release_dto_instance.to_dict()
# create an instance of NamespaceReleaseDTO from a dict
namespace_release_dto_from_dict = NamespaceReleaseDTO.from_dict(namespace_release_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


