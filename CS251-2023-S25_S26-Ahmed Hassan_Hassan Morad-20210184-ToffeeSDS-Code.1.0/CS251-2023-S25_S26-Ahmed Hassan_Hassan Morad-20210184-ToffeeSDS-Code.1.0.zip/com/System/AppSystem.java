package com.System;

import com.User.Buyer;

import java.util.Scanner;

import com.Authentications.*;
import com.ShippingCart.ItemCart;

public class AppSystem {
    public static Scanner input = new Scanner(System.in);
    private Buyer currentBuyer;
    private Registration registration;
    private Login login;
    public static ManageItems items = new ManageItems();
    public static ManageUsers users = new ManageUsers();
    /**
     * Constructor
     */
    public AppSystem() {
        run();
    }

    /**
     * Display the main menu
     */
    private void run() {
        login = new Login();
        registration = new Registration();
        System.out.println("Welcome to our system!");
        System.out.println("1- Login");
        System.out.println("2- Register");
        System.out.println("3- View Catalog");
        System.out.println("4- Exit");
        System.out.print("Enter your choice: ");
        int choice = Integer.parseInt(input.nextLine());
        switch (choice) {
            case 1:
                Buyer loggedBuyer = login.login();
                if (loggedBuyer != null) {
                    System.out.println("Login successful!");
                    currentBuyer = loggedBuyer;
                    displayBuyerMenu();
                } else {
                    System.out.println("Login failed!");
                }
                break;
            case 2:
                if (registration.register()) {
                    System.out.println("Registration successful!");
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
                return;
            default:
                System.out.println("Invalid choice!");
                break;
        }
        run();
    }

    /**
     * After login, display the type of the user menu
     */
    public void displayMenu() {
        System.out.println("What is your role?");
        System.out.println("1. Buyer");
        System.out.println("2. Admin");
        System.out.println("3. Exit");
        System.out.print("Enter your choice: ");
        int choice = Integer.parseInt(input.nextLine());
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

    /**
     * Display the buyer menu
     */
    private void displayBuyerMenu() {
        System.out.println("Which action do you want to perform?");
        System.out.println("1. search items");
        System.out.println("2. View Catalog");
        System.out.println("3. Choose Item");
        System.out.println("4. add new order");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
        int choice = Integer.parseInt(input.nextLine());
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
                currentBuyer.addNewOrder();
                break;
            case 5:
                System.out.println("Thank you for using our system!");
                System.exit(0);
                return;
            default:
                System.out.println("Invalid choice!");
                break;
        }
        displayBuyerMenu();
    }

    /**
     * Choose an item from the catalog
     */
    private void chooseItem() {
        ItemCart itemCart = items.chooseItem();
        if (itemCart == null) {
            return;
        }
        currentBuyer.addToCart(itemCart);
    }

    /**
     * Display the admin menu
     */
    private void displayAdminMenu() {
        System.out.println("There is no admin in this system yet!");
    }
}
