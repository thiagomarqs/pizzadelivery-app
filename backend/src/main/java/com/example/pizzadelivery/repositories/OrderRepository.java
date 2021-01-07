package com.example.pizzadelivery.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.pizzadelivery.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
	// Returns only pendent orders from the oldest to the most recent
	@Query("SELECT DISTINCT obj FROM Order obj JOIN FETCH obj.products "
			+ "WHERE obj.status = 0 ORDER BY obj.moment ASC")
	List<Order> findOrdersWithProducts();

}
