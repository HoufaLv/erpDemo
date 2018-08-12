package com.lv.controller;

import com.github.pagehelper.PageInfo;
import com.lv.entity.Parts;
import com.lv.entity.Type;
import com.lv.service.IPartsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;


/**
 * Created by houfalv on 2018/7/24.
 */
@Controller
@RequestMapping(value = "/parts")
public class PartsController {

    @Autowired
    private IPartsService iPartsService;


    /**
     * 分页展示，动态搜索
     *
     * @param pageNo
     * @param partsName 配件名称
     * @param inventory 配件库存
     * @param partsType 配件类型
     * @param model
     * @return
     */
    @RequestMapping(method = RequestMethod.GET)
    public String home(@RequestParam(name = "pageNo", required = false, defaultValue = "1") Integer pageNo,
                       @RequestParam(value = "partsName", required = false) String partsName,
                       @RequestParam(value = "inventory", required = false) Integer inventory,
                       @RequestParam(value = "partsType", required = false) Integer partsType,
                       Model model) {

        List<Type> typeList = iPartsService.listType();
        PageInfo<Parts> partsPageInfo = iPartsService.queryPartsByConditionWithPage(pageNo, partsName, inventory, partsType);

        model.addAttribute("pageInfo", partsPageInfo);
        model.addAttribute("typeList", typeList);
        return "parts/list";
    }

    /**
     * 添加配件
     * @param model
     * @return
     */
    @RequestMapping(value = "/new",method = RequestMethod.GET)
    public String newParts(Model model){
        List<Type> typeList = iPartsService.listType();
        model.addAttribute("typeList",typeList);
        return "parts/new";
    }

    @RequestMapping(value = "/new",method = RequestMethod.POST)
    public String newParts(Parts parts,
                           RedirectAttributes redirectAttributes){
        //todo 异常判断
        iPartsService.addParts(parts);
        return "redirect:/parts";
    }

    /**
     * 根据id 更新配件信息
     * @param id
     * @return
     */
    @RequestMapping(value = "/update/{id:\\d+}",method = RequestMethod.GET)
    public String updateParts(@PathVariable(name = "id") Integer id,
                              Model model){
        Parts parts = iPartsService.queryPartsById(id);
        List<Type> typeList = iPartsService.listType();

        model.addAttribute("parts",parts);
        model.addAttribute("typeList",typeList);

        return "parts/edit";
    }

//    @RequestMapping(value = "/update/{id:\\d+}",method = RequestMethod.POST)
//    public String updateParts(Parts parts,
//                              RedirectAttributes redirectAttributes){
//        int resultCount = iPartsService.updateParts(parts);
//
//        //todo 怎样处理异常信息
//        return "redirect:/parts";
//    }

}
