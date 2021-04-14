package com.huyhs.ExampleSpringBoot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.huyhs.ExampleSpringBoot.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

	Product findByName(String name);

}
