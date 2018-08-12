package com.ksit.erp.controller;

import com.ksit.erp.dto.ServerResponse;
import com.ksit.erp.entity.ErpCar;
import com.ksit.erp.entity.ErpCustomer;
import com.ksit.erp.exception.ServiceException;
import com.ksit.erp.service.ICarService;
import com.ksit.erp.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by houfalv on 2018/8/8.
 */
@Controller
@RequestMapping("/car")
public class CarController {

    @Autowired
    private ICarService iCarService;
    @Autowired
    private ICustomerService iCustomerService;

    /**
     * 根据车牌号查询车辆是否存在
     * @param licenceNo
     * @return
     */
    @RequestMapping(value = "/check/{licenceNo}",method = RequestMethod.GET)
    @ResponseBody
    public ServerResponse checkCarByLicenceNo(@PathVariable(name = "licenceNo") String licenceNo){
        return iCarService.checkCarByLicenceNo(licenceNo);
    }

    /**
     * 新增车辆，将所有用户信息传过去，新增车辆和车主信息s
     * @return
     */
    @RequestMapping(value = "/new",method = RequestMethod.GET)
    public String newCar(Model model){
        List<ErpCustomer> customerList = iCustomerService.listCustomer();
        model.addAttribute("customerList",customerList);
        return "car/new";
    }

    @RequestMapping(value = "/new",method = RequestMethod.POST)
    public String newCar(ErpCar erpCar){
        try {
            iCarService.newCar(erpCar);
        } catch (ServiceException e) {
            e.printStackTrace();
        }
        return "car/list";
    }

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    @ResponseBody
    public Object test(){
        return new ErpCar();
    }
}
