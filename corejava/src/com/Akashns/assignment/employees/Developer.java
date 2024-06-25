package com.Akashns.assignment.employees;

public class Developer extends Employee{
	
	private float Experience;
	private String coreLang;
	private String Domain;
	
	
	@Override
	public String toString() {
		return "Developer [Name=" + Name + ", EmployeeID=" + empId + ", Salary=" + Salary + ", Experience=" + Experience + ", coreLang=" + coreLang + ", Domain=" + Domain + "]";
	}


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
