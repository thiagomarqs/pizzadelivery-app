package com.example.pizzadelivery.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.pizzadelivery.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

	List<Product> findAllByOrderByNameAsc();
}
