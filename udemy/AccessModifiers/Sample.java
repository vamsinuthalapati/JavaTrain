package com.udemy.AccessModifiers;

public final class Sample {
	public void publicMethod() {
		
	}
	void defaultMethod() {
		
	}
	protected void protectedMethod() {
		
	}
	private void privateMethod() {
		
	}

	public static void main(String[] args) {
		Sample sample = new Sample();
		sample.publicMethod();
		sample.defaultMethod();
		sample.protectedMethod();
		sample.privateMethod();
		
		
	}

}
