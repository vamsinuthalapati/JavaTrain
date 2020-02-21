package com.practice.controlStatements;

public class Diamond {
	
	public void print(int num) {
		for(int i=1; i<=num; i++) {
			for(int j=i; j<=num; j++) {
					System.out.print(" ");
			}
			for(int k=1; k<=i; k++) {
				System.out.print(k);
			}
			for(int l=1; l<=i; l++) {
				if(i != l) {
					System.out.print(i-l);
				}
			}
			System.out.println();
		}
		for(int m=1; m<=num; m++) {
			for(int n=1; n<=m+1; n++) {
				System.out.print(" ");
			}
			int digit = 1;
			for(int o=m+1; o<num; o++) {
				
				if(( m!=o)) {
					System.out.print(digit++);
				}
			}
			for(int p=num; p>=m; p--) {
				if((m != p)) {
					System.out.print(p-m);
				}
			}
			System.out.println();
		}
	}
	
	
	public static void main(String[] args) {
		
		Diamond diamond = new Diamond();
		diamond.print(7);
	}

}
