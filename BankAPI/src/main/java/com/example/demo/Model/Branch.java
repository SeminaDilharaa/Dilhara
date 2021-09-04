package com.example.demo.Model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Branch {
	@Id
	private int BranchId;
	private String Address;
	private int NoAccount;
	private int NoStaff;
	
	
	
	@ManyToOne
	@JoinColumn(name ="bank_id",referencedColumnName = "Id")

	private Bank bank;
	
	@OneToMany
	@JoinColumn(name = "branch_id",referencedColumnName = "BranchId")
	
	public List<Customer> customers;
	public List<Employee> employees;
	
	public Branch() {
		
	}
	
	

	public Branch(int branchId, String address, int noAccount, int noStaff, Bank bank, List<Customer> customers,
			List<Employee> employees) {
		super();
		BranchId = branchId;
		Address = address;
		NoAccount = noAccount;
		NoStaff = noStaff;
		this.bank = bank;
		this.customers = customers;
		this.employees = employees;
	}



	public Branch(int branchId, String address, int noAccount, int noStaff) {
		super();
		BranchId = branchId;
		Address = address;
		NoAccount = noAccount;
		NoStaff = noStaff;
	}

	public int getBranchId() {
		return BranchId;
	}

	public void setBranchId(int branchId) {
		BranchId = branchId;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public int getNoAccount() {
		return NoAccount;
	}

	public void setNoAccount(int noAccount) {
		NoAccount = noAccount;
	}

	public int getNoStaff() {
		return NoStaff;
	}

	public void setNoStaff(int noStaff) {
		NoStaff = noStaff;
	}



	public Bank getBank() {
		return bank;
	}



	public void setBank(Bank bank) {
		this.bank = bank;
	}



	public List<Customer> getCustomers() {
		return customers;
	}



	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}



	public List<Employee> getEmployees() {
		return employees;
	}



	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	
	
	
}
