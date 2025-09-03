package com;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Java8DateOperations {

	public static void main(String[] args) {
	// find system date 
		LocalDate ld = LocalDate.now();
		System.out.println(ld);
	// find the time 
		LocalTime lt = LocalTime.now();
		System.out.println(lt);
		// date and time 
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);
		//LocalDateTime.now("");
		
	}

}
