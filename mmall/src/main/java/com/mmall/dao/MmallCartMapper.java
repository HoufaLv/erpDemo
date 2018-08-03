package com.mmall.dao;

import com.mmall.pojo.MmallCart;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MmallCartMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MmallCart record);

    int insertSelective(MmallCart record);

    MmallCart selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MmallCart record);

    int updateByPrimaryKey(MmallCart record);
}