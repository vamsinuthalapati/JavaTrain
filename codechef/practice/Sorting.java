package com.codechef.practice;

import java.util.Arrays;
import java.util.Scanner;

public class Sorting {
 public static void main(String[] args) throws Exception
 {
	 try {
		 Scanner scanner = new Scanner(System.in);
		    int testcase = scanner.nextInt();
		    int[] arry = new int[testcase];
		    while(testcase > 0){
		     
		      for(int i=0; i<testcase; i++) {
		    	  arry[i] = scanner.nextInt();
		    	  
		          
		      }
		      Arrays.sort(arry);
		      for(int j=0; j<testcase; j++) {
		    	  System.out.println(arry[j]);
		      }
		      testcase--; 
		    }
		    scanner.close(); 
	 }
	 catch(Exception e) {
		 
	 }
    
 }



}