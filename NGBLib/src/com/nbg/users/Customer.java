package com.nbg.users;

public class Customer extends User {
	private String photo;
	
	public Customer() {
		super();
		photo = "";
	}
	
	public Customer(String fname, String lname, String email, String password, String photo) {
		super(fname, lname, email, password);
		this.photo = photo;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}
	
	@Override
	public String toString() {
		return "Customer [fname=" + fname + ", lname=" + lname + ", email=" + email + ", password=" + password + "photo=" + photo + "]";
	}

}
