package com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.bean.Employee;

public class EmployeeOperation {

	public static void main(String[] args) {
		List<Employee> listOfEmployees = new ArrayList<Employee>();
		Employee emp1 = new Employee();
		emp1.setId(100);
		emp1.setName("Raj");
		emp1.setSalary(45000);
		
		Employee emp2= new Employee(101, "Lokesh", 46000);
		System.out.println("Number of employee is "+listOfEmployees.size());
		listOfEmployees.add(emp1);
		listOfEmployees.add(emp2);
		listOfEmployees.add(new Employee(102, "Ajay", 43000));
		System.out.println("Number of employee is "+listOfEmployees.size());
		System.out.println("Retrieve all employee details one by one");
		Iterator<Employee> li  = listOfEmployees.iterator();
		while(li.hasNext()) {
			Employee e = li.next();
			//System.out.println("id is "+e.getId()+" Name is "+e.getName()+" Salary is "+e.getSalary());
			System.out.println(e); // it call toString method. 
			if(e.getName().equals("Ajay")) {
				li.remove();
			}
		}
		System.out.println("Afer removed "+listOfEmployees.size());
	}

}
