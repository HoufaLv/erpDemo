package com.ksit.erp.service;

import com.github.pagehelper.PageInfo;
import com.ksit.erp.entity.ErpParts;
import com.ksit.erp.entity.ErpPartsType;

import java.util.List;

/**
 * Created by houfalv on 2018/8/7.
 */
public interface IPartsTypeService {

    /**
     * 返回所有配件类型
     * @return
     */
    List<ErpPartsType> listPartsType();

    /**
     * 根据条件查询对应的配件信息
     * @param pageNo
     * @param partsName
     * @param inventory
     * @param partsType
     * @return
     */
    PageInfo<ErpParts> queryPartsByConditionWithPage(Integer pageNo, String partsName, Integer inventory, Integer partsType);

}
