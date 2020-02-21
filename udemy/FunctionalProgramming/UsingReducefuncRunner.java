package com.udemy.FunctionalProgramming;

import java.util.List;

public class UsingReducefuncRunner {

	public static void main(String[] args) {
		List<Integer> list = List.of(34,98,67,54,76,56,12,13,11);
		normalAddition(list);
		functionalProgAdditon(list);
		
		Integer high = fpHighestMethod();
		System.out.println("highest number is "+high);
	}

	private static Integer fpHighestMethod() {
		return List.of(54,23,56,12,712,2143,12)
					.stream().max((num1, num2) -> 
								 Integer.compare(num1, num2)).get();
	}

	private static Integer functionalProgAdditon(List<Integer> list) {
		return list.stream().filter(numbers -> numbers % 2 ==0)
						.reduce(0, (number1, number2) ->
						{System.out.println((number1 + number2));
							return number1+number2;
						
						}
						);
		//System.out.println("sum of all even numbers in list "+add);
	}

	private static void normalAddition( List<Integer> list) {
		int sum =0;
		for(int i : list) {
			if(i % 2 != 0) {
				sum += i;
			}
		}
		System.out.println("sum of all odd numbers in list "+sum);
	}
	
	

}
