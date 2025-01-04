package com.productorderservice.tdd.product;

import com.productorderservice.tdd.product.application.service.AddProductRequest;
import com.productorderservice.tdd.product.application.service.ProductService;
import com.productorderservice.tdd.product.domain.DiscountPolicy;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ProductServiceTest {

    @Autowired
    private ProductService productService;

    @Test
    void 상품등록() {
        final AddProductRequest request = 상품등록요청_생성();

        productService.addProduct(request);
    }

    private static AddProductRequest 상품등록요청_생성() {
        final String name = "명";
        final int price = 1000;
        final DiscountPolicy discountPolicy = DiscountPolicy.NONE;
        return new AddProductRequest(name, price, discountPolicy);
    }

}