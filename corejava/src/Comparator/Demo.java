package Comparator;

import java.util.ArrayList;
import java.util.Collections;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Student> ar = new ArrayList<Student>();
		ar.add(new Student(222, "a", "london"));
		ar.add(new Student(234, "b", "beng"));
		ar.add(new Student(456, "c", "mysore"));
		
		Collections.sort(ar, new SortRoll());
		for (int i=0; i<ar.size(); i++) {
			System.out.println();
		}
	}

}
