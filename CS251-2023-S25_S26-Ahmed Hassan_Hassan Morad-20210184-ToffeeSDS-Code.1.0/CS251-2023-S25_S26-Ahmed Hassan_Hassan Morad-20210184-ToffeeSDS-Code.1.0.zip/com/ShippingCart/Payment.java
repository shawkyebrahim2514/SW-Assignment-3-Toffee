package com.ShippingCart;

import com.System.AppSystem;
import com.User.Buyer;

public class Payment {
    private Buyer currentBuyer;
    /**
     * Constructor
     * @param buyer
     */
    public Payment(Buyer buyer) {
        currentBuyer = buyer;
    }

    /**
     * Pay by cash
     * @param cost the cost of the order
     * @return the remaining cost
     */
    private double payByCash(double cost) {
        System.out.println("The payment will be cassh on delivery :)");
        return 0;
    }
    /**
     * Pay the order
     * @param cost the cost of the order
     * @param type the type of payment
     */
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

    /**
     * Choose the address of the order
     */
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
    /**
     * Pay by credit
     * @param cost the cost of the order
     */
    private void payByCredit(double cost) {
    }

    /**
     * Pay by smart wallet
     * @param cost the cost of the order
     */
    private void payBySmartWallet(double cost) {
    }
    /**
     * Pay by gift voucher
     * @param cost the cost of the order
     */
    private void payByGiftVoucher(double cost) {
    }
    /**
     * Pay by loyality points
     * @param cost the cost of the order
     */
    private void payByLoyalityPoints(double cost) {
    }
}
