package com.hong.RentHome;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @description:
 * 动态代理使用jdk代理 proxy
 * @author: hjx
 * @time: 2021年04月08日 9:39
 */
public class ProxyInvocationHandler implements InvocationHandler {


    private Rent rent ;

    public void setRent(Rent rent) {
        this.rent = rent;
    }

    public Object getProxy(){

        return Proxy.newProxyInstance(this.getClass().getClassLoader(), rent.getClass().getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        SeeHouse();
        Object object  = method.invoke(rent,args);
        fare();
        return object;
    }

    private void SeeHouse(){
        System.out.println("带人去看房");
    }

    private void fare(){
        System.out.println("收取中介费");
    }
}
