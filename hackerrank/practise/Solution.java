package com.hackerrank.practise;
import java.util.*;

public class Solution {
//	public void input() {
//		
//	}

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner =new Scanner(System.in);

//        String insert = "Insert";
//        String delete = "Delete";
        int n = scanner.nextInt();
        ArrayList<Integer> list = new ArrayList<Integer>();
        
       
        for(int i=0; i<n; i++){
            list.add(scanner.nextInt());
        }
        
        
        System.out.println("enter number of queries");
        int q = scanner.nextInt();
        
        for(int j = 0; j < q; j++) {
//        	String query1 = scanner.nextLine();
//        	String query2 = scanner.nextLine();
//        	int checkIf1 = query1.compareTo(insert);
//        	int checkIf2 = query2.compareTo(delete);
        	System.out.println("enter insert number");
        	int insert = scanner.nextInt();
        	
        	if(insert == 1) {
        		System.out.println("enter index and element");
        		int index = scanner.nextInt();
        		int element = scanner.nextInt();
        		list.add(index, element);
        	}
        	System.out.println("enter delete number");
        	int delete = scanner.nextInt();
        	if(delete == 1) {
        		int remove = scanner.nextInt();
        		list.remove(remove);
        	}
        	
        }
        
        System.out.println(list);

    }
}

