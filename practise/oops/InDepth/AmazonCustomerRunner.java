package com.practise.oops.InDepth;

public class AmazonCustomerRunner {

	public static void main(String[] args) {
		Address homeAddress = new Address("India", "AndhrPradesh", "Visakhapatnam", "531001");
		Address address1 = new Address("India","Telangana", "Hyderabad", "530012");
		AmazonCustomer amz_customer = new AmazonCustomer("Vamsi Krishna", homeAddress, address1);
		
		Address changedHomeAddress = new Address("India", "AndhraPradesh", "Vijayawada", "53009");
		amz_customer.changePersonalInfo(changedHomeAddress);
		
		System.out.println(amz_customer);
	}

}
