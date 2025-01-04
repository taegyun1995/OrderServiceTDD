package com.productorderservice.tdd.product.adapter;

import com.productorderservice.tdd.product.domain.Product;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class ProductRepository {

    private Map<Long, Product> persistence = new HashMap<>();
    private Long sequence = 0L;

    public void save(final Product product) {
        product.assignId(++sequence);
        persistence.put(product.getId(), product);
    }

}