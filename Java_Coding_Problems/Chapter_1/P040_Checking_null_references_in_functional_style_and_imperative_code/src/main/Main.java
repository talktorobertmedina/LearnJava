package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Problem Statement: 
 * Write a program that performs the null checks on the given
 * references in a functional style and imperative code.
 */
public class Main {

	public static void main(String[] args) {
		
		List<Integer> data = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
		List<Integer> tripData = tripleList(data);
		
		System.out.println(Arrays.toString(tripData.toArray()));
		System.out.println(Arrays.toString(data.toArray()));
		
		// declarative
		// TODO
	}

	// imperative
	public static List<Integer> tripleList(List<Integer> data) {
		
		if (data == null) {
			throw new IllegalArgumentException();
		}
		
		List<Integer> copy = new ArrayList<>(data);
		for (int idx = 0; idx < copy.size(); idx++) {
			copy.set(idx, data.get(idx) * 3);
		}
		
		return copy;
	}
}
