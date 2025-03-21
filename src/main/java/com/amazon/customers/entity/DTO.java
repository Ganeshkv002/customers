package com.amazon.customers.entity;

public class DTO {
    private int customerId;
    private int productId;
    private int cartId;

    public DTO(int customerId, int productId, int cartId) {
        this.customerId = customerId;
        this.productId = productId;
        this.cartId = cartId;
    }
}
