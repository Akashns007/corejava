//States details to demonstrate hirearcheal 
package com.Akashns.assignment3;

public class State extends Country{
	private String Parks;
	private String Dam;
	public State() {
		super();
		// TODO Auto-generated constructor stub
	}
	public State(String Parks, String Dam, String River, String Statues, String Lakes, String People, String Mountains, String Monuments) {
		super(River, Statues, Lakes, People, Mountains, Monuments);
		// TODO Auto-generated constructor stub
		this.Parks = Parks;
		this.Dam = Dam;
	}
	@Override
	public String toString() {
		return "State [Parks=" + Parks + ", Dam=" + Dam + ", getRiver()=" + getRiver() + ", getStatues()="
				+ getStatues() + ", getLakes()=" + getLakes() + ", toString()=" + super.toString() + ", getPeople()="
				+ getPeople() + ", getMountains()=" + getMountains() + ", getMonuments()=" + getMonuments()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	public String getParks() {
		return Parks;
	}
	public void setParks(String parks) {
		Parks = parks;
	}
	public String getDam() {
		return Dam;
	}
	public void setDam(String dam) {
		Dam = dam;
	}
	
	
	
	
}
