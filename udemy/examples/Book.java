package com.udemy.examples;

public class Book {
	//Encapsulation
	private String name;
	private int noOfPages;
	//setters
//	void setName(String name) {
//		this.name = name;
//	}
//	void setNoOfPages(int noOfPages) {
//		this.noOfPages = noOfPages;
//	}
	
	Book(){
//		this.noOfPages = 55;
		this(55);
	}
	Book(int noOfPages){
		this.noOfPages = noOfPages;
		System.out.println(this.noOfPages);
	}
	
	//Eclipse generated setters and getters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNoOfPages() {
		return noOfPages;
	}
	public void setNoOfPages(int noOfPages) {
		if(noOfPages > 0)
			this.noOfPages = noOfPages;
		else
			System.out.println("Invalid input, Number of Pages must be greater than 0");
	}
	
	//other methods
	public void increaseNoOfPages(int howMuch) {
		this.noOfPages += howMuch;
	}
	public void decreaseNoOfPages(int howMuch) {
		if(howMuch < this.noOfPages)
			this.noOfPages -= howMuch;
	}
}
