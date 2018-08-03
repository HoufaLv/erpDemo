package com.lv.mapper;

import com.lv.entity.ScenicCommon;
import com.lv.entity.ScenicCommonExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ScenicCommonMapper {
    long countByExample(ScenicCommonExample example);

    int deleteByExample(ScenicCommonExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ScenicCommon record);

    int insertSelective(ScenicCommon record);

    List<ScenicCommon> selectByExample(ScenicCommonExample example);

    ScenicCommon selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ScenicCommon record, @Param("example") ScenicCommonExample example);

    int updateByExample(@Param("record") ScenicCommon record, @Param("example") ScenicCommonExample example);

    int updateByPrimaryKeySelective(ScenicCommon record);

    int updateByPrimaryKey(ScenicCommon record);
}