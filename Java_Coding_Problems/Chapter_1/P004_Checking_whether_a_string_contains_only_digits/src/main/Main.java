package main;

/**
* Problem Statement:
* Write a program that checks whether the given string contains only digits
*/
public class Main {

	public static void main(String[] args) {
		
		System.out.println(isDigitOnly("apples"));
		System.out.println(isDigitOnly("aio1"));
	}
	
	public static boolean isDigitOnly(String text) {
		
		for (char letter: text.toCharArray()) {
			if (Character.isDigit(letter)) {
				return true;
			}
		}
		
		return false;
	}
}
