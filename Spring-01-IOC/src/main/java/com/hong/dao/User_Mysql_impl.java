package com.hong.dao;

/**
 * @description:
 * @author: hjx
 * @time: 2021年04月06日 10:42
 */
public class User_Mysql_impl implements UserDao {
    @Override
    public void getUser() {
        System.out.println("Mysql 获取用户信息");
    }
}
