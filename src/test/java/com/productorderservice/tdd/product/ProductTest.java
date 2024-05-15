package com.productorderservice.tdd.product;

import com.productorderservice.tdd.product.domain.DiscountPolicy;
import com.productorderservice.tdd.product.domain.Product;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProductTest {

    @Test
    void update() {
        final Product product = new Product("상품명", 1000, DiscountPolicy.NONE);

        product.update("상품 수정", 2000, DiscountPolicy.NONE);

        Assertions.assertThat(product.getName()).isEqualTo("상품 수정");
        Assertions.assertThat(product.getPrice()).isEqualTo(2000);
    }

    @Test
    void none_discounted_product() {
        final Product product = new Product("상품명", 1000, DiscountPolicy.NONE);

        final int discountPrice = product.getDiscountedPrice();

        Assertions.assertThat(discountPrice).isEqualTo(1000);
    }

    @Test
    void fix_1000_amount_discounted_product() {
        final Product product = new Product("상품명", 2000, DiscountPolicy.FIX_1000_AMOUNT);

        final int discountPrice = product.getDiscountedPrice();

        Assertions.assertThat(discountPrice).isEqualTo(1000);
    }

}