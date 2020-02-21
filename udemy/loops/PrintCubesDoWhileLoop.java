package com.udemy.loops;

import java.util.Scanner;

public class PrintCubesDoWhileLoop {
	int num;
	int limit;
	Scanner scan = new Scanner(System.in);
	
	
	void input() {
		System.out.println("enter a number");
		num = scan.nextInt();
		System.out.println("enter the limit");
		limit = scan.nextInt();
	}
	
	void doWhileLoop() {
		input();
		do {
			System.out.println(num * num * num);
		}
		while(num * num * num < limit);
		System.out.println("Thank you! Have fun!");
	}
	
	void whileLoop() {
		input();
		while(num * num * num < limit) {
			System.out.println(num * num * num);
			num++;
		}
	}
	
	
}
