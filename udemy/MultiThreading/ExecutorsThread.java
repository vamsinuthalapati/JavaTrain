 package com.udemy.MultiThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task implements Runnable{
	Integer num =1;
	public Task(Integer i) {
		this.num = i;
	}
	public void run() {
		
		System.out.println("\ntask "+num+" started");
		// TODO Auto-generated method stub
		for(int i = 10; i <= num*10 +9; i++) {
			
			System.out.print(i+" ");
		}
		System.out.println("\n task "+num+" completed");
	}

	
}

public class ExecutorsThread {

	public static void main(String[] args) {
		
		ExecutorService executor = Executors.newFixedThreadPool(1);
		executor.execute(new Task(1));
		executor.execute(new Task(2));
		executor.execute(new Task(3));
		executor.shutdown();
	}

}
