package com.udemy.MultiThreading;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Task2 implements Callable<String>{

	private String name;

	Task2(String name){
		this.name = name;
	}
	
	@Override
	public String call() throws Exception {
		return "Hello "+name;
	}

}

public class CallableExample {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executor = Executors.newFixedThreadPool(3);
		//Future<String> future = executor.submit(new Task2("vamsi"));
		System.out.println("thread started running");
		
		//String welcomeMessage = future.get();
		//System.out.println(welcomeMessage);
		
		List<Task2> tasks = List.of(new Task2("mercedes"), 
										new Task2("porshe"), 
										new Task2("ferrari"), 
										new Task2("tesla cyberTruck"));
		List<Future<String>> invokeAll = executor.invokeAll(tasks);

		for(Future<String> results : invokeAll) {
			System.out.println(results.get());
		}
		
		System.out.println("main method execution completed");
		executor.shutdown();
		
	}

}
