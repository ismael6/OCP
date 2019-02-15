package edu.ocp.concurrency.streams.behavior.parallelReductions.reduceMethod;

import java.util.stream.Stream;

/**
 * @author IsmaSp6
 *
 *	To reduce() on parallel stream returns the same result of a serial streams
 *		1) 'identity' defined such that for all elements in stream 'u',
 *			combiner.apply(identity, u) is equal to 'u'
 *			combiner.apply("", u) equals u
 *		2) accumulator operator 'op' must be associative and stateless
 *			'(a op b) op c' is equal to 'a op (b op c)'
 *			("a" + "b") + "c" equals "a" + ("b" + "c") 
 *		3) combiner associative, stateless and compatible with the identity
 *			
 */
public class Rules {
	public static void main(String[] args) {
		
//		all rules followed gives expected result (15)
		System.out.println(
				Stream.of(1,2,3,4,5,6).parallel()
				.reduce(
					0, // identity 
					(n1, n2) -> n1+n2, //accumulator
					(res1, res2) -> res1 + res2) //combiner
			);

//		identity do not accomplish first rule (20, accumulator adds for every element on stream)
		System.out.println(
				Stream.of(1,2,3,4,5,6).parallel()
				.reduce(
					1, // identity 
					(n1, n2) -> n1+n2, //accumulator
					(res1, res2) -> res1 + res2) //combiner
			);
	}
}
