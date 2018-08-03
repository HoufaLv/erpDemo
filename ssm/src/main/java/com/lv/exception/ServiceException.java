package com.lv.exception;

/**
 * Created by houfalv on 2018/7/25.
 */
public class ServiceException extends RuntimeException {

    public ServiceException(){}

    public ServiceException(Throwable throwable){
        super(throwable);
    }

    public ServiceException(Throwable throwable,String message){
        super(message,throwable);
    }

    public ServiceException(String message){
        super(message);
    }

}
