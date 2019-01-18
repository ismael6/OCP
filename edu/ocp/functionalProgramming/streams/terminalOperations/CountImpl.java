package edu.ocp.functionalProgramming.streams.terminalOperations;

import java.util.stream.Stream;

/**
 * @author IsmaSp6
 * 
 * Determines number of elements in a stream
 * 
 * parameters -> {}
 * 
 * returns -> long
 * 
 * on infinite stream -> don´t terminates 
 * 
 */
public class CountImpl {
	public static void main(String[] args) {

		Stream<Integer> finite = Stream.of(1,23,4);
		System.out.println(finite.count());
		
		Stream<Integer> infinite = Stream.iterate(1, n -> n+1);
		System.out.println(infinite.count()); // keeps running indeterminately
	}
}
