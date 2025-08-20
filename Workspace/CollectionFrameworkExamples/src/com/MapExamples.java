package com;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExamples {

	public static void main(String[] args) {
		// HashMap 
		
		//Map mm = new HashMap();
		//Map mm = new LinkedHashMap();
		Map mm = new TreeMap();
		mm.put(2, "Ravi");
		mm.put(1, "Raju");
		mm.put(8, "Ramesh");
		mm.put(5, "Ajay");
		//mm.put("a", "b");
		System.out.println(mm);
		
	}

}
