package com.productorderservice.tdd.order.application.port;

import com.productorderservice.tdd.order.domain.Order;
import com.productorderservice.tdd.product.domain.Product;

public interface OrderPort {

    Product getProductById(final Long productId);

    void save(final Order order);

}