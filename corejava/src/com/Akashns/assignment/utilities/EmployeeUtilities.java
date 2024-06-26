package com.Akashns.assignment.utilities;
import com.Akashns.assignment.employees.*;


public class EmployeeUtilities {
	
	public void project_manager(String Name, String empId, int Salary, int numOfEmp, float Experience, String Dept) {
		//
		Manager manager = new Manager();
		manager.setEmpId(empId);
		manager.setName(Name);
		manager.setSalary(Salary);
		manager.setNumOfEmp(numOfEmp);
		manager.setExperience(Experience);
		manager.setDept(Dept);
		System.out.println(manager);	
	}

	public void project_developers(String Name, String empId, int Salary, float Experience, String coreLang, String Domain) {
		Developer dev = new Developer();
		dev.setEmpId(empId);
		dev.setName(Name);
		dev.setSalary(Salary);
		dev.setCoreLang(coreLang);
		dev.setExperience(Experience);
		dev.setDomain(Domain);
		System.out.println(dev);
	}
}
