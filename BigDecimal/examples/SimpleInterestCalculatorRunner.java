package com.BigDecimal.examples;

public class SimpleInterestCalculatorRunner {

	public static void main(String[] args) {
		SimpleInterestCalculator totalValue = new SimpleInterestCalculator("65000", "3.2");
		System.out.println(totalValue.CalculateTotalValue(4));
		totalValue.sample();
	}

}	
