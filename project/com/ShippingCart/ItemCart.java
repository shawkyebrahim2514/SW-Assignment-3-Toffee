package com.ShippingCart;

public class ItemCart {
    private Item item;
    private Integer pieces;
    public ItemCart(Item item, Integer pieces) {
        this.item = item;
        this.pieces = pieces;
    }
    public Item getItem() {
        return item;
    }
    public Integer getPieces() {
        return pieces;
    }
}
