package com.User;

public abstract class User {
    private String name;
    private String email;
    private String username;
    private String password;

    public User() {
    }

    /**
     * @param name
     * @param email
     * @param username
     * @param password
     */
    public User(String name, String email, String username, String password) {
        this.name = name;
        this.email = email;
        this.username = username;
        this.password = password;

    }

    /**
     * @return the name of the user
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name of the user
     * 
     * @param name the name of the user
     */
    public void setName(String name) {
        this.name = name;

    }

    /**
     * @return the email of the user
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * Set the email of the user
     * 
     * @param email the email of the user
     */
    public void setEmail(String email) {
        this.email = email;

    }

    /**
     * @return the username of the user
     */
    public String getUsername() {
        return this.username;
    }

    /**
     * Set the username of the user
     * 
     * @param username the username of the user
     */
    public void setUsername(String username) {
        this.username = username;

    }

    /**
     * @return the password of the user
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * Set the password of the user
     * 
     * @param password the password of the user
     */
    public void setPassword(String password) {
        this.password = password;
    }
}
