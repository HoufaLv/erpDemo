package com.ksit.erp.controller;

import com.ksit.erp.dto.PermissionDTO;
import com.ksit.erp.dto.ServerResponse;
import com.ksit.erp.entity.Permission;
import com.ksit.erp.service.IPermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 权限管理业务控制器
 * Created by houfalv on 2018/7/27.
 */
@Controller
@RequestMapping("/manage/permission")
public class PermissionController {

    @Autowired
    private IPermissionService iPermissionService;

    /**
     * 跳转首页,树形结构顺序乱了的问题
     * 为什么会混乱，因为新增之后会出现顺序不一致的问题
     *
     * @return
     */
    @RequestMapping(method = RequestMethod.GET)
    public String home(Model model) {
        //List<Permission> permissionList = iPermissionService.listPermission();
        List<Permission> permissionList = iPermissionService.findAllPermissionSort();

        model.addAttribute("permissionList", permissionList);
        return "manage/permission/home";
    }

    /**
     * 添加权限
     *
     * @return
     */
    @RequestMapping(value = "/new", method = RequestMethod.GET)
    public String newPermission(Model model) {
        List<Permission> permissionList = iPermissionService.listPermission();
        model.addAttribute("permissionList", permissionList);
        return "manage/permission/new";
    }

    @RequestMapping(value = "/new", method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse<String> newPermission(Permission permission) {
        return iPermissionService.newPermission(permission);
    }

    /**
     * 更新权限
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/update/{id:\\d+}", method = RequestMethod.GET)
    @ResponseBody
    public ServerResponse updatePermission(@PathVariable(required = true, name = "id") Integer id,
                                           Model model) {
        Permission permission = iPermissionService.queryPermissionById(id);
        return ServerResponse.createBySuccess(permission);
    }

    /**
     * 更新权限，同时可以修改树形结构，可以更改权限的父权限，从而改变树形结构
     *
     * @param permissionDTO
     * @return
     */
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse updatePermission(PermissionDTO permissionDTO) {
        return iPermissionService.updatePermission(permissionDTO);
    }

    /**
     * 返回去除本权限以及本权限下所有子权限，将列表返回给前端
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/queryPermissionExclude/{id:\\d+}", method = RequestMethod.GET)
    @ResponseBody
    public ServerResponse queryPermissionExclude(@PathVariable(required = true, name = "id") Integer id) {
        return iPermissionService.queryPermissionListExcludeId(id);
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
     * 向前端返回所有权限信息
     * @return
     */
    @RequestMapping(value = "/listPermission",method = RequestMethod.GET)
    @ResponseBody
    public ServerResponse listPermission(){
        return ServerResponse.createBySuccess(iPermissionService.listPermission());
    }

}
