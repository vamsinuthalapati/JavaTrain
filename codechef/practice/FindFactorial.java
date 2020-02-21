package com.codechef.practice;


import java.util.Scanner;

public class FindFactorial{
    public static void main(String[] args){
      Scanner scanner = new Scanner(System.in);
      int testCase = scanner.nextInt();
      
      while(testCase > 0){
        int num = scanner.nextInt();
        long fact = 1;
        for(int i=1; i<=num; i++){
         fact *= i;
        }
        System.out.println(fact);
        
        testCase--;
      }
      scanner.close();
    }


}