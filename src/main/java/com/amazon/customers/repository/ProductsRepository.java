package com.amazon.customers.repository;

import com.amazon.customers.entity.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductsRepository extends JpaRepository<Products,Integer> {
    Optional<Products> findByFileName(String fileName);
}
