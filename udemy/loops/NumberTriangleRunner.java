package com.udemy.loops;

public class NumberTriangleRunner {
	int number;
	void triangle() {
		for(int i = 1; i <= number; i++) {
			for(int j = 1; j<= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		NumberTriangleRunner num = new NumberTriangleRunner();
		num.number = 5;
		num.triangle();
	}

}
