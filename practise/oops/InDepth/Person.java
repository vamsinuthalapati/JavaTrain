package com.practise.oops.InDepth;

public class Person {
	
	private String name;
	private String email;
	private String phone;
	private String collegeName;
	private String collegePercentage;
	
	

	public Person(String name) {
		super();
		this.name = name;
	}
	
	//setters and getters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public String getCollegePercentage() {
		return collegePercentage;
	}

	public void setCollegePercentage(String collegePercentage) {
		this.collegePercentage = collegePercentage;
	}
	
	public String toString() {
		return name+" "+email+" "+phone+" "+collegeName+" "+collegePercentage;
	}
	
}
