package com.productorderservice.tdd.payment;

import com.productorderservice.tdd.product.domain.DiscountPolicy;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class DiscountPolicyTest {

    @Test
    void applyDiscount() {
        final int price = 1000;

        final int discountedPrice = DiscountPolicy.NONE.applyDiscount(price);

        Assertions.assertThat(discountedPrice).isEqualTo(price);
    }

    @Test
    void name() {
        final int price = 2000;

        final int discountedPrice = DiscountPolicy.FIX_1000_AMOUNT.applyDiscount(price);

        Assertions.assertThat(discountedPrice).isEqualTo(1000);
    }

}