package com.practise.oops.InDepth;

public class Employee extends Person{
	private String title;
	private String grade;
	
	public Employee(String name, String title, String grade) {
		super(name);
		this.title = title;
		this.grade = grade;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	public String toString() {
		return super.toString()+" "+title+" "+grade;
	}
}
