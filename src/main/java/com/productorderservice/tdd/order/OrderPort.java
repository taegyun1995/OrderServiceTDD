package com.productorderservice.tdd.order;

import com.productorderservice.tdd.product.Product;

interface OrderPort {

    Product getProductById(final Long productId);

    void save(final Order order);

}