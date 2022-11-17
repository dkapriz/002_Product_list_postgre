package com.example.ProductList.repositories;

import com.example.ProductList.model.ProductList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductListRepositories extends JpaRepository<ProductList, Long> {
}
