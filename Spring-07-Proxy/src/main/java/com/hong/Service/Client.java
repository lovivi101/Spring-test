package com.hong.Service;

/**
 * @description:
 * 静态代理有的它都有，静态代理没有的，它也有！
 *
 * 可以使得我们的真实角色更加纯粹 . 不再去关注一些公共的事情 .
 *
 * 公共的业务由代理来完成 . 实现了业务的分工 ,
 *
 * 公共业务发生扩展时变得更加集中和方便 .
 *
 * 一个动态代理 , 一般代理某一类业务
 *
 * 一个动态代理可以代理多个类，代理的是接口！
 * @author: hjx
 * @time: 2021年04月08日 10:26
 */
public class Client {
    public static void main(String[] args) {
        UserService_impl user = new UserService_impl();
        ProxyInvocationHandler1 proxy = new ProxyInvocationHandler1();
        proxy.setUser(user);

        UserService proxy1 = (UserService) proxy.getProxy();

        proxy1.add();
        proxy1.update();
        proxy1.delete();
        proxy1.query();
    }
}
