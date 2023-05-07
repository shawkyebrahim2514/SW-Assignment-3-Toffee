package com.Authentications;

public class Registration {
    // user object
    private String name;
    private String email;
    private String phoneNumber;
    private String address;
    private String username;
    private String password;

    public Registration() {
    }

    public Registration(String name, String email, String phoneNumber, String address, String username, String password) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.username = username;
        this.password = password;
    }

    private  boolean checkValidation(){
        return false;
    }

    private void sendOTP(){

    }
    
    private boolean checkOTP(int OTP){
        return false;
    }

    public void register(){
        
      
    }
}
