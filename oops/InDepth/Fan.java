package com.oops.InDepth;

public class Fan {
	
	private String name;
	private float radius;
	private String colour;
	private boolean isOn;
	private int speed;
	
	public Fan(String name, float radius, String colour) {
		this.name = name;
		this.colour = colour;
		this.radius = radius;
	}
	public void switchOn() {
		this.isOn = true;
		this.speed = 5;
	}
	public void switchOff() {
		this.isOn = false;
		this.speed = 0;
	}
	public String toString() {
		return String.format("name = %s, radius = %f, colour = %s, isOn = %b, speed = %d", 
				name, radius, colour, isOn, speed);
	}
}
