package com.ShippingCart;

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
    
    /**
     * Constructor
     * @param name the name of the item
     * @param brand the brand of the item
     * @param description the description of the item
     * @param image the image of the item
     * @param pieces the number of pieces of the item
     * @param price the price of the item
     * @param discount the discount of the item
     * @param quantityType the quantity type of the item
     */
    public Item(String name, String brand, String description, String image, int pieces, double price,
            double discount, QuantityType quantityType) {
        this.name = name;
        this.brand = brand;
        this.description = description;
        this.image = image;
        this.pieces = pieces;
        this.price = price;
        this.discount = discount;
        this.quantityType = quantityType;
    }

    /**
     * View the item information
     */
    public void view() {
        System.out.println("Name: " + this.name);
        System.out.println("Brand: " + this.brand);
        System.out.println("image: " + this.image);
        System.out.print("Valid Pieces: " + this.pieces);
        System.out.println(" " + this.quantityType);
        System.out.println("Price: " + this.price);
        System.out.println(this.description);
    }

    /**
     * Update the item information
     */
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
                        setQuantityType(QuantityType.KILOS);
                        break;
                    case "packages":
                        setQuantityType(QuantityType.PACKAGE);
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
    /**
     * set the name of the item
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get the name of the item
     * @return the name of the item
     */
    public String getName() {
        return this.name;
    }

    /**
     * set the brand of the item
     * @param brand
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * set the description of the item
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * set the image of the item
     * @param image
     */
    public void setImage(String image) {
        this.image = image;
    }

    /**
     * set the number of pieces of the item
     * @param pieces
     */
    public void setPieces(int pieces) {
        this.pieces = pieces;
    }

    /**
     * get the brand of the item
     * @return the brand of the item
     */
    public String getBrand() {
        return brand;
    }

    /**
     * get the description of the item
     * @return the description of the item
     */
    public String getDescription() {
        return description;
    }

    /**
     * get the image of the item
     * @return the image of the item
     */
    public String getImage() {
        return image;
    }

    /**
     * get the number of pieces of the item
     * @return the number of pieces of the item
     */
    public int getPieces() {
        return pieces;
    }

    /**
     * get the discount of the item
     * @return the discount of the item
     */
    public double getDiscount() {
        return discount;
    }

    /**
     * get the quantity type of the item
     * @return the quantity type of the item
     */
    public QuantityType getQuantityType() {
        return quantityType;
    }

    /**
     * set the price of the item
     * @param price
     */
    public void setPrice(double price) {
        this.price = price - discount;
    }
    /**
     * get the price of the item
     * @return the price of the item
     */
    public double getPrice() {
        return this.price;
    }

    /**
     * set the discount of the item
     * @param discount
     */
    public void setDiscount(double discount) {
        this.discount = discount;
    }

    /**
     * set the quantity type of the item
     * @param quantityType
     */
    public void setQuantityType(QuantityType quantityType) {
        this.quantityType = quantityType;
    }
}