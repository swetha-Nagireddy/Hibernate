package com.mapping.onetomany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

//read the data
public class Test2 {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
		//loading the category obj
		
//		Category category = session.get(Category.class, 1);
//        System.out.println(category.getCategoryName());
//        System.out.println(category.getProducts().size());
//        
//        session.close();
//        
        //loading product
        Session session2 = factory.openSession();
        Product product = session2.get(Product.class, 1);
        System.out.println(product.getProductName()+" "+product.getCategory().getCategoryName());
	}

}
