package com.codechef.practice;

import java.util.Scanner;
import java.util.Arrays;

public class SecondLarge{
  public static void main(String[] args) throws Exception{
  try{
    Scanner scanner = new Scanner(System.in);
    int testcase = scanner.nextInt();
    
    while(testcase >= 0){
      int[] arry = new int[testcase];
      for(int i=0; i<testcase; i++) {
    	  arry[i] = scanner.nextInt();
      }
      //change the logic here
      System.out.println();
      Arrays.sort(arry);//
      for(int j=0; j<testcase; j++) {
    	  System.out.print(arry[j]+" ");
      }
      
      System.out.println();
     testcase--;
    }
    scanner.close();
   }
  
   catch(Exception e){
   }
  
  }

}