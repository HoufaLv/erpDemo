package com.ksit.erp.mapper;

import com.ksit.erp.entity.Role;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface RoleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Role record);

    int insertSelective(Role record);

    Role selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);

    /**
     * 根据角色验证角色是否存在
     * @param paramMap
     * @return
     */
    int validateRole(@Param("paramMap") Map<String, Object> paramMap);

    /**
     * 查询所有角色和 对应的权限列表
     *
     * @return
     */
    List<Role> listRoleWithPermission();

    /**
     * 根据id 查询对应的角色信息
     * @param id
     * @return
     */
    Role queryRoleById(Integer id);

    /**
     * 查询角色列表
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