package com.User;
import com.ShippingCart.*;
public class Buyer extends User {
    private String address;
    private String phoneNumber;
    private Integer loyaltyPoints;
    private Cart cart;
    private Order lastOrders[];
    private GiftVoucher giftVouchers[];

    private boolean checkValidUpdateInfo(){
        return false;
    }

    public void reorder(){
        
    }

    public void buyGiftVoucher(){
        
    }

    public void viewHistoryOrders(){
        
    }

    public void updateInfo(){
        
    }


    public void addToCart(Item item){}
        

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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
    
        
=======
    public Order addNewOrder(){
        Item items[] = confirmCart();
        Order order = new Order(items);
        //Double cost = order.pay();


        return null;
    }

    public void addToCart(Item item){

    }
        
    public void deleteFromCart(Item item){

    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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
    
    public Item[] confirmCart(){
        return null;
    }
}
