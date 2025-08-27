package com;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ReadAndWritePrimitiveData {

	public static void main(String[] args) throws Exception{
//		int id=100;
//		String name="Ravi";
//		float salary = 34000;
//		FileOutputStream fos = new FileOutputStream("emp.txt");
//		DataOutputStream dos = new DataOutputStream(fos);
//		dos.writeInt(id);
//		dos.writeUTF(name);
//		dos.writeFloat(salary);
//		System.out.println("Store primitive data in file");
		
	FileInputStream fis = new FileInputStream("emp.txt");		// read data as byte format 
		DataInputStream dis = new DataInputStream(fis);			// help to convert in specific data types. 
		int id1 = dis.readInt();
		String name1 = dis.readUTF();
		float salary1 = dis.readFloat();
		System.out.println("id is "+id1);
		System.out.println("name is "+name1);
		System.out.println("salary is "+salary1);
		

	}

}
