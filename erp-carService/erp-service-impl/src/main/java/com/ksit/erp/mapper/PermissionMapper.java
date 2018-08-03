package com.ksit.erp.mapper;

import com.ksit.erp.entity.Permission;

import java.util.List;

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
}