package com.amazon.customers.controller;

import com.amazon.customers.entity.Products;
import com.amazon.customers.services.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@RestController
@RequestMapping("/products")
@CrossOrigin(origins = "http://localhost:5173")
public class ProductsController {
    @Autowired
    private ProductsService service;
    @GetMapping("/findimage/{fileName}")
    public ResponseEntity<?> getProductImage(@PathVariable String fileName) throws IOException {
        byte[] imageData=service.getProductImage(fileName);
        return ResponseEntity.status(HttpStatus.OK)
                .contentType(MediaType.valueOf("image/png"))
                .body(imageData);
    }
    @GetMapping("/")
    public List<Products> getProducts(){
        return service.getProducts();
    }
    @GetMapping
    public Optional<Products> getProductsById(@RequestParam int id){
        return service.getProductById(id);
    }

}
