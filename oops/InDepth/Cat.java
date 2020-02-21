package com.oops.InDepth;

public class Cat extends Animal{

	@Override
	void bark() {
		// TODO Auto-generated method stub
		System.out.println("cat does not bark");
	}
	public static void main(String[] args) {
		Animal animal[] = {new Dog(), new Cat()};
		for(Animal i : animal) {
			i.bark();
		}
	}
}
