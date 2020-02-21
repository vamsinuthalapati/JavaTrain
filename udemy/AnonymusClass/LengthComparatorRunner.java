package com.udemy.AnonymusClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LengthComparatorRunner {


	public static void main(String[] args) {
	
		List<String> list = new ArrayList<>(
		List.of("vamsi", "krishna", "mercedes", "tesla", "ferrari"));
		Collections.sort(list, new Comparator<String>()  {

			@Override
			public int compare(String str1, String str2) {
				
				return Integer.compare(str1.length(), str2.length());
			}
			
		});

		System.out.println(list);
	}

}

//public void add(String names) {
//list.add(names);
//}

//public int compare(String str1, String str2) {
//// TODO Auto-generated method stub
//return Integer.compare(str1.length(), str2.length());
//}
//list.stream().map(names -> names.compareTo(names))
//.forEach(names -> System.out.print(list));
