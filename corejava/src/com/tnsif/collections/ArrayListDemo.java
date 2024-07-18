package com.tnsif.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		ArrayList ob = new ArrayList();
//		System.out.println("the size of the arraylist " + ob.size());
//		ob.add(2);
//		ob.add('a');
//		ob.add(22.35);
//		System.out.println("The elements of array are"+ob);
//		System.out.println("check: "+ob.contains(22.35));
//		System.out.println("element removal "+ob.remove(0));
//		System.out.println("The elements of array are"+ob);
		
		ArrayList <String>ob = new ArrayList<String>();
		ob.add("Bengaluru");
		ob.add("is");
		ob.add("the best city");
		ob.add("Ao");
		System.out.println("The elements of array are\n"+ob);
		Collections.sort(ob);
		System.out.println("The elements of array are\n"+ob);
		Iterator<String> i = ob.iterator();
		while(i.hasNext()) {
			String nm = i.next();//used for copying the current element
			ob.remove(0);
			System.out.println(nm);
		}
		
	}

}
