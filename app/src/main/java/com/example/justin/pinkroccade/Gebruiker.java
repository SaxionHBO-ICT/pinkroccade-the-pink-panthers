package com.example.justin.pinkroccade;

/**
 * Created by Justin on 18-5-2016.
 */
public class Gebruiker {

    private String username;
    private String password;

    public Gebruiker(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
