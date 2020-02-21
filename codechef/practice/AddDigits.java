package com.codechef.practice;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddDigits{

private long num =0;
private long remainder=0;
private long cofficient = 0;
private long temp = 0;
private static long sum = 0;
private static List<Long> list = new ArrayList<>();
    public AddDigits(long number){
    	 this.num = number;
    	 logic();
    	 
    }
    
	private void logic() {

		remainder = num % 10;
		temp = num;
		
		for(;;) {
			
			if(temp % 100 > 0) {
				cofficient = temp / 10;
				remainder += cofficient % 10;
				temp = cofficient;
			}
			else if(temp % 10 == 0){
				sum =  remainder;
				list.add(sum);
				break;
			}
		}
		
	}
	
	public static void main(String[] args){
	
		Scanner scanner = new Scanner(System.in);
		//System.out.println("enter number of testcases");
		int testCase = scanner.nextInt();
		for(int i=0; i<testCase; i++){
			//System.out.println("enter any number to add its digits");
			long number = scanner.nextLong();
			AddDigits main = new AddDigits(number);
			
		}
		list.stream().forEach(index -> System.out.println(index));
		scanner.close();
	
	}



}