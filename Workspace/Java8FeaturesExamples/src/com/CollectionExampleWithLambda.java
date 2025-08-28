package com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
class MyListConsumer implements Consumer<Integer>{
	@Override
	public void accept(Integer t) {
		System.out.println("Value "+t);
	}
}
public class CollectionExampleWithLambda {

	public static void main(String[] args) {
		List<Integer> ll = new ArrayList<Integer>();
		ll.add(10);ll.add(20); ll.add(30); ll.add(40);
		System.out.println(ll);
		System.out.println("Before java 8 if retrieve data");
		Iterator<Integer> li = ll.iterator();
		while(li.hasNext()) {
			int n = li.next();
			System.out.println(n);
		}
		System.out.println("After java 8 if retrieve data");
		Consumer<Integer> cc = new MyListConsumer();
		ll.forEach(cc);
		System.out.println("Retreive data using lambda");
		ll.forEach((v)->System.out.println("Value is "+v));
	}

}
