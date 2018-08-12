package com.ksit.erp.service.serviceImpl;

import com.google.common.collect.Maps;
import com.ksit.erp.dto.ServerResponse;
import com.ksit.erp.entity.Permission;
import com.ksit.erp.entity.Role;
import com.ksit.erp.entity.RolePermission;
import com.ksit.erp.mapper.EmployeeRoleMapper;
import com.ksit.erp.mapper.RoleMapper;
import com.ksit.erp.mapper.RolePermissionMapper;
import com.ksit.erp.service.IEmployeeService;
import com.ksit.erp.service.IPermissionService;
import com.ksit.erp.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by houfalv on 2018/8/1.
 */
@Service
public class RoleServiceImpl implements IRoleService {

    @Autowired
    private IPermissionService iPermissionService;
    @Autowired
    private RoleMapper roleMapper;
    @Autowired
    private RolePermissionMapper rolePermissionMapper;
    @Autowired
    private IEmployeeService iEmployeeService;
    @Autowired
    private EmployeeRoleMapper employeeRoleMapper;

    /**
     * 返回已经排序好的权限列表
     *
     * @return
     */
    @Override
    public ServerResponse callBackPermissionListSort() {
        List<Permission> permissionList = iPermissionService.findAllPermissionSort();
        return ServerResponse.createBySuccess(permissionList);
    }

    /**
     * 新增权限
     *
     * @param roleName
     * @param roleCode
     * @param permissionId
     * @return
     */
    @Override
    public ServerResponse newPermission(String roleName, String roleCode, Integer[] permissionId) {
        int resultCount = roleMapper.validateRole(new HashMap<String, Object>(){
            {
                put("role_name",roleName);
                put("role_code",roleCode);
            }
        });

        if (!(resultCount>0)) {
            Role role = new Role();
            role.setRoleName(roleName);
            role.setRoleCode(roleCode);
            role.setCreateTime(new Date());
            role.setUpdateTime(new Date());
            roleMapper.insert(role);

            for (Integer id : permissionId) {
                RolePermission rolePermission = new RolePermission();
                rolePermission.setRoleId(role.getId());
                rolePermission.setPermissionId(id);
                rolePermissionMapper.insert(rolePermission);
            }

            return ServerResponse.createBySuccessMessage("添加角色成功");
        }
        return ServerResponse.createByErrorMessage("角色已经存在，无法添加");
    }

    /**
     * 返回角色和角色对应的权限列表
     *
     * @return
     */
    @Override
    public List<Role> listRoleWithPermission() {
        return roleMapper.listRoleWithPermission();
    }

    /**
     * 根据id 查询对应的角色
     *
     * @param id
     * @return
     */
    @Override
    public ServerResponse queryRoleById(Integer id) {
        Role role = roleMapper.queryRoleById(id);
        return ServerResponse.createBySuccess(role);
    }

    /**
     * 根据id 查询对应的角色
     *
     * @param id
     * @return
     */
    @Override
    public Role selectRoleById(Integer id) {
        return roleMapper.queryRoleById(id);
    }

    /**
     * 在所有权限中查询当前角色拥有的权限
     *
     * @param currentPermissionList
     * @return
     */
    @Override
    public Map<Permission, Boolean> permissionBooleanMap(List<Permission> currentPermissionList) {
        List<Permission> permissionList = iPermissionService.findAllPermissionSort();

        Map<Permission,Boolean> resultMap = Maps.newLinkedHashMap();
        //为啥要用linkedHashMap?
        for (Permission permission : permissionList) {
            boolean flag = false;
            for (Permission currentPermission : currentPermissionList) {
                //如果所有的权限列表中和当前权限匹配，则将<Permission,true>,否则 <Permission,false>
                if (permission.getPermissionName().equals(currentPermission.getPermissionName())) {
                    flag = true;
                    break;
                }
            }
            resultMap.put(permission,flag);
        }
        return resultMap;
    }

    /**
     * 更新角色信息
     *
     * @param role
     * @param permissionId
     */
    @Override
    @Transactional(rollbackFor = RuntimeException.class)
    public void updatePermission(Role role, Integer[] permissionId) {
        roleMapper.updateByPrimaryKeySelective(role);

        //删除原有的对应关系
        rolePermissionMapper.deleteByRoleId(role.getId());

        //重新添加关系
        if (permissionId!=null) {
            for (Integer id : permissionId) {
                RolePermission rolePermission = new RolePermission();
                rolePermission.setRoleId(role.getId());
                rolePermission.setPermissionId(id);
                rolePermissionMapper.insert(rolePermission);
            }
        }
    }

    /**
     * 删除角色
     *
     * @param id
     * @return
     */
    @Override
    @Transactional(rollbackFor = RuntimeException.class)
    public ServerResponse delRole(Integer id) {
        //1.如果该角色没有人使用，则可以删除，否则不能删除
        //2.删除角色的时候也要删除对应关系

        int resultCount = employeeRoleMapper.validate(new HashMap<String,Object>(){
            {
                put("role_id",id);
            }
        });

        if (resultCount>0) {
            return ServerResponse.createByErrorMessage("当前角色已经被使用，无法删除");
        }

        //删除账号和角色的对应关系
        employeeRoleMapper.deleteByRoleId(id);
        //删除角色和权限的对应关系
        rolePermissionMapper.deleteByRoleId(id);
        //删除角色映射
        roleMapper.deleteByPrimaryKey(id);

        return ServerResponse.createBySuccess("删除成功");
    }

    /**
     * 返回所有角色
     *
     * @return
     */
    @Override
    public List<Role> listRole() {
        return roleMapper.listRole();
    }

    /**
     * 根据账号id 获取所有角色
     *
     * @param id
     * @return
     */
    @Override
    public List<Role> findRolesWithEmployeeId(Integer id) {
        return roleMapper.findRolesWithEmployeeId(id);
    }
}
