package com;

import java.util.Arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[]= {2,4,1,7,9,5};
		System.out.println("Before sort");
		for(int n:num) {
			System.out.print(" "+n);
		}
			Arrays.sort(num);
		System.out.println();
		System.out.println("After sort");
		for(int n:num) {
			System.out.print(" "+n);
		}
		System.out.println();
		System.out.println(" search opeation using birary search, element present in index position  "+Arrays.binarySearch(num, 4));
		System.out.println(" search opeation using birary search, element present in index position  "+Arrays.binarySearch(num, 9));
	}

}
