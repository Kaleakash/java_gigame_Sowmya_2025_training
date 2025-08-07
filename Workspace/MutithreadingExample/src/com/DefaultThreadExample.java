package com;

public class DefaultThreadExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t = Thread.currentThread();
		System.out.println(t);
		t.setName("My Thread");
		t.setPriority(1);  // min 1, max 10, norm 5
		t.setPriority(Thread.MAX_PRIORITY);
		System.out.println(t);
	}

}
