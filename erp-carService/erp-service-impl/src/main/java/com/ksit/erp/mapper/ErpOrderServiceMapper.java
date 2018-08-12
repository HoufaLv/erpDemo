package com.ksit.erp.mapper;

import com.ksit.erp.entity.ErpOrderServiceKey;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ErpOrderServiceMapper {
    int deleteByPrimaryKey(ErpOrderServiceKey key);

    int insert(ErpOrderServiceKey record);

    int insertSelective(ErpOrderServiceKey record);
}