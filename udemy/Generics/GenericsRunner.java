package com.udemy.Generics;

import java.util.ArrayList;
import java.util.List;



public class GenericsRunner {
	
	//static variable
	static <S extends Object> S sample(S value){
		return value;
		
	}
	
	//static methods
	static float addition(List <? extends Number> collect) {
		float adds = 0.0f;
		for(Number number : collect) { 
			adds += number.floatValue();	
		}
		return adds;
	}
	static double multiplication(List <? extends Number> collectMul) {
		double multiple = 1.0;
		for(Number number : collectMul) {
			multiple *= number.doubleValue();
		}
		return multiple;
	}
	static void div(List <? super Number> collectdiv) {
		collectdiv.add(21);
		collectdiv.add(22.0f);
		collectdiv.add(21.0);
		System.out.println(collectdiv);
		
	}
	public static void main(String[] args) {
//		MyCustomList<String> customList = new MyCustomList<>();
//		
//		customList.addElement("vamsi");
//		customList.addElement("Krishna");
//		String value = customList.get(0);
//		System.out.println(customList +" "+ value);
		
		String name = sample(new String("vamsi"));
		Integer num = sample(Integer.valueOf(1));
		List<Boolean> list = sample(new ArrayList<>());
		System.out.println(name+" "+num+" "+list);
		
		MyCustomList<Integer> customList2 = new MyCustomList<>();
		customList2.addElement(Integer.valueOf(20));
		customList2.addElement(Integer.valueOf(50));
		Integer number = customList2.get(1);
		System.out.println(customList2 +" "+ number);
		
		List<Byte> bytee = new ArrayList<>();
		System.out.println(bytee);
		System.out.println(addition(List.of(1,2,3,4)));
		System.out.println(addition(List.of(1.0f,2.0f,3.0f,4.0f)));
		System.out.println(addition(List.of(1.0,2.0,3.0,4.0)));
		System.out.println(addition(List.of(1l,2l,3l,4l)));

		System.out.println(multiplication(List.of(1,2,3,4)));
		System.out.println(multiplication(List.of(1.0f,2.0f,3.0f,4.0f)));
		System.out.println(multiplication(List.of(1.0,2.0,3.0,4.0)));
		System.out.println(multiplication(List.of(1l,2l,3l,4l)));
		
		List<Number> collectInt = new ArrayList<>();
		div(collectInt);
		
		collectInt.stream().forEach(f -> System.out.println(f+" "));
	}
}
