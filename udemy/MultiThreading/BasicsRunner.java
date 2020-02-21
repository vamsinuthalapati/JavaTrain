package com.udemy.MultiThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class ThreadRunner extends Thread{
	@Override
	public void run() {
		System.out.println("task 1 started");
		for(int i=100; i<=199; i++) {
			System.out.print(i + " ");}
		System.out.println("\n task 1 Completed");
		
	}
}
class  ThreadRunnable implements Runnable{

	@Override
	public  void run() {
		// TODO Auto-generated method stub
		System.out.println();
		System.out.println("task 2 started");
		for(int j=200; j<=299; j++) {
			System.out.print(j + " ");}
		System.out.println("\n task 2 Completed");
		
	}
	
}
class ThreadRunnablee implements Runnable{

	@Override
	public synchronized void run() {
		// TODO Auto-generated method stub
		System.out.println();
		System.out.println("task 3 started");
		for(int k=300; k<=399; k++) {
			System.out.print(k + " ");	}
		System.out.println("\n task 3 Completed");
	
	}
	
}

public class BasicsRunner {
	
	public static void main(String[] args) throws Throwable {
		ThreadRunner threadd = new ThreadRunner();
		
		
		
		ThreadRunnable thread2 = new ThreadRunnable();
		Thread t2 = new Thread(thread2);
		
		
		ThreadRunnablee thread3 = new ThreadRunnablee();
		Thread t3 = new Thread(thread3);
		threadd.start();
		t2.start();
		
//		//threadd.start();
//		//t2.setPriority(7);
//		
//		t2.start();
//		//t3.setPriority(10);
//		//t2.yield();
		t3.start();
		
		ExecutorService executor = Executors.newSingleThreadExecutor() ;
		//executor.execute(new ThreadRunnable());
		executor.execute(new ThreadRunnablee());
		executor.shutdown();
	}

	
}
