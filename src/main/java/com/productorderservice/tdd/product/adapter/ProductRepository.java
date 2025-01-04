package com.productorderservice.tdd.product.adapter;

import com.productorderservice.tdd.product.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

interface ProductRepository extends JpaRepository<Product, Long> {
}