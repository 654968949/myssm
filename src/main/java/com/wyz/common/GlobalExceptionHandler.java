package com.wyz.common;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ControllerAdvice 注解描述的类, spring mvc会分为他是
 * 	一个控制层全局异常的处理
 */
@ControllerAdvice
public class GlobalExceptionHandler {
    /**
     * @ExceptionHandler 注解描述的方法为异常处理方法,
     * 	次注解中定义的异常类型, 为这个方法可以处理的异常类型, 它可以处理
     * 	此异常以及这个异常类型的子类类型的异常
     * @param e
     * @return
     */
    @ExceptionHandler(RuntimeException.class)
    @ResponseBody // 告诉spring mvc最终相应结果转换为json格式返回, 如果返回的是页面可不写次注解
    public String doHandleRuntimeException(RuntimeException e) {
        e.printStackTrace();
        return "RuntimeException!";
    }

}
