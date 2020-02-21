package com.hackerrank.practise;

import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class TrigonometricCal {
	static double sinRadians, cosRadians, sinValue, cosValue, distance;
	static int increment = 1;
    private static List<Integer> list = new ArrayList<>();
    public static void logic(int testCase){
    	DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);
        for(int i=0; i<testCase; i++){
            for(int j=increment; j<testCase; j++){
            	System.out.println("logic started");
                int a = list.get(i);
                int b = list.get(j);
                int sum = a+b;
                int diff = a - b;
                 sinRadians = Math.toRadians(sum);
                 cosRadians = Math.toRadians(diff);
                 sinValue = Math.sin(sinRadians);
                 cosValue = Math.cos(cosRadians);
                 distance += sinValue * cosValue;
                 increment++;
                
            }
        }
//        return distance;
        System.out.println(df.format(distance));
        
    }
    public static void main(String args[] ) throws Exception {
       
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number of testcases");
        int testCase = scanner.nextInt();
        TrigonometricCal cal = new TrigonometricCal();
        list.add(5); list.add(2); list.add(7);
        TrigonometricCal.logic(testCase);
//        while(testCase > 0){
//        	System.out.println("enter a number");
//            list.add(scanner.nextInt());
////            if(testCase == 2) {
////            TrigonometricCal.logic(testCase);
////            }
//            testCase--;
//        }
        
        System.out.println("printing started"+list);
       
        scanner.close();
    }
}
