package com.hibernate.association;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		Address a = new Address("Banglore","Karnataka");
		Student s1 = new Student("Swetha",a);
		
		
		Configuration cfg = new Configuration().configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		session.beginTransaction();
		session.save(s1);
		session.getTransaction().commit();
		System.out.println("student saved Successfully");
		session.close();
		factory.close();
	}

}
