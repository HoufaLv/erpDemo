package com.ksit.erp.service.serviceImpl;

import com.ksit.erp.dto.ServerResponse;
import com.ksit.erp.entity.ErpCar;
import com.ksit.erp.mapper.ErpCarMapper;
import com.ksit.erp.service.ICarService;
import com.ksit.erp.util.Const;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;

/**
 * Created by houfalv on 2018/8/8.
 */
@Service
public class CarServiceImpl implements ICarService {

    @Autowired
    private ErpCarMapper erpCarMapper;

    /**
     * 根据车牌号查询车辆是否存在
     *
     * @param licenceNo
     * @return
     */
    @Override
    public ServerResponse checkCarByLicenceNo(String licenceNo) {
        if (licenceNo==null) {
            return ServerResponse.createByErrorMessage("车牌号不能为null");
        }

        int resultCount = erpCarMapper.validate(new HashMap<String,Object>(){
            {
                put(Const.TABLE_ERP_CAR_CAR_LICENCE,licenceNo);
            }
        });

        if (resultCount>0) {
            //如果车辆存在

            ErpCar erpCar = erpCarMapper.queryCarWithCustomerByLicenceNo(licenceNo);
            return ServerResponse.createBySuccess(erpCar);
        }
        return ServerResponse.createByErrorMessage("未找到该车辆");
    }

    /**
     * 根据车牌号查询车辆信息以及对应的车主信息
     *
     * @param licenceNo
     * @return
     */
    @Override
    public ErpCar queryCarWithCustomerByLicenceNo(String licenceNo) {
        return erpCarMapper.queryCarWithCustomerByLicenceNo(licenceNo);
    }

    /**
     * 新增车辆
     *
     * @param erpCar
     */
    @Override
    public void newCar(ErpCar erpCar) {
        erpCar.setCarCreateTime(new Date());
        erpCarMapper.insert(erpCar);
    }
}
