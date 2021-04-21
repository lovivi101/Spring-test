package com.hong.Log;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @description:
 * @author: hjx
 * @time: 2021年04月12日 13:47
 */


public class Before_log implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println(target.getClass().getName()+"的方法："+method.getName()+"被执行了");
    }
}
