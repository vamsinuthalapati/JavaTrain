package com.udemy.examples;

public class MotorBikeRunner {

	public static void main(String[] args) {
		MotorBike ktm = new MotorBike(50);
		MotorBike re =new MotorBike(35);
		MotorBike defaultt = new MotorBike();
		
		ktm.setName("ktm 390");
		re.setName("Royal Enfield Himalayan");
		
//		ktm.setSpeed(-180);
//		ktm.setSpeed(120);
//		re.setSpeed(100);
		
		ktm.increaseSpeed(55);
		re.decreaseSpeed(25);
		re.increaseSpeed(45);
//		ktm.start();
//		re.start();
		System.out.println(ktm.getName()+" is "+ktm.getSpeed());
		System.out.println(re.getName()+" is "+re.getSpeed());
		System.out.println(defaultt.getSpeed());
	}

}
