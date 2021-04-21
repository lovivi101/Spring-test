package com.hong.pojo;

import com.hong.autowire.Cat;
import com.hong.autowire.Dog;
import javax.annotation.Resource;

/**
 * @description:
 * @author: hjx
 * @time: 2021年04月07日 16:32
 */
public class User3 {



    @Resource(name = "dog1")
    private Dog dog;

    @Resource(name = "cat2")
    private Cat cat ;


    private String name ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "User2{" +
                "dog=" + dog +
                ", cat=" + cat +
                '}';
    }
}
