package com;

import java.util.function.Consumer;

class MyConsumer implements Consumer<String>{
	@Override
	public void accept(String t) {
		System.out.println("You pass the data as : "+t);
	}
}

public class PreDefinedFunctionInterfaceExample {
	public static void main(String[] args) {
		
		Consumer<String> c1 = new MyConsumer();
		c1.accept("Hello");
		
		
		
		System.out.println("-----------------------------");
		System.out.println(" providing the body for Consumer interface using lambda style");
		
		Consumer<Integer> c2  = (t)->System.out.println("You pass the number as : "+t);
		c2.accept(100);
		
		Consumer<String> c3 = (name)->System.out.println("You pass the message as "+name);
		c3.accept("Hi, how r you");
	}
}
