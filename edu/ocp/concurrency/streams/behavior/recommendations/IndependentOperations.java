package edu.ocp.concurrency.streams.behavior.recommendations;

import java.util.Arrays;

/**
 * @author IsmaSp6
 *
 *	Parallel streams rely on the fact that the operations can be executed independently
 *	Its highly recommended to not use side effect functions on lambda expressions
 */
public class IndependentOperations {
	public static void main(String[] args) {
		Arrays.asList("a","b","c")
				.parallelStream()
				.map(s -> s.toUpperCase()) // map operation affects each element of stream independently 
				.forEach(System.out::println);
		
		System.out.println("\n");
		Arrays.asList("a","b","c")
				.parallelStream()
				.map(s -> {System.out.println(s); return s.toUpperCase();}) // map operations have side effects, this alters output
				.forEach(System.out::println);
	}
	
	
}
