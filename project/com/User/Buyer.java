package com.User;

import java.util.LinkedList;

import com.ShippingCart.*;
import com.System.AppSystem;

public class Buyer extends User {
    private String address;
    private String phoneNumber;
    private Integer loyaltyPoints;
    private Cart cart;
    private Order lastOrders[];
    private GiftVoucher giftVouchers[];

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
        Order order = new Order(items);
        Double cost = order.calculateCost();
        Payment payment = new Payment(this);
        payment.pay(cost, "Cash");
        AppSystem.items.addNewOrder(order);
    }

    public void addToCart(ItemCart item) {

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

    public Order[] getLastOrders() {
        return lastOrders;
    }

    public void setLastOrders(Order[] lastOrders) {
        this.lastOrders = lastOrders;
    }

    public GiftVoucher[] getGiftVouchers() {
        return giftVouchers;
    }

    public void setGiftVouchers(GiftVoucher[] giftVouchers) {
        this.giftVouchers = giftVouchers;
    }
}
