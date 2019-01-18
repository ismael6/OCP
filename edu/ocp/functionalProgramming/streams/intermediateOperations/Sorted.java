package edu.ocp.functionalProgramming.streams.intermediateOperations;

import java.util.Comparator;
import java.util.stream.Stream;

/**
 * @author IsmaSp6
 *
 *	Sort elements on stream, if there is no comparator provided, the natural order applies
 *
 *	Signature
 *	Stream<T> sorted()
 *	Stream<T> sorted(Comparator<? super T> comparator)
 */
public class Sorted {
	public static void main(String[] args) {
		Stream
			.of("d","a","b")
			.sorted() // sorts Stream in natural order
			.forEach(System.out :: print);
		
		System.out.println();
		
		Stream
			.of("d","a","b")
			.sorted(Comparator.reverseOrder()) // sorts Stream using provided comparator
//			.sorted(Comparator::reverseOrder()) // not compiles (reverse order dont receives two arguments and dont returns an int)
			.forEach(System.out :: print);
		

	}
}
