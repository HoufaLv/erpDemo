package com.ksit.erp.mapper;

import com.ksit.erp.entity.Parts;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PartsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Parts record);

    int insertSelective(Parts record);

    Parts selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Parts record);

    int updateByPrimaryKey(Parts record);
}