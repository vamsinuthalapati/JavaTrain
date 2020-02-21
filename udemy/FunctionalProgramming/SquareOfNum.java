package com.udemy.FunctionalProgramming;

//import java.util.List;
import java.util.stream.IntStream;

public class SquareOfNum {

	public static void main(String[] args) {
////		List<Integer> list = List.of(1,2,3,4,5,6,7,8,9,10);
//		squaresOfNum(list);
		 IntStream.range(1,11).map(x -> x * x).forEach(x -> System.out.print(x+" "));

	}

//	private static void squaresOfNum(List<Integer> list) {
//		// list.stream().map(x -> x * x).forEach(x -> System.out.print(x+" "));
//		 IntStream.range(1,10).map(x -> x * x).forEach(x -> System.out.println(x+" "));
//	}
	
}
