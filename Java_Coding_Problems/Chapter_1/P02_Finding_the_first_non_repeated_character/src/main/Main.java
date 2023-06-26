package main;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * Problem Statement:
 * Write a program that returns the first non-repeated character from a given string.
 */
public class Main {

	public static void main(String[] args) {
		Character first = findFirstNonRepeating("aabbcceffkkepqwpqowwld123");
		System.out.println(first);
	}

	public static Map<Character, Integer> findDuplicate(String text) {
		Map<Character, Integer> countChars = new LinkedHashMap<>();
		
		for (Character letter: text.toCharArray()) {
			Integer counter = countChars.get(letter);
			if (counter != null) {
				counter++;
				countChars.put(letter, counter);
			}
			else {
				countChars.put(letter, 1);
			}
		}
		
		return countChars;
	}

	public static Character findFirstNonRepeating(String text) {
		
		Map<Character, Integer> map = findDuplicate(text);
		
		for (Entry<Character, Integer> itr: map.entrySet()) {
			if (itr.getValue() == 1) {
				return itr.getKey();
			}
		}
		
		return ' ';
	}
}
