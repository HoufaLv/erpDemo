package com.ksit.erp.mapper;

import com.ksit.erp.entity.ErpOrderParts;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ErpOrderPartsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ErpOrderParts record);

    int insertSelective(ErpOrderParts record);

    ErpOrderParts selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ErpOrderParts record);

    int updateByPrimaryKey(ErpOrderParts record);
}