package com.codechef.practice;



import java.util.*;


class Codechef2
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scanner = new Scanner(System.in);
		double x = scanner.nextDouble();
		double y = scanner.nextDouble();
		
		if(x < y){
			if(x % 5 == 0) {
				x += 0.5;
				y -= x;
				System.out.println(y);
			}
			else
				System.out.println(y);
		}
		else {
			scanner.close();
		    System.out.println(y);
		}
	}
}
