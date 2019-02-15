package edu.ocp.concurrency.streams.behavior.parallelReductions.collectMethod;

import java.util.Set;
import java.util.SortedSet;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.stream.Stream;

/**
 * @author IsmaSp6
 *
 *	collect() parameters: supplier, accumulator and combiner
 *
 *	The parallel streams collect() method works as next: 
 *		Apply the reduction to pairs of elements
 *		Create intermediate values 
 *		Combines the intermediate values to produce a final result 
 *	
 *	
 */
public class Basics {
	public static void main(String[] args) {
		Stream<Integer> numbers = Stream.of(1,2,3,4,5).parallel();
		SortedSet<Integer> set = 
				numbers.collect(
								ConcurrentSkipListSet::new,
								Set::add,
								Set::addAll
				);
		System.out.println(set);
	}
}
