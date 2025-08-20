package com;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class ListClasses {

	public static void main(String[] args) {
		// 1st Example in ArrayList 
//		List ll1 = new ArrayList();
//		ll1.add(100);
//		ll1.add(200);
		
		//ll1.addFirst(300);
//		System.out.println("Size "+ll.size());
//		int a=200;	// primitive values consider 
//		Integer i = new Integer(a); // converting primitive to object 
//		ll.add(i);
//		ll.add(30);	//auto-boxing : converting primitive to object. 
//		ll.add(10);
//		ll.add(80);
//		ll.add(50);
//		ll.add(40);
//		System.out.println("Size "+ll.size());
//		System.out.println(ll);  // display data as string format. 
//		System.out.println("retreive value using index "+ll.get(1));
//		ll.add(1, 100);
//		System.out.println(ll);  // display data as string format. 
//		ll.remove(2); // remove element using index position 
//		System.out.println(ll);
//		Integer value = 50; // auto-boxing. 
//		ll.remove(value); // here value consider as object not primitive 
//		System.out.println(ll);
		
//		ArrayList ll1= new ArrayList();
//		ll1.add(10);
//		ll1.add(20);
//		ll1.add(30);
//		ll1.add(40);
//			ll1.add(0, 100);
//		//ll1.addFirst(100);
//		//ll1.addLast(200);
//
//		
//		// Linked List Example 
//		//List ll2 = new LinkedList();
//		LinkedList ll2 = new LinkedList();
//		ll2.add(10);
//		ll2.add(20);
//		ll2.add(30);
//		ll2.add(40);
//		
//			ll2.addFirst(100);
//		ll2.addLast(200);
		
		// Vector class 
//		Vector vv = new Vector();
//		vv.addElement(100);
//		vv.addElement(200);
//		vv.addElement(300);
//		System.out.println(vv);
		
		// Stack Example 
		
		Stack ss = new Stack();
		
		ss.push(100);
		ss.push(200);
		ss.push(300);
		ss.push(400);
		
		System.out.println("All element "+ss);
		System.out.println("Remove top most element "+ss.pop());
		System.out.println("All element "+ss);
		System.out.println("Check top most element "+ss.peek());
		System.out.println("All element "+ss);
		System.out.println("Search operation "+ss.search(300));
		System.out.println("Search operation "+ss.search(100));
		System.out.println("Search operation "+ss.search(3000));
	}

}
