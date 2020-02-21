package com.Searching.Algorithm;

public class LinearSearchRunner {
	static int count = 1;
	public static int search(int list[], int find) {
		int arry_length = list.length;
		for(int i=0; i<arry_length; i++) {
			if(list[i] == find) {
				return find;
			}
			count++;
		}
		return -1;
	}

	
}
