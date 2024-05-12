package com.productorderservice.tdd.order;

import com.productorderservice.tdd.product.Product;
import org.springframework.util.Assert;

public class Order {
    private Long id;
    private final Product product;
    private final int quantity;

    public Order(final Product product, final int quantity) {
        this.product = product;
        this.quantity = quantity;
        Assert.notNull(product, "상품을 필수입니다.");
        Assert.isTrue(quantity > 0, "수량은 0보다 커야 합니다.");
    }

    public void assignId(final Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
