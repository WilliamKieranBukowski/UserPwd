package com.revature.model;

public class User {
    public String username;
    public String password;



    @Override
   public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
