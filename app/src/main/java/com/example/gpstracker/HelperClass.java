package com.example.gpstracker;

public class HelperClass {

    String username, password;

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public HelperClass(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public HelperClass(){

    }

}
