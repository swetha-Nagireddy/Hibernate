package com.hibernate.caching.first_level_cache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {

	public static void main(String[] args) {
		SessionFactory factory =new Configuration().configure().buildSessionFactory();
		
		Session s1 = factory.openSession();
		Car car = s1.get(Car.class, 1);
		System.out.println(car.getVehicleName());
		System.out.println(".......................");
//		Car car2 = s1.get(Car.class, 1);
//		System.out.println(car.getVehicleName());
		
		System.out.println("......................");
		Session s2 = factory.openSession();
		Car car3 = s2.get(Car.class, 1);
		System.out.println(car.getVehicleName());

	}

}
