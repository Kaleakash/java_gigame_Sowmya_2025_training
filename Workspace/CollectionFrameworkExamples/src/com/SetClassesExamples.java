package com;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetClassesExamples {

	public static void main(String[] args) {
	// HashSet example 
//		HashSet hs = new HashSet();
//		System.out.println(hs.size());
//		hs.add(10);
//		hs.add("Ravi");
//		hs.add(10.20);
//		hs.add(true);
//		System.out.println(hs.size());
		// 2nd Example for hashSet 
//		HashSet hs  = new HashSet();
//		System.out.println("size :"+hs.size());
//		System.out.println("Empty or not :"+hs.isEmpty());
//		hs.add(3);
//		hs.add(2);
//		hs.add(5);
//		hs.add(20);
//		hs.add("Ravi");
//		hs.add(9);
//		hs.add(7);
//		System.out.println("size :"+hs.size());
//		System.out.println("Empty or not :"+hs.isEmpty());
//		System.out.println(hs);// it display in string format. 
//		System.out.println(" Search element : "+hs.contains(3));
//		System.out.println(" Search element : "+hs.contains(30));
//		System.out.println(" Remove element : "+hs.remove(2));
//		System.out.println(" Remove element : "+hs.remove(25));
//		System.out.println(hs);// it display in string format.
		
		//3rd Example LinkedHashSet 
//		LinkedHashSet hs = new LinkedHashSet();
//		System.out.println("size :"+hs.size());
//		System.out.println("Empty or not :"+hs.isEmpty());
//		hs.add(3);
//		hs.add(2);
//		hs.add(5);
//		hs.add(20);
//		hs.add("Ravi");
//		hs.add(9);
//		hs.add(7);
//		System.out.println("size :"+hs.size());
//		System.out.println("Empty or not :"+hs.isEmpty());
//		System.out.println(hs);// it display in string format. 
//		System.out.println(" Search element : "+hs.contains(3));
//		System.out.println(" Search element : "+hs.contains(30));
//		System.out.println(" Remove element : "+hs.remove(2));
//		System.out.println(" Remove element : "+hs.remove(25));
//		System.out.println(hs);// it display in string format.
		
		// 4th Example 
		
		TreeSet hs = new TreeSet();
		System.out.println("size :"+hs.size());
		System.out.println("Empty or not :"+hs.isEmpty());
		hs.add(3);
		hs.add(3);
		hs.add(2);
		hs.add(5);
		hs.add(20);
		//hs.add("Ravi");
		hs.add(9);
		hs.add(7);
		System.out.println("size :"+hs.size());
		System.out.println("Empty or not :"+hs.isEmpty());
		System.out.println(hs);// it display in string format. 
		System.out.println(" Search element : "+hs.contains(3));
		System.out.println(" Search element : "+hs.contains(30));
		System.out.println(" Remove element : "+hs.remove(2));
		System.out.println(" Remove element : "+hs.remove(25));
		System.out.println(hs);// it display in string format.
	}

}
