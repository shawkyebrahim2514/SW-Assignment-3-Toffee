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
        name = input.nextLine();
        System.out.println( "Email: ");
        email = input.nextLine();
        System.out.println( "Phone Number: ");
        phoneNumber = input.nextLine();
        System.out.println( "Address: ");
        address = input.nextLine();
        System.out.println( "Username: ");
        username = input.nextLine();
        System.out.println( "Password: ");
        password = input.nextLine();
        System.out.println( "Confirm Password: ");
        confirmPassword = input.nextLine();
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
