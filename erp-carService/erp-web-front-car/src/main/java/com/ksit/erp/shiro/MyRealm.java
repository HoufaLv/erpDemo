package com.ksit.erp.shiro;

import com.ksit.erp.entity.Employee;
import com.ksit.erp.entity.EmployeeLoginLog;
import com.ksit.erp.entity.Permission;
import com.ksit.erp.entity.Role;
import com.ksit.erp.service.IEmployeeService;
import com.ksit.erp.service.IPermissionService;
import com.ksit.erp.service.IRoleService;
import com.ksit.erp.util.Const;
import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.*;

/**
 * Created by houfalv on 2018/7/30.
 */
public class MyRealm extends AuthorizingRealm {

    @Autowired
    private IPermissionService iPermissionService;
    @Autowired
    private IEmployeeService iEmployeeService;
    @Autowired
    private IRoleService iRoleService;

    /**
     * 授权
     *
     * @param principalCollection
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        Employee employee = (Employee) principalCollection.getPrimaryPrincipal();

        Set<String> roles = new HashSet<>();
        Set<String> stringPermissions = new HashSet<>();

        ArrayList<Permission> permissionList = new ArrayList<>();

        //找到当前登陆账号的所有的角色
        List<Role> roleList = iRoleService.findRolesWithEmployeeId(employee.getId());

        for (Role role : roleList) {
            //根据每一个角色id 找到所有的权限列表
            List<Permission> currentList = iPermissionService.findPermissionWithRoleId(role.getId());
            permissionList.addAll(currentList);
        }

        //添加所有角色代号
        for (Role role : roleList) {
            roles.add(role.getRoleCode());
        }
        //添加所有权限代号
        for (Permission permission : permissionList) {
            stringPermissions.add(permission.getPermissionCode());
        }

        SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
        simpleAuthorizationInfo.setRoles(roles);
        simpleAuthorizationInfo.setStringPermissions(stringPermissions);

        return simpleAuthorizationInfo;
    }

    /**
     * 登陆
     *
     * @param authenticationToken
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        UsernamePasswordToken usernamePasswordToken = (UsernamePasswordToken) authenticationToken;

        //usernamePasswordToken 获得账户信息，拿这个信息去后台比对，
        String userEmail = usernamePasswordToken.getUsername();
        Employee employee = iEmployeeService.queryEmployeeByEmail(userEmail);

        if (employee == null) {
            throw new UnknownAccountException("用户名或者密码错误");
        }

        //判断账户是否冻结，如果账户的status 不等于2 ，则判断为冻结
        if (StringUtils.equals(String.valueOf(employee.getEmployeeState()),Const.EMPLOYEE_NROMAL)) {
            String loginIp = usernamePasswordToken.getHost();
            EmployeeLoginLog employeeLoginLog = new EmployeeLoginLog();
            employeeLoginLog.setLoginIp(loginIp);
            employeeLoginLog.setLoginTime(new Date());
            employeeLoginLog.setEmployeeId(employee.getId());
            iEmployeeService.saveLoginLog(employeeLoginLog);

            //登陆成功
            return new SimpleAuthenticationInfo(employee, employee.getEmployeePassword(), getName());

        }
        throw new LockedAccountException("账户被锁定");

    }
}
