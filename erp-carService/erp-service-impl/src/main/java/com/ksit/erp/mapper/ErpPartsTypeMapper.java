package com.ksit.erp.mapper;

import com.github.pagehelper.PageInfo;
import com.ksit.erp.entity.ErpParts;
import com.ksit.erp.entity.ErpPartsType;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface ErpPartsTypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ErpPartsType record);

    int insertSelective(ErpPartsType record);

    ErpPartsType selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ErpPartsType record);

    int updateByPrimaryKey(ErpPartsType record);

    /**
     * 返回所有配件类型列表
     * @return
     */
    List<ErpPartsType> listPartsType();


}