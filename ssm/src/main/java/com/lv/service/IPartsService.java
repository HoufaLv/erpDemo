package com.lv.service;

import com.github.pagehelper.PageInfo;
import com.lv.common.ServerResponse;
import com.lv.entity.Parts;
import com.lv.entity.Type;

import java.util.List;
import java.util.Map;

/**
 * Created by houfalv on 2018/7/24.
 */
public interface IPartsService {

    /**
     * 分页查询Parts
     * @param pageNo
     * @return
     */
    ServerResponse<List<Parts>> listByPageNo(Integer pageNo);

    /**
     * 根据id 查询对应的Parts 对象
     * @param id
     * @return
     */
    ServerResponse<Parts> findPartsById(String id);

    /**
     * 查询所有 Type
     * @return
     */
    List<Type> listType();

    /**
     * 分页查询Parts 数据
     * @param pageNo
     * @return
     */
    PageInfo<Parts> listPartsByPageNo(Integer pageNo);

    /**
     * 根据 条件动态搜索，分页
     * @param pageNo
     * @param partsName
     * @param inventory
     * @param partsType
     * @return
     */
    PageInfo<Parts> queryPartsByConditionWithPage(Integer pageNo, String partsName, Integer inventory, Integer partsType);

    /**
     * 添加配件
     * @param parts
     */
    void addParts(Parts parts);


    /**
     * 动态验证配件信息
     * @param queryMap
     * @return
     */
    int validateParts(Map<String,Object> queryMap);

    /**
     * 根据id 查询对应的Parts 信息
     * @param id
     * @return
     */
    Parts queryPartsById(Integer id);
}
