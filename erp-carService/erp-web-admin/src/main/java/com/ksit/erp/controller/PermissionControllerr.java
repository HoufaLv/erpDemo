package com.ksit.erp.controller;

import com.ksit.erp.dto.ServerResponse;
import com.ksit.erp.entity.Permission;
import com.ksit.erp.service.IPermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

/**
 * Created by houfalv on 2018/7/30.
 */
@Controller
@RequestMapping("/manage1/permission")
public class PermissionControllerr {
    @Autowired
    private IPermissionService iPermissionService;

    /**
     * 跳转首页
     *
     * @return
     */
    @RequestMapping(method = RequestMethod.GET)
    public String home(Model model) {
        List<Permission> permissionList = iPermissionService.listPermission();
        model.addAttribute("permissionList", permissionList);
        return "manage/permission/home";
    }

    /**
     * 删除权限
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/delete/{id:\\d+}", method = RequestMethod.GET)
    @ResponseBody
    public ServerResponse delPermission(@PathVariable(name = "id") Integer id) {
        return iPermissionService.delPermission(id);
    }

    /**
     * 新增权限
     *
     * @return
     */
    @RequestMapping(value = "/new", method = RequestMethod.GET)
    public String newPermission(Model model) {
        List<Permission> permissionList = iPermissionService.listPermission();
        model.addAttribute("menuPermissionList",permissionList);
        return "manage/permission/new";
    }

    @RequestMapping(value = "/new", method = RequestMethod.POST)
    public String newPermission(Permission permission,
                                RedirectAttributes redirectAttributes) {
        try {
            iPermissionService.addPermission(permission);
        } catch (Exception e) {
            redirectAttributes.addFlashAttribute("message",e.getMessage());
            e.printStackTrace();
        }
        return "redirect:/manage/permission";
    }

    /**
     * 修改权限
     * @return
     */
    @RequestMapping(value = "/edit/{id:\\d+}",method = RequestMethod.GET)
    public String updatePermission(){
        //将本权限排除，剩余的权限显示到页面上去

        return "manage/permission/new";
    }

    /**
     * 向前端返回所有权限信息
     * @return
     */
    @RequestMapping(value = "/listPermission",method = RequestMethod.GET)
    @ResponseBody
    public ServerResponse listPermission(){
        return ServerResponse.createBySuccess(iPermissionService.listPermission());
    }
}
