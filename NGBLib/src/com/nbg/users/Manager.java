package com.nbg.users;

public class Manager extends User{
	
	public Manager() {
		super();
	}
	
	public Manager(String fname, String lname, String email, String password) {
		super(fname, lname, email, password);
	}

	@Override
	public String toString() {
		return "Manager [fname=" + fname + ", lname=" + lname + ", email=" + email + ", password=" + password + "]";
	}
	
	
	
	
	

}
