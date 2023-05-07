package com.Authentications;
import com.System.*;

public class Registration {
    // user object
    private String name;
    private String email;
    private String phoneNumber;
    private String address;
    private String username;
    private String password;
    private String confirmPassword;

    public Registration() {
        System.out.println("Please enter the following information: ");
        System.out.println( "Name: ");
        name = AppSystem.input.nextLine();
        System.out.println( "Email: ");
        email = AppSystem.input.nextLine();
        System.out.println( "Phone Number: ");
        phoneNumber = AppSystem.input.nextLine();
        System.out.println( "Address: ");
        address = AppSystem.input.nextLine();
        System.out.println( "Username: ");
        username = AppSystem.input.nextLine();
        System.out.println( "Password: ");
        password = AppSystem.input.nextLine();
        System.out.println( "Confirm Password: ");
        confirmPassword = AppSystem.input.nextLine();
    }

    private  boolean checkValidation(){
        return false;
    }

    private void sendOTP(){

    }
    
    private boolean checkOTP(int OTP){
        return false;
    }

    public boolean register(){
        
      return false;
    }
}
