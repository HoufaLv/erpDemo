package com.ksit.erp.mapper;

import com.ksit.erp.entity.ErpPartsStream;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ErpPartsStreamMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ErpPartsStream record);

    int insertSelective(ErpPartsStream record);

    ErpPartsStream selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ErpPartsStream record);

    int updateByPrimaryKey(ErpPartsStream record);
}