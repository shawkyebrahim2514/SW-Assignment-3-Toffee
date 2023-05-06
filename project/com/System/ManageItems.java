package com.System;

import java.util.LinkedList;

import com.ShippingCart.Item;

public class ManageItems {
    private LinkedList<Item> items = new LinkedList<>();

    // Methods for Users
    public void search() {
        System.out.println("Enter the name of the item you want to search: ");
        String itemName = AppSystem.input.nextLine();

    }

    public void viewCatalog() {
        Integer itemCounter = 1;
        for (Item item : items) {
            System.out.println("Item number: " + itemCounter);
            item.view();
            itemCounter++;
        }
    }

    public Item chooseItem() {
        viewCatalog();
        System.out.println("Enter the number of the item you want to choose: ");
        Integer itemNumber = AppSystem.input.nextInt();
        if (itemNumber > items.size()) {
            System.out.println("Invalid item number!");
            return null;
        }
        Item item = items.get(itemNumber - 1);
        return item;
    }

    // Methods for Admins
    public void addItems() {
    }

    public void deleteItems() {
    }

    public void updateItems() {
    }

    public void updateCatalog() {
    }

    public void viewOrders() {
    }

    public void setLoyaltyPoints() {
    }

    public void putRestrictions() {
    }

    public void viewStatistics() {
    }
}
