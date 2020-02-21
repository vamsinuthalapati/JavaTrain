package com.udemy.examples;

public class BiNumber {
	
	private int num_1; 
	private int num_2;
	
	public int getNum_1() {
		return num_1;
	}
	public void setNum_1(int num_1) {
		this.num_1 = num_1;
	}
	public int getNum_2() {
		return num_2;
	}
	public void setNum_2(int num_2) {
		this.num_2 = num_2;
	}
	
	
	public int add(int a, int b) {
		return a + b;
	}
	public int mul(int x, int y) {
		return x * y;
	}
	public void doublee(int p, int q) {
		int getNum_1 = 2 * p;
		int getNum_2 = 2 * q;
		
		setNum_1(getNum_1);
		setNum_2(getNum_2);
	}
	
}
