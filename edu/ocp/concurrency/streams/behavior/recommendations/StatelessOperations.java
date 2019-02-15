package edu.ocp.concurrency.streams.behavior.recommendations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author IsmaSp6
 *	
 *	+ Its highly recommended to avoid Stateful operations
 *		this way potential data side effects is avoided
 *
 *	
 *	Stateful lambda expression -> 
 *		its result depends on any state that might change during pipeline execution
 *
 *	Stateless lambda expression ->
 *		its result do NOT depend on any state that might change during pipeline execution
 */
public class StatelessOperations {
	public static void main(String[] args) {
//		List <Integer> list = new ArrayList<>(); // on parallel streams use synchronized collections or race conditions happens
		List <Integer> list = Collections.synchronizedList(new ArrayList<>());
		Arrays.asList(1,2,3,4,5)
			.parallelStream()
			.map(n -> {list.add(n); return n;}) // do NOT use stateful lambda expressions
			.forEachOrdered(System.out :: print); // 12345
		
		System.out.println();
		for(Integer i : list) {
			System.out.print(i); // unexpected order
		}
	}
}
