package com.mapping.onetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {

	public static void main(String[] args) {
		
		Account a1 = new Account("SBI45689");
		Employee e1 = new Employee("vivek","dev",a1);
		a1.setEmployee(e1);
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		session.beginTransaction();
		
		session.save(a1);
		session.save(e1);
		
		session.getTransaction().commit();
		session.close();
		System.out.println("Object saved successfully");
	}

}
