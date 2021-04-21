package com.hong.Service;

/**
 * @description:
 * @author: hjx
 * @time: 2021年04月12日 10:43
 */
public class UserService_impl implements UserService{
    @Override
    public void add() {
        System.out.println("----add a User ----");
    }

    @Override
    public void delete() {
        System.out.println("----delete a User ----");
    }

    @Override
    public void query() {
        System.out.println("----query a User ----");
    }

    @Override
    public void update() {
        System.out.println("----update a User ----");
    }
}
