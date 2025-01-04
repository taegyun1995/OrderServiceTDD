package com.productorderservice.tdd.product.adapter;

import com.productorderservice.tdd.product.application.port.ProductPort;
import com.productorderservice.tdd.product.domain.Product;
import org.springframework.stereotype.Component;

@Component
public class ProductAdapter implements ProductPort {

    private final ProductRepository productRepository;

    public ProductAdapter(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public void save(Product product) {
        productRepository.save(product);
    }

}