package com.productorderservice.tdd.product;

interface ProductPort {

    void save(final Product product);

    Product getProduct(Long productId);

}