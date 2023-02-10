package com.addistutor.ProductManagement_RestfulService.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.addistutor.ProductManagement_RestfulService.entity.ProductEntity;

public interface ProductRepository extends JpaRepository<ProductEntity,Integer>{
	ProductEntity findByName(String name);

}
