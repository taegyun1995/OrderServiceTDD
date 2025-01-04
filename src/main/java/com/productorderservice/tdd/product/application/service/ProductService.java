package com.productorderservice.tdd.product.application.service;

import com.productorderservice.tdd.product.application.port.ProductPort;
import com.productorderservice.tdd.product.domain.Product;

public class ProductService {

    private final ProductPort productPort;

    public ProductService(ProductPort productPort) {
        this.productPort = productPort;
    }

    public void addProduct(AddProductRequest request) {
        final Product product = new Product(request.name(), request.price(), request.discountPolicy());
    }

}