package com.example.pizzadelivery.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.pizzadelivery.dto.ProductDTO;
import com.example.pizzadelivery.entities.Product;
import com.example.pizzadelivery.repositories.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository repository;
	
	@Transactional(readOnly = true)
	public List<ProductDTO> findAll(){
		List<Product> list = repository.findAllByOrderByNameAsc();
		// Converts each Product in the list to a ProductDTO and returns the list
		return list.stream().map(x -> new ProductDTO(x)).collect(Collectors.toList());
	}

}
