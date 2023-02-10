package com.addistutor.ProductManagement_RestfulService.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name="product_table")
@AllArgsConstructor
//@NoArgsConstructor
@Data
@Getter
public class ProductEntity {
	
	@Id
    @GeneratedValue
    private int id;
    private String name;
    private int quantity;
    private double price;
    
    
	public ProductEntity() {
		super();
	}

	public ProductEntity(String name, int quantity, double price) {
		super();
		this.name = name;
		this.quantity = quantity;
		this.price = price;
	}

	public int getId() {
		return id;
	}	 

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
       
}
