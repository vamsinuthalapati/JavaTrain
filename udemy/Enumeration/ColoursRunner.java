package com.udemy.Enumeration;

import java.util.Arrays;
interface PaintShop{
	public void asianPaints();
	public void nipponPaints();
}
enum Colour implements PaintShop{
	WHITE(1), BLACK(9), RED(3), YELLOW(4), GREEN(5), BLUE(6);
	
	private int value;
	private Colour(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	@Override
	public void asianPaints() {
		System.out.println(WHITE+", "+BLUE+" ARE ONLY COLOURS AVAILABLE IN ASIAN PAINTS");
		
	}

	@Override
	public void nipponPaints() {
		System.out.println(WHITE+", "+RED+", "+YELLOW+" ARE AVAILABLE IN NIPPON PAINTS");
		
	}
}
public class ColoursRunner {

	public static void main(String[] args) {
		
		Colour colour = Colour.BLACK;
		
		System.out.println(colour);
		System.out.println(colour.BLUE.ordinal());
		System.out.println(colour.BLACK.getValue());
		System.out.println(colour.BLUE.values());
		System.out.println(colour.valueOf("BLUE"));
		System.out.println(Arrays.toString(colour.values()));
		colour.asianPaints();
		colour.nipponPaints();
	}

}
