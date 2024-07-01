package com.tnsif.staticPrograms;

public class StaticDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("the college name is :"+ Student.collageName); // accessing static variable
		
		Student ob = new Student("wade", 2);
		System.out.println(ob);

	}

}
