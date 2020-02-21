package com.udemy.examples;

public class CharacterDatatype {
	private char ch;
	
	public char getCh() {
		return ch;
	}
	public void setCh(char ch) {
		this.ch = ch;
	}
	
	void checkForVowels() {
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
				|| ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
			System.out.println(ch+" is a Vowel");
		}
		else if(ch >= 97 || ch <= 122 || ch >= 65 || ch <= 90)
			System.out.println(ch+" is a Consonent");
		else
			System.out.println(ch+" is not a Vowel or Consonent");
	}
	void checkForNumbers() {
		if(ch >= 48 || ch <= 57) {
			System.out.println(ch+" is a Number");
		}
		else
			System.out.println(ch+" is not a Number");
	}
	void checkForSpecialChar() {
		if(ch >= 33 || ch <= 47) {
			System.out.println(ch+" is a Special Character");
		}
		else
			System.out.println(ch+" is not a Special Character");
	}
}
