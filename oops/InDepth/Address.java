package com.oops.InDepth;

public class Address {
	
	private String line1;
	private int pincode;
	private String state;
	
	//constructor
	public Address(String line1, String state, int pincode) {
		super();
		this.line1 = line1;
		this.pincode = pincode;
		this.state = state;
	}
	public String toString() {
		return line1 + " " + state + " " + pincode;
 	}
}
