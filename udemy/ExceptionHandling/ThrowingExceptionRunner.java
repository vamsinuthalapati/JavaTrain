package com.udemy.ExceptionHandling;

class Amount{
	String currency;
	int howMuch;
	
	Amount(String currency, int howMuch){
		this.currency = currency;
		this.howMuch = howMuch;
	}
	public void add(Amount a) {
		if(this.currency.equals(a.currency)) {
			System.out.println(this.howMuch + a.howMuch);
		}
		else {
			throw  new RuntimeException(this.currency+" and "
					+ ""+a.currency+" are Different currencies");
		}
	}
}

public class ThrowingExceptionRunner {

	public static void main(String[] args) {
		Amount amount1 = new Amount("usd", 1000);
		Amount amount2 = new Amount("rupees", 2000);
		
		amount1.add(amount2);
	}

}
