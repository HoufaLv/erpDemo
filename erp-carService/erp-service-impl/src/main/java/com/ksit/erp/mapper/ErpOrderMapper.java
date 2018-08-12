package com.ksit.erp.mapper;

import com.ksit.erp.entity.ErpOrder;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ErpOrderMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ErpOrder record);

    int insertSelective(ErpOrder record);

    ErpOrder selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ErpOrder record);

    int updateByPrimaryKey(ErpOrder record);
}