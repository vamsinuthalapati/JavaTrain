package com.udemy.examples;

import java.util.Scanner;

public class WeekdayExample {
	private int choice =-1;
	private Scanner scanner;
	void weekday() {
		System.out.println("0: Sunday");
		System.out.println("1: Monday");
		System.out.println("2: Tuesday");
		System.out.println("3: Wednesday");
		System.out.println("4: Thursday");
		System.out.println("5: Friday");
		System.out.println("6: Saturday");
		scanner = new Scanner(System.in);
		System.out.println("Enter your choice");
		choice = scanner.nextInt();
		switchStatement();
	}
	private void switchStatement() {
		switch(choice) {
		case 0: 
		case 6: 
			System.out.println("Not a Weekday");
			break;
		default :
			System.out.println("weekday");
		}
	}
}
