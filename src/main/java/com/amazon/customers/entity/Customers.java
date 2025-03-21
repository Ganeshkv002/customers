package com.amazon.customers.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.time.LocalDateTime;
@Entity
public class Customers {
    @Id
    @GeneratedValue
    @Column(name = "customer_id")
    private int customerID;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    private String gender;
    private int age;
    @Column(name = "mobile_number")
    private String mobileNumber;
    @Column(name = "email_id")
    private String emailId;
    private String password;
    private String country;
    private String state;
    @Column(name = "pin_code")
    private int pinCode;
    @Column(name="rec_crt_ts")
    private LocalDateTime recCrts;
    @Column(name="rec_updt_ts")
    private LocalDateTime recUpdTs;

    Customers(){

    }

    Customers(int customerID, String firstName, String lastName,String gender, int age, String mobileNumber, String emailId, String password,
              String country, String state, int pinCode, LocalDateTime recCrts, LocalDateTime recUpdTs){
        this.customerID = customerID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
        this.mobileNumber = mobileNumber;
        this.emailId = emailId;
        this.password = password;
        this.country = country;
        this.state = state;
        this.pinCode = pinCode;
        this.recCrts = recCrts;
        this.recUpdTs = recUpdTs;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getPinCode() {
        return pinCode;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

    public LocalDateTime getDateTime() {
        return recCrts;
    }

    public void setRecCrts(LocalDateTime dateTime) {
        this.recCrts = dateTime;
    }

    public LocalDateTime getUpdateDateTime() {
        return recUpdTs;
    }

    public void setUpdateDateTime(LocalDateTime updateDateTime) {
        this.recUpdTs = updateDateTime;
    }
}
