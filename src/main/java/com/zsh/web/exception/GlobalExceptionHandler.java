package com.zsh.web.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/*@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(RuntimeException.class)
    @ResponseBody
    public Map<String,Object> exceptionHandler(){//处理异常方法
     Map<String, Object> map = new HashMap<String, Object>();
     map.put("errorCode", "101");
     map.put("errorMsg", "系統错误!");
        return map;
    }
}*/
