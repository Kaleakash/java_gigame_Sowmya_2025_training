package com;

public class RuntimeException {

	public static void main(String[] args) {
		System.out.println("Hi");
		int a=10;
		int b=1;
			try {
			int result = a/b;
			System.out.println("Result is "+result);
			int abc[]= {10,20,30,40};
				int result1 = abc[5];
			System.out.println("Result is "+result1);
			}catch(Exception e) {
				//System.out.println("I Take care");
				//System.out.println(e.getMessage());
				System.out.println(e.toString());
			}
		System.out.println("Bye");
		System.out.println("Bye");
		System.out.println("Bye");
	}

}
