package com.ShippingCart;

public class ItemCart {
    private Item item;
    private Integer pieces;
    /**
     * Constructor
     * @param item the item
     * @param pieces the number of pieces of the item
     */
    public ItemCart(Item item, Integer pieces) {
        this.item = item;
        this.pieces = pieces;
    }
    /**
     * get the item
     * @return the item
     */
    public Item getItem() {
        return item;
    }
    /**
     * get the number of pieces of the item
     * @return the number of pieces of the item
     */
    public Integer getPieces() {
        return pieces;
    }
}