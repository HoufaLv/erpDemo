package com.lv.controller.exceptionHandler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.io.IOException;

/**
 * Created by houfalv on 2018/7/24.
 */
@ControllerAdvice
public class ControllerExceptionHandler {

    /**
     * 全局异常处理，当引发IoException 的时候，将触发这个方法
     * @return
     */
    @ExceptionHandler(IOException.class)
    public String ioExceptionHandler(){
        return "html/error/500";
    }


}
