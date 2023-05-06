package com.Authentications;

import com.System.AppSystem;

public class Login {
    private String password;
    private String username;

    private boolean checkValidation() {
        return AppSystem.users.checkExistUser(username, password);
    }

    private boolean adminLogin() {
        System.out.println("There are no admins in the system!");
        return false;
    }

    private boolean buyerLogin() {
        System.out.print("Enter your username: ");
        username = AppSystem.input.next();
        System.out.print("Enter your password: ");
        password = AppSystem.input.next();
        return checkValidation();
    }

    public boolean login() {
        System.out.println("What is your role?");
        System.out.println("1. Buyer");
        System.out.println("2. Admin");
        System.out.println("3. Exit");
        System.out.print("Enter your choice: ");
        int choice = AppSystem.input.nextInt();
        switch (choice) {
            case 1:
                return buyerLogin();
            case 2:
                return adminLogin();
            case 3:
                System.out.println("Thank you for using our system!");
                System.exit(0);
            default:
                System.out.println("Invalid choice!");
                return false;
        }
    }
}
