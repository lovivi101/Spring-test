package com.hong.RentHome;

import org.junit.Test;

import java.util.Objects;

/**
 * @description: 静态代理
 * 静态代理角色分析
 * 抽象角色 : 一般使用接口或者抽象类来实现 (Rent)
 * 真实角色 : 被代理的角色 (Host)
 * 代理角色 : 代理真实角色 ; 代理真实角色后 , 一般会做一些附属的操作 . (Proxy)
 * 客户  :  使用代理角色来进行一些操作 . (Client)
 *
 * 静态代理的好处:
 * 可以使得我们的真实角色更加纯粹 . 不再去关注一些公共的事情 .
 * 公共的业务由代理来完成 . 实现了业务的分工 ,
 * 公共业务发生扩展时变得更加集中和方便 .
 * @author: hjx
 * @time: 2021年04月08日 8:45
 */
public class Client {

    public static void main(String[] args) {


        //房东出租
        Host host = new Host();


        //中介帮出租
        Proxy proxy = new Proxy(host);

        //客户租房
        proxy.rent();
    }

    @Test
    public void dynamic_proxy(){
        Host host = new Host();

        ProxyInvocationHandler proxy = new ProxyInvocationHandler();

        proxy.setRent(host);

        Rent proxy1 = (Rent) proxy.getProxy();

        proxy1.rent();
    }
}
