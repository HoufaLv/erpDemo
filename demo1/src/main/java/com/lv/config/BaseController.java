package com.lv.config;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.lv.utils.AjaxResult;
import com.lv.utils.AjaxResultPro;
import com.lv.utils.MagicNumber;

import java.util.ArrayList;
import java.util.List;

public class BaseController {


    /**
     * 将 java 数据转换为json时 是否循环，将list，String，Boolean，Map 为空的时候的解决方案
     */
    SerializerFeature[] feature =
            {
                    SerializerFeature.DisableCircularReferenceDetect,
                    SerializerFeature.WriteNullListAsEmpty,
                    SerializerFeature.WriteNullStringAsEmpty,
                    SerializerFeature.WriteNullBooleanAsFalse,
                    SerializerFeature.WriteMapNullValue
            };

    private List<Object> list = new ArrayList<Object>();

    /**
     * 构造成功返回信息
     * @param data          数据
     * @param count         数量
     * @param message       信息
     * @return
     */
    protected String buildSuccessResultInfo(Object data,Integer count,String message){
        AjaxResult ajaxResult = new AjaxResult(MagicNumber.AJAX_SUCCESS_NUMBER, message, data, count);
        return JSON.toJSONString(ajaxResult,feature);
    }

    protected String buildSuccessResultInfo(String message){
        AjaxResult ajaxResult = new AjaxResult(MagicNumber.AJAX_SUCCESS_NUMBER, message, list, MagicNumber.AJAX_COUNT);
        return JSON.toJSONString(ajaxResult,feature);
    }

    protected String buildSuccessResultInfo(Object data){
        AjaxResultPro ajaxResultPro = new AjaxResultPro();
        return JSON.toJSONString(ajaxResultPro,feature);
    }

    /**
     * 构造成功状态 返回结果为空
     * @return
     */
    protected String buildSuccessResult(){
        AjaxResult success = new AjaxResult(MagicNumber.AJAX_SUCCESS_NUMBER, "success", list, MagicNumber.AJAX_COUNT);
        return JSON.toJSONString(success,feature);
    }

    /**
     * 构造失败信息
     * @param message
     * @return
     */
    protected String buildFailResultInfo(String message){
        AjaxResult ajaxResult = new AjaxResult(MagicNumber.AJAX_FAILED_NUMBER, message, list, MagicNumber.AJAX_COUNT);
        return JSON.toJSONString(ajaxResult,feature);
    }

    protected String buildFailResultInfo(){
        AjaxResult ajaxResult = new AjaxResult(MagicNumber.AJAX_FAILED_NUMBER, "failed", list, MagicNumber.AJAX_COUNT);
        return JSON.toJSONString(ajaxResult,feature);
    }

}
