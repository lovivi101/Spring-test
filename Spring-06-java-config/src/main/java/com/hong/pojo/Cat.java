package com.hong.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * @description:
 * @author: hjx
 * @time: 2021年04月07日 15:49
 */

@Repository(value = "cat")
public class Cat implements behavior {

    private String name ;
    private int age ;

    public String getName() {
        return name;
    }

    @Value("Tom")
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    @Value("4")
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Cat() {
        System.out.println("猫叫声。。。。");
    }

    @Override
    public void call() {
        System.out.println("猫叫声。。。。");
    }
}
