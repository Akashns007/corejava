package com.tnsif.inheretencePrograms;

public class Student extends Customer {
	private String collageName;
	private int rollNo;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int id, long adharNo, long phoneNo, String collegeName, int rollNo) {
		super(name, id, adharNo, phoneNo);
		// TODO Auto-generated constructor stub
		this.collageName = collegeName;
		this.rollNo = rollNo;
	}

	
	
	
	

	@Override
	public String toString() {
		return "Student [collageName=" + collageName + ", rollNo=" + rollNo + ", getName()=" + getName() + ", getId()="
				+ getId() + ", getAdharNo()=" + getAdharNo() + ", getPhoneNo()=" + getPhoneNo() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

	public String getCollageName() {
		return collageName;
	}

	public void setCollageName(String collageName) {
		this.collageName = collageName;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	
	
	
	
}
