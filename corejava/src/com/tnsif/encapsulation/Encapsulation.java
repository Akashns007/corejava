// Program to demonstrate encapsulation
package com.tnsif.encapsulation;

public class Encapsulation {
	// if no access specifier then it is default
	private int serialNum = 10; //Data variable
	private String name;
	private int age;
	//use tostrings by right clicking and sources and generate tostring()
	//by using getter and setters we can right click and click on sources and generate getters and setters
	
	
	void show() {
		System.out.println("serialNumber:"+serialNum+"\t Name:"+name + "\t Age:"+age);
	}
	
	@Override
	public String toString() {
		return "Encapsulation [serialNum=" + serialNum + ", name=" + name + ", age=" + age + "]";
	}

	public int getSerialNum() {
		return serialNum;
	}
	public void setSerialNum(int serialNum) {
		this.serialNum = serialNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
