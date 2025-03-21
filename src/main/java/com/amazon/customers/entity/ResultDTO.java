package com.amazon.customers.entity;

import java.math.BigDecimal;


public class ResultDTO {

    private int productId;
    private String brand;
    private String name;
    private Long price;
    private int discount;

    private int quantity;
    private String fileName;

    private int cartId;

    ResultDTO(){}

    ResultDTO(int productId, String brand, String name, Long price, int discount, int quantity, String fileName, int cartId){
        this.productId = productId;
        this.brand = brand;
        this.name = name;
        this.price = price;
        this.discount = discount;
        this.quantity = quantity;
        this.fileName = fileName;
        this.cartId = cartId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int id) {
        this.productId = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String file_name) {
        this.fileName = file_name;
    }

    public int getCartId() {
        return cartId;
    }

    public void setCartId(int cartId) {
        this.cartId = cartId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
