package com.ksit.erp.mapper;

import com.ksit.erp.entity.ErpOrderEmployee;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ErpOrderEmployeeMapper {
    int insert(ErpOrderEmployee record);

    int insertSelective(ErpOrderEmployee record);
}