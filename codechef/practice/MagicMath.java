package com.codechef.practice;



import java.util.Scanner;
import java.util.Arrays;
public class MagicMath {
    public static void main(String args[] ) throws Exception {
       
        Scanner scanner = new Scanner(System.in);
//        List<Integer> list = new ArrayList<>();
      
        int sum = 0;
        int n = scanner.nextInt();
        int arry[] = new int[n];
        int[] list = new int[n];
        for(int i=0; i<n; i++){
             arry[i] = scanner.nextInt();
             sum += arry[i];
             {
            	 for(int j=0; j<n; j++){
                     
                     if(sum % 7 == 0){
                         sum -= arry[j];
                         if(sum % 7 == 0){
                             list[j] = arry[j];
                             Arrays.sort(list);
                             if(list[j] == arry[j]){
                                 System.out.println(j);
                             }
                             break;
                         }
                         else
                             System.out.println("-1");
                             break;
                     }
                     else{
                     	if(sum % 7 == 0){
                             sum -= arry[j];
                             if(sum % 7 == 0){
                                 list[j] = arry[j];
                                 Arrays.sort(list);
                                 if(list[j] == arry[j]){
                                     System.out.println(j);
                                 }
                             }
                     	}
                     }
                 }
             
             }
             
        }
        
        
        scanner.close();
    }
}

