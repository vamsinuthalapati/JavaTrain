package com.practise.oops.InDepth;

public class AmazonCustomer {
	private String name;
	private Address homeAddress;
	private Address address1;
	
	//setters and getters
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

	public Address getHomeAddress() {
		return homeAddress;
	}
	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}
	public Address getAddress1() {
		return address1;
	}
	public void setAddress1(Address address1) {
		this.address1 = address1;
	}
	
	
	//constructor
	public AmazonCustomer(String name, Address homeAddress, Address address1) {
		super();
		this.name = name;
		this.homeAddress = homeAddress;
		this.address1 = address1;
	}
	public void changePersonalInfo(Address homeAddress) {
		setHomeAddress(homeAddress);
	}
	
	public String toString() {
		return String.format("name - %s, homeAddress - %s, address1 - %s", name,homeAddress,address1);
	}
}
