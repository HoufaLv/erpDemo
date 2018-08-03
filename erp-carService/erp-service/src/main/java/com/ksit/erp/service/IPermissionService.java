package com.ksit.erp.service;

import com.ksit.erp.dto.PermissionDTO;
import com.ksit.erp.dto.ServerResponse;
import com.ksit.erp.entity.Permission;

import java.util.List;

/**
 * Created by houfalv on 2018/7/27.
 */
public interface IPermissionService {

    /**
     * 查询所有权限
     * @return
     */
    List<Permission> listPermission();

    /**
     * 添加权限
     * @param permission
     * @return
     */
    ServerResponse<String> newPermission(Permission permission);

    /**
     * 根据id 查询对应的权限信息
     * @param id
     * @return
     */
    Permission queryPermissionById(Integer id);

    /**
     * 删除权限
     * @param id
     * @return
     */
    ServerResponse delPermission(Integer id);

    /**
     * 返回排除当前权限的List
     * @param id
     * @return
     */
    ServerResponse queryPermissionListExcludeId(Integer id);

    /**
     * 添加权限
     * @param permission
     */
    void addPermission(Permission permission);

    /**
     * 更新权限
     * @param permissionDTO
     * @return
     */
    ServerResponse updatePermission(PermissionDTO permissionDTO);

    /**
     * 将所有权限排序返回
     * 
     */
    List<Permission> findAllPermissionSort();
}
