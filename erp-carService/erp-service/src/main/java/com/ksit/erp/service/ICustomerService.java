package com.ksit.erp.service;

import com.ksit.erp.entity.ErpCustomer;

import java.rmi.ServerException;
import java.util.List;

/**
 * Created by houfalv on 2018/8/8.
 */
public interface ICustomerService {
    /**
     * 新增客户
     * @param erpCustomer
     */
    void newCustomer(ErpCustomer erpCustomer) throws ServerException;

    List<ErpCustomer> listCustomer();
}
