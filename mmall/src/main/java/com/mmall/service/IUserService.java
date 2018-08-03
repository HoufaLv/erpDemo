package com.mmall.service;

import com.mmall.common.ServerResponse;
import com.mmall.pojo.MmallUser;

import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * Created by houfalv on 2018/7/11.
 */
public interface IUserService {


    /**
     * 登陆
     * @param username
     * @param password
     * @return
     */
    ServerResponse<MmallUser> login(String username, String password);

    /**
     * 用户注册
     * @param username
     * @param password
     * @param email
     * @param phone
     * @param question
     * @param answer
     * @return
     */
    ServerResponse<MmallUser> register(String username, String password, String email, String phone, String question, String answer);

    /**
     * 验证用户名是否有效
     * @param str
     * @param type
     * @return
     */
    ServerResponse<String> validateUser(String str,String type);

    /**
     * 登陆状态下，获取用户信息
     * @param httpSession
     * @return
     */
    ServerResponse<MmallUser> getUserInfo(HttpSession httpSession);

    /**
     * 获得用户忘记密码问题
     * @param username
     * @return
     */
    ServerResponse<String> forgetGetQuestion(String username);

    /**
     *提交问题答案,用于辨别是不是用户操作
     * @param username
     * @param question
     * @param answer
     * @return
     */
    ServerResponse<String> forgetCheckAnswer(String username, String question, String answer);

    /**
     * 忘记密码的重置密码
     * @param username
     * @param passwordNew
     * @param forgetToken
     * @return
     */
    ServerResponse<String> forgetResetPassword(String username, String passwordNew, String forgetToken);

    /**
     * 登陆状态重置密码
     * @param httpSession
     * @return
     */
    ServerResponse<String> resetPassword(HttpSession httpSession,String passwordOld,String passwordNew);

    /**
     * 登录状态更新个人信息
     * @param httpSession
     * @param email
     * @param phone
     * @param question
     * @param answer
     * @return
     */
    ServerResponse<String> updateInformation(HttpSession httpSession, String email, String phone, String question, String answer);

    /**
     * 获取用户登陆信息，并强制登陆
     * @param httpSession
     * @return
     */
    ServerResponse<MmallUser> getInformation(HttpSession httpSession);

    /**
     * 检查是否为管理员权限
     * @param mmallUser
     * @return
     */
    boolean checkAdminRole(MmallUser mmallUser);

    /**
     * 检查用户是否登陆
     * @param httpSession
     * @return
     */
    Map<String,Object> checkLogin(HttpSession httpSession);
}
