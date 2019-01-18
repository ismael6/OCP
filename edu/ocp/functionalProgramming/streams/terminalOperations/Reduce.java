package edu.ocp.functionalProgramming.streams.terminalOperations;

import java.util.function.BinaryOperator;
import java.util.stream.Stream;

/**
 * @author IsmaSp6
 * 
 * Combines all stream elements in one object
 * 
 * Signatures
 * 	A) T reduce(T identity, BinaryOperator<T> accumulator)
 * 	B) Optional<T>(BinaryOperator<T> accumulator)
 * 	C) <U> U reduce(U identity, Bifunction<U, ? super T, U> accumulator, BinaryOperator<U> combiner)
 * 
 * on infinite stream -> not terminates
 * 
 */
public class Reduce {
	public static void main(String[] args) {
		BinaryOperator<Integer> multiply = (a,b) -> a*b;

// 		A)
		System.out.println(Stream
							.of(1,2,3,4)
							.reduce(1, (v1,v2) -> v1*v2)); // return identity type
		
//		B)
		// with an empty stream
		System.out.println(Stream
				.empty() 
				.reduce((v1,v2) -> v1.equals(v2))); // returns empty Optional
		
		// with one element on stream
		System.out.println(Stream
							.of(12) 
							.reduce(multiply)); // returns Optional<T> with the same only one value on the stream
		
		// with more than one element on stream
		System.out.println(Stream
							.iterate(1, n -> n+1) 
							.limit(4)
							.reduce(multiply)); // returns Optional<T> with the resultant value of applying the reduction

//		C)
		System.out.println(Stream
				.iterate(1, n -> n+1) 
				.limit(4)
				.reduce(1,multiply,multiply)); // return identity type (works on parallel streams)
	}
}
