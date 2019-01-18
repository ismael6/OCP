package edu.ocp.functionalProgramming.streams.intermediateOperations;

import java.util.stream.Stream;

/**
 * @author IsmaSp6
 *
 *	obtains an stream with the elements that accomplish the predicate
 *
 *	signature
 *		Stream<T> filter(Predicate<? super T> predicate)
 */
public class Filter {
	public static void main(String[] args) {
		Stream
			.of(1,2,3,4)
			.filter(n -> n%2 == 0) // returns a stream of only even numbers
			.forEach(System.out::println);
	}
}
