package com.ShippingCart;

import java.util.LinkedList;

import com.System.AppSystem;

public class Cart {
    private LinkedList<ItemCart> items;

    public Cart() {
        items = new LinkedList<>();
    }

    public void addItem(ItemCart item) {
        this.items.add(item);
    }

    public void delete() {
        System.out.println("Please enter the Item name: ");
        String name = AppSystem.input.nextLine();
        for (int i = 0; i < this.items.size(); i++) {
            if (this.items.get(i).getItem().getName().equals(name)) {
                this.items.remove(i);
            }
        }
    }

    public LinkedList<ItemCart> confirm() {
        return this.items;
    }

}
