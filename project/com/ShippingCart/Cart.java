package com.ShippingCart;

import java.util.LinkedList;
import java.util.Scanner;

public class Cart {
    private LinkedList<Item> items;

    public Cart() {
        items = new LinkedList<Item>();
    }
    
    
    public void addItem(Item item) {
        this.items.add(item);
    }

    public void delete() {
        Scanner cin = new Scanner(System.in);
        System.out.println("Please enter the Item name: ");
        String name = cin.nextLine();
        for (int i = 0; i < this.items.size(); i++) {
            if (this.items.get(i).getName() == name) {
                this.items.remove(i);
            }
        }
        cin.close();
    }

    public LinkedList<Item> confirm() {

        return this.items;
    }
    
}
