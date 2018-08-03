package com.ksit.erp.controller;

import com.ksit.erp.entity.Employee;
import com.ksit.erp.exception.ServiceException;
import com.ksit.erp.service.IEmployeeService;
import com.ksit.erp.util.Const;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by houfalv on 2018/7/26.
 */
@Controller
public class HomeController {

    @Autowired
    private IEmployeeService iEmployeeService;

    @RequestMapping(value = "/home",method = RequestMethod.GET)
    public String home(){

        return "home";
    }

    /**
     * 用户登出
     * @param httpSession
     * @return
     */
    @RequestMapping(value = "/logout",method = RequestMethod.GET)
    public String logOut(HttpSession httpSession){
        httpSession.invalidate();
        return "redirect:/";
    }

    /**
     * 登陆
     * @return
     */
    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String login(){
        return "index";
    }

    @RequestMapping(value = "/",method = RequestMethod.POST)
    public String login(String employeeEmail,
                        String employeePassword,
                        String rememberMe,
                        HttpServletRequest httpServletRequest,
                        HttpSession httpSession,
                        RedirectAttributes redirectAttributes){


        Subject subject = SecurityUtils.getSubject();

        UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken(employeeEmail,DigestUtils.md5Hex(employeePassword),rememberMe!=null,httpServletRequest.getRemoteAddr());

        try {
            subject.login(usernamePasswordToken);
            return "redirect:/home";
        } catch (UnknownAccountException e) {
            redirectAttributes.addFlashAttribute("message","账户或者密码错误");
            e.printStackTrace();
        } catch (IncorrectCredentialsException e){
            redirectAttributes.addFlashAttribute("message","账户或者密码错误");
            e.printStackTrace();
        } catch (LockedAccountException e){
            redirectAttributes.addFlashAttribute("message","账户被冻结");
            e.printStackTrace();
        } catch (AuthenticationException e){
            redirectAttributes.addFlashAttribute("message","登陆失败");
            e.printStackTrace();
        }
        return "redirect:/";
    }
}
