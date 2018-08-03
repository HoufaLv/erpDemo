package com.ksit.erp.exception;

/**
 * 业务逻辑异常
 * Created by houfalv on 2018/7/26.
 */
public class ServiceException extends RuntimeException {

    public ServiceException() { }

    public ServiceException(String message) {
        super(message);
    }

    public ServiceException(String message, Throwable throwable) {
        super(message,throwable);
    }

    public ServiceException(Throwable throwable) {
        super(throwable);
    }

}
