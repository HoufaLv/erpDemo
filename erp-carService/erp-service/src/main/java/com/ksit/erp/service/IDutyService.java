package com.ksit.erp.service;

import com.ksit.erp.dto.ServerResponse;
import com.ksit.erp.entity.ErpService;
import com.ksit.erp.vo.ErpServiceVo;

import java.util.List;

/**
 * Created by houfalv on 2018/8/9.
 */
public interface IDutyService {

    /**
     * 新增车辆服务
     * @param erpService
     * @return
     */
    ServerResponse newService(ErpServiceVo erpService);

    /**
     * 服务列表
     * @return
     */
    List<ErpService> listService();
}
