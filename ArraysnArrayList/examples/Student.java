package com.ArraysnArrayList.examples;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;

public class Student {
	private String name;
	private int[] marks;

	int max;
	int temp;
	int min;
	
	Student(String name, int... marks){
		this.name = name;
		this.marks = marks;
	}
	
	public int getNumberOfMarks() {
		return marks.length;
	}
	public int getSumOfMarks() {
		int sum = 0;
		for(int i : marks) {
			sum += i;
		}
		return sum;
	}
	public int getMaximumMarks() {
		Arrays.parallelSort(marks);
		int num = marks.length;
		max = marks[num-1];
		return max;
	}
	public int getMinimumMarks() {
		Arrays.parallelSort(marks);
		min = marks[0];
		return min;
	}
	public BigDecimal getAverageMarks() {
		return new BigDecimal(getSumOfMarks()).divide (new BigDecimal( getNumberOfMarks()),3,RoundingMode.UP);
	}
	
}
