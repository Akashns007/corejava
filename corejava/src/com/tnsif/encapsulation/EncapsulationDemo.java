package com.tnsif.encapsulation;

public class EncapsulationDemo {
	public static void main(String[] args) {
		Encapsulation ob = new Encapsulation();
//		ob.name= "suma";
//		ob.age = 33;
//		ob.serialNum=22;
		
		ob.setAge(22);
		ob.setName("thorfinn");
		ob.setSerialNum(55);
		System.out.println(ob);
	}
}
