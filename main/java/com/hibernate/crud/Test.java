package com.hibernate.crud;

public class Test {

	public static void main(String[] args) {
	Product p1 = new Product("HPLaptop","change the world","laptop",78000);
	Product p2 = new Product("lenovoLaptop","invest into future","laptop",50000);
	
	HibernateUtil.addProduct(p1);
	HibernateUtil.addProduct(p2);
	
	//HinernateUtil.getProduct()
	
	//HibernateUtil.UpdatedProduct(2)

	}

}
