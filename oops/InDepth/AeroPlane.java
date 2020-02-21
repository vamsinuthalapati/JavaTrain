package com.oops.InDepth;

public class AeroPlane implements Flyable{

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("Aeroplane fly with fuel");
	}
	public static void main(String[] args) {
		/*
		 * In the below constructor creation we have created two new objects 
		 * AeroPlane() and Bird() using Flyable type flyable
		 */
		Flyable flyable[] = {new AeroPlane(), new Bird()};
		for(Flyable i : flyable) {
			i.fly();
		}
	}
}
