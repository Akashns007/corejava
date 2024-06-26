// program to demonstrate constructor
package com.tnsif.constructors;

public class Customer {
	private int id;
	private String Name;
	
	//default constructor
	public Customer() {
		super();
		System.out.println("---default constructor---");
	}
	
	
	public Customer(int id, String name) {
		super();
		this.id = id;
		Name = name;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return Name;
	}



	public void setName(String name) {
		Name = name;
	}



	@Override
	public String toString() {
		return "Customer [id=" + id + ", Name=" + Name + "]";
	}
	
}
