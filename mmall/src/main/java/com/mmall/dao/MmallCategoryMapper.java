package com.mmall.dao;

import com.mmall.pojo.MmallCategory;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.HashMap;
import java.util.List;

@Mapper
public interface MmallCategoryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MmallCategory record);

    int insertSelective(MmallCategory record);

    MmallCategory selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MmallCategory record);

    int updateByPrimaryKey(MmallCategory record);

    /**
     * 获取品类子分类
     * @param categoryId
     * @return
     */
    List<MmallCategory> selectCategoryChildrenByParentId(String categoryId);

    /**
     * 查询parentId 是否存在
     * @param parentId
     * @return
     */
    int selectParentType(String parentId);

    /**
     * 验证分类是否存在
     * @param paramMap
     * @return
     */
    int validateCategory(@Param("paramMap") HashMap<String, Object> paramMap);

    /**
     * 根据categoryId 来修改categoryName
     * @param categoryId
     * @param categoryName
     * @return
     */
    int setCategoryName(@Param("categoryId") String categoryId, @Param("categoryName") String categoryName);
}