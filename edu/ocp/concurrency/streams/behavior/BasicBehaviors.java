package edu.ocp.concurrency.streams.behavior;

import java.util.Arrays;

/**
 * @author IsmaSp6
 *
 *	The order of execution and order of results in parallel streams cannot be determined ahead of time 
 */
public class BasicBehaviors {
	public static void main(String[] args) {

//		serial Stream output
		Arrays.asList(1,2,3,4,5)
				.stream()
				.forEach(System.out :: print); // 12345
		
		System.out.println();
//		parallel Stream output
		Arrays.asList(1,2,3,4,5)
				.parallelStream()
				.forEach(System.out :: print); // unordered printed elements (many threads working on it)
		
//		parallel Stream ordered output
		System.out.println();
		Arrays.asList(1,2,3,4,5)
				.parallelStream()
				.forEachOrdered(System.out :: print); // ordered printed elements (lost performance)
	} 
}
