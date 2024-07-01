// 
package com.tnsif.staticPrograms;

public class MyClass {
	private int section;
	static int srNo;
	
	
	static {
		System.out.println("-----static block------");	
		srNo = 1000;
		//section++;
	}

	public MyClass() {
		super();
		System.out.println("====default constructor====");
	}
	
	static void display() {
		System.out.println("---static method---");
		System.out.println("the serial number is "+ srNo++);
		
	}

	@Override
	public String toString() {
		return "MyClass [section=" + section + "srNo" + srNo + "]";
	}
	
	
}
