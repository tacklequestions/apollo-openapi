# NamespaceGrayDelReleaseDTO

命名空间灰度删除发布请求数据传输对象，用于创建删除特定配置项的灰度发布

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**release_title** | **str** | 发布标题，用于标识这次灰度删除发布的名称或版本号 | [optional] 
**release_comment** | **str** | 发布备注，详细描述本次灰度删除发布的目的和删除的配置项 | [optional] 
**released_by** | **str** | 发布操作者用户名，记录是谁执行了这次灰度删除发布操作 | [optional] 
**is_emergency_publish** | **bool** | 是否为紧急发布，紧急发布可能会跳过某些审核流程 | [optional] 
**gray_del_keys** | **List[str]** | 需要在灰度发布中删除的配置项键名列表 | [optional] 

## Example

```python
from apollo_openapi.models.namespace_gray_del_release_dto import NamespaceGrayDelReleaseDTO

# TODO update the JSON string below
json = "{}"
# create an instance of NamespaceGrayDelReleaseDTO from a JSON string
namespace_gray_del_release_dto_instance = NamespaceGrayDelReleaseDTO.from_json(json)
# print the JSON string representation of the object
print(NamespaceGrayDelReleaseDTO.to_json())

# convert the object into a dict
namespace_gray_del_release_dto_dict = namespace_gray_del_release_dto_instance.to_dict()
# create an instance of NamespaceGrayDelReleaseDTO from a dict
namespace_gray_del_release_dto_from_dict = NamespaceGrayDelReleaseDTO.from_dict(namespace_gray_del_release_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


