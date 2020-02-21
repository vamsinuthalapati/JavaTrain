package com.collections.practise;

import java.util.*;


public class Listt {
	static
	{
		System.out.println("Static block?");
		
	}
	
	public static void main(String[] args) {
		List<Integer> intList = new ArrayList<>();
		List<String> linkedList = new LinkedList<>();
		String[] carNames = {"Tesla", "Audi", "Mercedes"};
		
		linkedList.add("vamsi");
		System.out.println(linkedList);
		//booList.add( true);
		intList=Arrays.asList(5,3,6,32,72,1,-4,2,0);
		linkedList = Arrays.asList(carNames);
		System.out.println(intList+" "+linkedList);
		
		//Anonymus class or Inner class
		{
			System.out.println("Inner class or Anonymus class");
			List<Integer> listl = new Vector<>();
			listl.add(45);
			System.out.println(listl);
		}

	}
}
