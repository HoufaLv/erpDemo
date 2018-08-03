package com.ksit.erp.mapper;

import com.ksit.erp.entity.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.HashMap;
import java.util.List;

@Mapper
public interface EmployeeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Employee record);

    int insertSelective(Employee record);

    Employee selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Employee record);

    int updateByPrimaryKey(Employee record);

    /**
     * 根据雇员email 查询雇员信息
     * @param employeeEmail
     * @return
     */
    Employee queryByEmployeeEmail(String employeeEmail);

    /**
     * 条件验证
     * @param paramMap
     * @return
     */
    int validate(@Param("paramMap") HashMap<String, Object> paramMap);

    List<Employee> listEmployeeWithRole();

    /**
     * 通过id 查询员工信息和员工对应的角色列表
     * @param id
     * @return
     */
    Employee queryEmployeeWithRoleById(Integer id);
}