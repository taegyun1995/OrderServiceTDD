package com.productorderservice.tdd.order.adapter;

import com.productorderservice.tdd.order.domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}