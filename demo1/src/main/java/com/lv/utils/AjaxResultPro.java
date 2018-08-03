package com.lv.utils;

/**
 * ajax 结果对象
 */
public class AjaxResultPro {

    private Object data;

    @Override
    public String toString() {
        return "AjaxResultPro{" +
                "data=" + data +
                '}';
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
