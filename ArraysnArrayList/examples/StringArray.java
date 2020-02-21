package com.ArraysnArrayList.examples;

import java.util.List;

public class StringArray {
	String temp = "";
	String[] day = {"Monday", "Tuesday", "Wednesday"};
	void view() {
		
	for(String s : day) {
		if(s.length() > temp.length()) {
			temp = s;
		}
	}
	System.out.println(temp);
	}
	
	void reverse() {
		for(int i = day.length-1; i >= 0; i--) {
			System.out.println(day[i]);
		}
	}
	/*
	 * Try Writing in Functional Programming with the help of streams and lambda expressions
	 */
//	int reverseLambda() {
//		List list = list.stream().map(y -> day.length).forEach(z -> System.out.println(z)); 
//		
//	}
//	Integer in = new Integer("6");
}
