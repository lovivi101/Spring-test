package com.hong.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: hjx
 * @time: 2021年04月07日 20:45
 */

@Component("user")
public class User {

    private String name ;
    private int age ;


    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }
    @Value("洪晋宣")
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    @Value("20")
    public void setAge(int age) {
        this.age = age;
    }
}
