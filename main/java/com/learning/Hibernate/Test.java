package com.learning.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		Employee emp = new Employee(103,"swetha","dev");
		
		
		//1.Get configuration object
		Configuration config = new Configuration().configure();
		
		//2.Get SessionFactory(I) object
		SessionFactory factory = config.buildSessionFactory();
		
		//3.get session(I) object
		Session session = factory.openSession();
		
		//4.get transaction(I)
		Transaction tx = session.beginTransaction();
		
		//operations: ==> insert : save
		session.save(emp);
		
		//5.commit the transaction
		session.getTransaction().commit();
		System.out.println("Object saved......");
		
		//6.close the session
		session.close();
		
		//7.close sessionFactory
		factory.close();

	}

}
