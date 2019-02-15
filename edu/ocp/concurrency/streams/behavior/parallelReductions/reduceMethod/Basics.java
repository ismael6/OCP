package edu.ocp.concurrency.streams.behavior.parallelReductions.reduceMethod;

import java.util.stream.Stream;

/**
 * @author IsmaSp6
 *
 *	reduce() parameters: identity, accumulator and combiner
 *	
 *	The parallel streams reduce() method works as next: 
 *		Apply the reduction to pairs of elements
 *		Create intermediate values 
 *		Combines the intermediate values to produce a final result 
 *
 *	
 */
public class Basics {
	public static void main(String[] args) {
		System.out.println(
			Stream.of("s","t","r","e","a","m").parallel()
			.reduce(
				"", // identity 
				(character, accumulatedstring) -> character+accumulatedstring, //accumulator
				(stringRes1, stringRes2) -> stringRes1 + stringRes2) //combiner
		);
	}
}
