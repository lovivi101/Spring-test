package com.hong.Service;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @description:
 * @author: hjx
 * @time: 2021年04月08日 10:04
 */
public class ProxyInvocationHandler1 implements InvocationHandler {

    private Object user;

    public void setUser(Object user) {
        this.user = user;
    }

    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), user.getClass().getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        log(method.getName());
        Object object = method.invoke(user,args);
        return object;
    }

    private void log(String msg){
        System.out.println("执行了"+msg+"方法");
    }
}
