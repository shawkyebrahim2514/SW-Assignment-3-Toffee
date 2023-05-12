package com.Authentications;

import com.Authentications.OTP.*;
import com.System.*;
import com.User.Buyer;

public class Registration {
    private String name;
    private String email;
    private String phoneNumber;
    private String address;
    private String username;
    private String password;

    /**
     * Constructor
     */
    public Registration() {
    }

    /**
     * Register as buyer
     * 
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
        takeName();
        takeEmail();
        OTP.sendOTP(email);
        takeOTP();
        takePhoneNumber();
        takeAddress();
        takeUsername();
        takePassword();
        checkPasswordConfirmation();
    }

    /**
     * take user name and check if it is valid
     */
    private void takeName() {
        System.out.println("Name: ");
        name = AppSystem.input.nextLine();
        while (!name.matches("^[A-Za-z\\s-]+$")) {
            System.out.println("Invalid Format, Please re-enter the name: ");
            name = AppSystem.input.nextLine();
        }
    }

    /**
     * take the email and check if it is valid
     */
    private void takeEmail() {
        System.out.println("Email: ");
        email = AppSystem.input.nextLine();
        while (!email.matches("^\\w+([.-]?\\w+)*@\\w+([.-]?\\w+)*(\\.\\w{2,3})+$")) {
            System.out.println("Invalid Format, Please re-enter the email: ");
            email = AppSystem.input.nextLine();
        }
    }

    /**
     * take otp from user and check if it is valid
     */
    private void takeOTP() {
        System.out.println("OTP code sent to your email: ");
        String otp = AppSystem.input.nextLine();
        while (!otp.equals(OTP.getOTP())) {
            System.out.println("OTP not matched re-enter the correct code: ");
            otp = AppSystem.input.nextLine();
        }
    }

    /**
     * take user phone number and check if it is valid
     */
    private void takePhoneNumber() {
        System.out.println("Phone Number: ");
        phoneNumber = AppSystem.input.nextLine();
        while (!phoneNumber.matches("^(011|012|010|015)\\d{8}$")) {
            System.out.println("Invalid Format, Please re-enter the phone number: ");
            phoneNumber = AppSystem.input.nextLine();
        }
    }

    /**
     * take user address and check if it is valid
     */
    private void takeAddress() {
        System.out.println("Address: ");
        address = AppSystem.input.nextLine();
        while (!address.matches("^[A-Za-z0-9\\s,]+$")) {
            System.out.println("Invalid Format, Please re-enter the address: ");
            address = AppSystem.input.nextLine();
        }
    }

    /**
     * take username and check if it is valid
     */
    private void takeUsername() {
        System.out.println("Username: ");
        username = AppSystem.input.nextLine();
        while (!username.matches("^[A-Za-z0-9_]+$")) {
            System.out.println("Invalid Format, Please re-enter the username: ");
            username = AppSystem.input.nextLine();
        }
    }

    /**
     * take user password and check if it is valid
     */
    private void takePassword() {
        System.out.println("Password: ");
        password = AppSystem.input.nextLine();
        while (!password.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&_])[A-Za-z\\d@$!%*?&_]{8,}$")) {
            System.out.println("Invalid Format, Please re-enter the password: ");
            password = AppSystem.input.nextLine();
        }
    }

    /**
     * make user confirm the password
     */
    private void checkPasswordConfirmation() {
        System.out.println("Confirm Password: ");
        String confirmPassword = AppSystem.input.nextLine();
        while (!confirmPassword.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&_])[A-Za-z\\d@$!%*?&_]{8,}$")) {
            System.out.println("Invalid Format, Please re-enter the confirm password: ");
            confirmPassword = AppSystem.input.nextLine();
        }
        while (!password.equals(confirmPassword)) {
            System.out.println("Password and Confirm Password are not matched, Please re-enter the password: ");
            confirmPassword = AppSystem.input.nextLine();
        }
    }
}
