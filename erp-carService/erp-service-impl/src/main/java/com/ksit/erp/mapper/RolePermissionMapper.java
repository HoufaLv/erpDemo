package com.ksit.erp.mapper;

import com.ksit.erp.entity.Role;
import com.ksit.erp.entity.RolePermission;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RolePermissionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RolePermission record);

    int insertSelective(RolePermission record);

    RolePermission selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RolePermission record);

    int updateByPrimaryKey(RolePermission record);

    /**
     * 查询角色和对应的权限列表
     * @return
     */
    List<Role> listRoleWithPermission();

    /**
     * 通过角色id 删除原有的对应关系
     * @param id
     */
    void deleteByRoleId(Integer id);

    /**
     * 根据权限id查询 该权限有没有角色使用
     * @param id
     * @return
     */
    int queryByPermissionId(Integer id);
}