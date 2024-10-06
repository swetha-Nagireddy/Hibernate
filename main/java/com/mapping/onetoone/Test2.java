package com.mapping.onetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

//inserting data
public class Test2 {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
		//fetch employee obj
		Employee employee = session.get(Employee.class, 1);
		System.out.println(employee.getEmpName()+" "+employee.getSalariedAccount().getAccountNumber());
		session.close();
		
		//fetch Account obj
		Session session2 =factory.openSession();
		Account account = session2.get(Account.class, 1);
		System.out.println(account.getAccountNumber()+" "+account.getEmployee().getEmpName());
		
	}

}
