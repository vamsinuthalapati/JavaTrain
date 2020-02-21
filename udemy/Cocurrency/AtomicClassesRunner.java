package com.udemy.Cocurrency;

import java.util.ArrayList;
import java.util.List;

public class AtomicClassesRunner {

	public static void main(String[] args) {
		AtomicClasses atomic = new AtomicClasses();
		List<Integer> list = new ArrayList<>(List.of(1,4,3,21,54,312,5,4,312,3,112,23));

		for(Integer numbers : list) {
			if(numbers % 2 == 0) {
				atomic.increment();
			}
		}
		System.out.println(atomic.getNum()
				+" are the number of even in the given list");
		
	}

}
