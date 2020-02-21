package com.oops.InDepth;

public class GtaGame implements GamingConsole{

	@Override
	public void up() {
		// TODO Auto-generated method stub
		System.out.println("walk forword");
	}

	@Override
	public void down() {
		// TODO Auto-generated method stub
		System.out.println("walk backward");
	}

	@Override
	public void right() {
		// TODO Auto-generated method stub
		System.out.println("walk right side");
	}

	@Override
	public void left() {
		// TODO Auto-generated method stub
		System.out.println("walk left side");
	}
	@Override
	public void settings() {
		System.out.println("gta game settings");
	}

}
