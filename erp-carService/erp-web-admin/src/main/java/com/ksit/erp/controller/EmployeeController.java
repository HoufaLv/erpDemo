package com.ksit.erp.controller;

import com.ksit.erp.dto.ServerResponse;
import com.ksit.erp.entity.Employee;
import com.ksit.erp.entity.Role;
import com.ksit.erp.service.IEmployeeService;
import com.ksit.erp.service.IRoleService;
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
     *
     * @param model
     * @return
     */
    @RequestMapping(method = RequestMethod.GET)
    public String home(Model model) {
        List<Employee> employeeList = iEmployeeService.listEmployee();
        model.addAttribute("employeeList", employeeList);
        return "manage/employee/home";
    }

    /**
     * 新增员工，跳转到新增首页
     *
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

    @RequestMapping(value = "/delete/{id:\\d+}",method = RequestMethod.GET)
    @ResponseBody
    public ServerResponse deleteEmployee(@PathVariable(name = "id",required = true) Integer id){
        return iEmployeeService.deleteEmployee(id);
    }
}
