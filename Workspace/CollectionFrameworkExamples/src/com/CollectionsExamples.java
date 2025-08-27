package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsExamples {

	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add("Raj");names.add("Vijay"); names.add("Ajay");
		System.out.println(names);
		
			Collections.sort(names);
		
		System.out.println("after sort - asc");
		System.out.println(names);
			Collections.reverse(names);
		
		System.out.println("after sort - desc");
		System.out.println(names);
	}

}
