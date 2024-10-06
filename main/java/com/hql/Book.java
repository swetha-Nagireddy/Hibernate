package com.hql;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
   private int bookId;
   private String bookName;
   private String author;
   private double bookprice;
   
public double getBookprice() {
	return bookprice;
}

public void setBookprice(double bookprice) {
	this.bookprice = bookprice;
}

public Book( String bookName, String author, double bookprice) {
	super();
	this.bookId = bookId;
	this.bookName = bookName;
	this.author = author;
	this.bookprice = bookprice;
}

public Book() {
	super();
	// TODO Auto-generated constructor stub
}





public String getBookName() {
	return bookName;
}

public void setBookName(String bookName) {
	this.bookName = bookName;
}

public String getAuthor() {
	return author;
}

public void setAuthor(String author) {
	this.author = author;
}
   

   
}
