package com.productorderservice.tdd.product.application.port;

import com.productorderservice.tdd.product.domain.Product;

public interface ProductPort {

    void save(final Product product);

    Product getProduct(Long productId);

}