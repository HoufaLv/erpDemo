package com.ksit.erp.mapper;

import com.github.pagehelper.PageInfo;
import com.ksit.erp.entity.ErpParts;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface ErpPartsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ErpParts record);

    int insertSelective(ErpParts record);

    ErpParts selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ErpParts record);

    int updateByPrimaryKey(ErpParts record);


    List<ErpParts> queryPartsByConditionWithPage(Map<String, Object> queryMap);

    /**
     * 根据配件类型查询 分类下的所有配件
     * @param id
     * @return
     */
    List<ErpParts> queryPartsByTypeID(String id);
}