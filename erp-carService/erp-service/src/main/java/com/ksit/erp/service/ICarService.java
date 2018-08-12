package com.ksit.erp.service;

import com.ksit.erp.dto.ServerResponse;
import com.ksit.erp.entity.ErpCar;

/**
 * Created by houfalv on 2018/8/8.
 */
public interface ICarService {

    /**
     * 根据车牌号查询车辆是否存在
     * @param licenceNo
     * @return
     */
    ServerResponse checkCarByLicenceNo(String licenceNo);

    /**
     * 根据车牌号查询车辆信息以及对应的车主信息
     * @param licenceNo
     * @return
     */
    ErpCar queryCarWithCustomerByLicenceNo(String licenceNo);

    /**
     * 新增车辆
     * @param erpCar
     */
    void newCar(ErpCar erpCar);
}
