package com.ksit.erp.shiro;

import com.ksit.erp.entity.Employee;
import com.ksit.erp.entity.Permission;
import com.ksit.erp.exception.ServiceException;
import com.ksit.erp.service.IEmployeeService;
import com.ksit.erp.service.IPermissionService;
import com.ksit.erp.util.Const;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by houfalv on 2018/7/30.
 */
public class MyRealm extends AuthorizingRealm {

    @Autowired
    private IPermissionService iPermissionService;

    @Autowired
    private IEmployeeService iEmployeeService;

    /**
     * 授权
     * @param principalCollection
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        return null;
    }

    /**
     * 登陆
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

        if (employee!=null) {
            if (!employee.getEmployeePassword().equals(Const.EMPLOYEE_NROMAL)) {
                //登陆成功
                return new SimpleAuthenticationInfo(employee,employee.getEmployeePassword(),getName());
            }
            throw new LockedAccountException("账户被锁定");
        }
        throw new UnknownAccountException("用户名或者密码错误");
    }
}
