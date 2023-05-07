package com.System;

import com.User.Buyer;

import java.util.Scanner;

import com.Authentications.*;
import com.ShippingCart.Item;
import com.ShippingCart.ItemCart;

public class AppSystem {
    public static Scanner input = new Scanner(System.in);
    private Buyer currentBuyer;
    private Registration registration;
    private Login login;
    public static ManageItems items = new ManageItems();
    public static ManageUsers users = new ManageUsers();

    public AppSystem() {
        registration = new Registration();
        login = new Login();
        System.out.println("Welcome to our system!");
        System.out.println("1- Login");
        System.out.println("2- Register");
        System.out.println("3- View Catalog");
        System.out.println("4- Exit");
        System.out.print("Enter your choice: ");
        int choice = input.nextInt();
        switch (choice) {
            case 1:
                if (login.login()) {
                    System.out.println("Login successful!");
                    displayBuyerMenu();
                } else {
                    System.out.println("Login failed!");
                }
                break;
            case 2:
                if (registration.register()) {
                    System.out.println("Registration successful!");
                    if (login.login()) {
                        System.out.println("Login successful!");
                        displayBuyerMenu();
                    } else {
                        System.out.println("Login failed!");
                    }
                } else {
                    System.out.println("Registration failed!");
                }
                break;
            case 3:
                items.viewCatalog();
                break;
            case 4:
                System.out.println("Thank you for using our system!");
                input.close();
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice!");
                break;
        }
    }

    public void displayMenu() {
        System.out.println("What is your role?");
        System.out.println("1. Buyer");
        System.out.println("2. Admin");
        System.out.println("3. Exit");
        System.out.print("Enter your choice: ");
        int choice = input.nextInt();
        switch (choice) {
            case 1:
                displayBuyerMenu();
                break;
            case 2:
                displayAdminMenu();
                break;
            case 3:
                System.out.println("Thank you for using our system!");
                input.close();
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice!");
                break;
        }
    }

    private void displayBuyerMenu() {
        System.out.println("Which action do you want to perform?");
        System.out.println("1. search items");
        System.out.println("2. View Catalog");
        System.out.println("3. Choose Item");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
        int choice = input.nextInt();
        switch (choice) {
            case 1:
                items.search();
                break;
            case 2:
                items.viewCatalog();
                break;
            case 3:
                chooseItem();
                break;
            case 4:
                System.out.println("Thank you for using our system!");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice!");
                break;
        }
    }

    private void chooseItem() {
        ItemCart itemCart = items.chooseItem();
        if (itemCart == null) {
            return;
        }
        currentBuyer.addToCart(itemCart);
    }

    private void displayAdminMenu() {
        System.out.println("There is no admin in this system yet!");
    }
}
