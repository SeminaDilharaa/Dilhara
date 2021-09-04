package com.example.demo.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Customer {
	@Id
	private int AccountId;
	private String Address;
	private String Name;
	private int PhoneNo;
	
	@ManyToOne
	@JoinColumn(name ="branch_id",referencedColumnName = "BranchId")
	private Branch branch;
	

	
	public Customer() {
		
	}
	

	public Customer(int accountId, String address, String name, int phoneNo, Branch branch) {
		super();
		AccountId = accountId;
		Address = address;
		Name = name;
		PhoneNo = phoneNo;
		this.branch = branch;
	}


	public Customer(int accountId, String address, String name, int phoneNo) {
		super();
		AccountId = accountId;
		Address = address;
		Name = name;
		PhoneNo = phoneNo;
	}

	public int getAccountId() {
		return AccountId;
	}

	public void setAccountId(int accountId) {
		AccountId = accountId;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getPhoneNo() {
		return PhoneNo;
	}

	public void setPhoneNo(int phoneNo) {
		PhoneNo = phoneNo;
	}


	public Branch getBranch() {
		return branch;
	}


	public void setBranch(Branch branch) {
		this.branch = branch;
	}
	
	
	
}
