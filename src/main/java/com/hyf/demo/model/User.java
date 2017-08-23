package com.hyf.demo.model;

/**
 * Created by hyf on 17-8-23.
 */
public class User {
    private String email;
    private String name;
    private String password;
    private String ename;
    private String age;

    public User(String email, String name, String password, String ename, String age) {
        this.email = email;
        this.name = name;
        this.password = password;
        this.ename = ename;
        this.age = age;
    }
}
