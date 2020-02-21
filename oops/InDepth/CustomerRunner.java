package com.oops.InDepth;

public class CustomerRunner {

	public static void main(String[] args) {
		
		Address home_address = new Address("line1", "Telangana", 500021 );
		Customer customer = new Customer("vamsi", home_address);

		Address work_address = new Address("line2", "Telangana", 500022);
		customer.setWork_address(work_address);
		
		System.out.println(customer.toString());
	}

}
