# OpenClusterDTO

Apollo集群信息数据传输对象，表示应用在特定环境下的集群配置

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**data_change_created_by** | **str** | 集群创建者用户名，记录是谁创建了这个集群 | [optional] 
**data_change_last_modified_by** | **str** | 集群最后修改者用户名，记录最后一次修改集群信息的用户 | [optional] 
**data_change_created_time** | **str** | 集群创建时间，ISO 8601格式的时间戳 | [optional] 
**data_change_last_modified_time** | **str** | 集群最后修改时间，ISO 8601格式的时间戳 | [optional] 
**name** | **str** | 集群名称，在同一应用和环境下唯一标识一个集群 | [optional] 
**app_id** | **str** | 所属应用的唯一标识符 | [optional] 

## Example

```python
from apollo_openapi.models.open_cluster_dto import OpenClusterDTO

# TODO update the JSON string below
json = "{}"
# create an instance of OpenClusterDTO from a JSON string
open_cluster_dto_instance = OpenClusterDTO.from_json(json)
# print the JSON string representation of the object
print(OpenClusterDTO.to_json())

# convert the object into a dict
open_cluster_dto_dict = open_cluster_dto_instance.to_dict()
# create an instance of OpenClusterDTO from a dict
open_cluster_dto_from_dict = OpenClusterDTO.from_dict(open_cluster_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


