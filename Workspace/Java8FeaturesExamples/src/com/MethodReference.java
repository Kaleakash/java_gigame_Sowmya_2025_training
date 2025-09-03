package com;

import java.util.Arrays;

@FunctionalInterface
interface SomeOperation {
	public int add(int x, int y);
}

class SomeOperationImp {
	public static int add(int x, int y) {
		int sum = x+y;
		return sum;
	}
}
public class MethodReference {

	public static void main(String[] args) {
	System.out.println("Providing the body for SomeOperation interface ");
	SomeOperation op1 = (a,b)->a+b;
	System.out.println(op1.add(100, 200));

	SomeOperation op2 = SomeOperationImp::add;
	System.out.println(op2.add(10, 20));
	
	int num[]= {10,20,30,40,50};
	System.out.println("display data using lambda");
		Arrays.stream(num).forEach(v->System.out.println(v));
	System.out.println("display data using method reference");
		Arrays.stream(num).forEach(System.out::println);
		
	}

}
