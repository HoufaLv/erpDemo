package com.ksit.erp.controller;

import com.github.pagehelper.PageInfo;
import com.ksit.erp.dto.ServerResponse;
import com.ksit.erp.entity.ErpParts;
import com.ksit.erp.entity.ErpPartsType;
import com.ksit.erp.service.IPartsService;
import com.ksit.erp.service.IPartsTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by houfalv on 2018/8/7.
 */
@Controller
@RequestMapping(value = "/storage/parts")
public class PartsController {

    @Autowired
    private IPartsTypeService iPartsTypeService;
    @Autowired
    private IPartsService iPartsService;


    /**
     * 配件管理首页
     * @param model
     * @return
     */
    @RequestMapping(method = RequestMethod.GET)
    public String home(@RequestParam(name = "pageNo", required = false, defaultValue = "1") Integer pageNo,
                       @RequestParam(value = "partsName", required = false) String partsName,
                       @RequestParam(value = "inventory", required = false) Integer inventory,
                       @RequestParam(value = "partsType", required = false) Integer partsType,
                       Model model){
        List<ErpPartsType> partsTypeList = iPartsTypeService.listPartsType();
        PageInfo<ErpParts> partsPageInfo = iPartsTypeService.queryPartsByConditionWithPage(pageNo, partsName, inventory, partsType);

        model.addAttribute("pageInfo",partsPageInfo);
        model.addAttribute("typeList",partsTypeList);
        return "parts/list";
    }

    /**
     * 删除配件，暂不处理关联关系
     * @param id
     * @return
     */
    @RequestMapping(value = "/delete/{id:\\d+}",method = RequestMethod.GET)
    public ServerResponse deleteParts(@PathVariable(value = "id",required = true) Integer id){
        return ServerResponse.createByErrorMessage("删除失败");
    }

    /**
     * 更新配件
     * @return
     */
    @RequestMapping(value = "/update/{id:\\d+}",method = RequestMethod.GET)
    public String updateParts(){
        return "parts/edit";
    }

    /**
     * 返回所有配件列表
     * @return
     */
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    @ResponseBody
    public String listParts(){
       //return iPartsService.listPartsWithType();
        return null;
    }

    //根据配件类型返回对应所有的配件
    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String newPermission(){
        return "manage/permission/home";
    }
}
