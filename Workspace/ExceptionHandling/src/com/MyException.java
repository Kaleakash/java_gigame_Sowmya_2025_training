package com;

public class MyException extends Exception{

	public MyException() {
		super();
	}
	MyException(String msg){
		//super();	// by default every class contains super() which call super class empty constructor 
		super(msg);  // we call super class ie Exception class parameter constructor to set the message. 
	}
}
