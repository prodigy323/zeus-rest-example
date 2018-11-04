package com.hong.zeusrestexample.repository;

import com.hong.zeusrestexample.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
