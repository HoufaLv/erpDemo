package com.ksit.erp.service.serviceImpl;

import com.ksit.erp.dto.ServerResponse;
import com.ksit.erp.entity.Employee;
import com.ksit.erp.entity.EmployeeLoginLog;
import com.ksit.erp.entity.EmployeeRole;
import com.ksit.erp.exception.ServiceException;
import com.ksit.erp.mapper.EmployeeLoginLogMapper;
import com.ksit.erp.mapper.EmployeeMapper;
import com.ksit.erp.mapper.EmployeeRoleMapper;
import com.ksit.erp.service.IEmployeeService;
import com.ksit.erp.util.Const;
import org.apache.commons.codec.digest.DigestUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 * Created by houfalv on 2018/7/26.
 */
@Service
public class EmployeeServiceImpl implements IEmployeeService {

    private Logger logger = LoggerFactory.getLogger(IEmployeeService.class);

    @Autowired
    private EmployeeMapper employeeMapper;
    @Autowired
    private EmployeeLoginLogMapper employeeLoginLogMapper;
    @Autowired
    private EmployeeRoleMapper employeeRoleMapper;

    @Override
    public Employee queryEmployeeById(int i) {
        return employeeMapper.selectByPrimaryKey(i);
    }

    /**
     * 用户登陆
     *
     * @param employeeEmail
     * @param employeePassword
     * @param remoteAddr
     * @return
     */
    @Override
    @Transactional(rollbackFor = RuntimeException.class)
    public Employee login(String employeeEmail, String employeePassword, String remoteAddr) throws ServiceException {
        Employee employee = employeeMapper.queryByEmployeeEmail(employeeEmail);
        if (employee!=null) {
            if (employee.getEmployeeState().equals(Integer.valueOf(Const.EMPLOYEE_NROMAL))) {
                if (employee.getEmployeePassword().equals(DigestUtils.md5Hex(employeePassword))) {

                    //添加登陆日志
                    EmployeeLoginLog employeeLoginLog = new EmployeeLoginLog();
                    employeeLoginLog.setEmployeeId(employee.getId());
                    employeeLoginLog.setLoginTime(new Date());
                    employeeLoginLog.setLoginIp(remoteAddr);

                    employeeLoginLogMapper.insert(employeeLoginLog);
                    logger.info("雇员登陆",employee);
                    return employee;
                }
                throw new ServiceException("账户密码错误");
            }
            throw new ServiceException("账户冻结");
        }
        throw new ServiceException("账户不存在");
    }

    /**
     * 根据用户邮箱 查询用户信息
     *
     * @param userEmail
     * @return
     */
    @Override
    public Employee queryEmployeeByEmail(String userEmail) {
        return employeeMapper.queryByEmployeeEmail(userEmail);
    }

    /**
     * 新增用户
     *
     * @param employee
     * @param roleIds
     */
    @Override
    @Transactional(rollbackFor = RuntimeException.class)
    public void newEmployee(Employee employee, Integer[] roleIds) {
        int resultCount = employeeMapper.validate(new HashMap<String,Object>(){
            {
                put("employee_name",employee.getEmployeeName());
                put("employee_tel",employee.getEmployeeTel());
                put("employee_email",employee.getEmployeeEmail());
            }
        });

        if (!(resultCount>0)) {

            String md5Password = DigestUtils.md5Hex(employee.getEmployeePassword());
            employee.setEmployeePassword(md5Password);
            employee.setEmployeeCreateTime(new Date());
            employee.setEmployeeState(Integer.valueOf(Const.EMPLOYEE_NROMAL));

            int generatedId = 0;

            try {
                employeeMapper.insert(employee);
            } catch (Exception e) {
                e.printStackTrace();
                throw new ServiceException("添加失败");
            }

            generatedId = employee.getId();

            for (Integer roleId : roleIds) {
                EmployeeRole employeeRole = new EmployeeRole();
                employeeRole.setEmployeeId(generatedId);
                employeeRole.setRoleId(roleId);
                employeeRoleMapper.insert(employeeRole);
            }

        }else{
            throw new ServiceException("用户已存在，添加失败");
        }
    }

    /**
     * 返回所有员工信息
     *
     * @return
     */
    @Override
    public List<Employee> listEmployee() {
        return employeeMapper.listEmployeeWithRole();
    }

    /**
     * 通过id 查询员工信息和员工对应的角色列表
     *
     * @param id
     * @return
     */
    @Override
    public Employee queryEmployeeWithRoleById(Integer id) {
        return employeeMapper.queryEmployeeWithRoleById(id);
    }

    /**
     * 更新员工
     *
     * @param employee
     * @param roleIds
     */
    @Override
    @Transactional(rollbackFor = RuntimeException.class)
    public void updateRole(Employee employee, Integer[] roleIds) {
        //更新员工信息，删除原有的 员工->角色 对应关系，重建对应关系
        Employee originEmployee = employeeMapper.selectByPrimaryKey(employee.getId());
        if (originEmployee==null) {
            throw new ServiceException("账户不存在");
        }

        employeeMapper.updateByPrimaryKeySelective(employee);
        employeeRoleMapper.deleteByEmployeeId(employee.getId());

        for (Integer roleId : roleIds) {
            EmployeeRole employeeRole = new EmployeeRole();
            employeeRole.setEmployeeId(employee.getId());
            employeeRole.setRoleId(roleId);
            //添加对应关系
            employeeRoleMapper.insert(employeeRole);
        }

    }

    /**
     * 删除雇员
     *
     * @param id
     * @return
     */
    @Override
    @Transactional(rollbackFor = RuntimeException.class)
    public ServerResponse deleteEmployee(Integer id) {

        Employee employee = employeeMapper.selectByPrimaryKey(id);
        if (employee==null) {
            return ServerResponse.createByErrorMessage("雇员不存在！");
        }

        employeeRoleMapper.deleteByEmployeeId(id);
        int resultCount = employeeMapper.deleteByPrimaryKey(id);

        if (resultCount>0) {
            return ServerResponse.createBySuccessMessage("删除成功!");
        }

        return ServerResponse.createByErrorMessage("删除失败!");
    }

    /**
     * 冻结账户
     *
     * @param id
     * @return
     */
    @Override
    public ServerResponse iceEmployee(Integer id) {

        int resultCount = employeeMapper.iceEmployee(id);
        if (resultCount>0) {
            return ServerResponse.createBySuccessMessage("冻结成功!");
        }
        return ServerResponse.createByErrorMessage("系统异常，请稍后再试");
    }

    /**
     * 根据账号或者邮箱 和 角色类型来查询对应的员工
     *
     * @param paramMap
     * @return
     */
    @Override
    public List<Employee> queryEmployeeByQueryParam(HashMap<String, Object> paramMap) {
        return employeeMapper.queryEmployeeByQueryParam(paramMap);
    }

    /**
     * 保存登陆日志
     *
     * @param employeeLoginLog
     */
    @Override
    public void saveLoginLog(EmployeeLoginLog employeeLoginLog) {
        employeeLoginLogMapper.insert(employeeLoginLog);
    }

    /**
     * 账户启用
     *
     * @param id
     * @return
     */
    @Override
    public ServerResponse unLockEmployee(Integer id) {
        int resultCount = employeeMapper.unLockEmployee(id);
        if (resultCount>0) {
            return ServerResponse.createBySuccessMessage("启用成功!");
        }
        return ServerResponse.createByErrorMessage("系统异常，请稍后再试");
    }
}
