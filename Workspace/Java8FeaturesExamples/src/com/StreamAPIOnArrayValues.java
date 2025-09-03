package com;

import java.util.Arrays;

public class StreamAPIOnArrayValues {

	public static void main(String[] args) {
		//int num[]= {1,2,3,4,5,6,7,8,9,10};
		
//		System.out.println("display value from array using stream concept");
//		Arrays.stream(num).forEach(v->System.out.println(v));
//		System.out.println("display even numbers from array using stream concept");
//		Arrays.stream(num).filter(v->v%2==0).forEach(v->System.out.println(v));
		
//		System.out.println("display odds numbers from array using stream concept");
//		Arrays.stream(num).filter(v->v%2!=0).forEach(v->System.out.println(v));
		
//		System.out.println("display  numbers > 5 from array using stream concept");
//		Arrays.stream(num).filter(v->v>5).forEach(v->System.out.println(v));
		
//		System.out.println("display and modified each number like add 10 for each numbers");
//		Arrays.stream(num).mapToLong(v->v+10).forEach(v->System.out.println(v));
		
		String names[]= {"Ravi","Raj","Ajay","Vikash","Balaji","Kumar"};
//		System.out.println("display all names one by one using stream concept");
//		Arrays.stream(names).forEach(v->System.out.println(v));
		
//		System.out.println("Display all names in upper case");
//		Arrays.stream(names).map(ele->ele.toUpperCase()).forEach(v->System.out.println(v));
		
		//System.out.println("Display only those names start with R character");
		//Arrays.stream(names).filter(name->name.startsWith("R")).forEach(v->System.out.println(v));
		
		System.out.println("few more terminal operator");
		boolean result1 = Arrays.stream(names).allMatch(name->name.contains("a"));		// all element must follow condition 
		System.out.println(result1);
		boolean result2 = Arrays.stream(names).anyMatch(name->name.length()>5);		// minimum one element must follow condition 
		System.out.println(result2);	
		
	}

}
