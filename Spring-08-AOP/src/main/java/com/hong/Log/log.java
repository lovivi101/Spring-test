package com.hong.Log;

/**
 * @description:
 *
 * 切入类
 * @author: hjx
 * @time: 2021年04月12日 15:53
 */
public class log {

    public void After(){
        System.out.println("------After-----");
    }

    public void Before(){
        System.out.println("------Before-----");
    }
}
