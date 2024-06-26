package com.Akashns.assignment;
import com.Akashns.assignment.utilities.*;

public class AssignmentMain {

	public static void main(String[] args) {
		
		EmployeeUtilities util = new EmployeeUtilities();
		util.project_manager("jack", "CI005" ,50000, 20, 5, "Hr");
		
		util.project_developers("WADE", "CI007", 40000, 10, "python", "CYBER SECURITY");		
	}

}
