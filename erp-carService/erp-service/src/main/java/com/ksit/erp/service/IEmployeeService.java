package com.ksit.erp.service;

import com.ksit.erp.dto.ServerResponse;
import com.ksit.erp.entity.Employee;
import com.ksit.erp.entity.EmployeeLoginLog;

import java.util.HashMap;
import java.util.List;

/**
 * Created by houfalv on 2018/7/26.
 */
public interface IEmployeeService {
    Employee queryEmployeeById(int i);

    /**
     * 用户登陆
     * @param employeeEmail
     * @param employeePassword
     * @param remoteAddr
     * @return
     */
    Employee login(String employeeEmail, String employeePassword, String remoteAddr);

    /**
     * 根据用户邮箱 查询用户信息
     * @param userEmail
     * @return
     */
    Employee queryEmployeeByEmail(String userEmail);

    /**
     * 新增用户
     * @param employee
     * @param roleIds
     */
    void newEmployee(Employee employee, Integer[] roleIds);

    /**
     * 返回所有员工信息
     * @return
     */
    List<Employee> listEmployee();

    /**
     * 通过id 查询员工信息和员工对应的角色列表
     * @param id
     * @return
     */
    Employee queryEmployeeWithRoleById(Integer id);

    /**
     * 更新员工
     * @param employee
     * @param roleIds
     */
    void updateRole(Employee employee, Integer[] roleIds);

    /**
     * 删除雇员
     * @param id
     * @return
     */
    ServerResponse deleteEmployee(Integer id);

    /**
     * 冻结账户
     * @param id
     * @return
     */
    ServerResponse iceEmployee(Integer id);

    /**
     * 根据账号或者邮箱 和 角色类型来查询对应的员工
     * @param hashMap
     * @return
     */
    List<Employee> queryEmployeeByQueryParam(HashMap<String, Object> hashMap);

    /**
     * 保存登陆日志
     *
     * @param employeeLoginLog
     */
    void saveLoginLog(EmployeeLoginLog employeeLoginLog);

    /**
     * 账户启用
     * @param id
     * @return
     */
    ServerResponse unLockEmployee(Integer id);
}
