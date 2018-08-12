package com.ksit.erp.controller;

import com.ksit.erp.dto.ServerResponse;
import com.ksit.erp.service.IDutyService;
import com.ksit.erp.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by houfalv on 2018/8/8.
 */
@Controller
@RequestMapping(value = "/order")
public class OrderController {

    @Autowired
    private IOrderService iOrderService;
    /**
     * 跳转到新增订单首页
     * @return
     */
    @RequestMapping(value = "/new",method = RequestMethod.GET)
    public String newOrder(){
        return "order/new";
    }


    /**
     * 返回所有服务列表
     * @return
     */
    @RequestMapping(value = "/service/list",method = RequestMethod.GET)
    @ResponseBody
    public ServerResponse listServiceType(){
        return iOrderService.listServiceType();
    }

    /**
     * 返回所有配件类型列表
     * @return
     */
    @RequestMapping(value = "/partsType/list",method = RequestMethod.GET)
    @ResponseBody
    public ServerResponse listPartsType(){
        return iOrderService.listPartsType();
    }

    /**
     * 根据配件类型 查出对应的所有配件列表
     * @param id
     * @return
     */
    @RequestMapping(value = "/parts/partsType/{id}",method = RequestMethod.GET)
    @ResponseBody
    public ServerResponse listPartsByType(@PathVariable String id){
        return iOrderService.listPartsByType(id);
    }
}
