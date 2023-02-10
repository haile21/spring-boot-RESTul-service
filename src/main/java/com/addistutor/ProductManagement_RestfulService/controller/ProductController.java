package com.addistutor.ProductManagement_RestfulService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;

import com.addistutor.ProductManagement_RestfulService.entity.ProductEntity;
import com.addistutor.ProductManagement_RestfulService.service.ProductService;

import org.springframework.web.bind.annotation.*;
 
@RestController // indicates that the data returned by each method will be written straight into the response body 
                 //instead of rendering a template.
@RequestMapping("/product")
public class ProductController {
	 
	    @Autowired
	    private ProductService service;

	    @PostMapping("/addProduct")
	    public ProductEntity addProduct(@RequestBody ProductEntity product) {
	        return service.saveProduct(product);
	    }

	    @PostMapping("/addProducts")
	    public List<ProductEntity> addProducts(@RequestBody List<ProductEntity> products) {
	        return service.saveProducts(products);
	    }

	    @GetMapping("/products")
	    public List<ProductEntity> findAllProducts() {
	        return service.getProducts();
	    }

	    @GetMapping("/productById/{id}")
	    public ProductEntity findProductById(@PathVariable int id) {
	        return service.getProductById(id);
	    }

	    @GetMapping("/product/{name}")
	    public ProductEntity findProductByName(@PathVariable String name) {
	        return service.getProductByName(name);
	    }

	    @PutMapping("/update")
	    public ProductEntity updateProduct(@RequestBody ProductEntity product) {
	        return service.updateProduct(product);
	    }

	    @DeleteMapping("/delete/{id}")
	    public String deleteProduct(@PathVariable int id) {
	        return service.deleteProduct(id);
	    }
}

	

