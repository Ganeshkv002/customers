package com.amazon.customers.services;

import com.amazon.customers.entity.Products;
import com.amazon.customers.repository.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;
import java.util.Optional;

@Service
public class ProductsService {
    @Autowired
    private ProductsRepository repository;
    private String folder_path = "/Users/arunkakaraparthi/Documents/ganesh workspace/amazonimages";
    public byte[] getProductImage(String filename) throws IOException {
        Optional<Products> fileData = repository.findByFileName(filename);
        String filePath=fileData.get().getFilePath()+"/"+filename;
        byte[] images = Files.readAllBytes(new File(filePath).toPath());
        return images;
    }
    public List<Products> getProducts(){
        return repository.findAll();
    }
    public Optional<Products> getProductById(int id) {
        return repository.findById(id);
    }
}


