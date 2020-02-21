package com.practise.oops.InDepth;

public class Address {
	private String country;
	private String state;
	private String city;
	private String pincode;
	
	
	
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	
	//constructor
	public Address(String country, String state, String city, String pincode) {
		super();
		this.country = country;
		this.state = state;
		this.city = city;
		this.pincode = pincode;
	}
	public String toString() {
		return country+" "+state+" "+city+" "+pincode;
	}
	
}
