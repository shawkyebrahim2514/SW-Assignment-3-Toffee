package com.ShippingCart;
import com.User.Buyer;
import java.util.Vector;

public class Order {
    private Vector<Item> items;
    private StatusType status;


    public Order(Vector<Item> items) {
        this.items = items;
        this.status = StatusType.ORDERED;
    }
    private void earnLoyalityPoints() {
    }
    
    private double calculateCost() {
        double cost = 0;
        for (Item i : this.items) {
            cost += i.getPrice();
        }
        return cost;
    }
    
    public void pay() {
        // Buyer b = new Buyer();
        // Payment orderPayment = new Payment(b);
        // orderPayment.pay(calculateCost(), "Cash");
    }

    public void cancel() {
        this.items = null;
        this.status = StatusType.CANCELLED;
        System.out.println("The Order has been canceled :(");
    }
    
}
