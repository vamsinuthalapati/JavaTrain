package com.udemy.collections;

import java.util.Comparator;
//import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

class StringLengthComparator implements Comparator<String>{
	@Override
	public int compare(String value1, String value2) {
		return Integer.compare(value2.length(), value1.length());
	}
}
public class Queuee {
	public static void main(String[] args) {
		Queue<String> queue = new PriorityQueue<>(new StringLengthComparator());
		queue.add("apple");
		queue.add("batmann");
		
		queue.offer("ironman");
		System.out.println(queue.poll());
		System.out.println(queue);
//		Map<String, Integer> map = Map.of("A", 4);
//		System.out.println(map.get("A"));
//		System.out.println(map.values());
	}
}


