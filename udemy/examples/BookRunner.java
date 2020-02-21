package com.udemy.examples;

public class BookRunner {

	public static void main(String[] args) {
		//creating Instances
		Book java = new Book(100);
		Book ds = new Book(75);
		Book algo = new Book(50);
		Book defaultt = new Book();
		
		System.out.println(defaultt.getNoOfPages());
		//setting data
		java.setName("Oracle");
		ds.setName("GeekforGeeks");
		algo.setName("AlgoExpert");
		
		//setting data
//		java.setNoOfPages(-23);
//		java.setNoOfPages(220);
//		ds.setNoOfPages(240);
//		algo.setNoOfPages(330);
		
//		calling a method
//		java.disp();
//		ds.disp();
//		algo.disp();
		
		java.increaseNoOfPages(55);
		algo.decreaseNoOfPages(30);
		java.decreaseNoOfPages(275);
		java.increaseNoOfPages(55);
		
		System.out.println(java.getName()+" "+ds.getName()+" "+algo.getName());
		System.out.println(java.getNoOfPages()+" "+ds.getNoOfPages()+" "+algo.getNoOfPages());
	}

}
