package com.udemy.Cocurrency;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

public class AtomicClasses {
	// using for counting numbers
	private AtomicInteger num = new AtomicInteger(0);
	
	public int increment() {
		return num.incrementAndGet();
		
	}
	public int decrement() {
		return num.decrementAndGet();
	}
	public AtomicInteger getNum() {
		return num;
	}
	
	AtomicIntegerArray atomicArry = new AtomicIntegerArray(0);
	
}
