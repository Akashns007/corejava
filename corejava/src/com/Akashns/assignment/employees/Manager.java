package com.Akashns.assignment.employees;

// Manager class is extending Employee class ,,,, inheritance
public class Manager extends Employee{
	//private objects
	private int numOfEmp;
	private float Experience;
	private String Dept;
	
	Employee emp = new Employee();
	//tostings
	@Override
	public String toString() {
		return "Manager [Name=" + Name + ", EmployeeID=" + empId + ", Salary=" + Salary + ", numOfEmp=" + numOfEmp + ", Experience=" + Experience + ", Dept=" + Dept + "]";
	}
	
	//getters and setters
	public int getNumOfEmp() {
		return numOfEmp;
	}
	public void setNumOfEmp(int numOfEmp) {
		this.numOfEmp = numOfEmp;
	}
	public float getExperience() {
		return Experience;
	}
	public void setExperience(float experience) {
		Experience = experience;
	}
	public String getDept() {
		return Dept;
	}
	public void setDept(String dept) {
		Dept = dept;
	}
}
