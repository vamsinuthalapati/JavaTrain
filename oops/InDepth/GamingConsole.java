package com.oops.InDepth;

public interface GamingConsole {
	public void up();
	public void down();
	public void right();
	public void left();
	default void settings() {
		System.out.println("game settings");
	}
}
