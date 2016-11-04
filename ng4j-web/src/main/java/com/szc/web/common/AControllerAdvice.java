package com.szc.web.common;

import org.springframework.http.HttpStatus;
import org.springframework.util.ClassUtils;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by zhufeng on 15/8/21.
 */
//注意使用注解@ControllerAdvice作用域是全局Controller范围
//可应用到所有@RequestMapping类或方法上的@ExceptionHandler、@InitBinder、@ModelAttribute，在这里是@ExceptionHandler
@ControllerAdvice
public class AControllerAdvice {

    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ResponseBody
    public String handleIOException(Exception ex) {
        System.out.println(ex.getMessage());
        ex.printStackTrace();
        return ClassUtils.getShortName(ex.getClass()) +":"+ ex.getMessage();
    }
}