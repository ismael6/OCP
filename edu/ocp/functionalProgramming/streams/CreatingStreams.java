package edu.ocp.functionalProgramming.streams;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * @author IsmaSp6
 * 
 * Stream is a secuence of data
 * 
 * Stream pipeline consists of:
 * 	Source -> data origin
 * 	Intermediate operations -> transformation rules of converting stream into another stream (lazy evaluation)(runs until terminal operation runs)
 * 	Terminal operation -> produces a result
 *
 */
public class CreatingStreams {
	public static void main(String[] args) {
		Stream<String> emptyStream = Stream.empty();
		Stream<String> singleElementStream = Stream.of("ds");
		Stream<String> manyElementStream = Stream.of("d","","s");
		manyElementStream.forEach(System.out::println);

//		Stream from List
		Stream<String> fromList = Arrays.asList("1","2","3").stream();
		
//		Streams allow infinite processing
		Stream<Double> infiniteValues = Stream.generate( () -> Math.random() ); // declarative infinite stream (lazy)
//		infiniteValues.forEach(System.out::println); // apply operation in all elements of stream
		
		Stream.iterate(1, n -> n+2) // lazy
		.forEach(System.out :: println); //prints infinite odd numbers by lazy invocations
	}
}
