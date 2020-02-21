package com.udemy.Generics;

import java.util.ArrayList;
import java.util.List;

public class MyCustomList<T extends Number> {
	List<T> list = new ArrayList<>();
	
	public void addElement(T element) {
		list.add(element);
	}
	public void removeElement(T element) {
		list.remove(element);
		System.out.println(element.byteValue());
	}
	
	public String toString() {
		return list.toString();
	}
	public T get(int index) {
		
		return list.get(index);
	}
	
	
	
}
