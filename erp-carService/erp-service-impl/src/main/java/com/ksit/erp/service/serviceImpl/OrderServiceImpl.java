package com.ksit.erp.service.serviceImpl;

import com.github.pagehelper.util.StringUtil;
import com.ksit.erp.dto.ServerResponse;
import com.ksit.erp.entity.ErpParts;
import com.ksit.erp.entity.ErpPartsType;
import com.ksit.erp.entity.ErpService;
import com.ksit.erp.service.IDutyService;
import com.ksit.erp.service.IOrderService;
import com.ksit.erp.service.IPartsService;
import com.ksit.erp.service.IPartsTypeService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by houfalv on 2018/8/10.
 */
@Service
public class OrderServiceImpl implements IOrderService {

    @Autowired
    private IDutyService iDutyService;
    @Autowired
    private IPartsTypeService iPartsTypeService;
    @Autowired
    private IPartsService iPartsService;


    @Override
    public ServerResponse listServiceType() {
        List<ErpService> erpServiceList = iDutyService.listService();
        return ServerResponse.createBySuccess(erpServiceList);
    }

    @Override
    public ServerResponse listPartsType() {
        List<ErpPartsType> partsTypeList = iPartsTypeService.listPartsType();
        return ServerResponse.createBySuccess(partsTypeList);
    }

    @Override
    public ServerResponse listPartsByType(String id) {
        if (StringUtils.isEmpty(id)) {
            return ServerResponse.createByErrorMessage("配件类型不能为空");
        }
        List<ErpParts> partsList = iPartsService.listPartsByType(id);
        return ServerResponse.createBySuccess(partsList);
    }
}
