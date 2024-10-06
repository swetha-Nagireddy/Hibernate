package com.mapping.onetomany;
//insert the data
import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



public class Test {

	public static void main(String[] args) {
		
		Category mobile = new Category();
		mobile.setCategoryName("Mobile");
		mobile.setCategoryDesc("Invading the new feature");
		
		Product p1 = new Product();
		p1.setProductName("Samsung-s10");
		p1.setProductPrice(1240000);
		
		Product p2 = new Product();
		p2.setProductName("IPhone-16");
		p2.setProductPrice(170000);
		
		List<Product> products =Arrays.asList(p1,p2);
		
		mobile.setProducts(products);
		
		p1.setCategory(mobile);
		p2.setCategory(mobile);
		
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		session.beginTransaction();
		
//		session.save(p1);
//		session.save(p2);
    	session.save(mobile);
		
		session.getTransaction().commit();
		session.close();
		System.out.println("object saved successfully");
		
		
		

	}

}
