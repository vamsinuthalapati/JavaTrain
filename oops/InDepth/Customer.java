package com.oops.InDepth;

public class Customer {
	private String name;
	private Address home_address;
	private Address work_address;
	
	//setter and getters
	public Address getWork_address() {
		return work_address;
	}
	
	public void setWork_address(Address work_address) {
		this.work_address = work_address;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Address getHome_address() {
		return home_address;
	}
	
	public void setHome_address(Address address) {
		this.home_address = address;
	}
	
	//constructor
	public Customer(String name, Address address) {
		super();
		this.name = name;
		this.home_address = address;
	}
	public String toString() {
		return String.format("name - %s, home_address - %s, work_address - %s", name, home_address, work_address);
	}
	
	
}
