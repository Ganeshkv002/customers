package com.amazon.customers.repository;

import com.amazon.customers.entity.BankDetails;
import com.amazon.customers.entity.Cart;
import com.amazon.customers.entity.ResultDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CartRepository extends JpaRepository<Cart,Integer> {
    @Query(value = "select p.id as productId, p.brand, p.name, p.price, p.discount, p.quantity, p.file_name as fileName, c.id as cartId from " +
            "Customers cst, " +
            "Cart c, " +
            "Products p " +
            "where " +
            "cst.customer_id = c.user_id and " +
            "c.product_id = p.id and " +
            "c.user_id = ?1 and c.status = ?2 ", nativeQuery = true)
    List<ResultDTO> findResultDTOByCustomers(int id, String status);
}
