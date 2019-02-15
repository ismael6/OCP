package edu.ocp.concurrency.streams.behavior.parallelReductions;

import java.util.Arrays;

/**
 * @author IsmaSp6
 *
 *	Parallel reductions -> reduction operations on parallel Streams.
 *		Results on parallel reductions can be different than reductions on serial streams
 *
 *		Neverthless Results on parallel reductions based on order (findFirst, limit, skip) 
 *			are consistent with serial streams but performance is reduced
 */
public class Basics {
	public static void main(String[] args) {
		System.out.println(
			Arrays.asList(1,2,3,4,5) 
				.stream()
				.findAny()); // 1 (predictable result, its a serial stream) 
		
		System.out.println(
				Arrays.asList(1,2,3,4,5)
					.parallelStream() 
					.findAny()); //unpredictable result, its a parallel stream

	}
}
