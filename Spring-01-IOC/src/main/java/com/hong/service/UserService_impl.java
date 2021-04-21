package com.hong.service;

import com.hong.dao.UserDao;
import com.hong.dao.User_Mysql_impl;
import com.hong.dao.User_init_impl;

/**
 * @description:
 * @author: hjx
 * @time: 2021年04月06日 10:43
 */
public class UserService_impl implements UserService{
    private UserDao User;


//    private UserDao User = new User_Mysql_impl();

    //革命性得到思维
    //IOC的推导
    //从程序控制变成第三方控制
    public void setUser(UserDao user) {
        this.User = user;
    }

    @Override
    public void getUser(){
        User.getUser();
    }
}
