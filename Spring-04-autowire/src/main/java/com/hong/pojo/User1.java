package com.hong.pojo;

import com.hong.autowire.Cat;
import com.hong.autowire.Dog;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @description:
 * @author: hjx
 * @time: 2021年04月07日 16:10
 */
public class User1 {
    @Autowired
    private Dog dog ;

    @Autowired
    private Cat cat ;

    private String name ;

    public void setName(String name) {
        this.name = name;
    }

    public Dog getDog() {
        return dog;
    }

    public Cat getCat() {
        return cat;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "User1{" +
                "dog=" + dog +
                ", cat=" + cat +
                ", name='" + name + '\'' +
                '}';
    }
}
