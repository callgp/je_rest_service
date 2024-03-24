package com.je;

import com.je.service.EmployeeService;

public class Test {
public static void main(String[] args) {
	
	EmployeeService empService=new EmployeeService();
	Employee emp=new Employee();
	emp.setName("class to test junit");
	Employee updatedEmployee=empService.getEmployeeDetails(emp);
	System.out.println(updatedEmployee);
	
}
}
