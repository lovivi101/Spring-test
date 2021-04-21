package com.hong.Log;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: hjx
 * @time: 2021年04月12日 16:03
 */


//使用注解实现增强类
@Component("Log")
@Aspect
public class AnnotationLog {


    @After("execution(* com.hong.Service.UserService_impl.*(..))")
    public void After(){
        System.out.println("注解实现： -----After-----");
    }

    @Before("execution(* com.hong.Service.UserService_impl.*(..))")
    public void Before(){
        System.out.println("注解实现： -----Before-----");
    }
}
