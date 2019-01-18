package edu.ocp.functionalProgramming.streams.intermediateOperations;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author IsmaSp6
 * 
 * provides capability to work a consumer on every element of the actual pipeline state
 *
 *	signature
 *	Stream<T> peek(Consumer<? super T> action)	
 */
public class Peek {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		
		Stream.of(1,2,3,4).peek(e->list.add(e)); //without terminal operation does nothing
//		Stream.of(1,2,3,4).peek(e->list.add(e)).count(); // with terminal operation, works fine (intermediate operations are lazy)
		
		System.out.println(list);
	}
}
