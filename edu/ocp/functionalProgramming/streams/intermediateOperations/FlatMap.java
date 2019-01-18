package edu.ocp.functionalProgramming.streams.intermediateOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author IsmaSp6
 * 
 * Flattens wrapped elements into a single resultant stream https://www.mkyong.com/java8/java-8-flatmap-example/
 * 
 * signature
 * 	<R> Stream<R> flatMap(Function<? super T, ? extends Stream<? extends R>> mapper)
 *
 */
public class FlatMap {
	public static void main(String[] args) {
		List<String> zero = Arrays.asList();
		List<String> one = Arrays.asList("1");
		List<String> two = Arrays.asList("1","2");
		
		Stream
			.of(zero, one, two)
			.forEach(System.out::println);
		
		Stream
			.of(zero, one, two)
			.flatMap(l -> l.stream()) // produces an stream for every element, and joins them 
			.forEach(System.out::println);
		
		Stream
			.of(1,2,3)
			.flatMap(l -> Stream.of("one", "two")) // produces an stream for every element, and joins thems into only one stream
			.forEach(System.out::println);
	}
}
