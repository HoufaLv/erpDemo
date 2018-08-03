package com.ksit.erp.mapper;

import com.ksit.erp.entity.EmployeeRole;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.HashMap;

@Mapper
public interface EmployeeRoleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(EmployeeRole record);

    int insertSelective(EmployeeRole record);

    EmployeeRole selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(EmployeeRole record);

    int updateByPrimaryKey(EmployeeRole record);

    int validate(@Param("paramMap") HashMap<String, Object> paramMap);

    /**
     * 根据角色id 删除关联关系
     * @param id
     */
    void deleteByRoleId(Integer id);

    /*
       根据账号id 删除关联关系
     * @param id
     */
    void deleteByEmployeeId(Integer id);
}