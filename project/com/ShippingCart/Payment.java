package com.ShippingCart;

import com.System.AppSystem;
import com.User.Buyer;

public class Payment {
    private Buyer currentBuyer;

    public Payment(Buyer buyer) {
        currentBuyer = buyer;
    }

    private double payByCash(double cost) {
        System.out.println("The payment will be cassh on delivery :)");
        return 0;
    }

    public void pay(double cost, String type) {
        switch (type) {
            case "Cash":
                cost = payByCash(cost);
                break;
            case "Credit":
                payByCredit(cost);
                break;
            case "Smart Wallet":
                payBySmartWallet(cost);
                break;
            case "Gift Voucher":
                payByGiftVoucher(cost);
                break;
            default:
                break;
        }
        if (cost != 0) {
            System.out.println(
                    "The Cost of the order not covered yet\n" +
                            "Choose Another way to complete your payment and make your order done: ");
            type = AppSystem.input.nextLine();
            pay(cost, type);
        } else {
            chooseAddress();
        }
    }

    private void chooseAddress() {
        System.out.println("Would you like the order to be dlivered in the same address? : (y/n)");
        String choice = AppSystem.input.nextLine();
        String orderAddress;
        if (choice.equals("y")) {
            orderAddress = this.currentBuyer.getAddress();
        } else {
            System.out.println("Please enter the address for your order: ");
            orderAddress = AppSystem.input.nextLine();
        }
    }

    private void payByCredit(double cost) {
    }

    private void payBySmartWallet(double cost) {
    }

    private void payByGiftVoucher(double cost) {
    }

    private void payByLoyalityPoints(double cost) {
    }
}
