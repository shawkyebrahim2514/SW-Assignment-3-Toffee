package com.ShippingCart;
import java.util.Scanner;

public class Item {
    private  String name;
    private String brand;
    private String description;
    private String image;
    private int pieces;
    private double price;
    private double discount;
    private QuantityType quantityType;

    public Item(){}
    public void view(){
        System.out.println("Name: " + this.name);
        System.out.println("Brand: " + this.brand);
        System.out.println("image: " + this.image);
        System.out.println("Valid Pieces: " + this.pieces);
        System.out.println("Price: " + this.price);
        System.out.println(this.description);
    }

    public void update() {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the product's name: ");
        String name = in.nextLine();
        setName(name);

        System.out.println("Please enter the product's Brand: ");
        String brand = in.nextLine();
        setBrand(brand);
 
        System.out.println("Please enter the product's Description: ");
        String description= in.nextLine();
        setDescription(description);

        System.out.println("Please enter the product's Image url: ");
        String imageUrl= in.nextLine();
        setImage(imageUrl);

        System.out.println("Please enter the product's name: ");
        double price = in.nextDouble();
        setPrice(price);
        
        System.out.println("Please enter the product's valid pieces:");
        int pieces = in.nextInt();
        setPieces(pieces);

        System.out.println("Please Select the type of quantity you want: ");
        System.out.println("packages, kilos ?");
        String type = in.nextLine();
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
        

        in.close();

    }
    public void setName(String name) {
        this.name = name;
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
    public void setPrice(double price) {
        this.price = price - discount;
    }
    public void setDiscount(double discount) {
        this.discount = discount;
    }
    public void setQuantityType(QuantityType quantityType) {
        this.quantityType = quantityType;
    }
}
