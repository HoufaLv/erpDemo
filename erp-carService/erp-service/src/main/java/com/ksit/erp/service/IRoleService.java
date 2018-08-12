package com.ksit.erp.service;

import com.ksit.erp.dto.ServerResponse;
import com.ksit.erp.entity.Permission;
import com.ksit.erp.entity.Role;

import java.util.List;
import java.util.Map;

/**
 * Created by houfalv on 2018/8/1.
 */
public interface IRoleService {

    /**
     * 返回已经排序好的权限列表
     * @return
     */
    ServerResponse callBackPermissionListSort();

    /**
     * 新增权限
     * @param roleName
     * @param roleCode
     * @param permissionId
     * @return
     */
    ServerResponse newPermission(String roleName, String roleCode, Integer[] permissionId);

    /**
     * 返回角色和角色对应的权限列表
     * @return
     */
    List<Role> listRoleWithPermission();

    /**
     * 根据id 查询对应的角色
     * @param id
     * @return
     */
    ServerResponse queryRoleById(Integer id);

    /**
     * 根据id 查询对应的角色
     * @param id
     * @return
     */
    Role selectRoleById(Integer id);

    /**
     * 在所有权限中查询当前角色拥有的权限
     * @param permissionList
     * @return
     */
    Map<Permission,Boolean> permissionBooleanMap(List<Permission> permissionList);

    /**
     * 更新角色信息
     * @param role
     * @param permissionId
     */
    void updatePermission(Role role, Integer[] permissionId);

    /**
     * 删除角色
     * @param id
     * @return
     */
    ServerResponse delRole(Integer id);

    /**
     * 返回所有角色
     * @return
     */
    List<Role> listRole();

    /**
     * 根据账号id 获取所有角色
     * @param id
     * @return
     */
    List<Role> findRolesWithEmployeeId(Integer id);
}
