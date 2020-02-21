package com.udemy.collections;

import java.util.HashMap;
import java.util.Map;

public class Mapp {
	public static void main(String[] args) {
		String string = "this is a string to be tested for.";
		
		Map<Character, Integer> map = new HashMap<>();
		char[] occarence = string.toCharArray();
		
		for(char occarences : occarence) { 
			Integer integer = map.get(occarence);
			if(integer == null) {
				
			}
		}
	}
}
