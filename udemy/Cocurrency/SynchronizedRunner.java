package com.udemy.Cocurrency;

import java.util.concurrent.atomic.AtomicInteger;
//import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SynchronizedRunner {
	private int i;
	private int j;
	private AtomicInteger atomic = new AtomicInteger(0); 
	/*
	 *  Atomic classes are used for avoiding mutable integer variables
	 *  When we are using a counter for some program then we can use AtomicInteger...
	 *  - Atomic classes are thread safe and we don't have to mention synchronized...
	 *  - keyword. There are in-built methods for incrementing or decrementing variables
	 */


	Lock lockI = new ReentrantLock();
	Lock lockJ = new ReentrantLock();
	 public void incrementI() {
		lockI.lock();
		i++;
		lockI.unlock();
		
	}
	 public int getI() {
		 return i;
	 }
	 public void incrementJ() {
		lockJ.lock();
		j++;
		lockJ.unlock();
		
	}
	public int getJ() {
		return j;
	}
	public AtomicInteger getAtomic() {
		return atomic;
	}
	public void setAtomic() {
		atomic.incrementAndGet();
	}
	
	
	
	//Exploring Atomic classes
	///private AtomicInteger ai = new AtomicInteger();
	public static void main(String[] args) {
		
		SynchronizedRunner runner = new SynchronizedRunner();
		 runner.incrementI();
		 runner.incrementJ();
		 runner.setAtomic();
		System.out.println(runner.getI()+" "+runner.getJ()+" "+runner.getAtomic());
	}

}
