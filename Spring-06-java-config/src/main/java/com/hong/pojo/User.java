package com.hong.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: hjx
 * @time: 2021年04月07日 21:06
 */

@Component("user")
public class User {

    private String name;
    private int age;



    private Dog dog;



    private Cat cat ;


    @Autowired
    @Qualifier(value = "dog")
    public void setDog(Dog dog) {
        this.dog = dog;
    }

    @Autowired
    @Qualifier(value = "cat")
    public void setCat(Cat cat) {
        this.cat = cat;
    }

    @Value("乐乐")
    public void setName(String name) {
        this.name = name;
    }

    @Value("20")
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", dog=" + dog +
                ", cat=" + cat +
                '}';
    }
}
