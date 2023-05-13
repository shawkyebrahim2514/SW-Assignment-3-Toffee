package com.User;

import java.util.LinkedList;

import com.ShippingCart.*;
import com.System.AppSystem;

public class Buyer extends User {
    private String address;
    private String phoneNumber;
    private Integer loyaltyPoints;
    private Cart cart;
    private LinkedList<Order> lastOrders;
    private LinkedList<GiftVoucher> giftVouchers;

    /**
     * @param name        the name of the buyer
     * @param email       the email of the buyer
     * @param phoneNumber the phone number of the buyer
     * @param address     the address of the buyer
     * @param username    the username of the buyer
     * @param password    the password of the buyer
     */
    public Buyer(String name, String email, String phoneNumber, String address, String username, String password) {
        super(name, email, username, password);
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.loyaltyPoints = 0;
        this.cart = new Cart();
        this.lastOrders = new LinkedList<>();
        this.giftVouchers = new LinkedList<>();
    }

    /**
     * Make an order, pay for it and then add it to the last orders of the buyer
     */
    public void addNewOrder() {
        LinkedList<ItemCart> items = this.cart.confirm();
        for (ItemCart item : items) {
            System.out.println("The number of pieces of this item: " + item.getPieces());
            item.getItem().view();
        }
        System.out.println("Do you want to confirm this order? (y/n)");
        String confirm = AppSystem.input.nextLine();
        if (confirm.equals("n")) {
            return;
        }
        Order order = new Order(items);
        Double cost = order.calculateCost();
        Payment payment = new Payment(this);
        payment.pay(cost, "Cash");
        AppSystem.items.addNewOrder(order);
        this.lastOrders.add(order);
        this.cart.clearItems();
    }

    /**
     * Add an item to the cart
     * 
     * @param item the item to be added
     */
    public void addToCart(ItemCart item) {
        this.cart.addItem(item);
    }

    public void deleteFromCart() {

    }

    /**
     * @return the address of the buyer
     */
    public String getAddress() {
        return address;
    }

    /**
     * @return the phone number of the buyer
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * set the phone number of the buyer
     * 
     * @param phoneNumber
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * @return the loyalty points of the buyer
     */
    public Integer getLoyaltyPoints() {
        return loyaltyPoints;
    }

    /**
     * set the loyalty points of the buyer
     * 
     * @param loyaltyPoints
     */
    public void setLoyaltyPoints(Integer loyaltyPoints) {
        this.loyaltyPoints = loyaltyPoints;
    }

    /**
     * @return the cart of the buyer
     */
    public Cart getCart() {
        return cart;
    }

    /**
     * set the cart of the buyer
     * 
     * @param cart
     */
    public void setCart(Cart cart) {
        this.cart = cart;
    }

    /**
     * @return the last orders of the buyer
     */
    public LinkedList<Order> getLastOrders() {
        return lastOrders;
    }

    /**
     * set the last orders of the buyer
     * 
     * @param lastOrders
     */
    public void setLastOrders(LinkedList<Order> lastOrders) {
        this.lastOrders = lastOrders;
    }

    /**
     * @return the gift vouchers of the buyer
     */
    public LinkedList<GiftVoucher> getGiftVouchers() {
        return giftVouchers;
    }

    /**
     * set the gift vouchers of the buyer
     * 
     * @param giftVouchers
     */
    public void setGiftVouchers(LinkedList<GiftVoucher> giftVouchers) {
        this.giftVouchers = giftVouchers;
    }

    /**
     * @return true if the buyer has enough loyalty points to buy the gift voucher
     */
    private boolean checkValidUpdateInfo() {
        return false;
    }

    /**
     * set the address of the buyer
     * 
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    public void reorder() {
    }

    public void buyGiftVoucher() {
    }

    public void viewHistoryOrders() {
    }

    public void updateInfo() {
    }
}
