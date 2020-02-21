package com.udemy.Cocurrency;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicEvenCounter {
	private AtomicInteger atomicInt = new AtomicInteger();
	
	public void increment() {
		atomicInt.incrementAndGet();
	}
	public AtomicInteger getAtomicInt() {
		return atomicInt;
	}
	
}
