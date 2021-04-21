package com.hong.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Repository;

/**
 * @description:
 * @author: hjx
 * @time: 2021年04月07日 15:47
 */

@Repository(value = "dog")
public class Dog implements behavior {

    private String name ;
    private int age ;


    public String getName() {
        return name;
    }


    @Value("旺财")
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    @Value("3")
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

    public Dog() {
        System.out.println("狗叫声。。。。");
    }

    @Override
    public void call() {
        System.out.println("狗叫声。。。。");
    }
}
