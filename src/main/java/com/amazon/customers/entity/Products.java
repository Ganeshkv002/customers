package com.amazon.customers.entity;

import jakarta.persistence.*;

@Entity
public class Products {
    @Id
    @GeneratedValue
    private int id;
    private String brand;
    private String name;
    private int price;
    private int discount;
    private float rating;
    @Column(name = "file_path")
    private String filePath;
    private int quantity;
    @Column(name = "file_name")
    private String fileName;

    Products(){

    }
    Products(int id,String brand,String name,int price,int discount,float rating,String filePath,int quantity,String fileName){
        this.id = id;
        this.brand = brand;
        this.name = name;
        this.price = price;
        this.discount = discount;
        this.rating = rating;
        this.filePath = filePath;
        this.quantity = quantity;
        this.fileName = fileName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
}
