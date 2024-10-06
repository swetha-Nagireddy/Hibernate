package com.hql;





import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class HQLUtility {

	
		private static SessionFactory factory = null;
		private static SessionFactory getsessionfactory() {
			if(factory ==null) {
				factory =new Configuration().configure().buildSessionFactory();
			}
			return factory;
		}
	
		
		public static String addBook(Book book) {
			Session session = getsessionfactory().openSession();
			session.beginTransaction();
			session.save(book);
			session.getTransaction().commit();
			session.close();
			return "Book saved successfully";
		}
		
		//read all record
		
		public static void getBooks() {
			String hql = "from Book";
			Session session = getsessionfactory().openSession();
			Query<Book> query = session.createQuery(hql);
			List<Book> list =query.list();
			
			
			for(Book b:list) {
				System.out.println("BookName : "+b.getBookName());
				System.out.println("Author : "+b.getAuthor());
				System.out.println("BookPrice : "+b.getBookprice());
				System.out.println("......................");
			}
			
			
		}
		
		
		//read book based on id:
		
		public static void getBookById(int bookId) {
			 String hql = "from Book where bookId=:id";
			 Session session = getsessionfactory().openSession();
			 Query<Book> query = session.createQuery(hql);
			 query.setInteger("id", bookId);
			 Book book = query.uniqueResult();
			 
			 System.out.println("BookName : "+book.getBookName());
				System.out.println("Author : "+book.getAuthor());
				System.out.println("BookPrice : "+book.getBookprice());
		}
		
		
		//update book based on id
		
		public static void updateBook(int bookId,String bookName) {
			String hql = "update Book set author=:name where bookId=:id";
			Session session = getsessionfactory().openSession();
			
			session.beginTransaction();
			Query<Book> query = session.createQuery(hql);
	
			query.setString("name",bookName);
			query.setInteger("id", bookId);
			int rows = query.executeUpdate();
			session.getTransaction().commit();
			System.out.println("number of rows affected : "+rows);
		}
		
		//pagination
		
		public static void getRecord() {
			String hql = "from Book";
			Session session = getsessionfactory().openSession();
			Query<Book> query = session.createQuery(hql);
			query.setFirstResult(0);
			query.setMaxResults(2);
			List<Book> list = query.list();
			
			for(Book b:list) {
				System.out.println("BookName : "+b.getBookName());
				System.out.println("Author : "+b.getAuthor());
				System.out.println("BookPrice : "+b.getBookprice());
				System.out.println("......................");
			}
			
		}
		
		
		//aggregate function
		
		public static void getTotalPrice() {
			String hql = "select sum(bookPrice) from Book";
			Session session = getsessionfactory().openSession();
			double totalAmount =(Double)session.createQuery(hql).getSingleResult();
			System.out.println(totalAmount);
		}
		
		public static void getCount() {
			String hql = "select count(*) from Book";
			Session session = getsessionfactory().openSession();
			Long count = (Long) session.createQuery(hql).getSingleResult();
			System.out.println(count);
			
		}
		
		public static void deleteBook(int bookId) {
			String hql = "delete from Book where bookId =:id";
			Session session = getsessionfactory().openSession();
			session.beginTransaction();
			Query<Book> query = session.createQuery(hql);
			query.setInteger("id", bookId);
			int executeUpdate = query.executeUpdate();
			session.getTransaction().commit();
			System.out.println("book deleted successfully");
			
			
		}
	

	}


