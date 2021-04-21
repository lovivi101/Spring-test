package com.hong.Log;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @description:
 * @author: hjx
 * @time: 2021年04月12日 15:12
 */


public class After_log implements AfterReturningAdvice {

    //returnValue 返回值
    //method被调用的方法
    //args 被调用的方法的对象的参数
    //target 被调用的目标对象
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println(target.getClass().getName()+"的方法："+method.getName()+"被执行了" +"返回值为："+returnValue);
    }
}
