package com.udemy.examples;

import java.util.Scanner;

public class MenuOption {
	int choice;
	int num1, num2;
	Scanner scanner=new Scanner(System.in);

	void menu() {
		System.out.println("Select the below Options");
		System.out.println("1: Add operation");
		System.out.println("2: Subtract operation");
		System.out.println("3: Multiply operation");
		System.out.println("4: Divide operation");
		
		System.out.println("Enter any option in Number format");
		choice = scanner.nextInt();
		System.out.println("Enter two numbers to be formatted as follows");
		num1 = scanner.nextInt();
		num2 = scanner.nextInt();
		//ifElseStatements();
		switchStatements();
	}

//	private void ifElseStatements() {
//		if(choice == 1) {			
//			System.out.println(num1 + num2);
//		}
//		else if(choice == 2) {
//			System.out.println(num1 - num2);
//		}
//		else if(choice == 3) {
//			System.out.println(num1 * num2);
//		}
//		else if(choice == 4) {
//			System.out.println(num1 / num2);
//		}
//		else
//			System.out.println("Invalid Input");
//	}
	
	private void switchStatements() {
		switch(choice) {
			case 1 : System.out.println(num1 + num2);
			break;
			
			case 2 : System.out.println(num1 - num2);
			break;
			
			case 3 : System.out.println(num1 * num2);
			break;
			
			case 4 : System.out.println(num1 / num2);
			break;
			
			default : System.out.println("Invalid input");
		}
	}
	
	
}
