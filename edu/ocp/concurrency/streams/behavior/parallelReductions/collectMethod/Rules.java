package edu.ocp.concurrency.streams.behavior.parallelReductions.collectMethod;

import java.util.Set;
import java.util.SortedSet;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.stream.Stream;

/**
 * @author IsmaSp6
 *
 *	To collect() on parallel stream returns the same result of a serial streams
 *		1) Supplier is recommended to be a concurrent collection 
 *			to avoid ConcurrentModificationException
 *		2) accumulator operator 'op' must be associative and stateless
 *			'(a op b) op c' is equal to 'a op (b op c)'
 *			("a" + "b") + "c" equals "a" + ("b" + "c")
 *		3) combiner associative, stateless and compatible with the accumulator operator
 */
public class Rules {
	public static void main(String[] args) {
		Stream<Integer> numbers = Stream.of(1,2,3,4,5).parallel();
		SortedSet<Integer> set = 
				numbers.collect(
								ConcurrentSkipListSet::new, // concurrent collection
								Set::add, // accumulator associative and stateless
								Set::addAll // combiner associative, stateless and compatible with acccumulator
				);
		System.out.println(set);
	}
}
