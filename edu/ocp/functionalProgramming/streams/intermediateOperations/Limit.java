package edu.ocp.functionalProgramming.streams.intermediateOperations;

import java.util.stream.Stream;

/**
 * @author IsmaSp6
 *
 *	Obtains all the elements on the stream until the max size limit specified
 *
 *	signature	
 *	Stream<T> limit(int maxSize)
 */
public class Limit {
	public static void main(String[] args) {
		Stream
			.iterate(10, n -> n+10)
			.limit(5) // return stream with only 5 elements
			.forEach(System.out :: println);
	}
}
