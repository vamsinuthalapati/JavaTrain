package com.codechef.practice;


import java.util.Scanner;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scanner = new Scanner(System.in);
		int num = 0;
		while(true){ 
		    num = scanner.nextInt();
		    if(num != 42)
		        System.out.println(num);
		    else {
		    	scanner.close();
		        break;
		    }
		}
	
	}
}
