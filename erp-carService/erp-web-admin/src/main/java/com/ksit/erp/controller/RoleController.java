package com.ksit.erp.controller;

import com.ksit.erp.dto.ServerResponse;
import com.ksit.erp.entity.Permission;
import com.ksit.erp.entity.Role;
import com.ksit.erp.service.IPermissionService;
import com.ksit.erp.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * Created by houfalv on 2018/7/31.
 */
@Controller
@RequestMapping("/manage/role")
public class RoleController {

    @Autowired
    private IRoleService iRoleService;
    @Autowired
    private IPermissionService iPermissionService;

    /**
     * 跳转到角色管理首页
     * 将角色页面中的数据展示出来
     * @return
     */
    @RequestMapping(method = RequestMethod.GET)
    public String home(Model model){
        List<Role> roleList = iRoleService.listRoleWithPermission();
        model.addAttribute("roleList",roleList);
        return "manage/role/home";
    }


    /**
     * 跳转到新增角色页面，将权限列表传过去,供角色挑选
     * @return
     */
    @RequestMapping(value = "/new",method = RequestMethod.GET)
    @ResponseBody
    public ServerResponse newRole(){
        return iRoleService.callBackPermissionListSort();
    }

    @RequestMapping(value = "/new",method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse newPermission(String roleName,String roleCode,Integer[] permissionId){
       return iRoleService.newPermission(roleName,roleCode,permissionId);
    }

    /**
     * 根据id 查询对应的角色信息
     * @param id
     * @return
     */
    @RequestMapping(value = "/{id:\\d+}",method = RequestMethod.GET)
    @ResponseBody
    public ServerResponse queryRoleById(@PathVariable(name = "id",required = true) Integer id){
        return iRoleService.queryRoleById(id);
    }


    /**
     * 根据id 更新对应的角色信息
     * @return
     */
    @RequestMapping(value = "/update/{id:\\d+}",method = RequestMethod.GET)
    public String updatePermission(@PathVariable(value = "id",required = true) Integer id,
                                   Model model){
        Role role = iRoleService.selectRoleById(id);

        Map<Permission,Boolean> permissionBooleanMap = iRoleService.permissionBooleanMap(role.getPermissionList());

        model.addAttribute("permissionBooleanMap",permissionBooleanMap);

        model.addAttribute("role",role);
        return "manage/role/update";
    }

    @RequestMapping(value = "/update/{id:\\d+}",method = RequestMethod.POST)
    public String updatePermission(Role role,Integer[] permissionId){
        iRoleService.updatePermission(role,permissionId);
        return "redirect:/manage/role";
    }

    /**
     * 删除角色
     * @param id
     * @return
     */
    @RequestMapping(value = "/delete/{id:\\d+}",method = RequestMethod.GET)
    @ResponseBody
    public ServerResponse delRole(@PathVariable(name = "id",required = true) Integer id){
        return iRoleService.delRole(id);
    }
}
