package com.technicalhunger.restful.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.technicalhunger.restful.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
