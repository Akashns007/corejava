package com.tnsif.abstractclass;

public class Akash extends TaxPayer{

	public Akash(double salary) {
		super(salary);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calTax() {
		// TODO Auto-generated method stub
		return salary*0.15;
	}
	
	
}
