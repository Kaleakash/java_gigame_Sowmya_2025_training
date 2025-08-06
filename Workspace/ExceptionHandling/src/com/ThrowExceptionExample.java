package com;

import java.util.Scanner;

public class ThrowExceptionExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age");
		//int result  = 100/0;
		int age = sc.nextInt();
		try {
		if(age>=21) {
			System.out.println("You Can apply for that job or you can vote!");
		}else {
			//throw new Exception();	// generic exception 
			//throw new Exception("age must be >=21"); exception with message 
			//throw new ArithmeticException();
			//throw new MyException();// custom exception 
			throw new MyException("age must be >=21");
		}
		}catch(Exception e) {
			//System.err.println(e.getMessage());
			System.err.println(e.toString());
			//e.printStackTrace();
		}
	}

}
