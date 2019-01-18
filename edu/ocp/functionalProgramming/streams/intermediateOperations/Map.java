package edu.ocp.functionalProgramming.streams.intermediateOperations;

import java.util.stream.Stream;

/**
 * @author IsmaSp6
 *
 *	Obtains a transformed element from each element of the previous stream
 *
 *	signature
 *	<R> Stream<R> map(Function<? super T, ? extends R> mapper) 
 */
public class Map {
	public static void main(String[] args) {
		Stream
			.of("fs","dfs","asdfas","asdf","asdf")
			.map(String::length) // returns stream with the length of every element
//			.map(s -> s.length()) // lambda sintax
			.forEach(System.out :: println);
	}
}
