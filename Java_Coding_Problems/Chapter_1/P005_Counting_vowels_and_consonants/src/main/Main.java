package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Problem Statement: 
 * Write a program that counts the number of vowels and
 * consonants in a given string. Do this for the English language, which has
 * five vowels (a, e, i, o, and u).
 */
public class Main {

	private static final Character[] vowels = new Character[] {'a', 'e', 'i', 'o', 'u'};
	
	public static void main(String[] args) {
		System.out.println(countVowels("aeiou"));
		System.out.println(countVowels("apples"));
		System.out.println(countVowels("mxz"));
	}
	
	public static int countVowels(String text) {
		int counter = 0;
		List<Character> vowelSet = new ArrayList<Character>(Arrays.asList(vowels));
		for (Character letter: text.toCharArray()) {
			if (vowelSet.contains(letter)) {
				counter++;
			}
		}
		
		return counter;
	}
}
