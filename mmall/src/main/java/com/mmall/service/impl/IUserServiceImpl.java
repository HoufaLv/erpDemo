package com.mmall.service.impl;

import com.mmall.common.Const;
import com.mmall.common.ResponseCode;
import com.mmall.common.ServerResponse;
import com.mmall.common.TokenCache;
import com.mmall.dao.MmallUserMapper;
import com.mmall.pojo.MmallUser;
import com.mmall.service.IUserService;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * Created by houfalv on 2018s/7/11.
 */
@Service(value = "iUserService")
public class IUserServiceImpl implements IUserService {

    @Autowired
    private MmallUserMapper mmallUserMapper;

    /**
     * 登陆
     *
     * @param username
     * @param password
     * @return
     */
    @Override
    public ServerResponse<MmallUser> login(String username, String password) {
        //如果存在账户，再比较密码
        int resultCount = mmallUserMapper.checkUserName(username);

        //账户不存在
        if (resultCount <= 0) {
            return ServerResponse.createByErrorMessage("账号密码错误");
        }

        String md5Password = DigestUtils.md5Hex(password);
        MmallUser mmallUser = mmallUserMapper.login(username, md5Password);

        if (mmallUser == null) {
            return ServerResponse.createByErrorMessage("账号密码错误");
        }
        //不对前端暴露用户密码
        mmallUser.setPassword(StringUtils.EMPTY);

        return ServerResponse.createBySuccess("登陆成功", mmallUser);
    }

    /**
     * 用户注册
     *
     * @param username
     * @param password
     * @param email
     * @param phone
     * @param question
     * @param answer
     * wwww
     * @return
     */
    @Override
    public ServerResponse<MmallUser> register(final String username, final String password, final String email, final String phone, String question, String answer) {
        int resultCount = mmallUserMapper.validateUser(new HashMap<String, Object>() {
            {
                put("username", username);
            }
        });

        if (!(resultCount>Const.ZERO)){
            resultCount = mmallUserMapper.validateUser(new HashMap<String, Object>(){
                {
                    put(Const.EMAIL, email);
                }
            });
            if (!(resultCount>Const.ZERO)){
                resultCount = mmallUserMapper.validateUser(new HashMap<String, Object>(){
                    {
                        put(Const.PHONE, phone);
                    }
                });
                if (!(resultCount>Const.ZERO)){

                    MmallUser mmallUser = new MmallUser(username, DigestUtils.md5Hex(password), email, phone, question, answer, 0, new Date(), new Date());
                    int result = mmallUserMapper.register(mmallUser);

                    mmallUser.setPassword(StringUtils.EMPTY);
                    mmallUser.setQuestion(StringUtils.EMPTY);
                    mmallUser.setAnswer(StringUtils.EMPTY);

                    if (result > Const.ZERO) {
                        return ServerResponse.createBySuccess("新增成功", mmallUser);
                    }
                    return ServerResponse.createByErrorMessage("新增失败");
                }
                return ServerResponse.createByErrorMessage("电话号码已经被占用");
            }
            return ServerResponse.createByErrorMessage("email 已经被占用");
        }
        return ServerResponse.createByErrorMessage("用户名已经被占用");
    }

    /**
     * 验证用户名是否有效
     * 根据username,email,phone 来检查用户是否有效
     *
     * @param str  值
     * @param type 类型
     * @return
     */
    @Override
    public ServerResponse<String> validateUser(String str, String type) {
        Map<String, Object> paramMap = new HashMap<>();

        if (Const.EMAIL.toUpperCase().equals(type.toUpperCase())) {
            paramMap.put(type, str);
        }
        if (Const.USER_NAME.toUpperCase().equals(type.toUpperCase())) {
            paramMap.put(type, str);
        }
        if (Const.PHONE.toUpperCase().equals(type.toUpperCase())) {
            paramMap.put(type, str);
        }

        int resultCount = mmallUserMapper.validateUser(paramMap);
        if (resultCount > Const.ZERO) {
            return ServerResponse.createByErrorMessage("该用户已被注册");
        }

        return ServerResponse.createBySuccessMessage("校验成功");
    }

