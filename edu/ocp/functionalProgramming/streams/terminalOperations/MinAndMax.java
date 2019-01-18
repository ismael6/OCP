package edu.ocp.functionalProgramming.streams.terminalOperations;

import java.util.stream.Stream;

/**
 * @author IsmaSp6
 * 
 * Finds smallest/largest value in a stream from a specific comparator rule
 * 
 * parameters -> Comparator<? super T>
 * 
 * returns Optional<T>
 * 
 * on infinite stream -> don´t terminates
 * 
 */
public class MinAndMax {
	public static void main(String[] args) {
		Stream<Integer> finite1 = Stream.of(1,23,4);
		finite1.min((i1,i2) -> i1-i2).ifPresent(System.out::println);
		
		Stream<Integer> finite2 = Stream.of(1,23,4);
		finite2.max((i1,i2) -> i1-i2).ifPresent(System.out::println);
		
//		if stream is empty, simply returns an empty Optional
		Stream<Integer> emptyStream = Stream.of();
		emptyStream.max((i1,i2) -> i1-i2).ifPresent(System.out::println);
		
		
//		infinite stream runs indeterminately
		Stream
			.iterate(2, n -> n+2)
			.min((v1, v2) -> v1-v2 )
				.ifPresent((x) -> System.out.println(x));
	}
}
