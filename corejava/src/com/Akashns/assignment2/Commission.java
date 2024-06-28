//class to calculate the commission 
package com.Akashns.assignment2;

import java.util.Scanner;

public class Commission {
	private String Name;
	private String Adress;
	private String Phone;
	private int SalesAmount;
	private double Commission;
	
	public void empDetails() {
		//taking inputs using Scanner
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Name: ");
		Name = sc.nextLine();
		System.out.println("Enter the Adress:");
		Adress = sc.nextLine();
		System.out.println("Enter the phone Number:");
		Phone = sc.next();
		System.out.println("Enter the sales Amount:");
		SalesAmount = sc.nextInt();
		sc.close();
	}
	
	public double calcCommission() {
		// calculating commission
		if (SalesAmount >= 100000) {
			Commission = SalesAmount + (SalesAmount * 0.1);
		}
		else if (50000 <= SalesAmount && SalesAmount < 100000) {
			Commission = SalesAmount + (SalesAmount * 0.05);
		}
		else if (30000 <= SalesAmount && SalesAmount < 50000) {
			Commission = SalesAmount + (SalesAmount * 0.03);
		}
		else {
			Commission = 0;
		}
		System.out.println("Commission: "+Commission);
		return Commission; // return commission
		
	}
}
