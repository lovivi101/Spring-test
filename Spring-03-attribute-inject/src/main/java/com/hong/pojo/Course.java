package com.hong.pojo;

import java.util.List;

/**
 * @description:
 * @author: hjx
 * @time: 2021年04月07日 9:45
 */
public class Course {
    private List<String> name ;

    public void setName(List<String> name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name=" + name +
                '}';
    }
}
