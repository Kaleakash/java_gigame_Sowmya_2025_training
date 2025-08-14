package com;

import java.util.ArrayList;
import java.util.List;

public class ListClasses {

	public static void main(String[] args) {
		// 1st Example in ArrayList 
		List ll = new ArrayList();
		System.out.println("Size "+ll.size());
		int a=200;	// primitive values consider 
		Integer i = new Integer(a); // converting primitive to object 
		ll.add(i);
		ll.add(30);	//auto-boxing : converting primitive to object. 
		ll.add(10);
		ll.add(80);
		ll.add(50);
		ll.add(40);
		System.out.println("Size "+ll.size());
		System.out.println(ll);  // display data as string format. 
		System.out.println("retreive value using index "+ll.get(1));
		ll.add(1, 100);
		System.out.println(ll);  // display data as string format. 
		ll.remove(2); // remove element using index position 
		System.out.println(ll);
		Integer value = 50; // auto-boxing. 
		ll.remove(value); // here value consider as object not primitive 
		System.out.println(ll);
	}

}
