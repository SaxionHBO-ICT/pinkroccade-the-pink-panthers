package com.example.justin.pinkroccade;

/**
 * Created by Justin on 18-5-2016.
 */
public class Gebruiker {

    private String username;
    private String password;

    /**
     * Constructor for creating a gebruiker object
     * @param username
     * @param password
     */
    public Gebruiker(String username, String password) {
        this.username = username;
        this.password = password;
    }

    /**
     * Returns username.
     * @return
     */
    public String getUsername() {
        return username;
    }

    /**
     * Returns password.
     * @return
     */
    public String getPassword() {
        return password;
    }

}