    /**
     * 登陆状态下，获取用户信息
     *
     * @param httpSession
     * @return
     */
    @Override
    public ServerResponse<MmallUser> getUserInfo(HttpSession httpSession) {
        MmallUser mmallUser = (MmallUser) httpSession.getAttribute(Const.CURRENT_USER);

        if (mmallUser == null) {
            return ServerResponse.createByErrorMessage("用户未登录,无法获取当前用户信息");
        }
        return ServerResponse.createBySuccess(mmallUser);
    }

    /**
     * 获得用户忘记密码问题
     *
     * @param username
     * @return
     */
    @Override
    public ServerResponse<String> forgetGetQuestion(final String username) {
        int resultCount = mmallUserMapper.validateUser(new HashMap<String, Object>() {
            {
                put("username", username);
            }
        });

        if (resultCount > 0) {
            //根据用户名查找问题
            String question = mmallUserMapper.getForgetQuestion(username);

            if (StringUtils.isBlank(question)) {
                return ServerResponse.createByErrorMessage("该用户未设置找回密码问题");
            }
            return ServerResponse.createBySuccessMessage(question);
        }

        return ServerResponse.createByErrorMessage("未找到用户");
    }

    /**
     * 提交问题答案,用于辨别是不是用户操作
     *
     * @param username
     * @param question
     * @param answer
     * @return
     */
    @Override
    public ServerResponse<String> forgetCheckAnswer(final String username, final String question, final String answer) {
        int resultCount = mmallUserMapper.validateUser(new HashMap<String, Object>() {
            {
                put(Const.USER_NAME, username);
                put(Const.QUESTION, question);
                put(Const.ANSWER, answer);
            }
        });

        if (resultCount > 0) {
            if (TokenCache.getKey(TokenCache.TOKEN_PREFIX + username) == null) {
                String token = UUID.randomUUID().toString();
                //添加缓存
                TokenCache.setKey(TokenCache.TOKEN_PREFIX + username, token);
                return ServerResponse.createBySuccessMessage(TokenCache.getKey(TokenCache.TOKEN_PREFIX + username));
            }
            return ServerResponse.createBySuccessMessage(TokenCache.getKey(TokenCache.TOKEN_PREFIX + username));
        }
        return ServerResponse.createByErrorMessage("问题答案错误");
    }

    /**
     * 忘记密码的重置密码
     *
     * @param username
     * @param passwordNew
     * @param forgetToken
     * @return
     */
    @Override
    public ServerResponse<String> forgetResetPassword(final String username, String passwordNew, String forgetToken) {
        int resultCount = mmallUserMapper.validateUser(new HashMap<String, Object>() {
            {
                put(Const.USER_NAME, username);
            }
        });

        if (resultCount > 0) {

            if (StringUtils.isBlank(forgetToken)) {
                return ServerResponse.createBySuccessMessage("需要登陆信息");
            }

            if (!TokenCache.getKey(TokenCache.TOKEN_PREFIX + username).equals(forgetToken)) {
                return ServerResponse.createByErrorMessage("token 不正确");
            }

            int result = mmallUserMapper.forgetResetPassword(username, DigestUtils.md5Hex(passwordNew));

            if (result > 0) {
                return ServerResponse.createBySuccessMessage("重置密码成功");
            }

            return ServerResponse.createBySuccessMessage("重置密码失败");
        }

        return ServerResponse.createByErrorMessage("用户不存在");
    }

    /**
     * 登陆状态重置密码
     *
     * @param httpSession
     * @param passwordOld
     * @param passwordNew
     * @return
     */
    @Override
    public ServerResponse<String> resetPassword(HttpSession httpSession, final String passwordOld, String passwordNew) {

        final String md5PasswordOld = DigestUtils.md5Hex(passwordOld);
        String md5PasswordNew = DigestUtils.md5Hex(passwordNew);

        final MmallUser mmallUser = (MmallUser) httpSession.getAttribute(Const.CURRENT_USER);
        if (mmallUser == null) {
            return ServerResponse.createByErrorMessage("用户未登录");
        }

        //todo 完成验证旧密码是否正确
        int resultCount = mmallUserMapper.validateUser(new HashMap<String, Object>() {
            {
                put(Const.PASSWORD_OLD, md5PasswordOld);
                put(Const.ID, mmallUser.getId());
            }
        });

        if (resultCount > 0) {
            int result = mmallUserMapper.resetPassword(mmallUser.getId(), md5PasswordOld, md5PasswordNew);
            if (result > 0) {
                return ServerResponse.createBySuccessMessage("修改密码成功");
            }
            return ServerResponse.createByErrorMessage("修改密码失败");
        }
        return ServerResponse.createByErrorMessage("旧密码错误");
    }

