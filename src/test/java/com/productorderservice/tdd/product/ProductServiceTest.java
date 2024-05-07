package com.productorderservice.tdd.product;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ProductServiceTest {

    @Autowired
    private ProductService productService;

    @Test
    void 상품조회() {
        // 상품 등록
        productService.addProduct(ProductSteps.상품등록요청_생성());
        final long productId = 1l;

        // 상품 조회
        final var response = productService.getProduct(productId);

        // 상품의 응답을 검증
        Assertions.assertThat(response).isNotNull();
    }

}