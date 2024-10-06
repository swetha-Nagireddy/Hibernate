package com.mapping.manytomany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.mapping.onetomany.Product;

public class Test2 {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
          //loading the category obj
		
		Customer category = session.get(Customer.class, 1);
        System.out.println(category.getCustomerName());
        System.out.println(category.getProduct().size());
        session.close();
        
        
            //loading product
//        Session session2 = factory.openSession();
//        Products product = session2.get(Products.class, 1);
//        System.out.println(product.getProductName()+" "+product.getCustomers().getCustomerName());
//	
	}

}
