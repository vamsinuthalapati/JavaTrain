package com.udemy.examples;

public class MotorBike {
	
	private int speed;
	private String name;
	
	MotorBike(){
		this(5);
	}
	
	MotorBike(int speed){
		this.speed = speed;
		System.out.println(this.speed);
	}
	
	//setters and getters
	public void setSpeed(int speed) {
		if(speed > 0)
			this.speed = speed;
		else
			System.out.println("Invalid input, Speed should be greater than 0");
	}
	public void setName(String name) {
		
		this.name = name;
	}
	public int getSpeed() {
		return speed;
	}
	public String getName() {
		return name;
	}
	
	//other methods
	public void increaseSpeed(int speed) {
		this.speed += speed;
	}
	public void decreaseSpeed(int howMuch) {
		
			setSpeed(this.speed -= howMuch);
	}
}
