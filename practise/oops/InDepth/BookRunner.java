package com.practise.oops.InDepth;

public class BookRunner {

	public static void main(String[] args) {
		Reviews reviews = new Reviews("vamsi");
		Book book = new Book("Lambdas and Streams", "Venkata Subramaniyam");
		reviews.addReview("great book");
		reviews.addReview("9.8/10");
		reviews.addReview("5/5");
		
		System.out.print(book);
		System.out.print(reviews);
	}

}
