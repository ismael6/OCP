package edu.ocp.functionalProgramming.optional;

import java.util.Optional;

/**
 * @author IsmaSp6
 * optional chaining operations:
 * 	filter 
 * 	ifPresent
 * 	map
 * 	flatMap
 * All of them returns: Optional<T>
 */
public class OptionalChaining {
	public static void main(String[] args) {
		Optional.of(4)	
			.map(v -> v-3) // returns Optional<Integer>
			.filter(v -> v > 0) // returns Optional<Integer>
			.ifPresent(System.out :: println); 
	}
}
