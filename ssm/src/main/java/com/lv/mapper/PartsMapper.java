package com.lv.mapper;

import com.lv.entity.Parts;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface PartsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Parts record);

    int insertSelective(Parts record);

    Parts selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Parts record);

    int updateByPrimaryKey(Parts record);

    /**
     * 根据页号进行分页查找对应的List<Parts>
     * @return
     */
    List<Parts> findPageWithType();

    /**
     * 根据页号进行分页查找对应的List<Parts>
     * @return
     */
    List<Parts> listPartsByPageNo();

    /**
     * 动态分页搜索
     * @param queryMap  条件
     * @return
     */
    List<Parts> queryPartsByConditionWithPage(Map<String, Object> queryMap);

    /**
     * 验证配件信息是否存在
     * @param queryMap
     * @return
     */
    int validateParts(@Param("queryMap") Map<String, Object> queryMap);
}