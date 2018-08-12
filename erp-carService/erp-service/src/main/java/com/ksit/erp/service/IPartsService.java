package com.ksit.erp.service;

import com.ksit.erp.entity.ErpParts;

import java.util.List;

/**
 * Created by houfalv on 2018/8/7.
 */
public interface IPartsService {

    /**
     * 根据配件类型 查询对应的所有配件
     * @return
     * @param id
     */
    List<ErpParts> listPartsByType(String id);
}
