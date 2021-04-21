package com.hong.pojo;

import com.hong.autowire.Cat;
import com.hong.autowire.Dog;

/**
 * @description:
 * @author: hjx
 * @time: 2021年04月07日 15:50
 */
public class User {
    private Dog dog;
    private Cat cat ;

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
}
