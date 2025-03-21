package com.amazon.customers.services;

import com.amazon.customers.entity.Cart;
import com.amazon.customers.entity.ResultDTO;
import com.amazon.customers.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CartService {
    @Autowired
    private CartRepository repository;

//    public Optional<Cart> getCartId(int id){
//        return repository.findById(id);
//    }
    public List<ResultDTO> getResultDTOByCustomer(int id,String status){
        return repository.findResultDTOByCustomers(id,status);
    }
    public Cart saveCart(Cart cart){
        return repository.save(cart);
    }
    public int removeById(int id){
        repository.deleteById(id);
        return id;
    }
}
