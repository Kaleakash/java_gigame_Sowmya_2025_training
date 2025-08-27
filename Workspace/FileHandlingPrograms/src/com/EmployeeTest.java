package com;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class EmployeeTest {

	public static void main(String[] args) throws Exception{
//			Employee emp1 = new Employee();
//		emp1.setId(100);
//		emp1.setName("Raju");
//		emp1.setSalary(4500);
//		System.out.println(emp1);
//		FileOutputStream fos = new FileOutputStream("employee.txt");
//			ObjectOutputStream oos = new ObjectOutputStream(fos);
//		oos.writeObject(emp1);
//		System.out.println("object serialization done sucessfuly");
		
		
		FileInputStream fis =new FileInputStream("employee.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
	Object obj = ois.readObject();
		Employee emp2 = (Employee)obj;		// type casting 
		System.out.println(emp2);
		
	}

}
