package com.mapping.manytomany;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		Customer c1 = new Customer();
		c1.setCustomerName("Giri");
		
		Customer c2 = new Customer();
		c2.setCustomerName("Janu");
		
		Customer c3 = new Customer();
		c3.setCustomerName("Navya");
		
		Products p1 = new Products();
		p1.setProductName("samsung");
		
		Products p2 = new Products();
		p2.setProductName("Iphone");
		
		Products p3 = new Products();
		p3.setProductName("Asus");
		
		List<Customer> list1 = Arrays.asList(c1,c2);
		List<Customer> list2 = Arrays.asList(c2,c3);
		List<Customer> list3 = Arrays.asList(c1,c3);
		
		List<Products> lis1 =Arrays.asList(p1,p2);
		List<Products> lis2 =Arrays.asList(p2,p3);
		List<Products> lis3 =Arrays.asList(p1,p3);
		
		c1.setProduct(lis1);
		c2.setProduct(lis2);
		c3.setProduct(lis3);
		
		p1.setCustomers(list1);
		p2.setCustomers(list2);
		p3.setCustomers(list3);
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		session.beginTransaction();
		
		session.save(c1);
		session.save(c2);
		session.save(c3);
		
		session.save(p1);
		session.save(p2);
		session.save(p3);
		
		session.getTransaction().commit();
		session.close();
		System.out.println("object saved successfully");
		
	}

}
