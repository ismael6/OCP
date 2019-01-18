package edu.ocp.functionalProgramming.streams.intermediateOperations;

import java.util.stream.Stream;

/**
 * @author IsmaSp6
 *
 *	obtains a stream with unique elements
 *
 *	signature
 *	Stream<T> distinct()
 */
public class Distinct {
	public static void main(String[] args) {
		Stream
			.of("aa","aa","b","aa")
			.distinct() // return stream with unique elements 
			.forEach(System.out:: println);
	}
}
