//program to demonstrate abstract class
package com.tnsif.abstractclass;
//non concrete class
public abstract class TaxPayer {
	public abstract double calTax(); //abstract method
	//
	
	protected double salary;
	// for displaying
	
	public TaxPayer(double salary) {
		super();
		this.salary = salary;
	}
	public void display() {
		System.out.println("then tax payed is: " + salary);	
	}


}
