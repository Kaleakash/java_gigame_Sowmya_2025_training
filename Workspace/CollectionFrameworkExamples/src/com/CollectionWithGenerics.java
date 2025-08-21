package com;

import java.util.ArrayList;
import java.util.List;

public class CollectionWithGenerics {

	public static void main(String[] args) {
	// Collection Framework without generics 
//		List ll = new ArrayList();
//		ll.add(10);	// auto-boxing : converting primitive to object. 
//		ll.add(10.20);
//		ll.add("Ravi");
//		ll.add(true);
//		
//		Object obj = ll.get(1);
//		if(obj instanceof Integer) {
//			Integer i = (Integer)obj;
//			int n  = i.intValue();
//			System.out.println(n);
//
//		}
//		if(obj instanceof Double) {
//			Double i = (Double)obj;
//			double n  = i.doubleValue();
//			System.out.println(n);
//
//		}
		
		// Collection framweork with generics 
		List<Integer> ll = new ArrayList<Integer>();
		ll.add(10);		// auto-boxing 
		ll.add(20);
		ll.add(30);
		ll.add(40);
		
		
		int n = ll.get(0);			// auto-unboxing :converting object to primitive 
		System.out.println(n);
		
		// Collection with all type so of values with generics 
		List<Object> ll1 = new ArrayList<Object>();
		ll1.add(10);
		ll1.add(10.20);
		ll1.add("Ravi");
		
	}

}
