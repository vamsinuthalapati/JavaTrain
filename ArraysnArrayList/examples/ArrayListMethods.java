package com.ArraysnArrayList.examples;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ArrayListMethods {
	void collection() {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6);
		System.out.println("squares of array list");
		list.stream().map(x -> x * x).forEach(y -> System.out.print(" "+y));
		System.out.println();
		System.out.println("squares of even array list");
		list.stream().filter(x -> x%2==0).map(y -> y * 2).forEach(z -> System.out.print(" "+z));
		
		List<Integer> numbers = list.stream().collect(Collectors.toList());
		System.out.println();
		System.out.println("the bellow numbers are from Collector.toList()");
		System.out.println(numbers);
		
		Set<Integer> num = list.stream().map(m -> m * 3).collect(Collectors.toSet());
		System.out.println("the below set is from Collectors.toSet()");
		System.out.println(num);
		
		BigDecimal bd = new BigDecimal(0);
		BigDecimal bd2 = BigDecimal.ZERO;
		System.out.println(bd2);
	}
}
