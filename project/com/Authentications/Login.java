package com.Authentications;

import com.System.AppSystem;
import com.User.Buyer;

public class Login {
    private String password;
    private String username;

    /**
     * Check if the username and password are valid
     * @return true if the username and password are valid, false otherwise
     */
    private boolean checkValidation() {
        return AppSystem.users.checkExistUser(username, password);
    }

    /**
     * Login as admin
     * @return true if the login is successful, false otherwise
     */
    private boolean adminLogin() {
        System.out.println("There are no admins in the system!");
        return false;
    }

    /**
     * Login as buyer
     * @return true if the login is successful, false otherwise
     */
    private Buyer buyerLogin() {
        System.out.print("Enter your username: ");
        username = AppSystem.input.nextLine();
        System.out.print("Enter your password: ");
        password = AppSystem.input.nextLine();
        if (checkValidation()) {
            return AppSystem.users.getBuyer(username);
        }
        return null;
    }

    /**
     * Login to the system
     * @return the buyer if the login is successful, null otherwise
     */
    public Buyer login() {
        System.out.println("What is your role?");
        System.out.println("1. Buyer");
        System.out.println("2. Admin");
        System.out.println("3. Exit");
        System.out.print("Enter your choice: ");
        int choice = Integer.parseInt(AppSystem.input.nextLine());
        switch (choice) {
            case 1:
                return buyerLogin();
            case 2:
                return null;
            case 3:
                System.out.println("Thank you for using our system!");
                System.exit(0);
                return null;
            default:
                System.out.println("Invalid choice!");
                return null;
        }
    }
}
