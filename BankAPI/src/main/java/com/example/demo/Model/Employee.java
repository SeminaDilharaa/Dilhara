package com.example.demo.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Employee {
	@Id
	private int EmpId;
	private String Address;
	private String Name;
	private int PhoneNo;
	
	@ManyToOne
	@JoinColumn(name = "branch_id",referencedColumnName = "BranchId")
	private Branch barnch;
	
	public Employee() {
		
	}
	
	

	public Employee(int empId, String address, String name, int phoneNo, Branch barnch) {
		super();
		EmpId = empId;
		Address = address;
		Name = name;
		PhoneNo = phoneNo;
		this.barnch = barnch;
	}



	public Employee(int empId, String address, String name, int phoneNo) {
		super();
		EmpId = empId;
		Address = address;
		Name = name;
		PhoneNo = phoneNo;
	}

	public int getEmpId() {
		return EmpId;
	}

	public void setEmpId(int empId) {
		EmpId = empId;
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



	public Branch getBarnch() {
		return barnch;
	}



	public void setBarnch(Branch barnch) {
		this.barnch = barnch;
	}
	
	
	
}
