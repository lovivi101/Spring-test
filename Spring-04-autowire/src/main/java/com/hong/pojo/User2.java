package com.hong.pojo;

import com.hong.autowire.Cat;
import com.hong.autowire.Dog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.io.Resource;

/**
 * @description:
 * @author: hjx
 * @time: 2021年04月07日 16:32
 */
public class User2 {


    /*Autowired 和 Resource 的不同
    它们的作用相同都是用注解方式注入对象，但执行顺序不同。
    @Autowired先byType，
    @Resource先byName。*/
    @Autowired
    @Qualifier(value = "dog2")
    private Dog dog;

    @Autowired
    @Qualifier(value = "cat1")
    private Cat cat ;


    private String name ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    @Override
    public String toString() {
        return "User2{" +
                "dog=" + dog +
                ", cat=" + cat +
                '}';
    }
}
