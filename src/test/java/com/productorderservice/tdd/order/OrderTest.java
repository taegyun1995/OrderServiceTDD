package com.productorderservice.tdd.order;

import com.productorderservice.tdd.product.DiscountPolicy;
import com.productorderservice.tdd.product.Product;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class OrderTest {

    @Test
    void getTotalPrice() {
        final Order order = new Order(new Product("상품명", 2000, DiscountPolicy.FIX_1000_AMOUNT), 2);

        final int totalPrice = order.getTotalPrice();

        Assertions.assertThat(totalPrice).isEqualTo(2000);
    }

}