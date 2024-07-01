//trying out static
package com.tnsif.staticPrograms;

public class Student {
	
	private String name;
	private int id;       //innstance variable
	
	static String collageName = "DBIT";

	public Student(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + "]";
	}
	
	
}
