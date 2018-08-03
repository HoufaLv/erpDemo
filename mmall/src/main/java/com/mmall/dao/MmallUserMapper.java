package com.mmall.dao;

import com.mmall.pojo.MmallUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Map;

@Mapper
public interface MmallUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MmallUser record);

    int insertSelective(MmallUser record);

    MmallUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MmallUser record);

    int updateByPrimaryKey(MmallUser record);

    /**
     * 检查用户是否存在
     * @param username
     * @return
     */
    int checkUserName(String username);

    /**
     * 根据加密之后的密码登陆
     * @param username
     * @param md5Password
     * @return
     */
    MmallUser login(@Param("username") String username, @Param("md5Password") String md5Password);


    /**
     * 根据类型来判断账户是否可用d
     * @param paramMap
     * @return
     */
    int validateUser(@Param("paramMap") Map<String, Object> paramMap);

    /**
     * 注册账户
     * @param mmallUser
     * @return
     */
    int register(MmallUser mmallUser);

    /**
     * 获得用户忘记密码问题
     * @param username
     * @return
     */
    String getForgetQuestion(String username);

    /**
     * 忘记密码的重置密码
     * @param username
     * @param passwordNew
     * @return
     */
    int forgetResetPassword(@Param("username") String username,@Param("passwordNew") String passwordNew);

    /**
     * 登陆状态重置密码
     *
     * @param id
     * @param passwordOld
     * @param passwordNew
     * @return
     */
    int resetPassword(@Param("id") Integer id, @Param("passwordOld") String passwordOld, @Param("passwordNew") String passwordNew);

    /**
     * 反向查询，查询email存在并且不是这个用户的，有的话就说明这个email 在别的用户中已经使用了
     * @param id
     * @param email
     * @return
     */
    int checkEmailByUserId(@Param("id") Integer id,@Param("email") String email);

    /**
     * 反向查询，查询phone存在并且不是这个用户的，有的话就说明这个email 在别的用户中已经使用了
     * @param id
     * @param phone
     * @return
     */
    int checkPhoneByUserId(@Param("id") Integer id,@Param("phone") String phone);

    /**
     * 判断email 和 phone 跟原来的是否相同s
     * @param email
     * @param phone
     * @param id
     * @return
     */
    int checkOriginEmailPhone(@Param("email") String email,@Param("phone") String phone,@Param("id") Integer id);
}