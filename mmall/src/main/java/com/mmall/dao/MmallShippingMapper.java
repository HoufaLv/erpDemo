package com.mmall.dao;

import com.mmall.pojo.MmallShipping;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MmallShippingMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MmallShipping record);

    int insertSelective(MmallShipping record);

    MmallShipping selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MmallShipping record);

    int updateByPrimaryKey(MmallShipping record);
}