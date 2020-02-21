package com.codechef.practice;

/* package codechef; // don't place package name! */

import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
public class AddDigitsByChef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scanner = new Scanner(System.in);
		
		int testCases = scanner.nextInt();
		while(testCases > 0 ) {
		    int number = scanner.nextInt();
		    int[] intTab = 
		    		String.valueOf(number).chars()
		    				.map(Character::getNumericValue).toArray();
            
            int sum = 0;
            for(int i = 0; i < intTab.length; i++){
                sum += intTab[i];
            }
            System.out.println(sum);
		    
		    testCases--;
		}
		scanner.close();
	}
}
