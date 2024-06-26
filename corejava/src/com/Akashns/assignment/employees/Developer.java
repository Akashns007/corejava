package com.Akashns.assignment.employees;
//Developer is inheriting the Employee class
public class Developer extends Employee{
	//private objects
	private float Experience;
	private String coreLang;
	private String Domain;
	
	//tostringas
	@Override
	public String toString() {
		return "Developer [Name=" + Name + ", EmployeeID=" + empId + ", Salary=" + Salary + ", Experience=" + Experience + ", coreLang=" + coreLang + ", Domain=" + Domain + "]";
	}

	//getters and setters
	public float getExperience() {
		return Experience;
	}


	public void setExperience(float experience) {
		Experience = experience;
	}


	public String getCoreLang() {
		return coreLang;
	}


	public void setCoreLang(String coreLang) {
		this.coreLang = coreLang;
	}


	public String getDomain() {
		return Domain;
	}


	public void setDomain(String domain) {
		Domain = domain;
	}
	
	
}
