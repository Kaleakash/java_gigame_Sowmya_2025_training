package com;
class Student implements Runnable{
	@Override
	public synchronized void run() {
		// TODO Auto-generated method stub
		Thread t = Thread.currentThread();
		String name = t.getName();
		for(int i=0;i<10;i++) {
			System.out.println(name+" "+i);
			try {
				Thread.sleep(500);
				if(i==4 && name.equals("Raj")) {
					wait();
				}
				if(i==6 && name.equals("Ajay")) {
					//notify();
					wait();
				}
				if(i==5 && name.equals("Ravi")) {
					notifyAll();
				}
				
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}

public class WaitAndNotifyMethodExample {

	public static void main(String[] args) {
		Student student = new Student();
		Thread rajStudent = new Thread(student, "Raj");
		Thread raviStudent = new Thread(student, "Ravi");
		Thread ajayStudent = new Thread(student, "Ajay");
		rajStudent.start();
		raviStudent.start();
		ajayStudent.start();

	}

}
