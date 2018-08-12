package com.ksit.erp.service.serviceImpl;

import com.ksit.erp.dto.ServerResponse;
import com.ksit.erp.entity.ErpService;
import com.ksit.erp.mapper.ErpServiceMapper;
import com.ksit.erp.service.IDutyService;
import com.ksit.erp.vo.ErpServiceVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by houfalv on 2018/8/9.
 */
@Service
public class DutyServiceImpl implements IDutyService {

    @Autowired
    private ErpServiceMapper erpServiceMapper;

    /**
     * 新增车辆服务
     *
     * @param erpServiceVo
     * @return
     */
    @Override
    public ServerResponse newService(ErpServiceVo erpServiceVo) {

        ErpService erpService = new ErpService();

        erpService.setServiceName(erpServiceVo.getServiceName());
        erpService.setServiceHour(Integer.valueOf(erpServiceVo.getServiceHour()));
        erpService.setServiceNo(Integer.valueOf(erpServiceVo.getServiceNo()));

        int resultCount = erpServiceMapper.selectByServiceNo(erpService.getServiceNo());
        if (resultCount>0) {
            return ServerResponse.createByErrorMessage("服务编号已经存在!");
        }

        erpServiceMapper.insert(erpService);
        return ServerResponse.createBySuccessMessage("添加成功");
    }

    /**
     * 服务列表
     *
     * @return
     */
    @Override
    public List<ErpService> listService() {
        return erpServiceMapper.listService();
    }
}
