package com.lv.common;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.map.annotate.JsonSerialize;

/**
 * 服务端通用响应对象,采用泛型设计
 * @param <T>
 */
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
//在序列化的时候，如果为null 的对象，key 也会消失
public class ServerResponse<T> {

    private int status;
    private String message;
    private T data;

    /**
     * 使用status,message,data来构造ServerResponse
     * @param status
     * @param message
     * @param data
     */
    private ServerResponse(int status, String message, T data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

    /**
     * 使用status,message来构造ServerResponse
     * @param status
     * @param message
     */
    private ServerResponse(int status, String message) {
        this.status = status;
        this.message = message;
    }

    /**
     * 使用status 来构造ServerResponse
     * @param status
     *
     */
    private ServerResponse(int status) {
        this.status = status;
    }

    /**
     * 使用status 和 data 来构造ServerResponse
     * @param status
     * @param data
     */
    private ServerResponse(int status, T data) {
        this.status = status;
        this.data = data;
    }


    public int getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }

    public T getData() {
        return data;
    }

    /**
     * 响应成功，返回0
     * @return
     */
    @JsonIgnore //使之不在序列化结果当中
    public boolean isSuccess(){
        return this.status == ResponseCode.SUCCESS.getCode();
    }

    /**
     * 响应成功返回结果
     * @param <T>
     * @return
     */
    public static <T> ServerResponse<T> createBySuccess(){
        return new ServerResponse<T>(ResponseCode.SUCCESS.getCode());
    }

    /**
     * 响应成功返回message
     * @param message
     * @param <T>
     * @return
     */
    public static <T> ServerResponse<T> createBySuccessMessage(String message){
        return new ServerResponse<T>(ResponseCode.SUCCESS.getCode(),message);
    }

    /**
     * 响应成功返回 data
     * @param data
     * @param <T>
     * @return
     */
    public static <T> ServerResponse<T> createBySuccess(T data){
        return new ServerResponse<T>(ResponseCode.SUCCESS.getCode(),data);
    }

    /**
     * 响应成功返回 messsage 和 data
     * @param message
     * @param data
     * @param <T>
     * @return
     */
    public static <T> ServerResponse<T> createBySuccess(String message,T data){
        return new ServerResponse<T>(ResponseCode.SUCCESS.getCode(),message,data);
    }


    /**
     * 响应失败返回
     * @param <T>
     * @return
     */
    public static <T> ServerResponse<T> createByError(){
        return new ServerResponse<T>(ResponseCode.ERROR.getCode(),ResponseCode.ERROR.getDesc());
    }


    /**
     * 响应失败返回 message
     * @param errorMessage
     * @param <T>
     * @return
     */
    public static <T> ServerResponse<T> createByErrorMessage(String errorMessage){
        return new ServerResponse<T>(ResponseCode.ERROR.getCode(),errorMessage);
    }

    /**
     * 响应失败返回 code 和 message
     * @param errorCode
     * @param errorMessage
     * @param <T>
     * @return
     */
    public static <T> ServerResponse<T> createByErrorCodeMessage(int errorCode,String errorMessage){
        return new ServerResponse<T>(errorCode,errorMessage);
    }
}
