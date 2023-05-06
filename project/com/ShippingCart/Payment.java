package com.ShippingCart;

import java.util.Scanner;

import com.User.Buyer;

public class Payment {
    private Buyer currentBuyer;

    public Payment(Buyer cBuyer) {
        currentBuyer = cBuyer;

    }

    private void payByCash(double cost) {
        System.out.println("The payment will be cassh on delivery :)");
        /* Sorry but I don't know what should I write here as the customer will pay in cash :) */
    }


    private void payByCredit(double cost) {}
    private void payBySmartWallet(double cost){}

    private void payByGiftVoucher(double cost){}

    private void payByLoyalityPoints(double cost) {}
    
    
    
    public void pay(double cost, String type) {
        Scanner in = new Scanner(System.in);
        switch (type) {
            case "Cash":
                payByCash(cost);
                break;
            case "Credit":
                payByCredit(cost);
                break;
            case "Smart Wallet":
                payBySmartWallet(cost);
                break;
            case "Gift Voucher":
                payByGiftVoucher(cost);
            default:
                break;
        }
        
        if (cost != 0) {
            System.out.println(
                    "The Cost of the order not covered yet\nChoose Another way to complete your payment and make your order done: ");
            type = in.nextLine();
            pay(cost, type);

        }
        in.close();
    }

}
