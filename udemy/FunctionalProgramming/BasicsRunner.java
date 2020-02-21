package com.udemy.FunctionalProgramming;

import java.util.List;

public class BasicsRunner {

	public static void main(String[] args) {
		List<Integer> collect = List.of(2,4,34,23,54,23,10);
		System.out.println(collect);
		typicalMethod(collect);
		fpMethod(collect);
		
	}

	private static void typicalMethod(List<Integer> collect) {
		for(int i : collect) {
			if(i % 2 == 0) {
				
				System.out.println(i);
			}
		}
	}
	
	private static void fpMethod(List<Integer> collect) {
		collect.stream().filter(number -> number % 2 == 0)
						.forEach(number -> System.out.println("element"+" - "+number));
	}
}
