package com.amazon.customers.repository;

import com.amazon.customers.entity.Customers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.QueryMethod;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomersRepository extends JpaRepository<Customers,Integer> {
    Customers findByEmailIdAndPassword(String emailId, String password);
    //Customers findByName(String name);
}
