package com.oops.InDepth;

public class FanRunner {

	public static void main(String[] args) {
		Fan fan = new Fan("Manufacturer 1", 0.34f, "black");
		fan.switchOn();
		System.out.println(fan.toString());
		fan.switchOff();
		System.out.println(fan.toString());
	}

}
