package com;
class BookTicket implements Runnable{
	int avl=2;
	@Override
	public synchronized void run() {
	Thread t = Thread.currentThread();
	String name = t.getName();
		if(avl>0) {
			System.out.println(name+" got the ticket");
			avl=avl-1;
		}else {
			System.out.println(name+" sorry no ticket");
		}
	}
}
public class BookingApp {

	public static void main(String[] args) {
	BookTicket bt1 = new BookTicket();		// avl=2
	//BookTicket bt2 = new BookTicket();	// avl=2
	//BookTicket bt3 = new BookTicket();	// avl=2
	Thread t1 = new Thread(bt1,"Ravi");
	Thread t2 = new Thread(bt1,"Ajay");
	Thread t3 = new Thread(bt1,"Vijay");
	Thread t4 = new Thread(bt1,"Mahesh");
	t1.start();
	t2.start();
	t3.start();
	t4.start();
	}

}
