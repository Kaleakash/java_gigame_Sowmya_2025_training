package com;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListiteratorData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = new ArrayList<String>();
		names.add("Ravi");names.add("Ajay");names.add("Vijay");names.add("Raju");
		System.out.println(names);
		System.out.println("Retrieve using ListIterator");
		ListIterator<String> li = names.listIterator();
		System.out.println("forward direction");
		while(li.hasNext()) {
			String name = li.next();
			System.out.println(name);
		}
		System.out.println("backward direction");
		while(li.hasPrevious()) {
			String name = li.previous();
			System.out.println(name);
		}
	}

}
