package com;

public class ThrowsExample {

	static void display1() throws NumberFormatException{
		try {
		int a=100/0;
		}catch(ArithmeticException e) {}
		System.out.println("display1 method");
	}
	
	public static void main(String[] args)throws Exception {
		//try {
		display1();
		//}catch(Exception e) {}
		System.out.println("main method");
	}

}
