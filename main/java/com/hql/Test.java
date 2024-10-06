package com.hql;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book p1 = new Book("Rich_Dad_poor_Dad","anonymous",2600);
		Book p2 = new Book("java_reference","John_doe",6600);
		Book p3 = new Book("HeadFirstWeb","anonymous",3000);
		Book p4 = new Book("html_black_book","wiliams",4000);
		Book p5 = new Book("letusc","Ysawanth_kanitkar",4600);
		
//		HQLUtility.addBook(p1);
//		HQLUtility.addBook(p2);
//		HQLUtility.addBook(p3);
//		HQLUtility.addBook(p4);
//		HQLUtility.addBook(p5);
		
		//HQLUtility.getBooks();
		
		//HQLUtility.getBookById(2);
		
		//HQLUtility.updateBook(3,"John-doe");
		
		//HQLUtility.getRecord();
		
		HQLUtility.getTotalPrice();

	}

}
