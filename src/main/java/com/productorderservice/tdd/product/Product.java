package com.productorderservice.tdd.product;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "products")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private int price;

    private DiscountPolicy discountPolicy;

    public Product(AddProductRequest request) {
        this.name = request.name();
        this.price = request.price();
        this.discountPolicy = request.discountPolicy();
    }

}