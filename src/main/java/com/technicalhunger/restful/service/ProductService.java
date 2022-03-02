package com.technicalhunger.restful.service;

import java.util.List;
import java.util.Optional;

import com.technicalhunger.restful.entity.Product;

public interface ProductService {

	List<Product> findAll();
	
	Optional<Product> findById(long id);
	
	Product save(Product product);
}
