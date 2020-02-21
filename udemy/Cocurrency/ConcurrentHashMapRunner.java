package com.udemy.Cocurrency;

import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.atomic.LongAdder;

public class ConcurrentHashMapRunner {

	public static void main(String[] args) {
		Map<Character, LongAdder> map = new Hashtable<>();
		
//		ConcurrentHashMap<Character, LongAdder> concurrentMap 
//													= new ConcurrentHashMap<>();
		String str = "vamsi krishna";
		for(char character : str.toCharArray()) {
			LongAdder longAdder = map.get(character);
			if(longAdder == null  ) {
				longAdder = new LongAdder();
			}
			longAdder.increment();
			map.put(character, longAdder);
		}
		System.out.println(map );
		
		
	}

}
