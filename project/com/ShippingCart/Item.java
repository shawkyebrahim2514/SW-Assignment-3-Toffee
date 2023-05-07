package com.ShippingCart;

import java.util.Scanner;

import com.System.AppSystem;

public class Item {
    private String name;
    private String brand;
    private String description;
    private String image;
    private int pieces;
    private double price;
    private double discount;
    private QuantityType quantityType;

    public Item() {
    }

    public void view() {
        System.out.println("Name: " + this.name);
        System.out.println("Brand: " + this.brand);
        System.out.println("image: " + this.image);
        System.out.print("Valid Pieces: " + this.pieces);
        System.out.println(" " + this.quantityType);
        System.out.println("Price: " + this.price);
        System.out.println(this.description);
    }

    public void update() {
        System.out.println("What do you want to update?");
        System.out.println("1- Name");
        System.out.println("2- Brand");
        System.out.println("3- Description");
        System.out.println("4- Image");
        System.out.println("5- Price");
        System.out.println("6- Pieces");
        System.out.println("7- Quantity Type");
        System.out.println("8- Discount");
        System.out.println("9- Exit");
        System.out.print("Enter your choice: ");
        int choice = Integer.parseInt(AppSystem.input.nextLine());
        switch (choice) {
            case 1:
                System.out.println("Please enter the new name: ");
                String name = AppSystem.input.nextLine();
                setName(name);
                break;
            case 2:
                System.out.println("Please enter the new brand: ");
                String brand = AppSystem.input.nextLine();
                setBrand(brand);
                break;
            case 3:
                System.out.println("Please enter the new description: ");
                String description = AppSystem.input.nextLine();
                setDescription(description);
                break;
            case 4:
                System.out.println("Please enter the new image: ");
                String image = AppSystem.input.nextLine();
                setImage(image);
                break;
            case 5:
                System.out.println("Please enter the new price: ");
                double price = AppSystem.input.nextDouble();
                setPrice(price);
                break;
            case 6:
                System.out.println("Please enter the new pieces: ");
                int pieces = AppSystem.input.nextInt();
                setPieces(pieces);
                break;
            case 7:
                System.out.println("Please Select the type of quantity you want: ");
                System.out.println("packages, kilos ?");
                String type = AppSystem.input.nextLine();
                switch (type) {
                    case "kilos":
                        setQuantityType(QuantityType.koios);
                        break;
                    case "packages":
                        setQuantityType(QuantityType.packges);
                        break;
                    default:
                        break;
                }
                break;
            case 8:
                System.out.println("Please enter the new discount: ");
                double discount = AppSystem.input.nextDouble();
                setDiscount(discount);
                break;
            case 9:
                return;
        }
        update();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setPieces(int pieces) {
        this.pieces = pieces;
    }

    public String getBrand() {
        return brand;
    }

    public String getDescription() {
        return description;
    }

    public String getImage() {
        return image;
    }

    public int getPieces() {
        return pieces;
    }

    public double getDiscount() {
        return discount;
    }

    public QuantityType getQuantityType() {
        return quantityType;
    }

    public void setPrice(double price) {
        this.price = price - discount;
    }

    public double getPrice() {
        return this.price;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public void setQuantityType(QuantityType quantityType) {
        this.quantityType = quantityType;
    }
}