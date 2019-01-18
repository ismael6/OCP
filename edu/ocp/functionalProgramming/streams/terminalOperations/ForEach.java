package edu.ocp.functionalProgramming.streams.terminalOperations;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author IsmaSp6
 * 
 * Apply consumer on each element of the stream
 * 
 * parameters -> Consumer<? super T>
 * 
 * returns void
 * 
 * on infinite stream -> not terminates
 * 
 */
public class ForEach {
	public static void main(String[] args) {
		
		List<Integer> l = new ArrayList<>();
		Stream.of(1,2,3,4,5).forEach(v -> l.add(v));
		System.out.println(l);

		Stream.iterate(0, v -> v-1).forEach(System.out :: println); //not terminates
		
		Stream<Integer> stream = Stream.of(2,3);
//		for(Integer i : stream) {} // not complies, cannot iterate directly on streams
	}
}
