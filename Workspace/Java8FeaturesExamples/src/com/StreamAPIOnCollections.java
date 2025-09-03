package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPIOnCollections {
	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add("Ravi");
		names.add("Ramesh");
		names.add("Ramesh");
		names.add("Ravi");
		names.add("Raj");
		names.add("Vikash");
		names.add("Vikash");
		names.add("Akash");
		names.add("Vikash");
		// convert list to stream and apply stream functionality 
//		System.out.println("display only those names which end with sh characters");
//		names.stream().filter(name->name.endsWith("sh")).forEach(name->System.out.println(name));
//		int size1 = names.size();
//		System.out.println("including duplicate data "+size1);
//		long size2 = names.stream().distinct().count();
//		System.out.println("excluding duplicate data "+size2);
//		
//		System.out.println("display each with with pre-fix as user or welcome");
//		System.out.println("two intermediate operator");
//		names.stream().distinct().map(name->"Welcome "+name).forEach(v->System.out.println(v));
		
		// Store stream result in another variables 
		// we can use one or more than one inter mediate operator and stored in result in another collection using collect method 
		List<String> uniqueNames = names.stream().distinct().collect(Collectors.toList());
		System.out.println("Number of unique names are "+uniqueNames.size());
	
	}
}
