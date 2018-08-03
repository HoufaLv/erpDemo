package com.lv.utils;

import java.io.Serializable;

/**
 * Ajax 返回对象
 */
public class AjaxResult implements Serializable {

    private static final long serialVersionUID = 1L;

    private int code;
    private String message;
    private Object data;
    private Integer count;

    public AjaxResult() { }

    public AjaxResult(int code, String message, Object data, Integer count) {
        this.code = code;
        this.message = message;
        this.data = data;
        this.count = count;
    }

    @Override
    public String toString() {
        return "AjaxResult{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                ", count=" + count +
                '}';
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
