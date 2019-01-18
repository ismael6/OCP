package edu.ocp.functionalProgramming.streams.intermediateOperations;

import java.util.stream.Stream;

/**
 * @author IsmaSp6
 *
 *	Excludes the elements from 0 until the max size specified
 *
 *	signature
 *	Stream<T> skip(int n)
 */
public class Skip {
	public static void main(String[] args) {
		Stream
			.of(10,20,30,40,50)
			.skip(2) // return stream with all elements but the first two
			.forEach(System.out :: println);
		
		Stream
		.of(10,20,30,40,50)
		.skip(10) // return empty stream (skip value is greater than stream size)
		.forEach(System.out :: println);
	}
}
