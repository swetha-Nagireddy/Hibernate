package com.mapping.onetoone;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="emp")
public class Employee {
	
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
  private int empId;
  private String empName;
  private String deptName;

  @OneToOne
  @JoinColumn(name="account_id")
  private Account salariedAccount;

public Employee() {
	super();
	// TODO Auto-generated constructor stub
}

public Employee(String empName, String deptName, Account salariedAccount) {
	super();
	this.empName = empName;
	this.deptName = deptName;
	this.salariedAccount = salariedAccount;
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

public String getDeptName() {
	return deptName;
}

public void setDeptName(String deptName) {
	this.deptName = deptName;
}

public Account getSalariedAccount() {
	return salariedAccount;
}

public void setSalariedAccount(Account salariedAccount) {
	this.salariedAccount = salariedAccount;
}

}
