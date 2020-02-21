package com.Searching.Algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchRunner {

	public int logic(int[] list, int find, int l, int n) {
		int element = find;
		if(n >= l) {
			int index = n / 2;
			if(list[index] == element) {
				return index;
			}
			else if(list[index] > element)
				return logic(list, find, l, n-1);
			else if(list[index] < element)
				return logic(list, find, l, n+1);
		}
		return -1;
		
	}
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	BinarySearchRunner bsr = new BinarySearchRunner();
	int[] arry = {43, 54, 23, 1, 24, 66, 100};
	for(int numbers : arry) {
		System.out.print(numbers+" ");
	}
	System.out.println("\nenter the number to be searched");
	Arrays.sort(arry);
	int length = arry.length;
	int find = scanner.nextInt();
	int found = bsr.logic(arry, find, 0, length-1);
	if(found == -1) {
		System.out.println("There is no such element");
	}
	else
		System.out.println("The element is at position "+(found+1));
	scanner.close();
	}
	
}
