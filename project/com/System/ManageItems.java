package com.System;

import java.util.LinkedList;

import com.ShippingCart.Item;
import com.ShippingCart.ItemCart;

public class ManageItems {
    private LinkedList<Item> items = new LinkedList<>();

    // Methods for Users
    public void search() {
        System.out.println("Enter the name of the item you want to search: ");
        String itemName = AppSystem.input.nextLine();
        for (Item item : items) {
            if (item.getName().equals(itemName)) {
                item.view();
                return;
            }
        }
    }

    public void viewCatalog() {
        Integer itemCounter = 1;
        for (Item item : items) {
            System.out.println("Item number: " + itemCounter);
            item.view();
            itemCounter++;
        }
    }

    public ItemCart chooseItem() {
        viewCatalog();
        System.out.println("Enter the number of the item you want to choose: ");
        Integer itemNumber = AppSystem.input.nextInt();
        if (itemNumber > items.size()) {
            System.out.println("Invalid item number!");
            return null;
        }
        Item item = items.get(itemNumber - 1);
        Integer pieces;
        System.out.println("Enter the number of pieces you want to buy: ");
        pieces = AppSystem.input.nextInt();
        if (pieces > item.getPieces()) {
            System.out.println("Invalid number of pieces!");
            return null;
        }
        item.setPieces(item.getPieces() - pieces);
        return new ItemCart(item, pieces);
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
