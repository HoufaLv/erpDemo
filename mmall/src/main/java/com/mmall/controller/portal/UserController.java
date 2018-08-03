package com.mmall.controller.portal;

import com.mmall.common.Const;
import com.mmall.common.ServerResponse;
import com.mmall.pojo.MmallUser;
import com.mmall.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * 门户，用户接口
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService iUserService;



    // <p>${user.name} </p>
    // <p>${user.email} </p>

    /**
     * 用户登陆
     * @param username
     * @param password
     * @param httpServletRequest
     * @return
     */
    @RequestMapping(value = "/login.do", method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse<MmallUser> login(String username,
                                           String password,
                                           HttpServletRequest httpServletRequest){
        HttpSession httpSession = httpServletRequest.getSession();
        ServerResponse<MmallUser> serverResponse = iUserService.login(username,password);

        //如果登陆成功
        if (serverResponse.isSuccess()) {
            httpSession.setAttribute(Const.CURRENT_USER,serverResponse.getData());
        }

        //serverResponse 中有状态码和对象
        //JSON

        return serverResponse;
    }

    /**
     * 用户登出
     * @param httpSession
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/logout.do",method = RequestMethod.POST)
    public ServerResponse<String> logout(HttpSession httpSession){
        if (httpSession.getAttribute(Const.CURRENT_USER)==null) {
            return ServerResponse.createByErrorMessage("用户未登录");
        }

        httpSession.removeAttribute(Const.CURRENT_USER);
        return ServerResponse.createBySuccessMessage("退出登陆成功");
    }

    /**
     * 用户注册
     * @param username          用户名
     * @param password          密码
     * @param email             邮箱
     * @param phone             电话
     * @param question          忘记密码问题
     * @param answer            忘记密码答案
     * @return
     */
    @RequestMapping(value = "/register.do",method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse<MmallUser> register(String username,String password,String email,String phone,String question,String answer){
        return iUserService.register(username,password,email,phone,question,answer);
    }

    /**
     * 验证用户名是否有效
     * @param str               验证字符串
     * @param type              验证类型
     * @return
     */
    @RequestMapping(value = "/check_valid.do",method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse<String> validateUser(String str, String type){
        return iUserService.validateUser(str,type);
    }

    /**
     * 登陆状态下，获取用户信息
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/get_user_info.do",method = RequestMethod.POST)
    public ServerResponse<MmallUser> getUserInfo(HttpSession httpSession){
        return iUserService.getUserInfo(httpSession);
    }

    /**
     * 用户忘记密码
     * @param username
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/forget_get_question.do",method = RequestMethod.POST)
    public ServerResponse<String> forgetGetQuestion(String username){
        return iUserService.forgetGetQuestion(username);
    }

    /**
     * 提交问题答案,用于辨别是不是用户操作
     * @param username          用户名
     * @param question          问题
     * @param answer            答案
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/forget_check_answer.do",method = RequestMethod.POST)
    public ServerResponse<String> forgetCheckAnswer (String username,String question,String answer){
        return iUserService.forgetCheckAnswer(username,question,answer);
    }

    /**
     * 忘记密码的重置密码
     * @param username
     * @param passwordNew
     * @param forgetToken
     * @return
     */
    @RequestMapping(value = "/forget_reset_password.do",method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse<String> forgetResetPassword(String username,String passwordNew,String forgetToken){
        return iUserService.forgetResetPassword(username,passwordNew,forgetToken);
    }

    /**
     * 登陆状态重置密码
     * @param httpSession
     * @return
     */
    @RequestMapping(value = "/reset_password.do",method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse<String> resetPassword(HttpSession httpSession,String passwordOld,String passwordNew){
        return iUserService.resetPassword(httpSession,passwordOld,passwordNew);
    }

    /**
     * 登陆状态更新个人信息
     * @param httpSession
     * @param email
     * @param phone
     * @param question
     * @param answer
     * @return
     */
    @RequestMapping(value = "/update_information.do",method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse<String> updateInformation(HttpSession httpSession,String email,String phone,String question,String answer){
        return iUserService.updateInformation(httpSession,email,phone,question,answer);
    }

    /**
     * 获取登陆用户信息，并强制登陆
     * @param httpSession
     * @return
     */
    @RequestMapping(value = "/get_information.do",method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse<MmallUser> getInformation(HttpSession httpSession){
        return iUserService.getInformation(httpSession);
    }
}
