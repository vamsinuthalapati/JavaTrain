package com.oops.InDepth;

public class HotelStaff extends HotelManager{

	@Override
	public void cook() {
		System.out.println("The dish is preaped");
	}

	@Override
	public void serve() {
		// TODO Auto-generated method stub
		System.out.println("The dish is served");
	}

	@Override
	public void cleanDishes() {
		// TODO Auto-generated method stub
		System.out.println("The plates are getting cleaned");
	}

}
