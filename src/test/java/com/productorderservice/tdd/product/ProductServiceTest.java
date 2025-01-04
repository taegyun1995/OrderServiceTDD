package com.productorderservice.tdd.product;

import com.productorderservice.tdd.product.application.service.GetProductResponse;
import com.productorderservice.tdd.product.application.service.ProductService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ProductServiceTest {

    @Autowired
    private ProductService productService;

    @Test
    void 상품조회() {
        productService.addProduct(ProductSteps.상품등록요청_생성());
        final long productId = 1L;

        final GetProductResponse response = productService.getProduct(productId);

        Assertions.assertThat(response).isNotNull();
    }

}