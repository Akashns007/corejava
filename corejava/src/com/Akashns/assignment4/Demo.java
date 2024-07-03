// demo for amazon prime and non prime
package com.Akashns.assignment4;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//interface object
		Amazon ob = new Offers(); //can use flipkart also...
		
		//object of class Offers
		Offers offer = new Offers();
		
		//welcome message inherited from the interfaces
		ob.welcome();
		//calculating the best offer in the offers class
		offer.bestOffer();
		//thank you message inherited from the interfaces
		ob.thankyou();
	}

}
