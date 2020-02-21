package com.udemy.Generics;

public class PrintArray<T> {
	public void array(T arry[]) {
		for(T i: arry) {
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		PrintArray myPrinter = new PrintArray();
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = {"Hello", "World"};
        myPrinter.array(intArray);
        myPrinter.array(stringArray);
		
	}

}
