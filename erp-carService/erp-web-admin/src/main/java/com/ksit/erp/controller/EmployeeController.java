package com.ksit.erp.controller;

import com.google.common.collect.Maps;
import com.ksit.erp.dto.ServerResponse;
import com.ksit.erp.entity.Employee;
import com.ksit.erp.entity.Role;
import com.ksit.erp.service.IEmployeeService;
import com.ksit.erp.service.IRoleService;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by houfalv on 2018/8/2.
 */
@Controller
@RequestMapping("/manage/employee")
public class EmployeeController {

    @Autowired
    private IRoleService iRoleService;
    @Autowired
    private IEmployeeService iEmployeeService;

    /**
     * 员工首页，将所有员工数据传给前端
     * 同时完成动态搜索 功能
     * @param model
     * @return
     */
    @RequestMapping(method = RequestMethod.GET)
    public String home(@RequestParam(name = "nameMobile",required = false) String nameMobile,
                       @RequestParam(name = "roleId",required = false) Integer roleId,
                       @RequestParam(name = "status",required = false) String status,
                       Model model) {

        List<Employee> resultEmployeeList = iEmployeeService.queryEmployeeByQueryParam(new HashMap<String,Object>(){
            {
                put("nameMobile",nameMobile);
                put("roleId",roleId);
                put("status",status);
            }
        });

        //List<Employee> employeeList = iEmployeeService.listEmployee();
        List<Role> roleList = iRoleService.listRole();

        model.addAttribute("employeeList", resultEmployeeList);
        model.addAttribute("roleList",roleList);
        return "manage/employee/home";
    }

    /**
     * 新增员工，跳转到新增首页
     * 如果需要某个角色才能访问，则可以使用@RequiresRoles("角色代号")
     * @param model
     * @return
     */

    @RequestMapping(value = "/new", method = RequestMethod.GET)
    public String newEmployee(Model model) {
        List<Role> roleList = iRoleService.listRole();
        model.addAttribute("roleList", roleList);
        return "manage/employee/new";
    }

    @RequestMapping(value = "/new", method = RequestMethod.POST)
    public String newPermission(Employee employee, Integer[] roleIds,
                                RedirectAttributes redirectAttributes) {
        try {
            iEmployeeService.newEmployee(employee, roleIds);
        } catch (Exception e) {
            redirectAttributes.addFlashAttribute("message", e.getMessage());
            e.printStackTrace();
            return "redirect:/manage/employee";
        }
        redirectAttributes.addFlashAttribute("message", "添加成功");
        return "redirect:/manage/employee";
    }

    /**
     * 跳转到更新角色信息页面
     * @param id
     * @return
     */
    @RequestMapping(value = "/update/{id:\\d+}", method = RequestMethod.GET)
    public String updateRole(@PathVariable(name = "id") Integer id,
                             Model model) {
        Employee employee = iEmployeeService.queryEmployeeWithRoleById(id);
        List<Role> roleList = iRoleService.listRole();
        model.addAttribute("roleList",roleList);
        model.addAttribute("employee",employee);
        return "/manage/employee/update";
    }

    @RequestMapping(value = "/update/{id:\\d+}",method = RequestMethod.POST)
    public String updateRole(Employee employee,Integer[] roleIds,
                             RedirectAttributes redirectAttributes){
        try {
            iEmployeeService.updateRole(employee,roleIds);
        } catch (Exception e) {
            redirectAttributes.addFlashAttribute("message",e.getMessage());
            e.printStackTrace();
            return "redirect:/manage/employee";
        }
        redirectAttributes.addFlashAttribute("message","添加成功");
        return "redirect:/manage/employee";
    }

    /**
     * 删除账户
     * @param id
     * @return
     */
    @RequestMapping(value = "/delete/{id:\\d+}",method = RequestMethod.GET)
    @ResponseBody
    public ServerResponse deleteEmployee(@PathVariable(name = "id",required = true) Integer id){
        return iEmployeeService.deleteEmployee(id);
    }

    /**
     * 冻结账户
     * @param id
     * @return
     */
    @RequestMapping(value = "/ice/{id:\\d+}",method = RequestMethod.GET)
    @ResponseBody
    public ServerResponse iceEmployee(@PathVariable(name = "id",required = true) Integer id){
        return iEmployeeService.iceEmployee(id);
    }

    /**
     * 账户启用
     * @param id
     * @return
     */
    @RequestMapping(value = "/unLock/{id:\\d+}",method = RequestMethod.GET)
    @ResponseBody
    public ServerResponse unLockEmployee(@PathVariable(name = "id",required = true) Integer id){
        return iEmployeeService.unLockEmployee(id);
    }
}
