package com.ShippingCart;

import java.util.LinkedList;

public class Order {
    private LinkedList<ItemCart> items;
    private StatusType status;

    public Order(LinkedList<ItemCart> items) {
        this.items = items;
        this.status = StatusType.ORDERED;
    }

    public double calculateCost() {
        double cost = 0;
        for (ItemCart itemCart : this.items) {
            cost += (itemCart.getItem().getPrice() * itemCart.getPieces());
        }
        return cost;
    }

    public void cancel() {
        this.items = null;
        this.status = StatusType.CANCELLED;
        System.out.println("The Order has been canceled :(");
    }

    private void earnLoyalityPoints() {
    }
}
