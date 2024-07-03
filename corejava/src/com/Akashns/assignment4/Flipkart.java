package com.Akashns.assignment4;

public interface Flipkart {

	void welcome();
	void thankyou();
	
	static int PriceOfProduct() {
		int amt = 45697;
		System.out.println("The product price in flipkart is "+amt);
		return amt;
	}
	
	static void aboutUs() {
		System.out.println("Its a ecommerce website called flipkart");
	}
	
}
