package com;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class BytewiseClassesExample {

	public static void main(String[] args) throws Exception{
		// Byte wise classes 
		// source : keyboard 
		// destination : console 
		// 1st example 
//		DataInputStream dis = new DataInputStream(System.in);
//		PrintStream ps = System.out;
//		ps.println("Enter the text");
//		String name  = dis.readLine();
//		ps.println(name);
		
		// 2nd program 
		// source : keyboard 
		// destination : file 
//		DataInputStream dis = new DataInputStream(System.in);
//		//FileOutputStream fos = new FileOutputStream("abc.txt");	// override the file 
//		FileOutputStream fos = new FileOutputStream("abc.txt",true);// append the file  
//		System.out.println("Enter the data");
//		int ch;
//		while((ch=dis.read()) != '@') {
//			fos.write(ch);
//			System.out.print(ch+" "+(char)ch);
//		}
//		System.out.println("data stored in file");
		
		// 2nd program 
		// source : file 
		// destination : file 
		FileInputStream fis = new FileInputStream("abc.txt");
		FileOutputStream fos = new FileOutputStream("mno.txt");
		int ch;
		while((ch=fis.read())!= -1) {   //-1 EOF end of the file 
			fos.write(ch);
		}
		fis.close();
		fos.close();
		System.out.println("copy from one file to another file");
	}

}
