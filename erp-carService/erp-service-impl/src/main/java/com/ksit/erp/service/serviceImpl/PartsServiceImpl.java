package com.ksit.erp.service.serviceImpl;

import com.ksit.erp.dto.ServerResponse;
import com.ksit.erp.entity.ErpParts;
import com.ksit.erp.mapper.ErpPartsMapper;
import com.ksit.erp.service.IPartsService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by houfalv on 2018/8/7.
 */
@Service
public class PartsServiceImpl implements IPartsService {

    @Autowired
    private ErpPartsMapper erpPartsMapper;

    /**
     * 根据配件类型 查询对应的所有配件
     *
     * @return
     * @param id
     */
    @Override
    public List<ErpParts> listPartsByType(String id) {
        return erpPartsMapper.queryPartsByTypeID(id);
    }
}
