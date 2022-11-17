package com.example.ProductList.repositories;

import com.example.ProductList.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepositories extends JpaRepository<Product, Long> {
    @Query(value = "SELECT p FROM Product p " +
            "LEFT JOIN p.productList pl WHERE pl.id = :list_id")
    Page<Product> getProductsByProductListId(@Param("list_id") Long listId, Pageable pageable);
}
