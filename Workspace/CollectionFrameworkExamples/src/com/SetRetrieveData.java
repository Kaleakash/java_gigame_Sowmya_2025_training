package com;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetRetrieveData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> ss1 = new HashSet<Integer>();
		ss1.add(10);ss1.add(40);ss1.add(30);ss1.add(20);
		System.out.println(ss1);	// get the data as string format 
		System.out.println("Retrieve the records one by one");
		for(int n:ss1) {
			System.out.println(n);
		}
		System.out.println("retrieve using iterator ");
		Iterator<Integer> li = ss1.iterator();
		while(li.hasNext()) {
			int n = li.next();
			
			System.out.println(n);
		}
	}

}
