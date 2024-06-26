package com.tnsif.scanners;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String args[]) {
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter the id: ");
		boolean a = ob.hasNextInt();
		System.out.println(a);
	}
}
