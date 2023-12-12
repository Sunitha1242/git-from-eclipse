package com.Java8.practice;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateTimeApi1 {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		System.out.println(date);
		LocalTime time = LocalTime.now();
		System.out.println(time);
		int dd = date.getDayOfMonth();
		int mm = date.getMonthValue();
		int yyyy = date.getYear();
		int h = time.getHour();
		int m = time.getMinute();
		int s = time.getSecond();
		int nano = time.getNano();

//		System.out.println("date::" + dd + "month::" + mm + "year::" + yyyy);
//		System.out.printf("%d:%d:%d:%d",h,m,s,nano);
//		System.out.printf("\n %d-%d-%d", dd, mm, yyyy);
    	LocalDateTime dt=LocalDateTime.now();
		System.out.println(dt);
		
	}

}
