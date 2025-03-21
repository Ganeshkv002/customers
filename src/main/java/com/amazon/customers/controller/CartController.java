package com.amazon.customers.controller;

import com.amazon.customers.entity.Cart;
import com.amazon.customers.entity.ResultDTO;
import com.amazon.customers.services.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
@RequestMapping("/cart")
public class CartController {
    private static final String INCART = "in-cart";
    @Autowired
    private CartService service;
//    @GetMapping
//    public Optional<Cart> getCartId(@RequestParam int id){
//        return service.getCartId(id);
//    }
    @GetMapping
    public List<ResultDTO> getResultDTOByCustomer(@RequestParam int id){
        return service.getResultDTOByCustomer(id, INCART);
    }
    @PostMapping
    public Cart saveCart(@RequestBody Cart cart){
        return service.saveCart(cart);
    }
    @DeleteMapping("/remove/{id}")
    public int removeById(@PathVariable int id){
        return service.removeById(id);
    }
}
