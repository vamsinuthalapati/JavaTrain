package com.hackerrank.practise; 
import java.text.DecimalFormat;
public class Solution2 { 

	// Driver Code 
	public static void main(String args[]) 
	{ 
		
		double degrees = 45.0; 

		// convert degrees to radians 
		double radians = Math.toRadians(degrees); 

		// cos() method to get the cosine value 
		double cosValue = Math.cos(radians); 
		DecimalFormat df = new DecimalFormat();
		
		df.setMaximumFractionDigits(2);
		// prints the cosine value 
		//System.out.println("cos(" + degrees + ") = " + cosValue); 
		System.out.println(cosValue);
      	System.out.println(df.format(cosValue));
	} 
} 
