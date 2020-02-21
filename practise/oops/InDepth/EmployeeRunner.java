package com.practise.oops.InDepth;

public class EmployeeRunner {

	public static void main(String[] args) {
		Person employee = new Employee("vamsi krishna", "Developer", "A");
		employee.setEmail("vamsi@gmail.com");
		employee.setPhone("966655439");
		employee.setCollegeName("Gayatri Vidya Parishad College of Engineering");
		employee.setCollegePercentage("64%");
		System.out.println(employee);
	}

}
