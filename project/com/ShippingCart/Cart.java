package com.ShippingCart;

import java.util.Scanner;
import java.util.Vector;

public class Cart {
    private Vector<Item> items;
    

    public Cart() {
        items = new Vector<Item>();
    }
    
    /**
     * @param item
     */
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

    public Vector<Item> confirm() {

        return this.items;
    }
    
}