    /**
     * 登录状态下更新个人信息,不能和session 中的当前用户的信息进行比较，因为可能数据库更新了，但是session 中的值还没有更新
     *
     * @param httpSession
     * @param email
     * @param phone
     * @param question
     * @param answer
     * @return
     */
    @Override
    public ServerResponse<String> updateInformation(HttpSession httpSession, final String email, final String phone, final String question, final String answer) {
        final MmallUser mmallUser = (MmallUser) httpSession.getAttribute(Const.CURRENT_USER);

        //判断用户是否登陆了
        if (mmallUser != null) {
            //判断给的email 和phone 和原来的一样不一样
             int resultCount =  mmallUserMapper.checkOriginEmailPhone(email,phone,mmallUser.getId());
            if (resultCount>0) {
                return ServerResponse.createByErrorMessage("email 或 phone 不能和原来的一样");
            }

            int resultCountEmail = mmallUserMapper.checkEmailByUserId(mmallUser.getId(), email);
            if (resultCountEmail > 0) {
                return ServerResponse.createByErrorMessage("Email 已经被使用，请更换后重试");
            }

            int resultCountPhone = mmallUserMapper.checkPhoneByUserId(mmallUser.getId(), phone);
            if (resultCountPhone > 0) {
                return ServerResponse.createByErrorMessage("电话号码已经被使用，请更换后重试");
            }

            MmallUser mmallUserUpdate = new MmallUser();
            mmallUserUpdate.setId(mmallUser.getId());
            mmallUserUpdate.setUsername(mmallUser.getUsername());
            mmallUserUpdate.setEmail(email);
            mmallUserUpdate.setPhone(phone);
            mmallUserUpdate.setQuestion(question);
            mmallUserUpdate.setAnswer(answer);

            int resultCountUpdate = mmallUserMapper.updateByPrimaryKeySelective(mmallUserUpdate);

            if (resultCountUpdate > 0) {
                return ServerResponse.createBySuccessMessage("更新用户信息成功");
            }
            return ServerResponse.createByErrorMessage("更新用户信息失败");

        }
        return ServerResponse.createByErrorMessage("用户未登录");
    }

    /**
     * 获取用户登陆信息，并强制登陆
     *
     * @param httpSession
     * @return
     */
    @Override
    public ServerResponse<MmallUser> getInformation(HttpSession httpSession) {
        MmallUser mmallUser = (MmallUser) httpSession.getAttribute(Const.CURRENT_USER);

        if (mmallUser!=null) {
            //将用户信息传到前端，并且隐藏部分信息
            MmallUser mmallUser1 = mmallUserMapper.selectByPrimaryKey(mmallUser.getId());
            if (mmallUser1!=null) {
                mmallUser1.setPassword("");
                return ServerResponse.createBySuccess(mmallUser1);
            }
            return ServerResponse.createByErrorMessage("找不到用户信息");
        }
        return ServerResponse.createByErrorCodeMessage(ResponseCode.NEED_LOGIN.getCode(),"用户未登录,无法获取当前用户信息,status=10,需要强制登录");
    }


    //todo backEnd

    /**
     * 检查是否为管理员权限
     *
     * @param mmallUser
     * @return
     */
    @Override
    public boolean checkAdminRole(final MmallUser mmallUser) {
        int resultCount = mmallUserMapper.validateUser(new HashMap<String,Object>(){
            {
                put(Const.ID,mmallUser.getId());
                put(Const.ROLE,"1");
            }
        });

        if (resultCount>0) {
            return true;
        }
        return false;
    }

    /**
     * 检查用户是否登陆
     *
     * @param httpSession
     * @return
     */
    @Override
    public Map<String, Object> checkLogin(HttpSession httpSession) {
        final MmallUser mmallUser = (MmallUser) httpSession.getAttribute(Const.CURRENT_USER);
        if (httpSession.getAttribute(Const.CURRENT_USER)!=null) {
            return new HashMap<String,Object>(){
                {
                    put(Const.IS_LOGIN,true);
                    put(Const.CURRENT_USER,mmallUser);
                }
            };
        }
        return new HashMap<String,Object>(){
            {
                put(Const.IS_LOGIN,false);
                put(Const.CURRENT_USER,null);
            }
        };
    }

}
