package com.ksit.erp.controller;

import com.ksit.erp.dto.ServerResponse;
import com.ksit.erp.entity.ErpService;
import com.ksit.erp.service.IDutyService;
import com.ksit.erp.vo.ErpServiceVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by houfalv on 2018/8/9.
 */
@Controller
@RequestMapping("/service")
public class ServiceController {

    @Autowired
    private IDutyService iDutyService;

    /**
     * 维修服务列表
     *
     * @return
     */
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String listService(Model model) {
        List<ErpService> erpServiceList = iDutyService.listService();
        model.addAttribute("erpServiceList",erpServiceList);
        return "service/list";
    }

    /**
     * 新增服务
     *
     * @param erpServiceVo
     * @return
     */
    @RequestMapping(value = "/new", method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse newService(ErpServiceVo erpServiceVo) {
        return iDutyService.newService(erpServiceVo);
    }
}
