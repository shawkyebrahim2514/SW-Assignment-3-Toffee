package com.ShippingCart;

import java.util.LinkedList;

public class Order {
    private LinkedList<ItemCart> items;
    private StatusType status;
    /**
     * Constructor
     * @param items the list of items
     */
    public Order(LinkedList<ItemCart> items) {
        this.items = items;
        this.status = StatusType.ORDERED;
    }
    /**
     * Calculate the cost of the order
     * @return the cost of the order
     */
    public double calculateCost() {
        double cost = 0;
        for (ItemCart itemCart : this.items) {
            cost += (itemCart.getItem().getPrice() * itemCart.getPieces());
        }
        return cost;
    }

    /**
     * Cancel the order
     */
    public void cancel() {
        this.items = null;
        this.status = StatusType.CANCELLED;
        System.out.println("The Order has been canceled :(");
    }

    /**
     * Add loyality points to the buyer
     */
    private void earnLoyalityPoints() {
    }
}
