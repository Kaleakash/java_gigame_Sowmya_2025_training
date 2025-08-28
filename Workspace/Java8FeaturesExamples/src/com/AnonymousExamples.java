package com;
interface Hello {
	public String sayHello(String name);
}
class HelloImp implements Hello {
	@Override
	public String sayHello(String name) {
		return "Welcome user "+name;
	}
}
public class AnonymousExamples {

	public static void main(String[] args) {
	// 1st approach 
	Hello h1 = new HelloImp();   
	System.out.println("using class "+h1.sayHello("Ravi"));
	// 2nd approach : providing the body for Hello interface using Anonymous class. java 5 features. 
	Hello h2 = new Hello() {
				@Override
				public String sayHello(String name) {
					// TODO Auto-generated method stub
					return "Welcome user using anonymous class "+name;
				}	//::Y
	};
	System.out.println("using anonymous class "+h2.sayHello("Ravi"));
	System.out.println();
	// 3rd approach : using lambda 
	Hello h3 = (name)->"Welcome to labmda user "+name;
	System.out.println("using anonymous function/methor or lambda  "+h3.sayHello("Ravi"));
	}

}
