package com.tnsif.abstractclass;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Ente the salary:");
		double sal = sc.nextDouble();
		TaxPayer ob;
		ob = new Akash(sal);
		ob.display();
	
		System.out.println("Ente the salary:");
		double sal2 = sc.nextDouble();
		ob = new Noob(sal2);
		ob.display();
	}
}
