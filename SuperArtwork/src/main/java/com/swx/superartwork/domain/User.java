package com.swx.superartwork.domain;
import  lombok.Data;

@Data
public class User {
    int id ;
    String username;
    String userpwd;

    public User() {
    }

    public User(String username, String userpwd) {
        this.username = username;
        this.userpwd = userpwd;
    }
}
