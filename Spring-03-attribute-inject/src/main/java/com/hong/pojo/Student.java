package com.hong.pojo;

import java.util.*;

/**
 * @description:
 * @author: hjx
 * @time: 2021年04月07日 9:42
 */
public class Student {
    private String name ;
    private int age ;
    private Course course ;
    private String[] hobby;
    private List<String> books;
    private Map<String,String> card ;
    private Set<String> games;
    private Properties mysql ;
    private String p;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", course=" + course +
                ", hobby=" + Arrays.toString(hobby) +
                ", books=" + books +
                ", card=" + card +
                ", games=" + games +
                ", properties=" + mysql+
                ", p='" + p + '\'' +
                '}';
    }

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

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public String[] getHobby() {
        return hobby;
    }

    public void setHobby(String[] hobby) {
        this.hobby = hobby;
    }

    public List<String> getBooks() {
        return books;
    }

    public void setBooks(List<String> books) {
        this.books = books;
    }

    public Map<String, String> getCard() {
        return card;
    }

    public void setCard(Map<String, String> card) {
        this.card = card;
    }

    public Set<String> getGames() {
        return games;
    }

    public void setGames(Set<String> games) {
        this.games = games;
    }

    public Properties getProperties() {
        return mysql;
    }

    public void setMysql(Properties mysql) {
        this.mysql = mysql;
    }

    public String getP() {
        return p;
    }

    public void setP(String p) {
        this.p = p;
    }
}
