package com.je.service;

import java.util.UUID;

import com.je.Employee;

public class EmployeeService {

	public Employee getEmployeeDetails(Employee emp) {
		emp.setName(emp.getName().toUpperCase());
		emp.setRandomId(UUID.randomUUID().toString());
		return emp;
	}
}
