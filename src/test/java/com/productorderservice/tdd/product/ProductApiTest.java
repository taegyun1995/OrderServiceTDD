package com.productorderservice.tdd.product;

import com.productorderservice.tdd.ApiTest;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;

import static com.productorderservice.tdd.product.ProductSteps.상품등록요청;
import static com.productorderservice.tdd.product.ProductSteps.상품등록요청_생성;

public class ProductApiTest extends ApiTest {

    @Test
    void 상품등록() {
        final var request = 상품등록요청_생성();

        final var response = 상품등록요청(request);

        Assertions.assertThat(response.statusCode()).isEqualTo(HttpStatus.CREATED.value());
    }

}