package com;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Task3 implements Callable<String>{
	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		
		Thread t = Thread.currentThread();
		System.out.println(t);
		return t.toString();
	}
}
class Task4 implements Runnable{
	@Override
	public void run() {
		Thread t = Thread.currentThread();
		System.out.println(t);
	}
}
public class CallableInterfaceExample {

	public static void main(String[] args) throws Exception{
//		Callable<String> cc= new Task3();
//		Runnable rr =  new Task4();
//		//String result = cc.call();
//		//System.out.println("result "+result);
//		// ExecutorService is a interface and Executors is a class which contains lot of static method to create the reference. 
//		ExecutorService es = Executors.newSingleThreadExecutor();
//								
//		Future<String> result1 = es.submit(cc);			// it is equal to start method 
//		System.out.println(result1.get());
//		Future result2 = es.submit(rr);
//		System.out.println(result2.get());
		
		
		Callable<String> cc= new Task3();
		ExecutorService es = Executors.newSingleThreadExecutor();
		//ExecutorService es = Executors.newFixedThreadPool(5);
		//ExecutorService es = Executors.newCachedThreadPool();
		for(int i=0;i<20;i++) {
			Future<String> result1 = es.submit(cc);			// it is equal to start method 
			System.out.println(result1.get());
		}
		es.shutdown();
		
	}

}
