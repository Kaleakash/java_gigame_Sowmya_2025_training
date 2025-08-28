package com;

@FunctionalInterface
interface Abc {
	void display1();		// abstract method 
	default void display2() {
		System.out.println("this is default display2 method");
	}
	default void display3() {
		System.out.println("this is default display3 method");
	}
	static void display4() {
		System.out.println("this is static display4 method");
	}
	
}
class Test implements Abc {
	@Override
	public void display1() {
	System.out.println("Test class provided body for display1 abstract method");	
	}
	@Override
	public void display2() {
		System.out.println("Test class overrided default method part of Abc interface");
	}
	
}
public class DefaultAndStaticInterfaceExample {
	public static void main(String[] args) {
	Test tt = new Test();
	tt.display1();
	tt.display2();
	tt.display3();
	Abc.display4();   // static method part of interface need to call using interface name
	}

}
