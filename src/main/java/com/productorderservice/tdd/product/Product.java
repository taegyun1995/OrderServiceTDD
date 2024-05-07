package com.productorderservice.tdd.product;

class Product {

    private final String name;
    private final int price;
    private final DiscountPolicy discountPolicy;
    private Long id;

    public Product(AddProductRequest request) {
        this.name = request.name();
        this.price = request.price();
        this.discountPolicy = request.discountPolicy();
    }

    public void assignId(final Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
