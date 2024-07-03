// program to demonstrate interface
package com.tnsif.interfacePrograms;

public interface Amazon {
	
	void welcome();
	void thankyou();
	
	default void serviceCharge() {
		int amt = 100;
		System.out.println("The service charge is "+amt);
	}
	
	static void aboutUs() {
		System.out.println("Its a ecommerce website");
	}
	
}
