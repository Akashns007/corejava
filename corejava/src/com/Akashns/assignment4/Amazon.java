// program to demonstrate interface
package com.Akashns.assignment4;

public interface Amazon {
	
	void welcome();
	void thankyou();
	
	 static int PriceOfProduct() {
		int amt = 200;
		System.out.println("The product price in amazon is "+amt);
		return amt;
	}
	
	static void aboutUs() {
		System.out.println("Its a ecommerce website called amazon");
	}
	
}
