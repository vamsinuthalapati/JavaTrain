package com.udemy.FunctionalProgramming;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

class Lambdas implements Consumer<Object>{

	@Override
	public void accept(Object t) {
		System.out.println(t);
	}
	
}

class MapBehind implements Function<Integer, Integer>{

	@Override
	public Integer apply(Integer t) {
		// TODO Auto-generated method stub
		
		return t*t;
	}
	
}

public class EvenNumberPredicate {
	public static void main(String[] args) {
		List.of(23,44,65,68,12,32).stream()
							.filter(num -> num % 2 ==0)
							.map(new MapBehind())
							.forEach(new Lambdas());
		
		
		//void forEach(Consumer<? super T> action);
//		 void accept(T t);
		
		//Function<? super T, ? extends R> mapper
		//R apply(T t);
	}
}
