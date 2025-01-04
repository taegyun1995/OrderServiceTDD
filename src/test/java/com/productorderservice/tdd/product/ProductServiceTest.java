package com.productorderservice.tdd.product;

import com.productorderservice.tdd.product.adapter.ProductAdapter;
import com.productorderservice.tdd.product.adapter.ProductRepository;
import com.productorderservice.tdd.product.application.port.ProductPort;
import com.productorderservice.tdd.product.application.service.AddProductRequest;
import com.productorderservice.tdd.product.application.service.ProductService;
import com.productorderservice.tdd.product.domain.DiscountPolicy;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

import java.util.HashMap;
import java.util.Map;

class ProductServiceTest {

    private ProductService productService;
    private ProductPort productPort;
    private ProductRepository productRepository;

    @BeforeEach
    void setUp() {
        productRepository = new ProductRepository();
        productPort = new ProductAdapter(productRepository);
        productService = new ProductService(productPort);
    }

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