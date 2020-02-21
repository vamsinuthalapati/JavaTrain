package com.ArraysnArrayList.examples;

import java.util.List;
import java.util.Arrays;

public class StringExample {
	
	String daysWithLongCh = "";
	String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
	List<String> list = Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday");
	
	public void longest() {
		for (String day : days) {
			if(daysWithLongCh.length() < day.length()) {
				daysWithLongCh = day;
			}
		}
		System.out.println(daysWithLongCh);
	}
	public void reverse() {
		for(int i=days.length-1; i >=0; i--) {
			System.out.println(days[i]);
		}
	}
	public void streamLong() {
		list.stream()
			.map(name -> ((String) name).length())
			.forEach(number -> System.out.println("Length of week day is " +number));
		
		list.stream()
			.map(String :: toUpperCase)
			.forEach(name -> System.out.print(" "+name));
	}
	
}
