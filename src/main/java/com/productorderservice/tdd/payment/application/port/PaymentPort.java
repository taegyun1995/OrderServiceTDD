package com.productorderservice.tdd.payment.application.port;

import com.productorderservice.tdd.order.domain.Order;
import com.productorderservice.tdd.payment.domain.Payment;

public interface PaymentPort {

    Order getOrder(Long orderId);

    void pay(int totalPrice, String cardNumber);

    void save(Payment payment);

}