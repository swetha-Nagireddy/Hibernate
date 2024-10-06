package com.hibernate.association;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
  private int studentId;
  private String studentName;
  
  @Embedded
  private Address address;

  public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	  
public Student(String studentName, Address address) {
	super();
	this.studentName = studentName;
	this.address = address;
}

public int getStudentId() {
	return studentId;
}

public void setStudentId(int studentId) {
	this.studentId = studentId;
}

public String getStudentName() {
	return studentName;
}

public void setStudentName(String studentName) {
	this.studentName = studentName;
}

public Address getAddress() {
	return address;
}

public void setAddress(Address address) {
	this.address = address;
}


  
}
