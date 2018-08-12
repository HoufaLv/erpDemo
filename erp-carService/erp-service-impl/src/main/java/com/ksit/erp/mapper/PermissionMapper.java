package com.ksit.erp.mapper;

import com.ksit.erp.entity.Permission;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface PermissionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Permission record);

    int insertSelective(Permission record);

    Permission selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Permission record);

    int updateByPrimaryKey(Permission record);

    /**
     * 查询权限列表
     * @return
     */
    List<Permission> listPermission();

    /**
     * 验证权限是否重复
     * @param permissionName
     * @return
     */
    int validatePermission(String permissionName);

    /**
     * 查询权限节点下是否有子节点
     * @param id
     * @return
     */
    int queryHasChildNode(Integer id);

    /**
     * 根据每一个角色id 找到所有的权限列表
     * @param id
     * @return
     */
    List<Permission> findPermissionWithRoleId(Integer id);
}