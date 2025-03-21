package com.amazon.customers.services;

import com.amazon.customers.entity.BankDetails;
import com.amazon.customers.repository.BankDetailsRepository;
import com.amazon.customers.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BankdetailsService {
    @Autowired
    private BankDetailsRepository repository;

    public BankDetails saveBankDetails(BankDetails bankDetails){
       return repository.save(bankDetails);
    }
    public BankDetails findBankDetailsId(int userId){
        return repository.findByUserId(userId);
    }

//    public BankDetails updateAmountByPrice(int price){
//        return repository.updateAmountByPrice(price);
//    }
}
