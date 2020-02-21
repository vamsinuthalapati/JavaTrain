package com.Searching.Algorithm;

import java.util.Scanner;

public class FibonacciSearchRunner {
	static int fib1 = 0;
	static int fib2 = 1;
	
	public void increment() {
		
		
		
	}
	public int search(int[] list, int element, int size) {
		for(int i=0; i<size; i++) {
//			if(list[fib1] != element) {
//				if(list[fib2] != element) {
//					increment();
//				}
//				else
//					return fib2;
//			
//			}
//			else if(list[fib1] == element)
//				return fib1;
//			else
//				return -1;
			if(list[fib1] == element) {
				return fib1;
			}
			else if(list[fib2] == element) {
				return fib2;
			}
			else
				if(i < size-1) {
					increment();
				}
				else
					break;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		FibonacciSearchRunner fibonacci = new FibonacciSearchRunner();
		Scanner scanner = new Scanner(System.in);
		int[] arry = {2,7,54,23,99,100,101,333,22,111,53,1,0};
		for(int num : arry) {
			System.out.print(num+" ");
		}
		System.out.println("\nenter any number in the list");
		int find = scanner.nextInt();
		int length = arry.length;
		int found = fibonacci.search(arry, find, length);
		
		if(found == -1) {
			System.out.println("There is no such number");
		}
		else
			System.out.println(find+" is at "+(found+1)+" position");
		scanner.close();
	}

}
