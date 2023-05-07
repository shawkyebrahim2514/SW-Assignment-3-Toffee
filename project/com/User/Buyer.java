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

    public Buyer(String name, String email, String phoneNumber, String address, String username, String password) {
        super(name, email, username, password);
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.loyaltyPoints = 0;
        this.cart = new Cart();
        this.lastOrders = new LinkedList<>();
        this.giftVouchers = new LinkedList<>();
    }

    private boolean checkValidUpdateInfo() {
        return false;
    }

    public void reorder() {

    }

    public void buyGiftVoucher() {

    }

    public void viewHistoryOrders() {

    }

    public void updateInfo() {

    }

    public void setAddress(String address) {
        this.address = address;
    }

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
    }

    public void addToCart(ItemCart item) {
        this.cart.addItem(item);
    }

    public void deleteFromCart(Item item) {

    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Integer getLoyaltyPoints() {
        return loyaltyPoints;
    }

    public void setLoyaltyPoints(Integer loyaltyPoints) {
        this.loyaltyPoints = loyaltyPoints;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public LinkedList<Order> getLastOrders() {
        return lastOrders;
    }

    public void setLastOrders(LinkedList<Order> lastOrders) {
        this.lastOrders = lastOrders;
    }

    public LinkedList<GiftVoucher> getGiftVouchers() {
        return giftVouchers;
    }

    public void setGiftVouchers(LinkedList<GiftVoucher> giftVouchers) {
        this.giftVouchers = giftVouchers;
    }
}
