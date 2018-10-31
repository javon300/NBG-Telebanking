package com.nbg.users;

import java.io.Serializable;

public abstract class User implements Serializable {
	protected String fname;
	protected String lname;
	protected String email;
	protected String password;
	
	public User() {
		fname = "";
		lname = "";
		email = "";
		password = "";
	}
	
	public User(String fname, String lname, String email, String password) {
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.password = password;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [fname=" + fname + ", lname=" + lname + ", email=" + email + ", password=" + password + "]";
	}
	
	
}
