package com.example.pizzadelivery.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.pizzadelivery.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
