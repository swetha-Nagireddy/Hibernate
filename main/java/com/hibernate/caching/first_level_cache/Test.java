package com.hibernate.caching.first_level_cache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		
		Car c1 = new Car("santro");
		Car c2 = new Car("Lamborgini");
		Car c3 = new Car("RangeRover");
		Car c4 = new Car("LandRover");
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		
		Session s1= factory.openSession();
		s1.beginTransaction();
		s1.save(c1);
		s1.save(c2);
		s1.save(c3);
		s1.save(c4);
		
		s1.getTransaction().commit();
		System.out.println("object saved successfully");
		
		s1.close();
		factory.close();

	}

}
