package com.codechef.practice;


import java.util.Scanner;

public class SumFirstLastNo{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int sum = 0;
        while(t > 0){
          int number = scanner.nextInt();
          int[] tab = String.valueOf(number).chars().map(Character :: getNumericValue)
          						.toArray();
          
              sum = tab[0] + tab[(tab.length)-1];
             System.out.println(sum);
          t--;
        }
        scanner.close();
    }
}