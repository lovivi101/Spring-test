package com.hong.autowire;

/**
 * @description:
 * @author: hjx
 * @time: 2021年04月07日 15:49
 */
public class Cat implements behavior{

    private String name ;
    private int age ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

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
