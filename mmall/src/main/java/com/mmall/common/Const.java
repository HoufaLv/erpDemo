package com.mmall.common;

/**
 * Created by houfalv on 2018/7/9.
 */
public class Const {

    public static final String CURRENT_USER = "current_user";
    public static final String EMAIL = "email";
    public static final String USER_NAME = "username";
    public static final String PHONE = "phone";
    public static final int ZERO = 0;
    public static final String QUESTION = "question";
    public static final String ANSWER = "answer";
    public static final String PASSWORD_OLD = "password";
    public static final String ID = "id";
    public static final String ROLE = "role";
    public static final String IS_LOGIN = "is_login";


    /**
     * 0 普通用户
     * 1 管理员用户
     */
    public interface Role{
        int ROLE_CUSTOMER = 0;
        int ROLE_ADMIN = 1;
    }
}
