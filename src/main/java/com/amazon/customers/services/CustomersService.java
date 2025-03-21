package com.amazon.customers.services;

import com.amazon.customers.entity.Customers;
import com.amazon.customers.repository.CustomersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class CustomersService {
    @Autowired
    private CustomersRepository repository;
    public Customers saveCustomer(Customers customer){
        customer.setRecCrts(LocalDateTime.now());
        return repository.save(customer);
    }
    public List<Customers> findAllCustomers(){
        return  repository.findAll();
    }
    public Customers getCustomerId(int id){
        return repository.findById(id).orElse(null);
    }
    public Customers findByEmailIdAndPassword(String  emailId,String password){
        return repository.findByEmailIdAndPassword(emailId,password);
    }
}
