package edu.ocp.concurrency.streams.behavior.parallelReductions.collectMethod.usingCollectors;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author IsmaSp6
 * 
 * 	collect() parameters: collector
 *	
 *	If the collection to insert is an ordered data structure, 
 *		the performance reduces and some operations will be unable to complete
 *		because the elements on the ordered data structure must be in same order than stream
 */
public class Basic {
	public static void main(String[] args) {
		Set<Integer> set = 
			Stream.iterate(1, n -> n+1)
			.limit(100)
			.parallel()
			.collect(Collectors.toSet()); 
		
		System.out.println(set);
	}
}
