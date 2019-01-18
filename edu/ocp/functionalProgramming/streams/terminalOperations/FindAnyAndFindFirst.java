package edu.ocp.functionalProgramming.streams.terminalOperations;

import java.util.stream.Stream;

/**
 * @author IsmaSp6
 * 
 * gets any or the first element from the stream
 * 
 * parameters -> {}
 * 
 * returns Optional<T>
 * 
 * on infinite stream -> terminates
 * 
 */
public class FindAnyAndFindFirst {
	
	public static void main(String[] args) {
		Stream<Integer> infiniteStream1 = Stream.iterate(1, n -> n+1);
		infiniteStream1.findAny().ifPresent(System.out :: println);
		
		Stream<String> finiteStream = Stream.of("c","a","bs");
		finiteStream.findFirst().ifPresent(System.out :: println);
	}
}
