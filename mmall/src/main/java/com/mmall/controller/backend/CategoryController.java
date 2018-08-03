package com.mmall.controller.backend;

import com.mmall.common.ServerResponse;
import com.mmall.pojo.MmallCategory;
import com.mmall.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * 品类 业务控制器
 * Created by houfalv on 2018/7/16.
 */
@Controller
@RequestMapping("/manage/category")
public class CategoryController {

    @Autowired
    private ICategoryService iCategoryService;

    /**
     * 获取品类子节点(平级)
     *
     * @param categoryId
     * @return
     */
    @RequestMapping(value = "/get_category.do", method = RequestMethod.GET)
    @ResponseBody
    public ServerResponse<List<MmallCategory>> getCategory(HttpSession httpSession,
                                                           @RequestParam(value = "categoryId", defaultValue = "0") String categoryId) {
        return iCategoryService.getCategory(httpSession, categoryId);
    }

    /**
     * 添加品类
     * @param httpSession
     * @param parentId
     * @param paramName
     * @return
     */
    @RequestMapping(value = "/add_category.do", method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse<String> addCategory(HttpSession httpSession,
                                              @RequestParam(value = "parentId", defaultValue = "0") String parentId,
                                              String paramName) {
        return iCategoryService.addCategory(httpSession, parentId, paramName);
    }

    /**
     * 更新品类名称
     * @param httpSession
     * @param categoryId
     * @param categoryName
     * @return
     */
    @RequestMapping(value = "/set_category_name.do",method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse<String> setCategoryName(HttpSession httpSession,
                                                  String categoryId,
                                                  String categoryName){
        return iCategoryService.setCategoryName(httpSession,categoryId,categoryName);
    }

    /**
     * 获取当前分类id 及递归子节点id
     * @param httpSession
     * @param categoryId
     * @return
     */
    @RequestMapping(value = "/get_deep_category.do",method = RequestMethod.GET)
    @ResponseBody
    public ServerResponse getDeepCategory(HttpSession httpSession,
                                          String categoryId){
        return iCategoryService.getDeepCategory(httpSession,categoryId);
    }
}
