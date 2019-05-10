package com.homework.springboot.model;



public class Person {

	private int id;
	private String fname;
	private String lname;
	private String address;
	private String ph;
	
	
	public Person(int id, String fname, String lname, String address, String ph) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.address = address;
		this.ph = ph;
	}


	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
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


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getPh() {
		return ph;
	}


	public void setPh(String ph) {
		this.ph = ph;
	}
	
	
}
