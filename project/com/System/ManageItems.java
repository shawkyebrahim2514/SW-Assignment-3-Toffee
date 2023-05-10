package com.System;

import java.util.LinkedList;

import com.ShippingCart.Item;
import com.ShippingCart.ItemCart;
import com.ShippingCart.Order;
import com.ShippingCart.QuantityType;

public class ManageItems {
    private LinkedList<Item> items = new LinkedList<>();
    private LinkedList<Order> orders = new LinkedList<>();
    /**
     * Constructor
     */
    public ManageItems() {
        // create 10 items for testing
        items.add(new Item("item1", "brand1", "description1", "image1", 10, 10, 0, QuantityType.PACKAGE));
        items.add(new Item("item2", "brand2", "description2", "image2", 10, 10, 0, QuantityType.PACKAGE));
        items.add(new Item("item3", "brand3", "description3", "image3", 10, 10, 0, QuantityType.PACKAGE));
        items.add(new Item("item4", "brand4", "description4", "image4", 10, 10, 0, QuantityType.KILOS));
        items.add(new Item("item5", "brand5", "description5", "image5", 10, 10, 0, QuantityType.PACKAGE));
        items.add(new Item("item6", "brand6", "description6", "image6", 10, 10, 0, QuantityType.KILOS));
        items.add(new Item("item7", "brand7", "description7", "image7", 10, 10, 0, QuantityType.KILOS));
        items.add(new Item("item8", "brand8", "description8", "image8", 10, 10, 0, QuantityType.PACKAGE));
        items.add(new Item("item9", "brand9", "description9", "image9", 10, 10, 0, QuantityType.PACKAGE));
        items.add(new Item("item10", "brand10", "description10", "image10", 10, 10, 0, QuantityType.KILOS));

        // Create 5 linkedlist of items for testing
        LinkedList<ItemCart> items1 = new LinkedList<>();
        items1.add(new ItemCart(items.get(0), 1));
        items1.add(new ItemCart(items.get(1), 1));
        orders.add(new Order(items1));

        items1 = new LinkedList<>();
        items1.add(new ItemCart(items.get(2), 1));
        items1.add(new ItemCart(items.get(3), 1));
        orders.add(new Order(items1));

        items1 = new LinkedList<>();
        items1.add(new ItemCart(items.get(4), 1));
        items1.add(new ItemCart(items.get(5), 1));
        orders.add(new Order(items1));

        items1 = new LinkedList<>();
        items1.add(new ItemCart(items.get(6), 1));
        items1.add(new ItemCart(items.get(7), 1));
        orders.add(new Order(items1));

        items1 = new LinkedList<>();
        items1.add(new ItemCart(items.get(8), 1));
        items1.add(new ItemCart(items.get(9), 1));
        orders.add(new Order(items1));

    }

    // Methods for Users
    /**
     * Search for an item
     */
    public void search() {
        System.out.println("Enter the name of the item you want to search: ");
        String itemName = AppSystem.input.nextLine();
        for (Item item : items) {
            if (item.getName().equals(itemName)) {
                item.view();
                return;
            }
        }
        System.out.println("Item not found!");
    }
    /**
     * View the catalog of items
     */
    public void viewCatalog() {
        Integer itemCounter = 1;
        for (Item item : items) {
            System.out.println("Item number: " + itemCounter);
            System.out.println("\n");
            item.view();
            itemCounter++;
        }
    }
    /**
     * Choose an item from the catalog
     * @return the item chosen
     */
    public ItemCart chooseItem() {
        viewCatalog();
        System.out.println("Enter the number of the item you want to choose: ");
        Integer itemNumber = Integer.parseInt(AppSystem.input.nextLine());
        if (itemNumber > items.size()) {
            System.out.println("Invalid item number!");
            return null;
        }
        Item item = items.get(itemNumber - 1);
        Integer pieces;
        System.out.println("Enter the number of pieces you want to buy: ");
        pieces = Integer.parseInt(AppSystem.input.nextLine());
        if (pieces > item.getPieces()) {
            System.out.println("Invalid number of pieces!");
            return null;
        }
        item.setPieces(item.getPieces() - pieces);
        return new ItemCart(item, pieces);
    }

    /**
     * Add a new order
     * @param order the order to be added
     */
    public void addNewOrder(Order order) {
        orders.add(order);
    }

    // Methods for Admins
    /**
     * Add new items to the catalog
     */
    public void addItems() {
    }

    /**
     * Delete items from the catalog
     */
    public void deleteItems() {
    }
    /**
     * Update the items in the catalog
     */
    public void updateItems() {
    }
    /**
     * Update the catalog
     */
    public void updateCatalog() {
    }
    /**
     * View the orders
     */
    public void viewOrders() {
    }
    /**
     * Set the loyalty points
     */
    public void setLoyaltyPoints() {
    }
    /**
     * Set the restrictions
     */
    public void putRestrictions() {
    }
    /**
     * View the items statistics
     */
    public void viewStatistics() {
    }
}
