package com.mapping.manytomany;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="products")
public class Products {
     
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int ProductId;
	
	@Column(nullable=false)
	private String  productName;
	
	
	@ManyToMany
	private List<Customer> customers;
	
	
	public List<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}

	public Products() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Products(String productName) {
		super();
		this.productName = productName;
		
	}

	public int getProductId() {
		return ProductId;
	}

	public void setProductId(int productId) {
		ProductId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	
	
	
}
