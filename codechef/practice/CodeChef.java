package com.codechef.practice;

import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
public class CodeChef
{
	List<Integer> list =  new ArrayList<>();
    List<Integer> list2 =  new ArrayList<>();
    List<Integer> list3 =  new ArrayList<>();
    public void logic(){
       // String name = "";
        
		Scanner scanner = new Scanner(System.in);
		int testcase = scanner.nextInt();
		for(int i = 0; i < testcase; i++) {
			int number = scanner.nextInt();
			for(int j = 0; j < number; j++) {
				list.add(scanner.nextInt());
				iterate(list);
			}
		}
		scanner.close();
    }
    public void iterate(List<Integer> arry) {
    	for(int a = 0; a < arry.size()-1; a++) {
    		if((arry.get(a))+1 == (arry.get(a+1))) {
    			list2.add(arry.get(a));
    			
    		}
    		else if(!((arry.get(a))+1 == (arry.get(a+1)))){
    			list3.add(arry.get(a));
    		}
    		
    	}
    	//arry.stream().filter(value -> )
    }
    public void view() {
    	System.out.print(list2);
		System.out.print(list2.get(0)+"..."+list2.get((list2.size()-1)));
		System.out.println();
		for(Integer num : list3) {
			System.out.print(num+" ");
		}
		Long total = list.stream().mapToLong(num -> num).sum();
		System.out.println(total);
	}
    
    
	
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		CodeChef codechef = new CodeChef();
		codechef.logic();
		codechef.view();
	}
}