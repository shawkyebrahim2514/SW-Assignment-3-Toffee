package com.ShippingCart;
import com.User.Buyer;
import java.util.Vector;
import java.util.Scanner;

public class Order {
    private Vector<Item> items;
    private StatusType status;
    private Buyer currentBuyer;
    private String orderAddress;


    public Order(Vector<Item> items) {
        this.items = items;
        this.status = StatusType.ORDERED;
        System.out.println("Would you like to continue the order or cancel it: yes(confirm) / no(cancel)");
        Scanner in = new Scanner(System.in);
        String choice = in.nextLine();
        if (choice == "yes") {
            pay(currentBuyer);
        } else {
            cancel();
        }
        in.close();
    }

    private void earnLoyalityPoints() {
    }
    
    private void chooseAddress() {
        System.out.println("Would you like the order to be dlivered in the same address? : yes / no");
        Scanner in = new Scanner(System.in);
        String choice = in.nextLine();
        if (choice == "yes") {
            orderAddress = this.currentBuyer.getAddress();
        }
        else {
            System.out.println("Please enter the address for your order: ");
            this.orderAddress = in.nextLine();
        }

        in.close();
    }

    private double calculateCost() {
        double cost = 0;
        for (Item i : this.items) {
            cost += i.getPrice();
        }
        return cost;
    }
    
    public void pay(Buyer b) {
        currentBuyer = b;
        Payment orderPayment = new Payment(b);
        orderPayment.pay(calculateCost(), "Cash");
        chooseAddress();
    }

    

    public void cancel() {
        this.items = null;
        this.status = StatusType.CANCELLED;
        System.out.println("The Order has been canceled :(");
    }
    
}
