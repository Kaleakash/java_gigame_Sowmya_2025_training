package com;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapRetreiveData {

	public static void main(String[] args) {
	
	Map<Integer, String> data = new HashMap<Integer, String>();
	data.put(3, "Ravi");
	data.put(1, "Raj");
	data.put(5, "Rajesh");
	data.put(2, "Ravi");
	System.out.println(data);
	System.out.println("converting map to set");
	Set<Integer> ss = data.keySet();  // all keys store in set 
	
	Iterator<Integer> li = ss.iterator();
	while(li.hasNext()) {
		int key = li.next();
		System.out.println("key "+key+" Value "+data.get(key));
	}
	}

}
