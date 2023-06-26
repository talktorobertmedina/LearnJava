package main;

/**
 * Problem Statement:
 * Write a program that reverses the letters of each word and a program that reverses the letters of each word and the words themselves.
 */
public class Main {

	public static void main(String[] args) {
		System.out.println(reverseWord("hello"));
		System.out.println(reverseEachWordInSentence("I Love You"));
	}
	
	public static String reverseWord(String text) {
		
		StringBuilder sb = new StringBuilder(text);
		return sb.reverse().toString();
	}
	
	public static String reverseEachWordInSentence(String text) {
		
		String[] words = text.split(" ");
		String[] reverseWord = new String[words.length];
		int idx = 0;
		for (String word: words) {
			reverseWord[idx] = reverseWord(word);
			idx++;
		}
		
		StringBuilder sb = new StringBuilder();
		for (String rword: reverseWord) {
			sb.append(rword);
			sb.append(' ');
		}
		
		return sb.toString();
	}
}
