package com.ArraysnArrayList.examples;

import java.math.BigDecimal;

public class StudentRunner {

	public static void main(String[] args) {
		int[] marks = {99,95,96};
		Student student = new Student("Vamsi", marks);
		int number = student.getNumberOfMarks();
		int sum = student.getSumOfMarks();
		int max = student.getMaximumMarks();
		int min = student.getMinimumMarks();
		BigDecimal average = student.getAverageMarks();
		System.out.println("the number of marks in the array is "+number);
		System.out.println("the sum of all the numbers in the array is "+sum);
		System.out.println("the maximum number in the array is "+max);
		System.out.println("the minimum number in the array is "+min);
		System.out.println("the average of all the marks in array is "+average);
		
	}

}
