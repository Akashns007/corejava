package com.tnsif.abstractclass;

public class Noob extends TaxPayer {

	public Noob(double salary) {
		super(salary);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calTax() {
		// TODO Auto-generated method stub
		if (salary >= 500000) {
			return salary*0.15;
		}
		else {
			return 0;
		}
	}
	
}
