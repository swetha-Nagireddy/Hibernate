package com.hibernate.crud;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class HibernateUtil {
    private static Session session=null;
	private static SessionFactory factory= null;
	private static SessionFactory getSessionFactory() {
		Configuration cfg = new Configuration().configure();
		if(factory==null) {
			factory = cfg.buildSessionFactory();
		}
		return factory;
	}
	
	
	public static void addProduct(Product p) {
		try {
			Session session= getSessionFactory().openSession();
			session.beginTransaction();
			session.save(p);
			session.getTransaction().commit();
			System.out.println("product saved successfully");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
	}
	
	public static void getProduct() {
		try {
			session = getSessionFactory().openSession();
			String hql = "from product";
			Query<Product> query = session.createQuery(hql);
			List<Product> products =query.list();
			
			for(Product p:products) {
				System.out.println("ProductId: "+p.getProductId());
				System.out.println("ProductName: "+p.getProductName());
				System.out.println("ProductPrice: "+p.getProductPrice());
				System.out.println("ProductDesc: "+p.getProductDescription());
				
				System.out.println("............................");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
	}
	
	public static void getProductById(int productId) {
		try {
			session = getSessionFactory().openSession();
			Product product = session.get(Product.class,productId);
			if(product!=null) {
				System.out.println("ProductId: "+product.getProductId());
				System.out.println("ProductName: "+product.getProductName());
				System.out.println("ProductPrice: "+product.getProductPrice());
				System.out.println("ProductDesc: "+product.getProductDescription());
				
				System.out.println("............................");
			}else {
				System.out.println("No product Found");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
	}
	
	
	
	public static void updateProduct(int productId,Product updatedProduct) {
		try {
			session = getSessionFactory().openSession();
			Product product = session.get(Product.class, productId);
			if(product!=null) {
				session.beginTransaction();
				product.setProductName(updatedProduct.getProductName());
				product.setProductDescription(updatedProduct.getProductDescription());
				product.setCategory(updatedProduct.getCategory());
				product.setProductPrice(updatedProduct.getProductPrice());
				
				
				session.save(product);
				session.getTransaction().commit();
				System.out.println("product updated succeddfully");
			}else {
				System.out.println("product not found");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
	}
	
	
	public static void deleteProduct(int productId) {
		try {
			session = getSessionFactory().openSession();
			Product product = session.get(Product.class, productId);
			if(product!=null) {
				session.beginTransaction();
				session.delete(product);
				session.getTransaction().commit();
				System.out.println("deleted successfully");
			}else {
				System.out.println("No product found to delete");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
	}
}
