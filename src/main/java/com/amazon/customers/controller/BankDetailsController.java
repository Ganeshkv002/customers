package com.amazon.customers.controller;

import com.amazon.customers.entity.BankDetails;
import com.amazon.customers.services.BankdetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
@RequestMapping("/bankdetails")
public class BankDetailsController {
    @Autowired
    private BankdetailsService service;
    @PostMapping
    public BankDetails saveBankDetails(@RequestBody BankDetails bankDetails){
        return service.saveBankDetails(bankDetails);
    }
    @GetMapping("/{userId}")
    public BankDetails findBankDetailsById(@PathVariable int userId){
        return service.findBankDetailsId(userId);
    }
}
