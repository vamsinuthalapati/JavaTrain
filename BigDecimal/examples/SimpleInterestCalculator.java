package com.BigDecimal.examples;

import java.math.BigDecimal;

public class SimpleInterestCalculator {
	BigDecimal principal;
	BigDecimal Interest;
	
	SimpleInterestCalculator(String principal, String simpleInterest){
		this.principal = new BigDecimal(principal);
		this.Interest = new BigDecimal(simpleInterest).divide(new BigDecimal(100));
	}
	public BigDecimal CalculateTotalValue(int noOfYears) {
		BigDecimal noOfYearsBigDecimal = new BigDecimal(noOfYears);
		BigDecimal TotalValue = principal.multiply(Interest).multiply(noOfYearsBigDecimal);
		return TotalValue;
	}
	void sample() {
		int i =3; int j = 6;
		if(i == 3 & j == 6) {
			System.out.println("True");
		}
		else
			System.out.println("False");
	}
}
