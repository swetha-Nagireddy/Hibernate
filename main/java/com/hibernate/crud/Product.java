package com.hibernate.crud;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name="products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int productId;
    
    @Column(name="p_name",nullable=false, unique=true)
	private String productName;
    
    @Column(name="p_desc",length=1000)
	private String productDescription;
    
    @Column(nullable=false,unique=true)
	private String category;
    
    @Column(name="p_price",nullable=false)
	private double productPrice;

	public Product(String productName, String productDescription, String category, double productPrice) {
		super();
		this.productName = productName;
		this.productDescription = productDescription;
		this.category = category;
		this.productPrice = productPrice;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	

	
    
    
    
	
	

}
