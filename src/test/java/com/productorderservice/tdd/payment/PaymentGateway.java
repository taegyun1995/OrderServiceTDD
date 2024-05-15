package com.productorderservice.tdd.payment;

interface PaymentGateway {

    void excute(final int totalPrice, final String cardNumber);

}