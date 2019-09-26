package com.stackroute.java;

import org.springframework.stereotype.Component;

@Component
public class User {
    private String name;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private String password;


    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }

    public void setName(String userName) {
        this.name=userName;
    }
}
