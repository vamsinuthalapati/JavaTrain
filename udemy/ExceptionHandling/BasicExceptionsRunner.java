package com.udemy.ExceptionHandling;

import java.util.InputMismatchException;

public class BasicExceptionsRunner {
	int a = 0, b = 10;
	
		void div() {
		try {
			int c = b / a;
			System.out.println(c);
		}
		catch(NullPointerException ne) {
			System.out.println("NullPointer exception");
		}
		catch(InputMismatchException ioe) {
			
		}
		catch(Exception e) {
			System.out.println("Generic exception");
		}
		}
	public static void main(String[] args) {
		
		BasicExceptionsRunner exception = new BasicExceptionsRunner();
		exception.div();
		
	}

}
