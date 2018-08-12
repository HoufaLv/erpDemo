package com.ksit.erp.controller;

import com.ksit.erp.entity.ErpCustomer;
import com.ksit.erp.exception.ServiceException;
import com.ksit.erp.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.rmi.ServerException;

/**
 * Created by houfalv on 2018/8/8.
 */
@Controller
@RequestMapping(value = "/customer")
public class CustomerController {

    @Autowired
    private ICustomerService iCustomerService;

    /**
     * 新增客户
     *
     * @return
     */
    @RequestMapping(value = "/new", method = RequestMethod.GET)
    public String newCustomer() {
        return "customer/new";
    }

    /**
     * 新增客户
     * @param erpCustomer
     * @return
     */
    @RequestMapping(value = "/new", method = RequestMethod.POST)
    public String newCustomer(ErpCustomer erpCustomer) {
        try {
            iCustomerService.newCustomer(erpCustomer);
        } catch (ServerException e) {
            e.printStackTrace();
        }
        return "customer/list";
    }

    /**
     * 跳转到客户列表首页
     *
     * @return
     */
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String listCustomer() {
        return null;
    }
}
