package com.amazon.customers.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.time.LocalDate;
@Entity
public class BankDetails {
    @Id
    @GeneratedValue
    private int id;
    @Column(name = "account_num")
    private long accountNum;
    private String name;
    @Column(name = "expire_date")
    private LocalDate expireDate;
    private int userId;
    private int cvv;
    private int amount;
    BankDetails(){}

    BankDetails(int id,long accountNum,String name,LocalDate expireDate,int userId,int cvv,int amount){
        this.id = id;
        this.accountNum = accountNum;
        this.name = name;
        this.expireDate = expireDate;
        this.userId = userId;
        this.cvv = cvv;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(long accountNum) {
        this.accountNum = accountNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(LocalDate expireDate) {
        this.expireDate = expireDate;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
