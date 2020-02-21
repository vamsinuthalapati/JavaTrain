package com.udemy.Cocurrency;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class AtomicEvenCounterRunner {

	public static void main(String[] args) throws IOException {
		AtomicEvenCounter atomic = new AtomicEvenCounter();
		List<Integer> numList = new ArrayList<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		logic(atomic, numList, br);
		System.out.println(atomic.getAtomicInt());
		long numb = br.read();
	}

	private static void logic(AtomicEvenCounter atomic, List<Integer> numList, BufferedReader br) throws IOException {
		int i = 0;
		while(true) {
			numList.add(br.read());
			if(numList.get(i) % 2 != 0) {
				atomic.increment();
			}
			else
				break;
			i++;
		}
		
	}

}
