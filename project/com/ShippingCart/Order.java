package com.ShippingCart;

public class Order {
    private Item items;
    private StatusType status;
<<<<<<< Updated upstream
=======
    private Buyer currentBuyer;
    private String orderAddress;


    public Order(Item[] items){

    }
    
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
>>>>>>> Stashed changes

    private void earnLoyalityPoints() {
    }
    
    private void calculateCost() {
    }
    
    public void pay() {
    }

    public void cancel() {
    }
    
}
