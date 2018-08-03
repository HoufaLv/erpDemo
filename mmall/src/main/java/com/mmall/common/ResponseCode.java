package com.mmall.common;

/**
 * Created by houfalv on 2018/7/9.
 * 通用服务端响应对象
 */
public enum ResponseCode {

    SUCCESS(0,"SUCCESS"),
    ERROR(1,"ERROR"),
    NEED_LOGIN(10,"NEED_LOGIN"),
    ILLEGAL_ARGUEMENT(2,"ILLEGAL_ARGUEMENT");

    private final int code;
    private final String desc;

    ResponseCode(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    //该对象对外部不可见，所以将不会提供set方法
    public int getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
