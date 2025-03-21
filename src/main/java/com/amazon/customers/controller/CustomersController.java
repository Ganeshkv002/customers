package com.amazon.customers.controller;

import com.amazon.customers.entity.Customers;
import com.amazon.customers.services.CustomersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
@RequestMapping("/amazon/customers")
public class CustomersController {
    @Autowired
    private CustomersService service;

    @PostMapping
    public Customers saveCustomer(@RequestBody Customers customer) {
        return service.saveCustomer(customer);
    }

    @GetMapping
    public List<Customers> findAllCustomers() {
        return service.findAllCustomers();
    }

    @GetMapping("/{id}")
    public Customers findCustomerId(@PathVariable int id) {
        return service.getCustomerId(id);
    }
    @GetMapping("/login")
    public Customers findByEmailIdAndPassword(@RequestParam String emailId,@RequestParam String password){
       Customers details = service.findByEmailIdAndPassword(emailId,password);
        return details;
    }
}