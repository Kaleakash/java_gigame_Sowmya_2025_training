package com.service;

import com.bean.Employee;

public class Department {
	Employee emp = new Employee();
	
	public void displayDepartmentInfo() {
		//System.out.println("id is "+emp.id);
		//System.out.println("name is "+emp.name);
		//System.out.println("salary is "+emp.salary);
		System.out.println("designation is "+emp.designation);
	}
}
