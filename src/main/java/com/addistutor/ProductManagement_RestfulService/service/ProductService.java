package com.addistutor.ProductManagement_RestfulService.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.addistutor.ProductManagement_RestfulService.entity.ProductEntity;
import com.addistutor.ProductManagement_RestfulService.repository.ProductRepository;

@Service 
public class ProductService {
	
	    @Autowired
	    private ProductRepository repository;

	    public ProductEntity saveProduct(ProductEntity product) {
	        return repository.save(product);
	    }

	    public List<ProductEntity> saveProducts(List<ProductEntity> products) {
	        return repository.saveAll(products);
	    }

	    public List<ProductEntity> getProducts() {
	        return repository.findAll();
	    }

	    public ProductEntity getProductById(int id) {
	        return repository.findById(id).orElse(null);
	    }

	    public ProductEntity getProductByName(String name) {
	        return repository.findByName(name);
	    }
	    
	    public String deleteProduct(int id) {
	        repository.deleteById(id); 
	        return "product removed !! " + id;
	    }

	    public ProductEntity updateProduct(ProductEntity product) {
	    	ProductEntity existingProduct = repository.findById(product.getId()).orElse(null);
	        existingProduct.setName("HP");
	        existingProduct.setQuantity(1);
	        existingProduct.setPrice(30000.0);
	        return repository.save(existingProduct);
	    }

}
