//Country details with inhereted details from Continent
package com.Akashns.assignment3;

public class Country extends Continent {
	private String River;
	private String Statues;
	private String Lakes;
	public Country() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Country(String River, String Statues, String Lakes, String People, String Mountains, String Monuments) {
		super(People, Mountains, Monuments);
		// TODO Auto-generated constructor stub
		this.Lakes = Lakes;
		this.River = River;
		this.Statues = Statues;
	}
	public String getRiver() {
		return River;
	}
	public void setRiver(String river) {
		River = river;
	}
	public String getStatues() {
		return Statues;
	}
	public void setStatues(String statues) {
		Statues = statues;
	}
	public String getLakes() {
		return Lakes;
	}
	public void setLakes(String lakes) {
		Lakes = lakes;
	}
	@Override
	public String toString() {
		return "Country [River=" + River + ", Statues=" + Statues + ", Lakes=" + Lakes + ", getPeople()=" + getPeople()
				+ ", getMountains()=" + getMountains() + ", getMonuments()=" + getMonuments() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	
	
	
	
}
