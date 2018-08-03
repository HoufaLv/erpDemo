package com.ksit.erp.mapper;

import com.ksit.erp.entity.EmployeeLoginLog;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EmployeeLoginLogMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(EmployeeLoginLog record);

    int insertSelective(EmployeeLoginLog record);

    EmployeeLoginLog selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(EmployeeLoginLog record);

    int updateByPrimaryKey(EmployeeLoginLog record);
}