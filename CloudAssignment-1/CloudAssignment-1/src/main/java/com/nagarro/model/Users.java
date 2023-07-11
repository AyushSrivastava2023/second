package com.nagarro.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class Users {
	
	@Id
	private String fname;
	private String lname;
	private long phone;
	
	 public Users(){}
	 
	 public Users(String fname, String lname, long phone) {
			
			this.fname = fname;
			this.lname = lname;
			this.phone = phone;
		}
	
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.fname +" "+ this.lname;
	}
	
	
	

}
