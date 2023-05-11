package com.Authentications;

import com.System.*;
import com.User.Buyer;
import com.OTP.*;

public class Registration {
    private String name;
    private String email;
    private String phoneNumber;
    private String address;
    private String username;
    private String password;
    private String confirmPassword;


    /**
     * Constructor
     */
    public Registration() {
    }

    /**
     * Send OTP to the user's email
     */
    private void sendOTP() {

    }

    /**
     * Check if the OTP is valid
     * @param OTP the OTP to be checked
     * @return true if the OTP is valid, false otherwise
     */

    private boolean checkOTP(int OTP) {
        return false;
    }

    /**
     * Register as buyer
     * @return true if the registration is successful, false otherwise
     */
    public boolean register() {
        takeUserInfo();
        if (!AppSystem.users.checkExistUser(username, password)) {
            Buyer newBuyer = new Buyer(name, email, phoneNumber, address, username, password);
            AppSystem.users.addNewBuyer(newBuyer);
            return true;
        }
        return false;
    }

    /**
     * Take the user's information and check if it is valid
     */
    private void takeUserInfo() {
        System.out.println("Please enter the following information: ");

        System.out.println("Name: ");
        name = AppSystem.input.nextLine();

        while(!name.matches("^[A-Za-z\\s-]+$")){
            System.out.println("Invalid Format, Please re-enter the name: ");
            name = AppSystem.input.nextLine();
        }

        System.out.println("Email: ");
        email = AppSystem.input.nextLine();

        while(!email.matches("^\\w+([.-]?\\w+)*@\\w+([.-]?\\w+)*(\\.\\w{2,3})+$")){
            System.out.println("Invalid Format, Please re-enter the email: ");
            email = AppSystem.input.nextLine();
        }

        OTP.sendOTP(email);

        System.out.println("OTP code sent to your email: ");
        String otp = AppSystem.input.nextLine();

        while(!otp.equals(OTP.getOTP())){
            System.out.println("OTP not matched re-enter the correct code: ");
            otp = AppSystem.input.nextLine();
        }
        System.out.println("Phone Number: ");
        phoneNumber = AppSystem.input.nextLine();

        while(!phoneNumber.matches("^(011|012|010|015)\\d{8}$")){
            System.out.println("Invalid Format, Please re-enter the phone number: ");
            phoneNumber = AppSystem.input.nextLine();
        }

        System.out.println("Address: ");
        address = AppSystem.input.nextLine();

        while(!address.matches("^[A-Za-z0-9\\s,]+$")){
            System.out.println("Invalid Format, Please re-enter the address: ");
            address = AppSystem.input.nextLine();
        }

        System.out.println("Username: ");
        username = AppSystem.input.nextLine();

        while(!username.matches("^[A-Za-z0-9_]+$")){
            System.out.println("Invalid Format, Please re-enter the username: ");
            username = AppSystem.input.nextLine();
        }

        System.out.println("Password: ");
        password = AppSystem.input.nextLine();

        while(!password.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&_])[A-Za-z\\d@$!%*?&_]{8,}$")){
            System.out.println("Invalid Format, Please re-enter the password: ");
            password = AppSystem.input.nextLine();
        }

        System.out.println("Confirm Password: ");
        confirmPassword = AppSystem.input.nextLine();

        while(!confirmPassword.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&_])[A-Za-z\\d@$!%*?&_]{8,}$")){
            System.out.println("Invalid Format, Please re-enter the confirm password: ");
            confirmPassword = AppSystem.input.nextLine();
        }

        while(!password.equals(confirmPassword)){
            System.out.println("Password and Confirm Password are not matched, Please re-enter the password: ");
            confirmPassword = AppSystem.input.nextLine();
        }
    }
}
