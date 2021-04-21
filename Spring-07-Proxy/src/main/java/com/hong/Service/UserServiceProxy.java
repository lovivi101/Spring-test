package com.hong.Service;

/**
 * @description:
 *
 * 需求来了，现在我们需要增加一个日志功能，怎么实现！
 * 思路1 ：在实现类上增加代码 【麻烦！】
 * 思路2：使用代理来做，能够不改变原来的业务情况下，实现此功能就是最好的了！
 * @author: hjx
 * @time: 2021年04月08日 8:54
 */
public class UserServiceProxy implements UserService{

    private UserService_impl User;

    public UserServiceProxy() {
    }

    public void setUser(UserService_impl user) {
        this.User = user;
    }

    private void log(String msg){
        System.out.println("执行了"+msg+"方法");
    }

    @Override
    public void add() {
        log("add");
        User.add();
    }

    @Override
    public void delete() {
        log("delete");
        User.delete();
    }

    @Override
    public void update() {
        log("update");
        User.update();
    }

    @Override
    public void query() {
        log("query");
        User.query();
    }
}
