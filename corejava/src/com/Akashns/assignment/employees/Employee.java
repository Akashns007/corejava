package com.Akashns.assignment.employees;

public class Employee {
	
	// creating private attributes
	protected String Name;
	protected String empId;
	protected int Salary;
	
	// to display the details
	void show() {
		System.out.println("Name:"+Name+"\t Id:"+empId+ "\t Salary:"+Salary);
	}
	
	//implementing tostrings()
	@Override
	public String toString() {
		return "Employee [Name=" + Name + ", empId=" + empId + ", Salary=" + Salary + "]";
	}
	
	// getter and setters for the private attributes
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public int getSalary() {
		return Salary;
	}

	public void setSalary(int salary) {
		Salary = salary;
	}	
}
