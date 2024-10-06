package com.mapping.onetoone;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Account {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private int accountId;
    private String accountNumber;
    
    @OneToOne(mappedBy="salariedAccount")
   // @JoinColumn(name="emp_id")
    private Employee employee;
    
    
	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Account(String accountNumber) {
		super();
		this.accountNumber = accountNumber;
	}

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
    
    
    
}
