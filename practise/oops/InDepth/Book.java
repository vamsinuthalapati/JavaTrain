package com.practise.oops.InDepth;

public class Book {
	private String bookName;
	private String bookAuthor;
	
	
	public Book(String bookName, String bookAuthor) {
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
	}
	
	public String toString() {
		return bookName+" "+bookAuthor;
	}
}
