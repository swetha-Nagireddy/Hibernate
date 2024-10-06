package com.learning.Hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;



@Entity
@Table(name="emp")
public class Employee {
	@Id
	@GeneratedValue(strategy= GenerationType.SEQUENCE,generator="id_generator")
	@SequenceGenerator(name="id_generator",sequenceName="Employee_Id",allocationSize = 1)
	@Column(name="emp_id")
 private int empId;
	@Column(name="emp_name",nullable=false)
 private String empName;
	
	@Transient
 private String empDept;
public Employee(int empId, String empName, String empDept) {
	super();
	this.empId = empId;
	this.empName = empName;
	this.empDept = empDept;
}
public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
public String getEmpDept() {
	return empDept;
}
public void setEmpDept(String empDept) {
	this.empDept = empDept;
}
 
}
