package com.productorderservice.tdd.payment;

import com.productorderservice.tdd.order.Order;

interface PaymentPort {

    Order getOrder(Long orderId);

    void pay(int totalPrice, String cardNumber);

    void save(Payment payment);

}