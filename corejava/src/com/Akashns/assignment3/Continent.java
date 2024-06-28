//continent with all details
package com.Akashns.assignment3;

public class Continent {
	private String People;
	private String Mountains;
	private String Monuments;
	
	public Continent() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Continent(String People, String Mountains, String Monuments) {
		super();
		this.People = People;
		this.Mountains = Mountains;
		this.Monuments = Monuments;
	}
	public String getPeople() {
		return People;
	}
	public void setPeople(String people) {
		People = people;
	}
	public String getMountains() {
		return Mountains;
	}
	public void setMountains(String mountains) {
		Mountains = mountains;
	}
	public String getMonuments() {
		return Monuments;
	}
	public void setMonuments(String monuments) {
		Monuments = monuments;
	}
	@Override
	public String toString() {
		return "Continent [People=" + People + ", Mountains=" + Mountains + ", Monuments=" + Monuments + "]";
	}
	
	
	
}

