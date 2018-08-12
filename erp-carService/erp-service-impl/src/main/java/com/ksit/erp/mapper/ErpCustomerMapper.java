package com.ksit.erp.mapper;

import com.ksit.erp.entity.ErpCustomer;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.HashMap;
import java.util.List;

@Mapper
public interface ErpCustomerMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ErpCustomer record);

    int insertSelective(ErpCustomer record);

    ErpCustomer selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ErpCustomer record);

    int updateByPrimaryKey(ErpCustomer record);

    int validateCustomer(@Param("paramMap") HashMap<String, Object> paramMap);

    List<ErpCustomer> listCustomer();
}