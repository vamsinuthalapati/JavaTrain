package com.practise.oops.InDepth;

import java.util.ArrayList;

public class Reviews{

	private String yourName;
	private ArrayList<String> reviewList = new ArrayList<>();
	
	public Reviews(String yourName) {
		
		this.yourName = yourName;
	}
	
	public void addReview(String yourReview) {
		reviewList.add(yourReview);
	}

	public String toString() {
		return" "+yourName+" - "+reviewList;
	}
	
	
}
