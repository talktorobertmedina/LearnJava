package main;

import java.util.Map;
import java.util.HashMap;

/**
 * Problem Statement:
 * Counting duplicate characters: Write a program that counts duplicate characters from a given string.
 */

public class Main {

	public static void main(String[] args) {
		Map<Character, Integer> map = findDuplicate("aabbccz%$@#$%^&(()(!~");
		map.forEach((k, v) -> System.out.println(k + ", " + v));
	}
	
	public static Map<Character, Integer> findDuplicate(String text) {
		Map<Character, Integer> countChars = new HashMap<>();
		
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
}
