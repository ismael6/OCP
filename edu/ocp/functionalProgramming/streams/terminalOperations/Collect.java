package edu.ocp.functionalProgramming.streams.terminalOperations;

import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author IsmaSp6
 * 
 * takes elements from stream and saves them on a mutable data structure following provided rules
 * 
 * Signatures
 * 	A) <R> R collect(Supplier<R> supplier, BiConsumer<R, ? super T> accumulator, BiConsumer<R, R> combiner)
 * 	B) <R, A> R collect(Collector <? super T, A, R> collector) 
 *	
 * on infinite Streams not terminates
 */
public class Collect {
	public static void main(String[] args) {
//		A) Custom collector
		System.out.println(Stream
							.of("s","t","r","e","a","m") // data on stream
							.collect( // collect stream data following next rules
									TreeSet::new,  // container data is a TreeSet
									TreeSet::add,  // each element in stream added on treeSet
									TreeSet::addAll)); // if there are parallel operations, join the result with the addAll method
		
//		B) Using API provided collector
		System.out.println(Stream
							.of("s","t","r","e","a","m")
							.collect(Collectors.toCollection(TreeSet::new)));
	}
}
