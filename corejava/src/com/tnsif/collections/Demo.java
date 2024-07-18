package com.tnsif.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//normal for loop
		int arr[] = {5,2,6,2,6,72,3};
		int n = arr.length;
		System.out.println("the array elements: ");
		for(int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}
		
		//using iterator
		ArrayList ob = new ArrayList();
		ob.add("Bengaluru");
		ob.add(23.45);
		ob.add(54);
		ob.add("Ao");
		Iterator i = ob.iterator();
		System.out.println("the ArrayList elements are: ");
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		
	}

}
