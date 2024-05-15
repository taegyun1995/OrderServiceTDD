package com.productorderservice.tdd.payment.adapter;

interface PaymentGateway {

    void excute(final int totalPrice, final String cardNumber);

}