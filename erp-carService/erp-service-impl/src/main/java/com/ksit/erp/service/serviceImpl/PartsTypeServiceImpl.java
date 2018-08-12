package com.ksit.erp.service.serviceImpl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ksit.erp.entity.ErpParts;
import com.ksit.erp.entity.ErpPartsType;
import com.ksit.erp.mapper.ErpPartsMapper;
import com.ksit.erp.mapper.ErpPartsTypeMapper;
import com.ksit.erp.service.IPartsTypeService;
import com.ksit.erp.util.Const;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by houfalv on 2018/8/7.
 */
@Service
public class PartsTypeServiceImpl implements IPartsTypeService {

    @Autowired
    private ErpPartsMapper erpPartsMapper;
    @Autowired
    private ErpPartsTypeMapper erpPartsTypeMapper;

    /**
     * 返回所有配件类型
     *
     * @return
     */
    @Override
    public List<ErpPartsType> listPartsType() {
        return erpPartsTypeMapper.listPartsType();
    }

    /**
     * 根据条件查询对应的配件信息
     *
     * @param pageNo
     * @param partsName
     * @param inventory
     * @param partsType
     * @return
     */
    @Override
    public PageInfo<ErpParts> queryPartsByConditionWithPage(Integer pageNo, String partsName, Integer inventory, Integer partsType) {

        PageHelper.startPage(pageNo,Const.DEFAULT_PAGESIZE);

        Map<String,Object> queryMap = new HashMap<>();
        queryMap.put("partsName",partsName);
        queryMap.put("inventory",inventory);
        queryMap.put("partsType",partsType);

        List<ErpParts> erpPartsList = erpPartsMapper.queryPartsByConditionWithPage(queryMap);

        PageInfo<ErpParts> pageInfo = new PageInfo<>(erpPartsList);

        return pageInfo;

    }
}
