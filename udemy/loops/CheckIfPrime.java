package com.udemy.loops;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CheckIfPrime {
	int number;
	int count;
	boolean isPrime(int num) {
		if(num > 0) {
		this.number = num;
		}
		for(int i = 1; i <= number-1; i++) {
			if(number % i == 0) {
				count++;
			}
		}
		if(count > 2) {
			return true;
		}
		else {
			return false;
		}
		
	}
	void streams() {
		int[] num = new int[5];
		Arrays.fill(num, 100);
		for(int i : num) {
			System.out.println(i);
		}
		int[] num1 = {100,100,100,100,100};
		System.out.println(Arrays.equals(num, num1));
		int[] num3 = {34,54,23,1,4};
		Arrays.parallelSort(num3);
		
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		System.out.println(list);
		
	}
//	void forEach(List listt) {
//		for(int i : listt) {
//			System.out.println(i);
//		}
//	}
}
