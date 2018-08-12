package com.ksit.erp.controller.exceptionHandler;

import com.ksit.erp.exception.ServiceException;
import org.apache.shiro.authz.AuthorizationException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * Created by houfalv on 2018/8/6.
 */
@ControllerAdvice
public class ControllerExceptionHandler {

    @ExceptionHandler(AuthorizationException.class)
    public String authorizationException(){
        return "error/401";
    }

    @ExceptionHandler(ServiceException.class)
    public String serviceException(){
        return "error/500";
    }
}
