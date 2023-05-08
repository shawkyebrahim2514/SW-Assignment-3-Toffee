package com.ShippingCart;

import java.util.LinkedList;

import com.System.AppSystem;

public class Cart {
    private LinkedList<ItemCart> items;

    /**
     * Constructor
     */
    public Cart() {
        items = new LinkedList<>();
    }

    /**
     * Add item to the cart
     * @param item the item to be added
     */
    public void addItem(ItemCart item) {
        this.items.add(item);
    }

    /**
     * Delete item from the cart
     */
    public void delete() {
        System.out.println("Please enter the Item name: ");
        String name = AppSystem.input.nextLine();
        for (int i = 0; i < this.items.size(); i++) {
            if (this.items.get(i).getItem().getName().equals(name)) {
                this.items.remove(i);
            }
        }
    }

<<<<<<< Updated upstream
    public void clearItems() {
        this.items.clear();
    }

=======
    /**
     * Confirm the cart
     * @return the list of items in the cart
     */
>>>>>>> Stashed changes
    public LinkedList<ItemCart> confirm() {
        return this.items;
    }

}
