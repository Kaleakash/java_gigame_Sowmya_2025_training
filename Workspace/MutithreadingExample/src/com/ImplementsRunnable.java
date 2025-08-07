package com;
class Task1 implements Runnable {
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("i = "+i);
		}
		
	}
}
class Task2 extends Thread {
	@Override
	public void run() {
		for(int j=0;j<10;j++) {
			System.out.println("j = "+j);
		}
	}
}
public class ImplementsRunnable {

	public static void main(String[] args) {
//		Runnable rr1 = new Task1();
//		
//		Thread t  = new Thread(rr1);		// thread class reference we are passing reference of Runnable while creating thread class reference. 
//		//t.start();						// it call pre -defined run method it contains empty body
//		t.start();
//		Task2 tt2 = new Task2();		// thread class reference 
//		tt2.start();
		
		Runnable rr =new Task2();
		Thread t1 = new Thread(rr);
		Thread t2 = new Thread(rr);
		Thread t3 = new Thread(rr);
		Thread t4 = new Thread(rr);
		Thread t5 = new Thread(rr);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}

}
