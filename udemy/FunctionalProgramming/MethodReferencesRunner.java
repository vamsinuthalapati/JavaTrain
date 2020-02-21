package com.udemy.FunctionalProgramming;

import java.util.List;
import java.util.function.Predicate;

public class MethodReferencesRunner {

	public static Integer mapMul(Integer num) {
		return num * num;
	}
	public static boolean filterDiv(Integer num) {
		return num % 2 ==0;
	}
	
	
	public static void main(String[] args) {
		
		
		System.out.println("1. storing functions in variables"
				+ " 2. passing functions to methods"
				+ " 3. returning functions from methods");
		Predicate<? super Integer> evenPredicate = extractEvenPredicate();
		List.of(23,44,65,68,12,32).stream()
				.filter(evenPredicate)
				.map(num -> num * num)
				.forEach(num -> System.out.println(num));
		
		System.out.println("printing the same output using method references");
		List.of(23,44,65,68,12,32).stream()
				.filter(MethodReferencesRunner :: filterDiv)
				.map(MethodReferencesRunner :: mapMul)
				.forEach(System.out :: println);
		
		
		List.of("red dead", "redemption", "scarface").stream()
				.map(str -> str.length())
				.forEach(str -> System.out.println(str));
		
		System.out.println("using method references");
		List.of("red dead", "redemption", "scarface").stream()
				.map(String :: toUpperCase)
				.forEach(System.out :: println);
	}
	private static Predicate<? super Integer> extractEvenPredicate() {
		return num -> num % 2 ==0;
	}
	

}
