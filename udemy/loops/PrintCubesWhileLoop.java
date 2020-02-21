package com.udemy.loops;

public class PrintCubesWhileLoop {
	int num;
	int limit;
	int cube_num=1;
	void cubesWhileLoop() {
		
		while(num * num * num< limit) {
			
			System.out.println(num * num * num);
			num++;
		}

	}
}
