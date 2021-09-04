package com.example.demo.Model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Bank {
	@Id
	private int Id;
	private String Name;
	private String Address;
	private int NoBranch;
	
	@OneToMany
	@JoinColumn(name="bank_id",referencedColumnName = "Id")
	
	public List<Branch> branchs;
	
	public Bank() {
		
	}
	
	

	public Bank(int id, String name, String address, int noBranch, List<Branch> branchs) {
		super();
		Id = id;
		Name = name;
		Address = address;
		NoBranch = noBranch;
		this.branchs = branchs;
	}



	public Bank(int id, String name, String address, int noBranch) {
		super();
		Id = id;
		Name = name;
		Address = address;
		NoBranch = noBranch;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public int getNoBranch() {
		return NoBranch;
	}

	public void setNoBranch(int noBranch) {
		NoBranch = noBranch;
	}



	public List<Branch> getBranchs() {
		return branchs;
	}



	public void setBranchs(List<Branch> branchs) {
		this.branchs = branchs;
	}
	
	
	
	
}
