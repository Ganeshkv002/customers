package com.amazon.customers.repository;

import com.amazon.customers.entity.BankDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BankDetailsRepository extends JpaRepository<BankDetails,Integer> {
    BankDetails findByUserId(int userId);
}
